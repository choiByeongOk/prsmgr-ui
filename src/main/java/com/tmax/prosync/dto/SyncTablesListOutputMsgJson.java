	
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




import com.tmax.prosync.dto.SyncTablesMsgJson;


public class SyncTablesListOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.SyncTablesListOutput _SyncTablesListOutput = (com.tmax.prosync.dto.SyncTablesListOutput)obj;
		
		if(_SyncTablesListOutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _SyncTablesListOutput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.SyncTablesListOutput _SyncTablesListOutput, JsonWriter writer )throws Exception{
	           
		
		writer.name("syncTables");
						    					
		com.tmax.prosync.dto.SyncTablesMsgJson __syncTables = new com.tmax.prosync.dto.SyncTablesMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _SyncTablesListOutput.sizeSyncTables(); i++) {
			if(_SyncTablesListOutput.getSyncTablesList().get(i) != null) {
				writer.beginObject();
				__syncTables.marshal((com.tmax.prosync.dto.SyncTables)_SyncTablesListOutput.getSyncTables(i), writer);
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
		
		com.tmax.prosync.dto.SyncTablesListOutput _SyncTablesListOutput = new com.tmax.prosync.dto.SyncTablesListOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SyncTablesListOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_SyncTablesListOutput = (com.tmax.prosync.dto.SyncTablesListOutput)unmarshal( jr,  _SyncTablesListOutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _SyncTablesListOutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.SyncTablesListOutput _SyncTablesListOutput = (com.tmax.prosync.dto.SyncTablesListOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SyncTablesListOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_SyncTablesListOutput = (com.tmax.prosync.dto.SyncTablesListOutput)unmarshal( jr,  _SyncTablesListOutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _SyncTablesListOutput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.SyncTablesListOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.SyncTablesListOutput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
		case "syncTables" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.SyncTablesMsgJson __syncTables = new com.tmax.prosync.dto.SyncTablesMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.SyncTables ___SyncTables = new com.tmax.prosync.dto.SyncTables();	
				reader.beginObject();
				dto.getSyncTablesList().add((com.tmax.prosync.dto.SyncTables)__syncTables.unmarshal( reader, ___SyncTables ));
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
