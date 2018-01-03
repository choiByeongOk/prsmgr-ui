	
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






public class EventsConfirmInputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.EventsConfirmInput _EventsConfirmInput = (com.tmax.prosync.dto.EventsConfirmInput)obj;
		
		if(_EventsConfirmInput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _EventsConfirmInput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.EventsConfirmInput _EventsConfirmInput, JsonWriter writer )throws Exception{
	           
		
		writer.name("userId");
		
	
		if (_EventsConfirmInput.getUserId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsConfirmInput.getUserId()));
		}
	
		
		writer.name("eventId");
		
		writer.value(Integer.toString(_EventsConfirmInput.getEventId()));
		
		writer.name("projectId");
		
	
		if (_EventsConfirmInput.getProjectId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsConfirmInput.getProjectId()));
		}
	
		
		writer.name("topId");
		
	
		if (_EventsConfirmInput.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_EventsConfirmInput.getTopId()));
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
		
		com.tmax.prosync.dto.EventsConfirmInput _EventsConfirmInput = new com.tmax.prosync.dto.EventsConfirmInput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.EventsConfirmInput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_EventsConfirmInput = (com.tmax.prosync.dto.EventsConfirmInput)unmarshal( jr,  _EventsConfirmInput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _EventsConfirmInput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.EventsConfirmInput _EventsConfirmInput = (com.tmax.prosync.dto.EventsConfirmInput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.EventsConfirmInput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_EventsConfirmInput = (com.tmax.prosync.dto.EventsConfirmInput)unmarshal( jr,  _EventsConfirmInput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _EventsConfirmInput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.EventsConfirmInput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.EventsConfirmInput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "userId" :
		{	
			dto.setUserId( reader.nextString());									
			break;
		}	
	
			
	
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
