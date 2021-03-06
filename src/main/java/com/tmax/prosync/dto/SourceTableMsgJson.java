	
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






public class SourceTableMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.SourceTable _SourceTable = (com.tmax.prosync.dto.SourceTable)obj;
		
		if(_SourceTable == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _SourceTable, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.SourceTable _SourceTable, JsonWriter writer )throws Exception{
	           
		
		writer.name("topId");
		
	
		if (_SourceTable.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SourceTable.getTopId()));
		}
	
		
		writer.name("xId");
		
		writer.value(Integer.toString(_SourceTable.getXId()));
		
		writer.name("tsn");
		
		writer.value(Integer.toString(_SourceTable.getTsn()));
		
		writer.name("ddSeqNum");
		
		writer.value(Integer.toString(_SourceTable.getDdSeqNum()));
		
		writer.name("userId");
		
	
		if (_SourceTable.getUserId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SourceTable.getUserId()));
		}
	
		
		writer.name("tableName");
		
	
		if (_SourceTable.getTableName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SourceTable.getTableName()));
		}
	
		
		writer.name("instanceId");
		
		writer.value(Integer.toString(_SourceTable.getInstanceId()));
								  					
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
		
		com.tmax.prosync.dto.SourceTable _SourceTable = new com.tmax.prosync.dto.SourceTable();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SourceTable();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_SourceTable = (com.tmax.prosync.dto.SourceTable)unmarshal( jr,  _SourceTable);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _SourceTable;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.SourceTable _SourceTable = (com.tmax.prosync.dto.SourceTable) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SourceTable();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_SourceTable = (com.tmax.prosync.dto.SourceTable)unmarshal( jr,  _SourceTable);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _SourceTable;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.SourceTable dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.SourceTable dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "topId" :
		{	
			dto.setTopId( reader.nextString());									
			break;
		}	
	
			
	
		case "xId" :
		{	
			dto.setXId( reader.nextInt());									
			break;
		}	
	
			
	
		case "tsn" :
		{	
			dto.setTsn( reader.nextInt());									
			break;
		}	
	
			
	
		case "ddSeqNum" :
		{	
			dto.setDdSeqNum( reader.nextInt());									
			break;
		}	
	
			
	
		case "userId" :
		{	
			dto.setUserId( reader.nextString());									
			break;
		}	
	
			
	
		case "tableName" :
		{	
			dto.setTableName( reader.nextString());									
			break;
		}	
	
			
	
		case "instanceId" :
		{	
			dto.setInstanceId( reader.nextInt());									
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
