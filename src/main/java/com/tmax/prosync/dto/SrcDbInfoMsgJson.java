	
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






public class SrcDbInfoMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.SrcDbInfo _SrcDbInfo = (com.tmax.prosync.dto.SrcDbInfo)obj;
		
		if(_SrcDbInfo == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _SrcDbInfo, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.SrcDbInfo _SrcDbInfo, JsonWriter writer )throws Exception{
	           
		
		writer.name("instance");
		
	
		if (_SrcDbInfo.getInstance() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SrcDbInfo.getInstance()));
		}
	
		
		writer.name("engineType");
		
	
		if (_SrcDbInfo.getEngineType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SrcDbInfo.getEngineType()));
		}
	
		
		writer.name("ip");
		
	
		if (_SrcDbInfo.getIp() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SrcDbInfo.getIp()));
		}
	
		
		writer.name("cluster");
		
	
		if (_SrcDbInfo.getCluster() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SrcDbInfo.getCluster()));
		}
	
		
		writer.name("charset");
		
	
		if (_SrcDbInfo.getCharset() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SrcDbInfo.getCharset()));
		}
	
		
		writer.name("ncharset");
		
	
		if (_SrcDbInfo.getNcharset() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_SrcDbInfo.getNcharset()));
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
		
		com.tmax.prosync.dto.SrcDbInfo _SrcDbInfo = new com.tmax.prosync.dto.SrcDbInfo();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SrcDbInfo();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_SrcDbInfo = (com.tmax.prosync.dto.SrcDbInfo)unmarshal( jr,  _SrcDbInfo);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _SrcDbInfo;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.SrcDbInfo _SrcDbInfo = (com.tmax.prosync.dto.SrcDbInfo) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.SrcDbInfo();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_SrcDbInfo = (com.tmax.prosync.dto.SrcDbInfo)unmarshal( jr,  _SrcDbInfo);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _SrcDbInfo;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.SrcDbInfo dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.SrcDbInfo dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "instance" :
		{	
			dto.setInstance( reader.nextString());									
			break;
		}	
	
			
	
		case "engineType" :
		{	
			dto.setEngineType( reader.nextString());									
			break;
		}	
	
			
	
		case "ip" :
		{	
			dto.setIp( reader.nextString());									
			break;
		}	
	
			
	
		case "cluster" :
		{	
			dto.setCluster( reader.nextString());									
			break;
		}	
	
			
	
		case "charset" :
		{	
			dto.setCharset( reader.nextString());									
			break;
		}	
	
			
	
		case "ncharset" :
		{	
			dto.setNcharset( reader.nextString());									
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
