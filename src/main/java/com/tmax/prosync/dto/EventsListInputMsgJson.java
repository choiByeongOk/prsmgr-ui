	
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






public class EventsListInputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.EventsListInput _EventsListInput = (com.tmax.prosync.dto.EventsListInput)obj;
		
		if(_EventsListInput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _EventsListInput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.EventsListInput _EventsListInput, JsonWriter writer )throws Exception{
	           
		
		writer.name("projectId");
		
	
		if (_EventsListInput.getProjectId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsListInput.getProjectId()));
		}
	
		
		writer.name("topId");
		
	
		if (_EventsListInput.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsListInput.getTopId()));
		}
	
		
		writer.name("eventLevel");
		
	
		if (_EventsListInput.getEventLevel() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsListInput.getEventLevel()));
		}
	
		
		writer.name("status");
		
	
		if (_EventsListInput.getStatus() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsListInput.getStatus()));
		}
	
		
		writer.name("processType");
		
	
		if (_EventsListInput.getProcessType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsListInput.getProcessType()));
		}
	
		
		writer.name("threadType");
		
	
		if (_EventsListInput.getThreadType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsListInput.getThreadType()));
		}
	
		
		writer.name("startTime");
		
	
		if (_EventsListInput.getStartTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsListInput.getStartTime()));
		}
	
		
		writer.name("endTime");
		
	
		if (_EventsListInput.getEndTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsListInput.getEndTime()));
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
		
		com.tmax.prosync.dto.EventsListInput _EventsListInput = new com.tmax.prosync.dto.EventsListInput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.EventsListInput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_EventsListInput = (com.tmax.prosync.dto.EventsListInput)unmarshal( jr,  _EventsListInput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _EventsListInput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.EventsListInput _EventsListInput = (com.tmax.prosync.dto.EventsListInput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.EventsListInput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_EventsListInput = (com.tmax.prosync.dto.EventsListInput)unmarshal( jr,  _EventsListInput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _EventsListInput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.EventsListInput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.EventsListInput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "projectId" :
		{	
			dto.setProjectId( reader.nextString());									
			break;
		}	
	
			
	
		case "topId" :
		{	
			dto.setTopId( reader.nextString());									
			break;
		}	
	
			
	
		case "eventLevel" :
		{	
			dto.setEventLevel( reader.nextString());									
			break;
		}	
	
			
	
		case "status" :
		{	
			dto.setStatus( reader.nextString());									
			break;
		}	
	
			
	
		case "processType" :
		{	
			dto.setProcessType( reader.nextString());									
			break;
		}	
	
			
	
		case "threadType" :
		{	
			dto.setThreadType( reader.nextString());									
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
