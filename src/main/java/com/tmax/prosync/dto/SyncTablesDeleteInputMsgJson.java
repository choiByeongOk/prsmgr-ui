	
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






public class SyncTablesDeleteInputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.SyncTablesDeleteInput _SyncTablesDeleteInput = (com.tmax.prosync.dto.SyncTablesDeleteInput)obj;
		
		if(_SyncTablesDeleteInput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _SyncTablesDeleteInput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.SyncTablesDeleteInput _SyncTablesDeleteInput, JsonWriter writer )throws Exception{
	           
		
		writer.name("topId");
		
	
		if (_SyncTablesDeleteInput.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTablesDeleteInput.getTopId()));
		}
	
		
		writer.name("type");
		
	
		if (_SyncTablesDeleteInput.getType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTablesDeleteInput.getType()));
		}
	
		
		writer.name("name");
		
	
		if (_SyncTablesDeleteInput.getName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTablesDeleteInput.getName()));
		}
	
		
		writer.name("owner");
		
	
		if (_SyncTablesDeleteInput.getOwner() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTablesDeleteInput.getOwner()));
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
		
		com.tmax.prosync.dto.SyncTablesDeleteInput _SyncTablesDeleteInput = new com.tmax.prosync.dto.SyncTablesDeleteInput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SyncTablesDeleteInput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_SyncTablesDeleteInput = (com.tmax.prosync.dto.SyncTablesDeleteInput)unmarshal( jr,  _SyncTablesDeleteInput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _SyncTablesDeleteInput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.SyncTablesDeleteInput _SyncTablesDeleteInput = (com.tmax.prosync.dto.SyncTablesDeleteInput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SyncTablesDeleteInput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_SyncTablesDeleteInput = (com.tmax.prosync.dto.SyncTablesDeleteInput)unmarshal( jr,  _SyncTablesDeleteInput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _SyncTablesDeleteInput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.SyncTablesDeleteInput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.SyncTablesDeleteInput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "topId" :
		{	
			dto.setTopId( reader.nextString());									
			break;
		}	
	
			
	
		case "type" :
		{	
			dto.setType( reader.nextString());									
			break;
		}	
	
			
	
		case "name" :
		{	
			dto.setName( reader.nextString());									
			break;
		}	
	
			
	
		case "owner" :
		{	
			dto.setOwner( reader.nextString());									
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
