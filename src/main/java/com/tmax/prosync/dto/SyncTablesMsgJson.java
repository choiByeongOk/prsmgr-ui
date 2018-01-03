	
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






public class SyncTablesMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.SyncTables _SyncTables = (com.tmax.prosync.dto.SyncTables)obj;
		
		if(_SyncTables == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _SyncTables, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.SyncTables _SyncTables, JsonWriter writer )throws Exception{
	           
		
		writer.name("topId");
		
	
		if (_SyncTables.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTables.getTopId()));
		}
	
		
		writer.name("sourceDBName");
		
	
		if (_SyncTables.getSourceDBName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTables.getSourceDBName()));
		}
	
		
		writer.name("srcOwnerTable");
		
	
		if (_SyncTables.getSrcOwnerTable() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTables.getSrcOwnerTable()));
		}
	
		
		writer.name("targetDBName");
		
	
		if (_SyncTables.getTargetDBName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTables.getTargetDBName()));
		}
	
		
		writer.name("tarOwnerTable");
		
	
		if (_SyncTables.getTarOwnerTable() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTables.getTarOwnerTable()));
		}
	
		
		writer.name("group");
		
	
		if (_SyncTables.getGroup() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTables.getGroup()));
		}
	
		
		writer.name("map");
		
	
		if (_SyncTables.getMap() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTables.getMap()));
		}
	
		
		writer.name("Action");
		
	
		if (_SyncTables.getAction() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTables.getAction()));
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
		
		com.tmax.prosync.dto.SyncTables _SyncTables = new com.tmax.prosync.dto.SyncTables();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SyncTables();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_SyncTables = (com.tmax.prosync.dto.SyncTables)unmarshal( jr,  _SyncTables);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _SyncTables;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.SyncTables _SyncTables = (com.tmax.prosync.dto.SyncTables) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SyncTables();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_SyncTables = (com.tmax.prosync.dto.SyncTables)unmarshal( jr,  _SyncTables);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _SyncTables;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.SyncTables dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.SyncTables dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "topId" :
		{	
			dto.setTopId( reader.nextString());									
			break;
		}	
	
			
	
		case "sourceDBName" :
		{	
			dto.setSourceDBName( reader.nextString());									
			break;
		}	
	
			
	
		case "srcOwnerTable" :
		{	
			dto.setSrcOwnerTable( reader.nextString());									
			break;
		}	
	
			
	
		case "targetDBName" :
		{	
			dto.setTargetDBName( reader.nextString());									
			break;
		}	
	
			
	
		case "tarOwnerTable" :
		{	
			dto.setTarOwnerTable( reader.nextString());									
			break;
		}	
	
			
	
		case "group" :
		{	
			dto.setGroup( reader.nextString());									
			break;
		}	
	
			
	
		case "map" :
		{	
			dto.setMap( reader.nextString());									
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
