package com.rest.example;


import java.util.UUID;
import java.util.concurrent.TimeoutException;

import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.Job;
import com.google.cloud.bigquery.JobId;
import com.google.cloud.bigquery.JobInfo;
import com.google.cloud.bigquery.QueryJobConfiguration;


public class LoadDataUsingRest {
public static void main(String[] args) throws InterruptedException, TimeoutException {
	BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();
	
	String querry = RestHandler.getData();
	System.out.println(querry);
	if (! querry.equals(null)) {
		 QueryJobConfiguration queryConfig =
			        QueryJobConfiguration.newBuilder(querry)
			            // Use standard SQL syntax for queries.
			            // See: https://cloud.google.com/bigquery/sql-reference/
			            .setUseLegacySql(false)
			            .build();

			    // Create a job ID so that we can safely retry.
			    JobId jobId = JobId.of(UUID.randomUUID().toString());
			    Job queryJob = bigquery.create(JobInfo.newBuilder(queryConfig).setJobId(jobId).build());

			    // Wait for the query to complete.
			    queryJob = queryJob.waitFor();
			    if (queryJob == null) {
			        throw new RuntimeException("Job no longer exists");
			      } else if (queryJob.getStatus().getError() != null) {
			        // You can also look at queryJob.getStatus().getExecutionErrors() for all
			        // errors, not just the latest one.
			        throw new RuntimeException(queryJob.getStatus().getError().toString());
			      }
	}

	else{
		System.out.println("UNABLE TO FETCH DATA");
	}
  
      }

}

