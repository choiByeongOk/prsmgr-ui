	
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






public class ProjectMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.Project _Project = (com.tmax.prosync.dto.Project)obj;
		
		if(_Project == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _Project, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.Project _Project, JsonWriter writer )throws Exception{
	           
		
		writer.name("projectId");
		
		writer.value(Integer.toString(_Project.getProjectId()));
		
		writer.name("name");
		
	
		if (_Project.getName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Project.getName()));
		}
	
		
		writer.name("type");
		
	
		if (_Project.getType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Project.getType()));
		}
	
		
		writer.name("status");
		
	
		if (_Project.getStatus() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Project.getStatus()));
		}
	
		
		writer.name("maxThreadNum");
		
		writer.value(Integer.toString(_Project.getMaxThreadNum()));
		
		writer.name("syncTableNum");
		
		writer.value(Integer.toString(_Project.getSyncTableNum()));
		
		writer.name("createdUser");
		
	
		if (_Project.getCreatedUser() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Project.getCreatedUser()));
		}
	
		
		writer.name("createdTime");
		
	
		if (_Project.getCreatedTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Project.getCreatedTime()));
		}
	
		
		writer.name("lastModifiedUser");
		
	
		if (_Project.getLastModifiedUser() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Project.getLastModifiedUser()));
		}
	
		
		writer.name("lastModifiedTime");
		
	
		if (_Project.getLastModifiedTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Project.getLastModifiedTime()));
		}
	
		
		writer.name("description");
		
	
		if (_Project.getDescription() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Project.getDescription()));
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
		
		com.tmax.prosync.dto.Project _Project = new com.tmax.prosync.dto.Project();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Project();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_Project = (com.tmax.prosync.dto.Project)unmarshal( jr,  _Project);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _Project;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.Project _Project = (com.tmax.prosync.dto.Project) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Project();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_Project = (com.tmax.prosync.dto.Project)unmarshal( jr,  _Project);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _Project;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.Project dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.Project dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "projectId" :
		{	
			dto.setProjectId( reader.nextInt());									
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
	
			
	
		case "maxThreadNum" :
		{	
			dto.setMaxThreadNum( reader.nextInt());									
			break;
		}	
	
			
	
		case "syncTableNum" :
		{	
			dto.setSyncTableNum( reader.nextInt());									
			break;
		}	
	
			
	
		case "createdUser" :
		{	
			dto.setCreatedUser( reader.nextString());									
			break;
		}	
	
			
	
		case "createdTime" :
		{	
			dto.setCreatedTime( reader.nextString());									
			break;
		}	
	
			
	
		case "lastModifiedUser" :
		{	
			dto.setLastModifiedUser( reader.nextString());									
			break;
		}	
	
			
	
		case "lastModifiedTime" :
		{	
			dto.setLastModifiedTime( reader.nextString());									
			break;
		}	
	
			
	
		case "description" :
		{	
			dto.setDescription( reader.nextString());									
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
