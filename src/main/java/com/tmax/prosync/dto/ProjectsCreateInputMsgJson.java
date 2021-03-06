	
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




import com.tmax.prosync.dto.ConnectionMsgJson;


public class ProjectsCreateInputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.ProjectsCreateInput _ProjectsCreateInput = (com.tmax.prosync.dto.ProjectsCreateInput)obj;
		
		if(_ProjectsCreateInput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _ProjectsCreateInput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.ProjectsCreateInput _ProjectsCreateInput, JsonWriter writer )throws Exception{
	           
		
		writer.name("name");
		
	
		if (_ProjectsCreateInput.getName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectsCreateInput.getName()));
		}
	
		
		writer.name("description");
		
	
		if (_ProjectsCreateInput.getDescription() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectsCreateInput.getDescription()));
		}
	
		
		writer.name("userId");
		
	
		if (_ProjectsCreateInput.getUserId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ProjectsCreateInput.getUserId()));
		}
	
		
		writer.name("connection");
						    					
		com.tmax.prosync.dto.ConnectionMsgJson __connection = new com.tmax.prosync.dto.ConnectionMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _ProjectsCreateInput.sizeConnection(); i++) {
			if(_ProjectsCreateInput.getConnectionList().get(i) != null) {
				writer.beginObject();
				__connection.marshal((com.tmax.prosync.dto.Connection)_ProjectsCreateInput.getConnection(i), writer);
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
		
		com.tmax.prosync.dto.ProjectsCreateInput _ProjectsCreateInput = new com.tmax.prosync.dto.ProjectsCreateInput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ProjectsCreateInput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_ProjectsCreateInput = (com.tmax.prosync.dto.ProjectsCreateInput)unmarshal( jr,  _ProjectsCreateInput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _ProjectsCreateInput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.ProjectsCreateInput _ProjectsCreateInput = (com.tmax.prosync.dto.ProjectsCreateInput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ProjectsCreateInput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_ProjectsCreateInput = (com.tmax.prosync.dto.ProjectsCreateInput)unmarshal( jr,  _ProjectsCreateInput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _ProjectsCreateInput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.ProjectsCreateInput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.ProjectsCreateInput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "name" :
		{	
			dto.setName( reader.nextString());									
			break;
		}	
	
			
	
		case "description" :
		{	
			dto.setDescription( reader.nextString());									
			break;
		}	
	
			
	
		case "userId" :
		{	
			dto.setUserId( reader.nextString());									
			break;
		}	
	
			
		case "connection" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.ConnectionMsgJson __connection = new com.tmax.prosync.dto.ConnectionMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.Connection ___Connection = new com.tmax.prosync.dto.Connection();	
				reader.beginObject();
				dto.getConnectionList().add((com.tmax.prosync.dto.Connection)__connection.unmarshal( reader, ___Connection ));
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
