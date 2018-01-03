	
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
public class Columns extends DataObject {
	private static final String DTO_LOGICAL_NAME = "Columns";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public Columns() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : columnName
	 * Comments    : 
	 */		

	private String columnName = EMPTY_STRING;
	
			
	private boolean columnName_nullable = false;
	
	public boolean isNullableColumnName() {
		return this.columnName_nullable;
	}	
	
	private boolean columnName_invalidation = false;
	
	public void setInvalidationColumnName(boolean invalidation) { 
		this.columnName_invalidation = invalidation;
	}
	
	public boolean isInvalidationColumnName() {
		return this.columnName_invalidation;
	}
	
	private boolean columnName_modified = false;
	

	public boolean isModifiedColumnName() {
		return this.columnName_modified;
	}
	
	public void unModifiedColumnName() {
		this.columnName_modified = false;
	}

	public String getColumnName() {
		return columnName;
	}
	public String getNvlColumnName() {
		if(getColumnName() == null) {
			return  EMPTY_STRING;
		} else {
			return getColumnName();
		}
	}
	public void setColumnName(String columnName) {
		if(columnName == null) {
			this.columnName  = EMPTY_STRING;
		} else {
			this.columnName = columnName;
		}
		this.columnName_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.columnName_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.columnName_modified == true)
			modifiedFields.add("columnName");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		Columns copyObj = new Columns();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _columns) {
		if(this == _columns) return;
		Columns __columns = (Columns) _columns;
		
		this.setColumnName(__columns.getColumnName());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("columnName : ").append(columnName).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("columnName"
							, FieldPropertyFactory.getFieldProperty( "columnName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 256 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "columnName" : return getColumnName();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "columnName" : setColumnName((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(Columns obj) {
		if (obj == this) return true;					
		if(this.columnName != null ? !this.columnName.equals(obj.getColumnName()) : obj.getColumnName() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
