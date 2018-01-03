	
package com.tmax.prosync.dto;

import java.io.IOException;
import java.util.List;

import java.util.ArrayList;

import java.util.Map;

import com.tmax.promapper.engine.dto.record.common.FieldProperty;
import com.tmax.promapper.engine.dto.record.common.FieldPropertyFactory;
import com.tmax.proobject.model.exception.FieldNotFoundException;
import com.tmax.proobject.core.exception.ProObjectRuntimeException;
import com.tmax.proobject.core.constant.ProObjectExceptionCode;

import com.tmax.proobject.model.dataobject.DataObject;








@com.tmax.proobject.core.DataObject
public class JobRetryInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "JobRetryInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public JobRetryInput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : jobName
	 * Comments    : 
	 */		

	private String jobName = EMPTY_STRING;
	
			
	private boolean jobName_nullable = false;
	
	public boolean isNullableJobName() {
		return this.jobName_nullable;
	}	
	
	private boolean jobName_invalidation = false;
	
	public void setInvalidationJobName(boolean invalidation) { 
		this.jobName_invalidation = invalidation;
	}
	
	public boolean isInvalidationJobName() {
		return this.jobName_invalidation;
	}
	
	private boolean jobName_modified = false;
	

	public boolean isModifiedJobName() {
		return this.jobName_modified;
	}
	
	public void unModifiedJobName() {
		this.jobName_modified = false;
	}

	public String getJobName() {
		return jobName;
	}
	public String getNvlJobName() {
		if(getJobName() == null) {
			return  EMPTY_STRING;
		} else {
			return getJobName();
		}
	}
	public void setJobName(String jobName) {
		if(jobName == null) {
			this.jobName  = EMPTY_STRING;
		} else {
			this.jobName = jobName;
		}
		this.jobName_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : topId
	 * Comments    : 
	 */		

	private String topId = EMPTY_STRING;
	
			
	private boolean topId_nullable = false;
	
	public boolean isNullableTopId() {
		return this.topId_nullable;
	}	
	
	private boolean topId_invalidation = false;
	
	public void setInvalidationTopId(boolean invalidation) { 
		this.topId_invalidation = invalidation;
	}
	
	public boolean isInvalidationTopId() {
		return this.topId_invalidation;
	}
	
	private boolean topId_modified = false;
	

	public boolean isModifiedTopId() {
		return this.topId_modified;
	}
	
	public void unModifiedTopId() {
		this.topId_modified = false;
	}

	public String getTopId() {
		return topId;
	}
	public String getNvlTopId() {
		if(getTopId() == null) {
			return  EMPTY_STRING;
		} else {
			return getTopId();
		}
	}
	public void setTopId(String topId) {
		if(topId == null) {
			this.topId  = EMPTY_STRING;
		} else {
			this.topId = topId;
		}
		this.topId_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.jobName_modified = false;
		this.topId_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.jobName_modified == true)
			modifiedFields.add("jobName");
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		JobRetryInput copyObj = new JobRetryInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _jobRetryInput) {
		if(this == _jobRetryInput) return;
		JobRetryInput __jobRetryInput = (JobRetryInput) _jobRetryInput;
		
		this.setJobName(__jobRetryInput.getJobName());
		this.setTopId(__jobRetryInput.getTopId());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("jobName : ").append(jobName).append("\n");				
		buffer.append("topId : ").append(topId).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(2);
		fieldPropertyMap.put("jobName"
							, FieldPropertyFactory.getFieldProperty( "jobName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "jobName" : return getJobName();
			case "topId" : return getTopId();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "jobName" : setJobName((String)arg);break;
			case "topId" : setTopId((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(JobRetryInput obj) {
		if (obj == this) return true;					
		if(this.jobName != null ? !this.jobName.equals(obj.getJobName()) : obj.getJobName() != null) return false; 										
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
