	
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
public class TargetDbs extends DataObject {
	private static final String DTO_LOGICAL_NAME = "TargetDbs";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public TargetDbs() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : targetDBName
	 * Comments    : 
	 */		

	private String targetDBName = EMPTY_STRING;
	
			
	private boolean targetDBName_nullable = false;
	
	public boolean isNullableTargetDBName() {
		return this.targetDBName_nullable;
	}	
	
	private boolean targetDBName_invalidation = false;
	
	public void setInvalidationTargetDBName(boolean invalidation) { 
		this.targetDBName_invalidation = invalidation;
	}
	
	public boolean isInvalidationTargetDBName() {
		return this.targetDBName_invalidation;
	}
	
	private boolean targetDBName_modified = false;
	

	public boolean isModifiedTargetDBName() {
		return this.targetDBName_modified;
	}
	
	public void unModifiedTargetDBName() {
		this.targetDBName_modified = false;
	}

	public String getTargetDBName() {
		return targetDBName;
	}
	public String getNvlTargetDBName() {
		if(getTargetDBName() == null) {
			return  EMPTY_STRING;
		} else {
			return getTargetDBName();
		}
	}
	public void setTargetDBName(String targetDBName) {
		if(targetDBName == null) {
			this.targetDBName  = EMPTY_STRING;
		} else {
			this.targetDBName = targetDBName;
		}
		this.targetDBName_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.targetDBName_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.targetDBName_modified == true)
			modifiedFields.add("targetDBName");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		TargetDbs copyObj = new TargetDbs();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _targetDbs) {
		if(this == _targetDbs) return;
		TargetDbs __targetDbs = (TargetDbs) _targetDbs;
		
		this.setTargetDBName(__targetDbs.getTargetDBName());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("targetDBName : ").append(targetDBName).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("targetDBName"
							, FieldPropertyFactory.getFieldProperty( "targetDBName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "targetDBName" : return getTargetDBName();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "targetDBName" : setTargetDBName((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(TargetDbs obj) {
		if (obj == this) return true;					
		if(this.targetDBName != null ? !this.targetDBName.equals(obj.getTargetDBName()) : obj.getTargetDBName() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
