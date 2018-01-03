	
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






public class TarDbInfoMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.TarDbInfo _TarDbInfo = (com.tmax.prosync.dto.TarDbInfo)obj;
		
		if(_TarDbInfo == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _TarDbInfo, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.TarDbInfo _TarDbInfo, JsonWriter writer )throws Exception{
	           
		
		writer.name("instance");
		
	
		if (_TarDbInfo.getInstance() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_TarDbInfo.getInstance()));
		}
	
		
		writer.name("engineType");
		
	
		if (_TarDbInfo.getEngineType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_TarDbInfo.getEngineType()));
		}
	
		
		writer.name("ip");
		
	
		if (_TarDbInfo.getIp() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_TarDbInfo.getIp()));
		}
	
		
		writer.name("cluster");
		
	
		if (_TarDbInfo.getCluster() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_TarDbInfo.getCluster()));
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
		
		com.tmax.prosync.dto.TarDbInfo _TarDbInfo = new com.tmax.prosync.dto.TarDbInfo();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.TarDbInfo();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_TarDbInfo = (com.tmax.prosync.dto.TarDbInfo)unmarshal( jr,  _TarDbInfo);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _TarDbInfo;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.TarDbInfo _TarDbInfo = (com.tmax.prosync.dto.TarDbInfo) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.TarDbInfo();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_TarDbInfo = (com.tmax.prosync.dto.TarDbInfo)unmarshal( jr,  _TarDbInfo);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _TarDbInfo;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.TarDbInfo dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.TarDbInfo dto, JsonReader reader, String name) throws Exception{				
		
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
