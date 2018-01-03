	
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






public class SyncTablesListInputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.SyncTablesListInput _SyncTablesListInput = (com.tmax.prosync.dto.SyncTablesListInput)obj;
		
		if(_SyncTablesListInput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _SyncTablesListInput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.SyncTablesListInput _SyncTablesListInput, JsonWriter writer )throws Exception{
	           
		
		writer.name("topId");
		
	
		if (_SyncTablesListInput.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTablesListInput.getTopId()));
		}
	
		
		writer.name("tableRowCount");
		
		writer.value(Integer.toString(_SyncTablesListInput.getTableRowCount()));
		
		writer.name("pageNum");
		
		writer.value(Integer.toString(_SyncTablesListInput.getPageNum()));
		
		writer.name("targetDBName");
		
	
		if (_SyncTablesListInput.getTargetDBName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SyncTablesListInput.getTargetDBName()));
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
		
		com.tmax.prosync.dto.SyncTablesListInput _SyncTablesListInput = new com.tmax.prosync.dto.SyncTablesListInput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SyncTablesListInput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_SyncTablesListInput = (com.tmax.prosync.dto.SyncTablesListInput)unmarshal( jr,  _SyncTablesListInput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _SyncTablesListInput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.SyncTablesListInput _SyncTablesListInput = (com.tmax.prosync.dto.SyncTablesListInput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SyncTablesListInput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_SyncTablesListInput = (com.tmax.prosync.dto.SyncTablesListInput)unmarshal( jr,  _SyncTablesListInput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _SyncTablesListInput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.SyncTablesListInput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.SyncTablesListInput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "topId" :
		{	
			dto.setTopId( reader.nextString());									
			break;
		}	
	
			
	
		case "tableRowCount" :
		{	
			dto.setTableRowCount( reader.nextInt());									
			break;
		}	
	
			
	
		case "pageNum" :
		{	
			dto.setPageNum( reader.nextInt());									
			break;
		}	
	
			
	
		case "targetDBName" :
		{	
			dto.setTargetDBName( reader.nextString());									
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
