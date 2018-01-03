	
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




import com.tmax.prosync.dto.KeyValueMsgJson;


public class ParametersEditInputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.ParametersEditInput _parametersEditInput = (com.tmax.prosync.dto.ParametersEditInput)obj;
		
		if(_parametersEditInput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _parametersEditInput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.ParametersEditInput _parametersEditInput, JsonWriter writer )throws Exception{
	           
		
		writer.name("topId");
		
	
		if (_parametersEditInput.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_parametersEditInput.getTopId()));
		}
	
		
		writer.name("processType");
		
	
		if (_parametersEditInput.getProcessType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_parametersEditInput.getProcessType()));
		}
	
		
		writer.name("processNum");
		
		writer.value(Integer.toString(_parametersEditInput.getProcessNum()));
		
		writer.name("type");
		
	
		if (_parametersEditInput.getType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_parametersEditInput.getType()));
		}
	
		
		writer.name("keyValue");
						    					
		com.tmax.prosync.dto.KeyValueMsgJson __keyValue = new com.tmax.prosync.dto.KeyValueMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _parametersEditInput.sizeKeyValue(); i++) {
			if(_parametersEditInput.getKeyValueList().get(i) != null) {
				writer.beginObject();
				__keyValue.marshal((com.tmax.prosync.dto.KeyValue)_parametersEditInput.getKeyValue(i), writer);
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
		
		com.tmax.prosync.dto.ParametersEditInput _parametersEditInput = new com.tmax.prosync.dto.ParametersEditInput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ParametersEditInput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_parametersEditInput = (com.tmax.prosync.dto.ParametersEditInput)unmarshal( jr,  _parametersEditInput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _parametersEditInput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.ParametersEditInput _parametersEditInput = (com.tmax.prosync.dto.ParametersEditInput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ParametersEditInput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_parametersEditInput = (com.tmax.prosync.dto.ParametersEditInput)unmarshal( jr,  _parametersEditInput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _parametersEditInput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.ParametersEditInput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.ParametersEditInput dto, JsonReader reader, String name) throws Exception{				
		
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
	
			
	
		case "type" :
		{	
			dto.setType( reader.nextString());									
			break;
		}	
	
			
		case "keyValue" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.KeyValueMsgJson __keyValue = new com.tmax.prosync.dto.KeyValueMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.KeyValue ___KeyValue = new com.tmax.prosync.dto.KeyValue();	
				reader.beginObject();
				dto.getKeyValueList().add((com.tmax.prosync.dto.KeyValue)__keyValue.unmarshal( reader, ___KeyValue ));
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
