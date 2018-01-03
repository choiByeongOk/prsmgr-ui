	
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






public class SyncTableInstanceMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.SyncTableInstance _SyncTableInstance = (com.tmax.prosync.dto.SyncTableInstance)obj;
		
		if(_SyncTableInstance == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _SyncTableInstance, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.SyncTableInstance _SyncTableInstance, JsonWriter writer )throws Exception{
	           
		
		writer.name("syncTableId");
		
		writer.value(Integer.toString(_SyncTableInstance.getSyncTableId()));
		
		writer.name("topId");
		
	
		if (_SyncTableInstance.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTableInstance.getTopId()));
		}
	
		
		writer.name("xId");
		
		writer.value(Integer.toString(_SyncTableInstance.getXId()));
		
		writer.name("tsn");
		
		writer.value(Integer.toString(_SyncTableInstance.getTsn()));
		
		writer.name("ddSeqNum");
		
		writer.value(Integer.toString(_SyncTableInstance.getDdSeqNum()));
		
		writer.name("userId");
		
	
		if (_SyncTableInstance.getUserId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTableInstance.getUserId()));
		}
	
		
		writer.name("tableName");
		
	
		if (_SyncTableInstance.getTableName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTableInstance.getTableName()));
		}
	
		
		writer.name("instanceId");
		
		writer.value(Integer.toString(_SyncTableInstance.getInstanceId()));
		
		writer.name("syncType");
		
	
		if (_SyncTableInstance.getSyncType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTableInstance.getSyncType()));
		}
	
		
		writer.name("name");
		
	
		if (_SyncTableInstance.getName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTableInstance.getName()));
		}
	
		
		writer.name("mappingTableId");
		
		writer.value(Integer.toString(_SyncTableInstance.getMappingTableId()));
								  					
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
		
		com.tmax.prosync.dto.SyncTableInstance _SyncTableInstance = new com.tmax.prosync.dto.SyncTableInstance();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SyncTableInstance();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_SyncTableInstance = (com.tmax.prosync.dto.SyncTableInstance)unmarshal( jr,  _SyncTableInstance);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _SyncTableInstance;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.SyncTableInstance _SyncTableInstance = (com.tmax.prosync.dto.SyncTableInstance) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SyncTableInstance();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_SyncTableInstance = (com.tmax.prosync.dto.SyncTableInstance)unmarshal( jr,  _SyncTableInstance);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _SyncTableInstance;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.SyncTableInstance dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.SyncTableInstance dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "syncTableId" :
		{	
			dto.setSyncTableId( reader.nextInt());									
			break;
		}	
	
			
	
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
	
			
	
		case "syncType" :
		{	
			dto.setSyncType( reader.nextString());									
			break;
		}	
	
			
	
		case "name" :
		{	
			dto.setName( reader.nextString());									
			break;
		}	
	
			
	
		case "mappingTableId" :
		{	
			dto.setMappingTableId( reader.nextInt());									
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
