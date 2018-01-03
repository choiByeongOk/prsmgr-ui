	
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
public class SourceDbs extends DataObject {
	private static final String DTO_LOGICAL_NAME = "SourceDbs";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public SourceDbs() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : sourceDBName
	 * Comments    : 
	 */		

	private String sourceDBName = EMPTY_STRING;
	
			
	private boolean sourceDBName_nullable = false;
	
	public boolean isNullableSourceDBName() {
		return this.sourceDBName_nullable;
	}	
	
	private boolean sourceDBName_invalidation = false;
	
	public void setInvalidationSourceDBName(boolean invalidation) { 
		this.sourceDBName_invalidation = invalidation;
	}
	
	public boolean isInvalidationSourceDBName() {
		return this.sourceDBName_invalidation;
	}
	
	private boolean sourceDBName_modified = false;
	

	public boolean isModifiedSourceDBName() {
		return this.sourceDBName_modified;
	}
	
	public void unModifiedSourceDBName() {
		this.sourceDBName_modified = false;
	}

	public String getSourceDBName() {
		return sourceDBName;
	}
	public String getNvlSourceDBName() {
		if(getSourceDBName() == null) {
			return  EMPTY_STRING;
		} else {
			return getSourceDBName();
		}
	}
	public void setSourceDBName(String sourceDBName) {
		if(sourceDBName == null) {
			this.sourceDBName  = EMPTY_STRING;
		} else {
			this.sourceDBName = sourceDBName;
		}
		this.sourceDBName_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.sourceDBName_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.sourceDBName_modified == true)
			modifiedFields.add("sourceDBName");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		SourceDbs copyObj = new SourceDbs();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _sourceDbs) {
		if(this == _sourceDbs) return;
		SourceDbs __sourceDbs = (SourceDbs) _sourceDbs;
		
		this.setSourceDBName(__sourceDbs.getSourceDBName());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("sourceDBName : ").append(sourceDBName).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("sourceDBName"
							, FieldPropertyFactory.getFieldProperty( "sourceDBName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "sourceDBName" : return getSourceDBName();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "sourceDBName" : setSourceDBName((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(SourceDbs obj) {
		if (obj == this) return true;					
		if(this.sourceDBName != null ? !this.sourceDBName.equals(obj.getSourceDBName()) : obj.getSourceDBName() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
