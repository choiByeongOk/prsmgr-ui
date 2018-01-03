	
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
public class Groups extends DataObject {
	private static final String DTO_LOGICAL_NAME = "Groups";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public Groups() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : groupNum
	 * Comments    : 
	 */		

	private int groupNum;
	
		
	
	private boolean groupNum_invalidation = false;
	
	public void setInvalidationGroupNum(boolean invalidation) { 
		this.groupNum_invalidation = invalidation;
	}
	
	public boolean isInvalidationGroupNum() {
		return this.groupNum_invalidation;
	}
	
	private boolean groupNum_modified = false;
	

	public boolean isModifiedGroupNum() {
		return this.groupNum_modified;
	}
	
	public void unModifiedGroupNum() {
		this.groupNum_modified = false;
	}

	public int getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
		this.groupNum_modified = true;
		this.isModified = true;
	}
	
	public void setGroupNum(Integer groupNum) {
		if( groupNum == null) {
			this.groupNum = 0;
		} else{
			this.groupNum = groupNum.intValue();
		}
		this.groupNum_modified = true;
		this.isModified = true;
	}
	public void setGroupNum(String groupNum) {
		if  (groupNum==null || groupNum.length() == 0) {
			this.groupNum = 0;
		} else {
			this.groupNum = Integer.parseInt(groupNum);
		}
		this.groupNum_modified = true;
		this.isModified = true;
	}		

	@Override
	public void clearAllIsModified() {
		this.groupNum_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.groupNum_modified == true)
			modifiedFields.add("groupNum");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		Groups copyObj = new Groups();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _groups) {
		if(this == _groups) return;
		Groups __groups = (Groups) _groups;
		
		this.setGroupNum(__groups.getGroupNum());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("groupNum : ").append(groupNum).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("groupNum"
							, FieldPropertyFactory.getFieldProperty( "groupNum","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 16 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "groupNum" : return getGroupNum();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "groupNum" : setGroupNum((Integer)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(Groups obj) {
		if (obj == this) return true;				
		if(this.groupNum != obj.getGroupNum()) return false; 				
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
