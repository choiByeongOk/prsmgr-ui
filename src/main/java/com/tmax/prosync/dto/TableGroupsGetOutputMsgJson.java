	
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




import com.tmax.prosync.dto.TableGroupMsgJson;


public class TableGroupsGetOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.TableGroupsGetOutput _tableGroupsGetOutput = (com.tmax.prosync.dto.TableGroupsGetOutput)obj;
		
		if(_tableGroupsGetOutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _tableGroupsGetOutput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.TableGroupsGetOutput _tableGroupsGetOutput, JsonWriter writer )throws Exception{
	           
		
		writer.name("tableGroup");
						    					
		com.tmax.prosync.dto.TableGroupMsgJson __tableGroup = new com.tmax.prosync.dto.TableGroupMsgJson();					
		writer.beginArray();					
		for(int i = 0; i < _tableGroupsGetOutput.sizeTableGroup(); i++) {
			if(_tableGroupsGetOutput.getTableGroupList().get(i) != null) {
				writer.beginObject();
				__tableGroup.marshal((com.tmax.prosync.dto.TableGroup)_tableGroupsGetOutput.getTableGroup(i), writer);
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
		
		com.tmax.prosync.dto.TableGroupsGetOutput _tableGroupsGetOutput = new com.tmax.prosync.dto.TableGroupsGetOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.TableGroupsGetOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_tableGroupsGetOutput = (com.tmax.prosync.dto.TableGroupsGetOutput)unmarshal( jr,  _tableGroupsGetOutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _tableGroupsGetOutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.TableGroupsGetOutput _tableGroupsGetOutput = (com.tmax.prosync.dto.TableGroupsGetOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.TableGroupsGetOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_tableGroupsGetOutput = (com.tmax.prosync.dto.TableGroupsGetOutput)unmarshal( jr,  _tableGroupsGetOutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _tableGroupsGetOutput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.TableGroupsGetOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.TableGroupsGetOutput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
		case "tableGroup" :
		{
			reader.beginArray();
			com.tmax.prosync.dto.TableGroupMsgJson __tableGroup = new com.tmax.prosync.dto.TableGroupMsgJson();
			while( reader.hasNext() ){	
				com.tmax.prosync.dto.TableGroup ___TableGroup = new com.tmax.prosync.dto.TableGroup();	
				reader.beginObject();
				dto.getTableGroupList().add((com.tmax.prosync.dto.TableGroup)__tableGroup.unmarshal( reader, ___TableGroup ));
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
