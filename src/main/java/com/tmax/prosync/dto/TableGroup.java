	
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
public class TableGroup extends DataObject {
	private static final String DTO_LOGICAL_NAME = "TableGroup";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public TableGroup() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : groupId
	 * Comments    : 
	 */		

	private int groupId;
	
		
	
	private boolean groupId_invalidation = false;
	
	public void setInvalidationGroupId(boolean invalidation) { 
		this.groupId_invalidation = invalidation;
	}
	
	public boolean isInvalidationGroupId() {
		return this.groupId_invalidation;
	}
	
	private boolean groupId_modified = false;
	

	public boolean isModifiedGroupId() {
		return this.groupId_modified;
	}
	
	public void unModifiedGroupId() {
		this.groupId_modified = false;
	}

	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
		this.groupId_modified = true;
		this.isModified = true;
	}
	
	public void setGroupId(Integer groupId) {
		if( groupId == null) {
			this.groupId = 0;
		} else{
			this.groupId = groupId.intValue();
		}
		this.groupId_modified = true;
		this.isModified = true;
	}
	public void setGroupId(String groupId) {
		if  (groupId==null || groupId.length() == 0) {
			this.groupId = 0;
		} else {
			this.groupId = Integer.parseInt(groupId);
		}
		this.groupId_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : instanceId
	 * Comments    : 
	 */		

	private int instanceId;
	
		
	
	private boolean instanceId_invalidation = false;
	
	public void setInvalidationInstanceId(boolean invalidation) { 
		this.instanceId_invalidation = invalidation;
	}
	
	public boolean isInvalidationInstanceId() {
		return this.instanceId_invalidation;
	}
	
	private boolean instanceId_modified = false;
	

	public boolean isModifiedInstanceId() {
		return this.instanceId_modified;
	}
	
	public void unModifiedInstanceId() {
		this.instanceId_modified = false;
	}

	public int getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(int instanceId) {
		this.instanceId = instanceId;
		this.instanceId_modified = true;
		this.isModified = true;
	}
	
	public void setInstanceId(Integer instanceId) {
		if( instanceId == null) {
			this.instanceId = 0;
		} else{
			this.instanceId = instanceId.intValue();
		}
		this.instanceId_modified = true;
		this.isModified = true;
	}
	public void setInstanceId(String instanceId) {
		if  (instanceId==null || instanceId.length() == 0) {
			this.instanceId = 0;
		} else {
			this.instanceId = Integer.parseInt(instanceId);
		}
		this.instanceId_modified = true;
		this.isModified = true;
	}		

	@Override
	public void clearAllIsModified() {
		this.groupId_modified = false;
		this.instanceId_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.groupId_modified == true)
			modifiedFields.add("groupId");
		if(this.instanceId_modified == true)
			modifiedFields.add("instanceId");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		TableGroup copyObj = new TableGroup();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _tableGroup) {
		if(this == _tableGroup) return;
		TableGroup __tableGroup = (TableGroup) _tableGroup;
		
		this.setGroupId(__tableGroup.getGroupId());
		this.setInstanceId(__tableGroup.getInstanceId());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("groupId : ").append(groupId).append("\n");				
		buffer.append("instanceId : ").append(instanceId).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(2);
		fieldPropertyMap.put("groupId"
							, FieldPropertyFactory.getFieldProperty( "groupId","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("instanceId"
							, FieldPropertyFactory.getFieldProperty( "instanceId","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "groupId" : return getGroupId();
			case "instanceId" : return getInstanceId();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "groupId" : setGroupId((Integer)arg);break;
			case "instanceId" : setInstanceId((Integer)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(TableGroup obj) {
		if (obj == this) return true;				
		if(this.groupId != obj.getGroupId()) return false; 								
		if(this.instanceId != obj.getInstanceId()) return false; 				
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
