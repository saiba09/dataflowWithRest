package com.rest.example;


import java.util.List;
import java.util.concurrent.TimeoutException;

import com.google.api.services.bigquery.model.TableRow;
import com.google.cloud.dataflow.sdk.Pipeline;
import com.google.cloud.dataflow.sdk.coders.StringUtf8Coder;
import com.google.cloud.dataflow.sdk.io.BigQueryIO;
import com.google.cloud.dataflow.sdk.options.DataflowPipelineOptions;
import com.google.cloud.dataflow.sdk.options.PipelineOptions;
import com.google.cloud.dataflow.sdk.options.PipelineOptionsFactory;
import com.google.cloud.dataflow.sdk.runners.BlockingDataflowPipelineRunner;
import com.google.cloud.dataflow.sdk.transforms.Create;
import com.google.cloud.dataflow.sdk.transforms.DoFn;
import com.google.cloud.dataflow.sdk.transforms.ParDo;
import com.google.cloud.dataflow.sdk.values.PCollection;
import com.rest.entity.PatientEntity;
import com.util.Parser;



public class loadRestUsingDataflow {
	public static Parser parser = new Parser();
	static final DoFn<String, TableRow> MUTATION_TRANSFORM = new DoFn<String, TableRow>() {
		private static final long serialVersionUID = 1L;
		@Override
		public void processElement(DoFn<String, TableRow>.ProcessContext context) throws Exception {
			String csvData = context.element();
			PatientEntity patientEntity =  parser.getPatinetData(csvData );
			TableRow row = new TableRow().set("patient_id", patientEntity.getPatient_id()).set("name", patientEntity.getName()).set("Address",patientEntity.getAddress())
					.set("city",patientEntity.getCity()).set("State",patientEntity.getState()).set("maritialStatus",patientEntity.getMaritialStatus()).set("telecom",patientEntity.getTelecom())
					.set("gender",patientEntity.getGender()).set("birthDate",patientEntity.getBirthDate()).set("multipleBirthInteger", patientEntity.getMultipleBirthInteger()).set("deceasedDateTime", patientEntity.getDeceasedDateTime());;
			context.output(row);
		}

	};
	public static void main(String[] args) throws InterruptedException, TimeoutException {

		List<String> data = RestHandler.getData();
		DataflowPipelineOptions  options = PipelineOptionsFactory.create().as(DataflowPipelineOptions.class);
		options.setRunner(BlockingDataflowPipelineRunner.class);
		options.setProject("healthcare-12");
		options.setStagingLocation("gs://mihin-data/staging12");

	//	PipelineOptions pipelineOptions = PipelineOptionsFactory.create();
		Pipeline p = Pipeline.create(options);
		PCollection<String> inputData = p.apply(Create.of(data)).setCoder(StringUtf8Coder.of());
		inputData.apply(ParDo.named("Processing File").of(MUTATION_TRANSFORM))
		.apply(BigQueryIO.Write
				.named("Writeing to Big Querry")
				.to("healthcare-12:Mihin_Data_Sample.PatientDataFromRest")
				.withWriteDisposition(BigQueryIO.Write.WriteDisposition.WRITE_TRUNCATE)
				.withCreateDisposition(BigQueryIO.Write.CreateDisposition.CREATE_NEVER));
		p.run();

	}

}

