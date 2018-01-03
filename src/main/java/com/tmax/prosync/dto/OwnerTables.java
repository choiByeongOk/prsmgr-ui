	
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
public class OwnerTables extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ownerTables";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public OwnerTables() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : ownerTable
	 * Comments    : 
	 */		

	private String ownerTable = EMPTY_STRING;
	
			
	private boolean ownerTable_nullable = false;
	
	public boolean isNullableOwnerTable() {
		return this.ownerTable_nullable;
	}	
	
	private boolean ownerTable_invalidation = false;
	
	public void setInvalidationOwnerTable(boolean invalidation) { 
		this.ownerTable_invalidation = invalidation;
	}
	
	public boolean isInvalidationOwnerTable() {
		return this.ownerTable_invalidation;
	}
	
	private boolean ownerTable_modified = false;
	

	public boolean isModifiedOwnerTable() {
		return this.ownerTable_modified;
	}
	
	public void unModifiedOwnerTable() {
		this.ownerTable_modified = false;
	}

	public String getOwnerTable() {
		return ownerTable;
	}
	public String getNvlOwnerTable() {
		if(getOwnerTable() == null) {
			return  EMPTY_STRING;
		} else {
			return getOwnerTable();
		}
	}
	public void setOwnerTable(String ownerTable) {
		if(ownerTable == null) {
			this.ownerTable  = EMPTY_STRING;
		} else {
			this.ownerTable = ownerTable;
		}
		this.ownerTable_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.ownerTable_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.ownerTable_modified == true)
			modifiedFields.add("ownerTable");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		OwnerTables copyObj = new OwnerTables();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _ownerTables) {
		if(this == _ownerTables) return;
		OwnerTables __ownerTables = (OwnerTables) _ownerTables;
		
		this.setOwnerTable(__ownerTables.getOwnerTable());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("ownerTable : ").append(ownerTable).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("ownerTable"
							, FieldPropertyFactory.getFieldProperty( "ownerTable","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 256 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "ownerTable" : return getOwnerTable();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "ownerTable" : setOwnerTable((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(OwnerTables obj) {
		if (obj == this) return true;					
		if(this.ownerTable != null ? !this.ownerTable.equals(obj.getOwnerTable()) : obj.getOwnerTable() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
