	
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




import com.tmax.prosync.dto.StatMsgJson;


public class StatsRealTimeOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.StatsRealTimeOutput _StatsRealTimeOutput = (com.tmax.prosync.dto.StatsRealTimeOutput)obj;
		
		if(_StatsRealTimeOutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _StatsRealTimeOutput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.StatsRealTimeOutput _StatsRealTimeOutput, JsonWriter writer )throws Exception{
	           
		
		writer.name("stat");
						    					
		com.tmax.prosync.dto.StatMsgJson __stat = new com.tmax.prosync.dto.StatMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _StatsRealTimeOutput.sizeStat(); i++) {
			if(_StatsRealTimeOutput.getStatList().get(i) != null) {
				writer.beginObject();
				__stat.marshal((com.tmax.prosync.dto.Stat)_StatsRealTimeOutput.getStat(i), writer);
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
		
		com.tmax.prosync.dto.StatsRealTimeOutput _StatsRealTimeOutput = new com.tmax.prosync.dto.StatsRealTimeOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.StatsRealTimeOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_StatsRealTimeOutput = (com.tmax.prosync.dto.StatsRealTimeOutput)unmarshal( jr,  _StatsRealTimeOutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _StatsRealTimeOutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.StatsRealTimeOutput _StatsRealTimeOutput = (com.tmax.prosync.dto.StatsRealTimeOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.StatsRealTimeOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_StatsRealTimeOutput = (com.tmax.prosync.dto.StatsRealTimeOutput)unmarshal( jr,  _StatsRealTimeOutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _StatsRealTimeOutput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.StatsRealTimeOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.StatsRealTimeOutput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
		case "stat" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.StatMsgJson __stat = new com.tmax.prosync.dto.StatMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.Stat ___Stat = new com.tmax.prosync.dto.Stat();	
				reader.beginObject();
				dto.getStatList().add((com.tmax.prosync.dto.Stat)__stat.unmarshal( reader, ___Stat ));
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
