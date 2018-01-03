	
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




import com.tmax.prosync.dto.SourceDbsMsgJson;
import com.tmax.prosync.dto.TargetDbsMsgJson;


public class DbsListOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.DbsListOutput _DbsListOutput = (com.tmax.prosync.dto.DbsListOutput)obj;
		
		if(_DbsListOutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _DbsListOutput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.DbsListOutput _DbsListOutput, JsonWriter writer )throws Exception{
	           
		
		writer.name("sourceDbs");
						    					
		com.tmax.prosync.dto.SourceDbsMsgJson __sourceDbs = new com.tmax.prosync.dto.SourceDbsMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _DbsListOutput.sizeSourceDbs(); i++) {
			if(_DbsListOutput.getSourceDbsList().get(i) != null) {
				writer.beginObject();
				__sourceDbs.marshal((com.tmax.prosync.dto.SourceDbs)_DbsListOutput.getSourceDbs(i), writer);
				writer.endObject();
			}
		}
		writer.endArray();	
		writer.name("targetDbs");
						    					
		com.tmax.prosync.dto.TargetDbsMsgJson __targetDbs = new com.tmax.prosync.dto.TargetDbsMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _DbsListOutput.sizeTargetDbs(); i++) {
			if(_DbsListOutput.getTargetDbsList().get(i) != null) {
				writer.beginObject();
				__targetDbs.marshal((com.tmax.prosync.dto.TargetDbs)_DbsListOutput.getTargetDbs(i), writer);
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
		
		com.tmax.prosync.dto.DbsListOutput _DbsListOutput = new com.tmax.prosync.dto.DbsListOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.DbsListOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_DbsListOutput = (com.tmax.prosync.dto.DbsListOutput)unmarshal( jr,  _DbsListOutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _DbsListOutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.DbsListOutput _DbsListOutput = (com.tmax.prosync.dto.DbsListOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.DbsListOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_DbsListOutput = (com.tmax.prosync.dto.DbsListOutput)unmarshal( jr,  _DbsListOutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _DbsListOutput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.DbsListOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.DbsListOutput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
		case "sourceDbs" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.SourceDbsMsgJson __sourceDbs = new com.tmax.prosync.dto.SourceDbsMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.SourceDbs ___SourceDbs = new com.tmax.prosync.dto.SourceDbs();	
				reader.beginObject();
				dto.getSourceDbsList().add((com.tmax.prosync.dto.SourceDbs)__sourceDbs.unmarshal( reader, ___SourceDbs ));
				reader.endObject();
			}
			reader.endArray();
			break;
		}			
		case "targetDbs" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.TargetDbsMsgJson __targetDbs = new com.tmax.prosync.dto.TargetDbsMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.TargetDbs ___TargetDbs = new com.tmax.prosync.dto.TargetDbs();	
				reader.beginObject();
				dto.getTargetDbsList().add((com.tmax.prosync.dto.TargetDbs)__targetDbs.unmarshal( reader, ___TargetDbs ));
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
