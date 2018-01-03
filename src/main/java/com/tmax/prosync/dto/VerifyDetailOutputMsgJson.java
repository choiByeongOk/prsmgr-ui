	
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






public class VerifyDetailOutputMsgJson extends Message {

	private static java.text.DecimalFormat nf =  (java.text.DecimalFormat)java.text.NumberFormat.getInstance();	

	public byte[] marshal(DataObject obj) throws Exception {			
		com.tmax.prosync.dto.VerifyDetailOutput _VerifyDetailOutput = (com.tmax.prosync.dto.VerifyDetailOutput)obj;
		
		if(_VerifyDetailOutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _VerifyDetailOutput, jw);
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.prosync.dto.VerifyDetailOutput _VerifyDetailOutput, JsonWriter writer )throws Exception{
	           
		
		writer.name("jobName");
		
	
		if (_VerifyDetailOutput.getJobName() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getJobName()));
		}
	
		
		writer.name("topId");
		
	
		if (_VerifyDetailOutput.getTopId() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getTopId()));
		}
	
		
		writer.name("byKey");
		
	
		if (_VerifyDetailOutput.getByKey() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getByKey()));
		}
	
		
		writer.name("processType");
		
	
		if (_VerifyDetailOutput.getProcessType() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getProcessType()));
		}
	
		
		writer.name("srcTableOwner");
		
	
		if (_VerifyDetailOutput.getSrcTableOwner() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getSrcTableOwner()));
		}
	
		
		writer.name("srcTable");
		
	
		if (_VerifyDetailOutput.getSrcTable() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getSrcTable()));
		}
	
		
		writer.name("srcPartition");
		
	
		if (_VerifyDetailOutput.getSrcPartition() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getSrcPartition()));
		}
	
		
		writer.name("srcWhere");
		
	
		if (_VerifyDetailOutput.getSrcWhere() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getSrcWhere()));
		}
	
		
		writer.name("tarTableOwner");
		
	
		if (_VerifyDetailOutput.getTarTableOwner() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getTarTableOwner()));
		}
	
		
		writer.name("tarTable");
		
	
		if (_VerifyDetailOutput.getTarTable() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getTarTable()));
		}
	
		
		writer.name("tarPartition");
		
	
		if (_VerifyDetailOutput.getTarPartition() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getTarPartition()));
		}
	
		
		writer.name("tarWhere");
		
	
		if (_VerifyDetailOutput.getTarWhere() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getTarWhere()));
		}
	
		
		writer.name("hint");
		
	
		if (_VerifyDetailOutput.getHint() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getHint()));
		}
	
		
		writer.name("where");
		
	
		if (_VerifyDetailOutput.getWhere() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getWhere()));
		}
	
		
		writer.name("orderBy");
		
	
		if (_VerifyDetailOutput.getOrderBy() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getOrderBy()));
		}
	
		
		writer.name("status");
		
	
		if (_VerifyDetailOutput.getStatus() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getStatus()));
		}
	
		
		writer.name("insertCount");
		
		writer.value(Integer.toString(_VerifyDetailOutput.getInsertCount()));
		
		writer.name("updateCount");
		
		writer.value(Integer.toString(_VerifyDetailOutput.getUpdateCount()));
		
		writer.name("deleteCount");
		
		writer.value(Integer.toString(_VerifyDetailOutput.getDeleteCount()));
		
		writer.name("ip");
		
	
		if (_VerifyDetailOutput.getIp() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getIp()));
		}
	
		
		writer.name("reportPath");
		
	
		if (_VerifyDetailOutput.getReportPath() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getReportPath()));
		}
	
		
		writer.name("errorDetail");
		
	
		if (_VerifyDetailOutput.getErrorDetail() == null) {
			writer.value("");
		} else {
			writer.value(removeNullChar(_VerifyDetailOutput.getErrorDetail()));
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
		
		com.tmax.prosync.dto.VerifyDetailOutput _VerifyDetailOutput = new com.tmax.prosync.dto.VerifyDetailOutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.VerifyDetailOutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_VerifyDetailOutput = (com.tmax.prosync.dto.VerifyDetailOutput)unmarshal( jr,  _VerifyDetailOutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _VerifyDetailOutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {
		
		com.tmax.prosync.dto.VerifyDetailOutput _VerifyDetailOutput = (com.tmax.prosync.dto.VerifyDetailOutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.prosync.dto.VerifyDetailOutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_VerifyDetailOutput = (com.tmax.prosync.dto.VerifyDetailOutput)unmarshal( jr,  _VerifyDetailOutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _VerifyDetailOutput;
	}
		
		 
	public DataObject unmarshal(JsonReader reader, com.tmax.prosync.dto.VerifyDetailOutput dto) throws Exception{

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
       	 return dto;
	}
		 
	protected void setField(com.tmax.prosync.dto.VerifyDetailOutput dto, JsonReader reader, String name) throws Exception{				
		
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
	
			
	
		case "processType" :
		{	
			dto.setProcessType( reader.nextString());									
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
	
			
	
		case "status" :
		{	
			dto.setStatus( reader.nextString());									
			break;
		}	
	
			
	
		case "insertCount" :
		{	
			dto.setInsertCount( reader.nextInt());									
			break;
		}	
	
			
	
		case "updateCount" :
		{	
			dto.setUpdateCount( reader.nextInt());									
			break;
		}	
	
			
	
		case "deleteCount" :
		{	
			dto.setDeleteCount( reader.nextInt());									
			break;
		}	
	
			
	
		case "ip" :
		{	
			dto.setIp( reader.nextString());									
			break;
		}	
	
			
	
		case "reportPath" :
		{	
			dto.setReportPath( reader.nextString());									
			break;
		}	
	
			
	
		case "errorDetail" :
		{	
			dto.setErrorDetail( reader.nextString());									
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
