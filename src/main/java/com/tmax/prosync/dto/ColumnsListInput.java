	
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
public class ColumnsListInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ColumnsListInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ColumnsListInput() {
			super();
			
	}	 
	
	private boolean isModified = false;

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
		this.topId_modified = false;
		this.ownerTable_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.ownerTable_modified == true)
			modifiedFields.add("ownerTable");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ColumnsListInput copyObj = new ColumnsListInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _columnsListInput) {
		if(this == _columnsListInput) return;
		ColumnsListInput __columnsListInput = (ColumnsListInput) _columnsListInput;
		
		this.setTopId(__columnsListInput.getTopId());
		this.setOwnerTable(__columnsListInput.getOwnerTable());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("ownerTable : ").append(ownerTable).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(2);
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
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
			case "topId" : return getTopId();
			case "ownerTable" : return getOwnerTable();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topId" : setTopId((String)arg);break;
			case "ownerTable" : setOwnerTable((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ColumnsListInput obj) {
		if (obj == this) return true;					
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.ownerTable != null ? !this.ownerTable.equals(obj.getOwnerTable()) : obj.getOwnerTable() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
