	
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




import com.tmax.prosync.dto.OwnerTablesMsgJson;


public class TablesListOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.TablesListOutput _TablesListOutput = (com.tmax.prosync.dto.TablesListOutput)obj;
		
		if(_TablesListOutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _TablesListOutput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.TablesListOutput _TablesListOutput, JsonWriter writer )throws Exception{
	           
		
		writer.name("ownerTables");
						    					
		com.tmax.prosync.dto.OwnerTablesMsgJson __ownerTables = new com.tmax.prosync.dto.OwnerTablesMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _TablesListOutput.sizeOwnerTables(); i++) {
			if(_TablesListOutput.getOwnerTablesList().get(i) != null) {
				writer.beginObject();
				__ownerTables.marshal((com.tmax.prosync.dto.OwnerTables)_TablesListOutput.getOwnerTables(i), writer);
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
		
		com.tmax.prosync.dto.TablesListOutput _TablesListOutput = new com.tmax.prosync.dto.TablesListOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.TablesListOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_TablesListOutput = (com.tmax.prosync.dto.TablesListOutput)unmarshal( jr,  _TablesListOutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _TablesListOutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.TablesListOutput _TablesListOutput = (com.tmax.prosync.dto.TablesListOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.TablesListOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_TablesListOutput = (com.tmax.prosync.dto.TablesListOutput)unmarshal( jr,  _TablesListOutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _TablesListOutput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.TablesListOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.TablesListOutput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
		case "ownerTables" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.OwnerTablesMsgJson __ownerTables = new com.tmax.prosync.dto.OwnerTablesMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.OwnerTables ___ownerTables = new com.tmax.prosync.dto.OwnerTables();	
				reader.beginObject();
				dto.getOwnerTablesList().add((com.tmax.prosync.dto.OwnerTables)__ownerTables.unmarshal( reader, ___ownerTables ));
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
