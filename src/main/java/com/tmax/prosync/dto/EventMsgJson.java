	
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






public class EventMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.Event _Event = (com.tmax.prosync.dto.Event)obj;
		
		if(_Event == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _Event, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.Event _Event, JsonWriter writer )throws Exception{
	           
		
		writer.name("eventId");
		
		writer.value(Integer.toString(_Event.getEventId()));
		
		writer.name("projectId");
		
	
		if (_Event.getProjectId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getProjectId()));
		}
	
		
		writer.name("topId");
		
	
		if (_Event.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getTopId()));
		}
	
		
		writer.name("eventLevel");
		
	
		if (_Event.getEventLevel() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getEventLevel()));
		}
	
		
		writer.name("status");
		
	
		if (_Event.getStatus() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getStatus()));
		}
	
		
		writer.name("processType");
		
	
		if (_Event.getProcessType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getProcessType()));
		}
	
		
		writer.name("processNum");
		
		writer.value(Integer.toString(_Event.getProcessNum()));
		
		writer.name("threadType");
		
	
		if (_Event.getThreadType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getThreadType()));
		}
	
		
		writer.name("detail");
		
	
		if (_Event.getDetail() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getDetail()));
		}
	
		
		writer.name("occurredTime");
		
	
		if (_Event.getOccurredTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getOccurredTime()));
		}
	
		
		writer.name("confirmedTime");
		
	
		if (_Event.getConfirmedTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getConfirmedTime()));
		}
	
		
		writer.name("confirmedBy");
		
	
		if (_Event.getConfirmedBy() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getConfirmedBy()));
		}
	
		
		writer.name("Action");
		
	
		if (_Event.getAction() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Event.getAction()));
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
		
		com.tmax.prosync.dto.Event _Event = new com.tmax.prosync.dto.Event();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Event();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_Event = (com.tmax.prosync.dto.Event)unmarshal( jr,  _Event);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _Event;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.Event _Event = (com.tmax.prosync.dto.Event) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Event();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_Event = (com.tmax.prosync.dto.Event)unmarshal( jr,  _Event);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _Event;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.Event dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.Event dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "eventId" :
		{	
			dto.setEventId( reader.nextInt());									
			break;
		}	
	
			
	
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
	
			
	
		case "processNum" :
		{	
			dto.setProcessNum( reader.nextInt());									
			break;
		}	
	
			
	
		case "threadType" :
		{	
			dto.setThreadType( reader.nextString());									
			break;
		}	
	
			
	
		case "detail" :
		{	
			dto.setDetail( reader.nextString());									
			break;
		}	
	
			
	
		case "occurredTime" :
		{	
			dto.setOccurredTime( reader.nextString());									
			break;
		}	
	
			
	
		case "confirmedTime" :
		{	
			dto.setConfirmedTime( reader.nextString());									
			break;
		}	
	
			
	
		case "confirmedBy" :
		{	
			dto.setConfirmedBy( reader.nextString());									
			break;
		}	
	
			
	
		case "Action" :
		{	
			dto.setAction( reader.nextString());									
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
