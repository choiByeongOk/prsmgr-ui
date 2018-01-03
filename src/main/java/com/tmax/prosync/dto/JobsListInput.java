	
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
public class JobsListInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "JobsListInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public JobsListInput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : topIds
	 * Comments    : 
	 */		

	private String topIds = EMPTY_STRING;
	
			
	private boolean topIds_nullable = false;
	
	public boolean isNullableTopIds() {
		return this.topIds_nullable;
	}	
	
	private boolean topIds_invalidation = false;
	
	public void setInvalidationTopIds(boolean invalidation) { 
		this.topIds_invalidation = invalidation;
	}
	
	public boolean isInvalidationTopIds() {
		return this.topIds_invalidation;
	}
	
	private boolean topIds_modified = false;
	

	public boolean isModifiedTopIds() {
		return this.topIds_modified;
	}
	
	public void unModifiedTopIds() {
		this.topIds_modified = false;
	}

	public String getTopIds() {
		return topIds;
	}
	public String getNvlTopIds() {
		if(getTopIds() == null) {
			return  EMPTY_STRING;
		} else {
			return getTopIds();
		}
	}
	public void setTopIds(String topIds) {
		if(topIds == null) {
			this.topIds  = EMPTY_STRING;
		} else {
			this.topIds = topIds;
		}
		this.topIds_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.topIds_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.topIds_modified == true)
			modifiedFields.add("topIds");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		JobsListInput copyObj = new JobsListInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _jobsListInput) {
		if(this == _jobsListInput) return;
		JobsListInput __jobsListInput = (JobsListInput) _jobsListInput;
		
		this.setTopIds(__jobsListInput.getTopIds());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topIds : ").append(topIds).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("topIds"
							, FieldPropertyFactory.getFieldProperty( "topIds","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 1024 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "topIds" : return getTopIds();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topIds" : setTopIds((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(JobsListInput obj) {
		if (obj == this) return true;					
		if(this.topIds != null ? !this.topIds.equals(obj.getTopIds()) : obj.getTopIds() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
