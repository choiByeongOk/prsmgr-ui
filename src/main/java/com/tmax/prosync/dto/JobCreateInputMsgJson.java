	
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






public class JobCreateInputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.JobCreateInput _JobCreateInput = (com.tmax.prosync.dto.JobCreateInput)obj;
		
		if(_JobCreateInput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _JobCreateInput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.JobCreateInput _JobCreateInput, JsonWriter writer )throws Exception{
	           
		
		writer.name("jobName");
		
	
		if (_JobCreateInput.getJobName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getJobName()));
		}
	
		
		writer.name("topId");
		
	
		if (_JobCreateInput.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getTopId()));
		}
	
		
		writer.name("byKey");
		
	
		if (_JobCreateInput.getByKey() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getByKey()));
		}
	
		
		writer.name("srcTableOwner");
		
	
		if (_JobCreateInput.getSrcTableOwner() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getSrcTableOwner()));
		}
	
		
		writer.name("srcTable");
		
	
		if (_JobCreateInput.getSrcTable() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getSrcTable()));
		}
	
		
		writer.name("srcPartition");
		
	
		if (_JobCreateInput.getSrcPartition() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getSrcPartition()));
		}
	
		
		writer.name("srcWhere");
		
	
		if (_JobCreateInput.getSrcWhere() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getSrcWhere()));
		}
	
		
		writer.name("tarTableOwner");
		
	
		if (_JobCreateInput.getTarTableOwner() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getTarTableOwner()));
		}
	
		
		writer.name("tarTable");
		
	
		if (_JobCreateInput.getTarTable() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getTarTable()));
		}
	
		
		writer.name("tarPartition");
		
	
		if (_JobCreateInput.getTarPartition() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getTarPartition()));
		}
	
		
		writer.name("tarWhere");
		
	
		if (_JobCreateInput.getTarWhere() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getTarWhere()));
		}
	
		
		writer.name("hint");
		
	
		if (_JobCreateInput.getHint() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getHint()));
		}
	
		
		writer.name("where");
		
	
		if (_JobCreateInput.getWhere() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getWhere()));
		}
	
		
		writer.name("orderBy");
		
	
		if (_JobCreateInput.getOrderBy() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_JobCreateInput.getOrderBy()));
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
		
		com.tmax.prosync.dto.JobCreateInput _JobCreateInput = new com.tmax.prosync.dto.JobCreateInput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.JobCreateInput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_JobCreateInput = (com.tmax.prosync.dto.JobCreateInput)unmarshal( jr,  _JobCreateInput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _JobCreateInput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.JobCreateInput _JobCreateInput = (com.tmax.prosync.dto.JobCreateInput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.JobCreateInput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_JobCreateInput = (com.tmax.prosync.dto.JobCreateInput)unmarshal( jr,  _JobCreateInput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _JobCreateInput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.JobCreateInput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.JobCreateInput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "jobName" :
		{	
			dto.setJobName( reader.nextString());									
			break;
		}	
	
			
	
		case "topId" :
		{	
			dto.setTopId( reader.nextString());									
			break;
		}	
	
			
	
		case "byKey" :
		{	
			dto.setByKey( reader.nextString());									
			break;
		}	
	
			
	
		case "srcTableOwner" :
		{	
			dto.setSrcTableOwner( reader.nextString());									
			break;
		}	
	
			
	
		case "srcTable" :
		{	
			dto.setSrcTable( reader.nextString());									
			break;
		}	
	
			
	
		case "srcPartition" :
		{	
			dto.setSrcPartition( reader.nextString());									
			break;
		}	
	
			
	
		case "srcWhere" :
		{	
			dto.setSrcWhere( reader.nextString());									
			break;
		}	
	
			
	
		case "tarTableOwner" :
		{	
			dto.setTarTableOwner( reader.nextString());									
			break;
		}	
	
			
	
		case "tarTable" :
		{	
			dto.setTarTable( reader.nextString());									
			break;
		}	
	
			
	
		case "tarPartition" :
		{	
			dto.setTarPartition( reader.nextString());									
			break;
		}	
	
			
	
		case "tarWhere" :
		{	
			dto.setTarWhere( reader.nextString());									
			break;
		}	
	
			
	
		case "hint" :
		{	
			dto.setHint( reader.nextString());									
			break;
		}	
	
			
	
		case "where" :
		{	
			dto.setWhere( reader.nextString());									
			break;
		}	
	
			
	
		case "orderBy" :
		{	
			dto.setOrderBy( reader.nextString());									
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
