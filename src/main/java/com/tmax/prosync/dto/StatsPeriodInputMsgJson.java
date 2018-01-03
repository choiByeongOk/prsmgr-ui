	
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






public class StatsPeriodInputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.StatsPeriodInput _StatsPeriodInput = (com.tmax.prosync.dto.StatsPeriodInput)obj;
		
		if(_StatsPeriodInput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _StatsPeriodInput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.StatsPeriodInput _StatsPeriodInput, JsonWriter writer )throws Exception{
	           
		
		writer.name("topId");
		
	
		if (_StatsPeriodInput.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsPeriodInput.getTopId()));
		}
	
		
		writer.name("processType");
		
	
		if (_StatsPeriodInput.getProcessType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsPeriodInput.getProcessType()));
		}
	
		
		writer.name("processNum");
		
		writer.value(Integer.toString(_StatsPeriodInput.getProcessNum()));
		
		writer.name("metric");
		
	
		if (_StatsPeriodInput.getMetric() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsPeriodInput.getMetric()));
		}
	
		
		writer.name("timeType");
		
	
		if (_StatsPeriodInput.getTimeType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsPeriodInput.getTimeType()));
		}
	
		
		writer.name("startTime");
		
	
		if (_StatsPeriodInput.getStartTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsPeriodInput.getStartTime()));
		}
	
		
		writer.name("endTime");
		
	
		if (_StatsPeriodInput.getEndTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsPeriodInput.getEndTime()));
		}
	
		
		writer.name("numOfPoints");
		
		writer.value(Long.toString(_StatsPeriodInput.getNumOfPoints()));
								  					
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
		
		com.tmax.prosync.dto.StatsPeriodInput _StatsPeriodInput = new com.tmax.prosync.dto.StatsPeriodInput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.StatsPeriodInput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_StatsPeriodInput = (com.tmax.prosync.dto.StatsPeriodInput)unmarshal( jr,  _StatsPeriodInput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _StatsPeriodInput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.StatsPeriodInput _StatsPeriodInput = (com.tmax.prosync.dto.StatsPeriodInput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.StatsPeriodInput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_StatsPeriodInput = (com.tmax.prosync.dto.StatsPeriodInput)unmarshal( jr,  _StatsPeriodInput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _StatsPeriodInput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.StatsPeriodInput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.StatsPeriodInput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "topId" :
		{	
			dto.setTopId( reader.nextString());									
			break;
		}	
	
			
	
		case "processType" :
		{	
			dto.setProcessType( reader.nextString());									
			break;
		}	
	
			
	
		case "processNum" :
		{	
			dto.setProcessNum( reader.nextInt());									
			break;
		}	
	
			
	
		case "metric" :
		{	
			dto.setMetric( reader.nextString());									
			break;
		}	
	
			
	
		case "timeType" :
		{	
			dto.setTimeType( reader.nextString());									
			break;
		}	
	
			
	
		case "startTime" :
		{	
			dto.setStartTime( reader.nextString());									
			break;
		}	
	
			
	
		case "endTime" :
		{	
			dto.setEndTime( reader.nextString());									
			break;
		}	
	
			
	
		case "numOfPoints" :
		{	
			dto.setNumOfPoints( reader.nextLong());									
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
