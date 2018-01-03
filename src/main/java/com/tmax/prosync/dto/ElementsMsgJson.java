	
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




import com.tmax.prosync.dto.DataMsgJson;


public class ElementsMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.Elements _Elements = (com.tmax.prosync.dto.Elements)obj;
		
		if(_Elements == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _Elements, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.Elements _Elements, JsonWriter writer )throws Exception{
	           
		
		writer.name("group");
		
	
		if (_Elements.getGroup() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Elements.getGroup()));
		}
	
		
		writer.name("classes");
		
	
		if (_Elements.getClasses() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Elements.getClasses()));
		}
	
		
		writer.name("data");
	
		com.tmax.prosync.dto.DataMsgJson __data = new com.tmax.prosync.dto.DataMsgJson();					
			if(_Elements.getData() != null) {
				writer.beginObject();
				__data.marshal((com.tmax.prosync.dto.Data)_Elements.getData(), writer);
				writer.endObject();
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
		
		com.tmax.prosync.dto.Elements _Elements = new com.tmax.prosync.dto.Elements();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Elements();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_Elements = (com.tmax.prosync.dto.Elements)unmarshal( jr,  _Elements);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _Elements;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.Elements _Elements = (com.tmax.prosync.dto.Elements) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Elements();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_Elements = (com.tmax.prosync.dto.Elements)unmarshal( jr,  _Elements);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _Elements;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.Elements dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.Elements dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "group" :
		{	
			dto.setGroup( reader.nextString());									
			break;
		}	
	
			
	
		case "classes" :
		{	
			dto.setClasses( reader.nextString());									
			break;
		}	
	
			
	
		case "data" :
		{	
			com.tmax.prosync.dto.DataMsgJson __data = new com.tmax.prosync.dto.DataMsgJson();
	
			com.tmax.prosync.dto.Data ___Data = new com.tmax.prosync.dto.Data();	
			reader.beginObject();
			dto.setData((com.tmax.prosync.dto.Data)__data.unmarshal( reader, ___Data ));
			reader.endObject();

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
