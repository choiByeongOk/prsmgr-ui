	
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






public class StatsRealTimeInputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.StatsRealTimeInput _StatsRealTimeInput = (com.tmax.prosync.dto.StatsRealTimeInput)obj;
		
		if(_StatsRealTimeInput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _StatsRealTimeInput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.StatsRealTimeInput _StatsRealTimeInput, JsonWriter writer )throws Exception{
	           
		
		writer.name("topIds");
		
	
		if (_StatsRealTimeInput.getTopIds() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsRealTimeInput.getTopIds()));
		}
	
		
		writer.name("targetInstanceIds");
		
	
		if (_StatsRealTimeInput.getTargetInstanceIds() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsRealTimeInput.getTargetInstanceIds()));
		}
	
		
		writer.name("threadTypes");
		
	
		if (_StatsRealTimeInput.getThreadTypes() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsRealTimeInput.getThreadTypes()));
		}
	
		
		writer.name("metrics");
		
	
		if (_StatsRealTimeInput.getMetrics() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsRealTimeInput.getMetrics()));
		}
	
		
		writer.name("startTime");
		
	
		if (_StatsRealTimeInput.getStartTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_StatsRealTimeInput.getStartTime()));
		}
	
		
		writer.name("timeInterval");
		
		writer.value(Integer.toString(_StatsRealTimeInput.getTimeInterval()));
								  					
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
		
		com.tmax.prosync.dto.StatsRealTimeInput _StatsRealTimeInput = new com.tmax.prosync.dto.StatsRealTimeInput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.StatsRealTimeInput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_StatsRealTimeInput = (com.tmax.prosync.dto.StatsRealTimeInput)unmarshal( jr,  _StatsRealTimeInput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _StatsRealTimeInput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.StatsRealTimeInput _StatsRealTimeInput = (com.tmax.prosync.dto.StatsRealTimeInput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.StatsRealTimeInput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_StatsRealTimeInput = (com.tmax.prosync.dto.StatsRealTimeInput)unmarshal( jr,  _StatsRealTimeInput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _StatsRealTimeInput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.StatsRealTimeInput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.StatsRealTimeInput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "topIds" :
		{	
			dto.setTopIds( reader.nextString());									
			break;
		}	
	
			
	
		case "targetInstanceIds" :
		{	
			dto.setTargetInstanceIds( reader.nextString());									
			break;
		}	
	
			
	
		case "threadTypes" :
		{	
			dto.setThreadTypes( reader.nextString());									
			break;
		}	
	
			
	
		case "metrics" :
		{	
			dto.setMetrics( reader.nextString());									
			break;
		}	
	
			
	
		case "startTime" :
		{	
			dto.setStartTime( reader.nextString());									
			break;
		}	
	
			
	
		case "timeInterval" :
		{	
			dto.setTimeInterval( reader.nextInt());									
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
