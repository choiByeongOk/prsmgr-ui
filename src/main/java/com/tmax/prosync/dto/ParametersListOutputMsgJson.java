	
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




import com.tmax.prosync.dto.ParameterMsgJson;


public class ParametersListOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.ParametersListOutput _ParametersListOutput = (com.tmax.prosync.dto.ParametersListOutput)obj;
		
		if(_ParametersListOutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _ParametersListOutput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.ParametersListOutput _ParametersListOutput, JsonWriter writer )throws Exception{
	           
		
		writer.name("parameter");
						    					
		com.tmax.prosync.dto.ParameterMsgJson __parameter = new com.tmax.prosync.dto.ParameterMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _ParametersListOutput.sizeParameter(); i++) {
			if(_ParametersListOutput.getParameterList().get(i) != null) {
				writer.beginObject();
				__parameter.marshal((com.tmax.prosync.dto.Parameter)_ParametersListOutput.getParameter(i), writer);
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
		
		com.tmax.prosync.dto.ParametersListOutput _ParametersListOutput = new com.tmax.prosync.dto.ParametersListOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ParametersListOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_ParametersListOutput = (com.tmax.prosync.dto.ParametersListOutput)unmarshal( jr,  _ParametersListOutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _ParametersListOutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.ParametersListOutput _ParametersListOutput = (com.tmax.prosync.dto.ParametersListOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.ParametersListOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_ParametersListOutput = (com.tmax.prosync.dto.ParametersListOutput)unmarshal( jr,  _ParametersListOutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _ParametersListOutput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.ParametersListOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.ParametersListOutput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
		case "parameter" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.ParameterMsgJson __parameter = new com.tmax.prosync.dto.ParameterMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.Parameter ___Parameter = new com.tmax.prosync.dto.Parameter();	
				reader.beginObject();
				dto.getParameterList().add((com.tmax.prosync.dto.Parameter)__parameter.unmarshal( reader, ___Parameter ));
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
