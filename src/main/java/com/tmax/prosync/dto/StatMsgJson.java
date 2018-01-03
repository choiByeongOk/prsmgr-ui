	
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






public class StatMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.Stat _Stat = (com.tmax.prosync.dto.Stat)obj;
		
		if(_Stat == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _Stat, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.Stat _Stat, JsonWriter writer )throws Exception{
	           
		
		writer.name("topId");
		
	
		if (_Stat.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Stat.getTopId()));
		}
	
		
		writer.name("processType");
		
	
		if (_Stat.getProcessType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Stat.getProcessType()));
		}
	
		
		writer.name("processNum");
		
		writer.value(Integer.toString(_Stat.getProcessNum()));
		
		writer.name("timeType");
		
	
		if (_Stat.getTimeType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Stat.getTimeType()));
		}
	
		
		writer.name("dmlInsert");
		
		writer.value(Integer.toString(_Stat.getDmlInsert()));
		
		writer.name("dmlUpdate");
		
		writer.value(Integer.toString(_Stat.getDmlUpdate()));
		
		writer.name("dmlDelete");
		
		writer.value(Integer.toString(_Stat.getDmlDelete()));
		
		writer.name("tx");
		
		writer.value(Integer.toString(_Stat.getTx()));
		
		writer.name("ddl");
		
		writer.value(Integer.toString(_Stat.getDdl()));
		
		writer.name("skipDml");
		
		writer.value(Integer.toString(_Stat.getSkipDml()));
		
		writer.name("time");
		
	
		if (_Stat.getTime() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_Stat.getTime()));
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
		
		com.tmax.prosync.dto.Stat _Stat = new com.tmax.prosync.dto.Stat();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Stat();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_Stat = (com.tmax.prosync.dto.Stat)unmarshal( jr,  _Stat);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _Stat;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.Stat _Stat = (com.tmax.prosync.dto.Stat) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.Stat();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_Stat = (com.tmax.prosync.dto.Stat)unmarshal( jr,  _Stat);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _Stat;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.Stat dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.Stat dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "topId" :
		{	
			dto.setTopId( reader.nextString());									
			break;
		}	
	
			
	
		case "processType" :
		{	
			dto.setProcessType( reader.nextString());									
			break;
		}	
	
			
	
		case "processNum" :
		{	
			dto.setProcessNum( reader.nextInt());									
			break;
		}	
	
			
	
		case "timeType" :
		{	
			dto.setTimeType( reader.nextString());									
			break;
		}	
	
			
	
		case "dmlInsert" :
		{	
			dto.setDmlInsert( reader.nextInt());									
			break;
		}	
	
			
	
		case "dmlUpdate" :
		{	
			dto.setDmlUpdate( reader.nextInt());									
			break;
		}	
	
			
	
		case "dmlDelete" :
		{	
			dto.setDmlDelete( reader.nextInt());									
			break;
		}	
	
			
	
		case "tx" :
		{	
			dto.setTx( reader.nextInt());									
			break;
		}	
	
			
	
		case "ddl" :
		{	
			dto.setDdl( reader.nextInt());									
			break;
		}	
	
			
	
		case "skipDml" :
		{	
			dto.setSkipDml( reader.nextInt());									
			break;
		}	
	
			
	
		case "time" :
		{	
			dto.setTime( reader.nextString());									
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
