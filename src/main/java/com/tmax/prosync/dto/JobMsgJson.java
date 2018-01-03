	
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






public class JobMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.Job _Job = (com.tmax.prosync.dto.Job)obj;
		
		if(_Job == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _Job, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.Job _Job, JsonWriter writer )throws Exception{
	           
		
		writer.name("jobName");
		
	
		if (_Job.getJobName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Job.getJobName()));
		}
	
		
		writer.name("topId");
		
	
		if (_Job.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Job.getTopId()));
		}
	
		
		writer.name("srcTable");
		
	
		if (_Job.getSrcTable() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Job.getSrcTable()));
		}
	
		
		writer.name("tarTable");
		
	
		if (_Job.getTarTable() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Job.getTarTable()));
		}
	
		
		writer.name("status");
		
	
		if (_Job.getStatus() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Job.getStatus()));
		}
	
		
		writer.name("sqlCount");
		
		writer.value(Integer.toString(_Job.getSqlCount()));
		
		writer.name("ip");
		
	
		if (_Job.getIp() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Job.getIp()));
		}
	
		
		writer.name("reportPath");
		
	
		if (_Job.getReportPath() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Job.getReportPath()));
		}
	
		
		writer.name("time");
		
	
		if (_Job.getTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Job.getTime()));
		}
	
								  					
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
		
		com.tmax.prosync.dto.Job _Job = new com.tmax.prosync.dto.Job();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Job();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_Job = (com.tmax.prosync.dto.Job)unmarshal( jr,  _Job);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _Job;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.Job _Job = (com.tmax.prosync.dto.Job) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Job();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_Job = (com.tmax.prosync.dto.Job)unmarshal( jr,  _Job);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _Job;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.Job dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.Job dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "jobName" :
		{	
			dto.setJobName( reader.nextString());									
			break;
		}	
	
			
	
		case "topId" :
		{	
			dto.setTopId( reader.nextString());									
			break;
		}	
	
			
	
		case "srcTable" :
		{	
			dto.setSrcTable( reader.nextString());									
			break;
		}	
	
			
	
		case "tarTable" :
		{	
			dto.setTarTable( reader.nextString());									
			break;
		}	
	
			
	
		case "status" :
		{	
			dto.setStatus( reader.nextString());									
			break;
		}	
	
			
	
		case "sqlCount" :
		{	
			dto.setSqlCount( reader.nextInt());									
			break;
		}	
	
			
	
		case "ip" :
		{	
			dto.setIp( reader.nextString());									
			break;
		}	
	
			
	
		case "reportPath" :
		{	
			dto.setReportPath( reader.nextString());									
			break;
		}	
	
			
	
		case "time" :
		{	
			dto.setTime( reader.nextString());									
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
