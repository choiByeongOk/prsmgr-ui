	
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






public class LongTxMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.LongTx _LongTx = (com.tmax.prosync.dto.LongTx)obj;
		
		if(_LongTx == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _LongTx, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.LongTx _LongTx, JsonWriter writer )throws Exception{
	           
		
		writer.name("topId");
		
	
		if (_LongTx.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_LongTx.getTopId()));
		}
	
		
		writer.name("xId");
		
		writer.value(Integer.toString(_LongTx.getXId()));
		
		writer.name("insertCount");
		
		writer.value(Integer.toString(_LongTx.getInsertCount()));
		
		writer.name("updateCount");
		
		writer.value(Integer.toString(_LongTx.getUpdateCount()));
		
		writer.name("deleteCount");
		
		writer.value(Integer.toString(_LongTx.getDeleteCount()));
		
		writer.name("startTime");
		
	
		if (_LongTx.getStartTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_LongTx.getStartTime()));
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
		
		com.tmax.prosync.dto.LongTx _LongTx = new com.tmax.prosync.dto.LongTx();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.LongTx();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_LongTx = (com.tmax.prosync.dto.LongTx)unmarshal( jr,  _LongTx);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _LongTx;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.LongTx _LongTx = (com.tmax.prosync.dto.LongTx) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.LongTx();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_LongTx = (com.tmax.prosync.dto.LongTx)unmarshal( jr,  _LongTx);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _LongTx;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.LongTx dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.LongTx dto, JsonReader reader, String name) throws Exception{				
		
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
	
			
	
		case "insertCount" :
		{	
			dto.setInsertCount( reader.nextInt());									
			break;
		}	
	
			
	
		case "updateCount" :
		{	
			dto.setUpdateCount( reader.nextInt());									
			break;
		}	
	
			
	
		case "deleteCount" :
		{	
			dto.setDeleteCount( reader.nextInt());									
			break;
		}	
	
			
	
		case "startTime" :
		{	
			dto.setStartTime( reader.nextString());									
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
