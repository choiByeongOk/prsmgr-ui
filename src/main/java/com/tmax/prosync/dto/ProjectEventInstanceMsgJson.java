	
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






public class ProjectEventInstanceMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.ProjectEventInstance _ProjectEventInstance = (com.tmax.prosync.dto.ProjectEventInstance)obj;
		
		if(_ProjectEventInstance == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _ProjectEventInstance, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.ProjectEventInstance _ProjectEventInstance, JsonWriter writer )throws Exception{
	           
		
		writer.name("projectId");
		
	
		if (_ProjectEventInstance.getProjectId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectEventInstance.getProjectId()));
		}
	
		
		writer.name("name");
		
	
		if (_ProjectEventInstance.getName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectEventInstance.getName()));
		}
	
		
		writer.name("type");
		
	
		if (_ProjectEventInstance.getType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectEventInstance.getType()));
		}
	
		
		writer.name("status");
		
	
		if (_ProjectEventInstance.getStatus() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectEventInstance.getStatus()));
		}
	
		
		writer.name("syncTableNum");
		
		writer.value(Integer.toString(_ProjectEventInstance.getSyncTableNum()));
		
		writer.name("failEventCount");
		
		writer.value(Integer.toString(_ProjectEventInstance.getFailEventCount()));
		
		writer.name("errorEventCount");
		
		writer.value(Integer.toString(_ProjectEventInstance.getErrorEventCount()));
		
		writer.name("sourceDBName");
		
	
		if (_ProjectEventInstance.getSourceDBName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectEventInstance.getSourceDBName()));
		}
	
		
		writer.name("targetDBName");
		
	
		if (_ProjectEventInstance.getTargetDBName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectEventInstance.getTargetDBName()));
		}
	
		
		writer.name("Action");
		
	
		if (_ProjectEventInstance.getAction() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectEventInstance.getAction()));
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
		
		com.tmax.prosync.dto.ProjectEventInstance _ProjectEventInstance = new com.tmax.prosync.dto.ProjectEventInstance();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ProjectEventInstance();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_ProjectEventInstance = (com.tmax.prosync.dto.ProjectEventInstance)unmarshal( jr,  _ProjectEventInstance);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _ProjectEventInstance;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.ProjectEventInstance _ProjectEventInstance = (com.tmax.prosync.dto.ProjectEventInstance) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ProjectEventInstance();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_ProjectEventInstance = (com.tmax.prosync.dto.ProjectEventInstance)unmarshal( jr,  _ProjectEventInstance);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _ProjectEventInstance;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.ProjectEventInstance dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.ProjectEventInstance dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "projectId" :
		{	
			dto.setProjectId( reader.nextString());									
			break;
		}	
	
			
	
		case "name" :
		{	
			dto.setName( reader.nextString());									
			break;
		}	
	
			
	
		case "type" :
		{	
			dto.setType( reader.nextString());									
			break;
		}	
	
			
	
		case "status" :
		{	
			dto.setStatus( reader.nextString());									
			break;
		}	
	
			
	
		case "syncTableNum" :
		{	
			dto.setSyncTableNum( reader.nextInt());									
			break;
		}	
	
			
	
		case "failEventCount" :
		{	
			dto.setFailEventCount( reader.nextInt());									
			break;
		}	
	
			
	
		case "errorEventCount" :
		{	
			dto.setErrorEventCount( reader.nextInt());									
			break;
		}	
	
			
	
		case "sourceDBName" :
		{	
			dto.setSourceDBName( reader.nextString());									
			break;
		}	
	
			
	
		case "targetDBName" :
		{	
			dto.setTargetDBName( reader.nextString());									
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
