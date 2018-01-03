	
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






public class DataMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.Data _Data = (com.tmax.prosync.dto.Data)obj;
		
		if(_Data == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _Data, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.Data _Data, JsonWriter writer )throws Exception{
	           
		
		writer.name("id");
		
	
		if (_Data.getId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Data.getId()));
		}
	
		
		writer.name("label");
		
	
		if (_Data.getLabel() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Data.getLabel()));
		}
	
		
		writer.name("source");
		
	
		if (_Data.getSource() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Data.getSource()));
		}
	
		
		writer.name("target");
		
	
		if (_Data.getTarget() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Data.getTarget()));
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
		
		com.tmax.prosync.dto.Data _Data = new com.tmax.prosync.dto.Data();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Data();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_Data = (com.tmax.prosync.dto.Data)unmarshal( jr,  _Data);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _Data;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.Data _Data = (com.tmax.prosync.dto.Data) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Data();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_Data = (com.tmax.prosync.dto.Data)unmarshal( jr,  _Data);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _Data;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.Data dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.Data dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "id" :
		{	
			dto.setId( reader.nextString());									
			break;
		}	
	
			
	
		case "label" :
		{	
			dto.setLabel( reader.nextString());									
			break;
		}	
	
			
	
		case "source" :
		{	
			dto.setSource( reader.nextString());									
			break;
		}	
	
			
	
		case "target" :
		{	
			dto.setTarget( reader.nextString());									
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
