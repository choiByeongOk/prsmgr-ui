	
package com.tmax.prosync.dto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import com.tmax.proobject.model.dataobject.DataObject;


import org.w3c.dom.Node;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tmax.promapper.engine.base.Message;
import com.tmax.proobject.util.json.ProObjectStreamJsonConstants;




import com.tmax.prosync.dto.ProjectEventInstanceMsgJson;


public class ProjectsOverviewOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.ProjectsOverviewOutput _ProjectsOverviewOutput = (com.tmax.prosync.dto.ProjectsOverviewOutput)obj;
		
		if(_ProjectsOverviewOutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _ProjectsOverviewOutput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.ProjectsOverviewOutput _ProjectsOverviewOutput, JsonWriter writer )throws Exception{
	           
		
		writer.name("projectEventInstance");
						    					
		com.tmax.prosync.dto.ProjectEventInstanceMsgJson __projectEventInstance = new com.tmax.prosync.dto.ProjectEventInstanceMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _ProjectsOverviewOutput.sizeProjectEventInstance(); i++) {
			if(_ProjectsOverviewOutput.getProjectEventInstanceList().get(i) != null) {
				writer.beginObject();
				__projectEventInstance.marshal((com.tmax.prosync.dto.ProjectEventInstance)_ProjectsOverviewOutput.getProjectEventInstance(i), writer);
				writer.endObject();
			}
		}
		writer.endArray();							  					
	}

	/**
     * do not use
     */
  	public void marshal(DataObject dataobject, Node node) throws Exception {          
  	}

  	public String removeNullChar(String charString) {
    		if( charString == null )
    			return "";
    		
			StringBuffer sb = new StringBuffer();
			for (int i = 0 ; i<charString.length(); i++) {
				if(charString.charAt(i) == (char)0) {
					sb.append("");
				} else {
					sb.append(charString.charAt(i));
				}
			}
			return sb.toString();
  	}
	
	public DataObject unmarshal(byte[] bytes, int i) throws Exception {
		
		com.tmax.prosync.dto.ProjectsOverviewOutput _ProjectsOverviewOutput = new com.tmax.prosync.dto.ProjectsOverviewOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ProjectsOverviewOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_ProjectsOverviewOutput = (com.tmax.prosync.dto.ProjectsOverviewOutput)unmarshal( jr,  _ProjectsOverviewOutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _ProjectsOverviewOutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.ProjectsOverviewOutput _ProjectsOverviewOutput = (com.tmax.prosync.dto.ProjectsOverviewOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ProjectsOverviewOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_ProjectsOverviewOutput = (com.tmax.prosync.dto.ProjectsOverviewOutput)unmarshal( jr,  _ProjectsOverviewOutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _ProjectsOverviewOutput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.ProjectsOverviewOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.ProjectsOverviewOutput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
		case "projectEventInstance" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.ProjectEventInstanceMsgJson __projectEventInstance = new com.tmax.prosync.dto.ProjectEventInstanceMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.ProjectEventInstance ___ProjectEventInstance = new com.tmax.prosync.dto.ProjectEventInstance();	
				reader.beginObject();
				dto.getProjectEventInstanceList().add((com.tmax.prosync.dto.ProjectEventInstance)__projectEventInstance.unmarshal( reader, ___ProjectEventInstance ));
				reader.endObject();
			}
			reader.endArray();
			break;
		}		
		default :
			reader.skipValue();
			break;
		}
	}
		 
    /**
     * do not use
     */
	public int unmarshal(byte[] bytes, int i, DataObject dataobject){
		return -1;
	}
	
	/**
     * do not use
     */
	public DataObject unmarshal(Node node) throws Exception {
		return null;
	}
    
 		

}
