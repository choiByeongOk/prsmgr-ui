	
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


public class ConnectionsListOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.ConnectionsListOutput _ConnectionsListOutput = (com.tmax.prosync.dto.ConnectionsListOutput)obj;
		
		if(_ConnectionsListOutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _ConnectionsListOutput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.ConnectionsListOutput _ConnectionsListOutput, JsonWriter writer )throws Exception{
	           
		
		writer.name("connection");
						    					
		com.tmax.prosync.dto.ConnectionMsgJson __connection = new com.tmax.prosync.dto.ConnectionMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _ConnectionsListOutput.sizeConnection(); i++) {
			if(_ConnectionsListOutput.getConnectionList().get(i) != null) {
				writer.beginObject();
				__connection.marshal((com.tmax.prosync.dto.Connection)_ConnectionsListOutput.getConnection(i), writer);
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
		
		com.tmax.prosync.dto.ConnectionsListOutput _ConnectionsListOutput = new com.tmax.prosync.dto.ConnectionsListOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ConnectionsListOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_ConnectionsListOutput = (com.tmax.prosync.dto.ConnectionsListOutput)unmarshal( jr,  _ConnectionsListOutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _ConnectionsListOutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.ConnectionsListOutput _ConnectionsListOutput = (com.tmax.prosync.dto.ConnectionsListOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ConnectionsListOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_ConnectionsListOutput = (com.tmax.prosync.dto.ConnectionsListOutput)unmarshal( jr,  _ConnectionsListOutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _ConnectionsListOutput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.ConnectionsListOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.ConnectionsListOutput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
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
