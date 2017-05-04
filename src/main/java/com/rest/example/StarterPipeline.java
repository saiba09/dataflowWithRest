/*
 * Copyright (C) 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.rest.example;

import com.google.cloud.dataflow.sdk.Pipeline;
import com.google.cloud.dataflow.sdk.options.PipelineOptionsFactory;
import com.google.cloud.dataflow.sdk.transforms.Create;
import com.google.cloud.dataflow.sdk.transforms.DoFn;
import com.google.cloud.dataflow.sdk.transforms.ParDo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StarterPipeline {
  private static final Logger LOG = LoggerFactory.getLogger(StarterPipeline.class);
//String res = "";
//JSONParser parser = new JSONParser();
//try {
//	Object object = parser.parse(line);
//	JSONObject jsonObject = (JSONObject) object;
//	JSONArray resource = (JSONArray) jsonObject.get("entry");
//	for(int i=0;i < resource.size() ; i++){
//	JSONObject jsonObject1 = (JSONObject) parser.parse(resource.get(i).toString());
//	//System.out.println(jsonObject1);
//	 HashMap<String , JSONArray> map = (HashMap) jsonObject1.get("resource");
////	System.out.println(jsonObject1.get("search"));
//	// System.out.println(map);
//	// System.out.println(map.get("gender"));
//	 JSONArray FullnameArray  = map.get("name") ;
//	 JSONObject nameObject  = (JSONObject) parser.parse(FullnameArray.get(0).toString());
//	 //System.out.println(nameObject.get("text"));
//	 //System.out.println(map.get("id"));
//	// System.out.println(map.get("birthDate"));
//	res ="Record " + i+ " "+ map.get("id") + " : " + nameObject.get("text") + " : " + map.get("gender") + " : " + map.get("birthDate") +"\n";
//	}
//}
//catch(Exception e){
//	 e.printStackTrace();
//}
  public static void main(String[] args) {
    Pipeline p = Pipeline.create(
        PipelineOptionsFactory.fromArgs(args).withValidation().create());

    p.apply(Create.of("Hello", "World"))
    .apply(ParDo.of(new DoFn<String, String>() {
      @Override
      public void processElement(ProcessContext c) {
        c.output(c.element().toUpperCase());
      }
    }))
    .apply(ParDo.of(new DoFn<String, Void>() {
      @Override
      public void processElement(ProcessContext c)  {
        LOG.info(c.element());
      }
    }));

    p.run();
  }
}
