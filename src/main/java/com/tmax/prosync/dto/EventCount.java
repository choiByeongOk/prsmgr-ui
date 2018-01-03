	
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
public class EventCount extends DataObject {
	private static final String DTO_LOGICAL_NAME = "EventCount";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public EventCount() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : projectId
	 * Comments    : 
	 */		

	private String projectId = EMPTY_STRING;
	
			
	private boolean projectId_nullable = false;
	
	public boolean isNullableProjectId() {
		return this.projectId_nullable;
	}	
	
	private boolean projectId_invalidation = false;
	
	public void setInvalidationProjectId(boolean invalidation) { 
		this.projectId_invalidation = invalidation;
	}
	
	public boolean isInvalidationProjectId() {
		return this.projectId_invalidation;
	}
	
	private boolean projectId_modified = false;
	

	public boolean isModifiedProjectId() {
		return this.projectId_modified;
	}
	
	public void unModifiedProjectId() {
		this.projectId_modified = false;
	}

	public String getProjectId() {
		return projectId;
	}
	public String getNvlProjectId() {
		if(getProjectId() == null) {
			return  EMPTY_STRING;
		} else {
			return getProjectId();
		}
	}
	public void setProjectId(String projectId) {
		if(projectId == null) {
			this.projectId  = EMPTY_STRING;
		} else {
			this.projectId = projectId;
		}
		this.projectId_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : failEventCount
	 * Comments    : 
	 */		

	private int failEventCount;
	
		
	
	private boolean failEventCount_invalidation = false;
	
	public void setInvalidationFailEventCount(boolean invalidation) { 
		this.failEventCount_invalidation = invalidation;
	}
	
	public boolean isInvalidationFailEventCount() {
		return this.failEventCount_invalidation;
	}
	
	private boolean failEventCount_modified = false;
	

	public boolean isModifiedFailEventCount() {
		return this.failEventCount_modified;
	}
	
	public void unModifiedFailEventCount() {
		this.failEventCount_modified = false;
	}

	public int getFailEventCount() {
		return failEventCount;
	}
	public void setFailEventCount(int failEventCount) {
		this.failEventCount = failEventCount;
		this.failEventCount_modified = true;
		this.isModified = true;
	}
	
	public void setFailEventCount(Integer failEventCount) {
		if( failEventCount == null) {
			this.failEventCount = 0;
		} else{
			this.failEventCount = failEventCount.intValue();
		}
		this.failEventCount_modified = true;
		this.isModified = true;
	}
	public void setFailEventCount(String failEventCount) {
		if  (failEventCount==null || failEventCount.length() == 0) {
			this.failEventCount = 0;
		} else {
			this.failEventCount = Integer.parseInt(failEventCount);
		}
		this.failEventCount_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : errorEventCount
	 * Comments    : 
	 */		

	private int errorEventCount;
	
		
	
	private boolean errorEventCount_invalidation = false;
	
	public void setInvalidationErrorEventCount(boolean invalidation) { 
		this.errorEventCount_invalidation = invalidation;
	}
	
	public boolean isInvalidationErrorEventCount() {
		return this.errorEventCount_invalidation;
	}
	
	private boolean errorEventCount_modified = false;
	

	public boolean isModifiedErrorEventCount() {
		return this.errorEventCount_modified;
	}
	
	public void unModifiedErrorEventCount() {
		this.errorEventCount_modified = false;
	}

	public int getErrorEventCount() {
		return errorEventCount;
	}
	public void setErrorEventCount(int errorEventCount) {
		this.errorEventCount = errorEventCount;
		this.errorEventCount_modified = true;
		this.isModified = true;
	}
	
	public void setErrorEventCount(Integer errorEventCount) {
		if( errorEventCount == null) {
			this.errorEventCount = 0;
		} else{
			this.errorEventCount = errorEventCount.intValue();
		}
		this.errorEventCount_modified = true;
		this.isModified = true;
	}
	public void setErrorEventCount(String errorEventCount) {
		if  (errorEventCount==null || errorEventCount.length() == 0) {
			this.errorEventCount = 0;
		} else {
			this.errorEventCount = Integer.parseInt(errorEventCount);
		}
		this.errorEventCount_modified = true;
		this.isModified = true;
	}		

	@Override
	public void clearAllIsModified() {
		this.projectId_modified = false;
		this.failEventCount_modified = false;
		this.errorEventCount_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.projectId_modified == true)
			modifiedFields.add("projectId");
		if(this.failEventCount_modified == true)
			modifiedFields.add("failEventCount");
		if(this.errorEventCount_modified == true)
			modifiedFields.add("errorEventCount");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		EventCount copyObj = new EventCount();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _eventCount) {
		if(this == _eventCount) return;
		EventCount __eventCount = (EventCount) _eventCount;
		
		this.setProjectId(__eventCount.getProjectId());
		this.setFailEventCount(__eventCount.getFailEventCount());
		this.setErrorEventCount(__eventCount.getErrorEventCount());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("projectId : ").append(projectId).append("\n");				
		buffer.append("failEventCount : ").append(failEventCount).append("\n");				
		buffer.append("errorEventCount : ").append(errorEventCount).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(3);
		fieldPropertyMap.put("projectId"
							, FieldPropertyFactory.getFieldProperty( "projectId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("failEventCount"
							, FieldPropertyFactory.getFieldProperty( "failEventCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("errorEventCount"
							, FieldPropertyFactory.getFieldProperty( "errorEventCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "projectId" : return getProjectId();
			case "failEventCount" : return getFailEventCount();
			case "errorEventCount" : return getErrorEventCount();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "projectId" : setProjectId((String)arg);break;
			case "failEventCount" : setFailEventCount((Integer)arg);break;
			case "errorEventCount" : setErrorEventCount((Integer)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(EventCount obj) {
		if (obj == this) return true;					
		if(this.projectId != null ? !this.projectId.equals(obj.getProjectId()) : obj.getProjectId() != null) return false; 									
		if(this.failEventCount != obj.getFailEventCount()) return false; 								
		if(this.errorEventCount != obj.getErrorEventCount()) return false; 				
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
