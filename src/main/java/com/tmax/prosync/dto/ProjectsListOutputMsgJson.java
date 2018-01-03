	
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






public class ProjectsListOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.ProjectsListOutput _ProjectTop = (com.tmax.prosync.dto.ProjectsListOutput)obj;
		
		if(_ProjectTop == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _ProjectTop, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.ProjectsListOutput _ProjectTop, JsonWriter writer )throws Exception{
	           
		
		writer.name("projectId");
		
	
		if (_ProjectTop.getProjectId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectTop.getProjectId()));
		}
	
		
		writer.name("name");
		
	
		if (_ProjectTop.getName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectTop.getName()));
		}
	
		
		writer.name("type");
		
	
		if (_ProjectTop.getType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectTop.getType()));
		}
	
		
		writer.name("topIds");
		
	
		if (_ProjectTop.getTopIds() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectTop.getTopIds()));
		}
	
		
		writer.name("ip");
		
	
		if (_ProjectTop.getIp() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectTop.getIp()));
		}
	
		
		writer.name("description");
		
	
		if (_ProjectTop.getDescription() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectTop.getDescription()));
		}
	
		
		writer.name("createdUser");
		
	
		if (_ProjectTop.getCreatedUser() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectTop.getCreatedUser()));
		}
	
		
		writer.name("createdTime");
		
	
		if (_ProjectTop.getCreatedTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectTop.getCreatedTime()));
		}
	
		
		writer.name("lastModifiedUser");
		
	
		if (_ProjectTop.getLastModifiedUser() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectTop.getLastModifiedUser()));
		}
	
		
		writer.name("lastModifiedTime");
		
	
		if (_ProjectTop.getLastModifiedTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectTop.getLastModifiedTime()));
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
		
		com.tmax.prosync.dto.ProjectsListOutput _ProjectTop = new com.tmax.prosync.dto.ProjectsListOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ProjectsListOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_ProjectTop = (com.tmax.prosync.dto.ProjectsListOutput)unmarshal( jr,  _ProjectTop);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _ProjectTop;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.ProjectsListOutput _ProjectTop = (com.tmax.prosync.dto.ProjectsListOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ProjectsListOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_ProjectTop = (com.tmax.prosync.dto.ProjectsListOutput)unmarshal( jr,  _ProjectTop);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _ProjectTop;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.ProjectsListOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.ProjectsListOutput dto, JsonReader reader, String name) throws Exception{				
		
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
	
			
	
		case "topIds" :
		{	
			dto.setTopIds( reader.nextString());									
			break;
		}	
	
			
	
		case "ip" :
		{	
			dto.setIp( reader.nextString());									
			break;
		}	
	
			
	
		case "description" :
		{	
			dto.setDescription( reader.nextString());									
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
