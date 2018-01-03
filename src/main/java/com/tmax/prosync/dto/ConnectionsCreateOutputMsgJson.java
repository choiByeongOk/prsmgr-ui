	
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




import com.tmax.prosync.dto.ElementsMsgJson;
import com.tmax.prosync.dto.SrcDbInfoMsgJson;
import com.tmax.prosync.dto.TarDbInfoMsgJson;


public class ConnectionsCreateOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.ConnectionsCreateOutput _ConnectionsCreateOutput = (com.tmax.prosync.dto.ConnectionsCreateOutput)obj;
		
		if(_ConnectionsCreateOutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _ConnectionsCreateOutput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.ConnectionsCreateOutput _ConnectionsCreateOutput, JsonWriter writer )throws Exception{
	           
		
		writer.name("topIds");
		
	
		if (_ConnectionsCreateOutput.getTopIds() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ConnectionsCreateOutput.getTopIds()));
		}
	
		
		writer.name("projectType");
		
	
		if (_ConnectionsCreateOutput.getProjectType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_ConnectionsCreateOutput.getProjectType()));
		}
	
		
		writer.name("elements");
						    					
		com.tmax.prosync.dto.ElementsMsgJson __elements = new com.tmax.prosync.dto.ElementsMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _ConnectionsCreateOutput.sizeElements(); i++) {
			if(_ConnectionsCreateOutput.getElementsList().get(i) != null) {
				writer.beginObject();
				__elements.marshal((com.tmax.prosync.dto.Elements)_ConnectionsCreateOutput.getElements(i), writer);
				writer.endObject();
			}
		}
		writer.endArray();	
		writer.name("srcDbInfo");
						    					
		com.tmax.prosync.dto.SrcDbInfoMsgJson __srcDbInfo = new com.tmax.prosync.dto.SrcDbInfoMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _ConnectionsCreateOutput.sizeSrcDbInfo(); i++) {
			if(_ConnectionsCreateOutput.getSrcDbInfoList().get(i) != null) {
				writer.beginObject();
				__srcDbInfo.marshal((com.tmax.prosync.dto.SrcDbInfo)_ConnectionsCreateOutput.getSrcDbInfo(i), writer);
				writer.endObject();
			}
		}
		writer.endArray();	
		writer.name("tarDbInfo");
						    					
		com.tmax.prosync.dto.TarDbInfoMsgJson __tarDbInfo = new com.tmax.prosync.dto.TarDbInfoMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _ConnectionsCreateOutput.sizeTarDbInfo(); i++) {
			if(_ConnectionsCreateOutput.getTarDbInfoList().get(i) != null) {
				writer.beginObject();
				__tarDbInfo.marshal((com.tmax.prosync.dto.TarDbInfo)_ConnectionsCreateOutput.getTarDbInfo(i), writer);
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
		
		com.tmax.prosync.dto.ConnectionsCreateOutput _ConnectionsCreateOutput = new com.tmax.prosync.dto.ConnectionsCreateOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ConnectionsCreateOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_ConnectionsCreateOutput = (com.tmax.prosync.dto.ConnectionsCreateOutput)unmarshal( jr,  _ConnectionsCreateOutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _ConnectionsCreateOutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.ConnectionsCreateOutput _ConnectionsCreateOutput = (com.tmax.prosync.dto.ConnectionsCreateOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ConnectionsCreateOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_ConnectionsCreateOutput = (com.tmax.prosync.dto.ConnectionsCreateOutput)unmarshal( jr,  _ConnectionsCreateOutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _ConnectionsCreateOutput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.ConnectionsCreateOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.ConnectionsCreateOutput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "topIds" :
		{	
			dto.setTopIds( reader.nextString());									
			break;
		}	
	
			
	
		case "projectType" :
		{	
			dto.setProjectType( reader.nextString());									
			break;
		}	
	
			
		case "elements" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.ElementsMsgJson __elements = new com.tmax.prosync.dto.ElementsMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.Elements ___Elements = new com.tmax.prosync.dto.Elements();	
				reader.beginObject();
				dto.getElementsList().add((com.tmax.prosync.dto.Elements)__elements.unmarshal( reader, ___Elements ));
				reader.endObject();
			}
			reader.endArray();
			break;
		}			
		case "srcDbInfo" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.SrcDbInfoMsgJson __srcDbInfo = new com.tmax.prosync.dto.SrcDbInfoMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.SrcDbInfo ___SrcDbInfo = new com.tmax.prosync.dto.SrcDbInfo();	
				reader.beginObject();
				dto.getSrcDbInfoList().add((com.tmax.prosync.dto.SrcDbInfo)__srcDbInfo.unmarshal( reader, ___SrcDbInfo ));
				reader.endObject();
			}
			reader.endArray();
			break;
		}			
		case "tarDbInfo" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.TarDbInfoMsgJson __tarDbInfo = new com.tmax.prosync.dto.TarDbInfoMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.TarDbInfo ___TarDbInfo = new com.tmax.prosync.dto.TarDbInfo();	
				reader.beginObject();
				dto.getTarDbInfoList().add((com.tmax.prosync.dto.TarDbInfo)__tarDbInfo.unmarshal( reader, ___TarDbInfo ));
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
