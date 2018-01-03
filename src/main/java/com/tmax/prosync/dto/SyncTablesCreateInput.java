	
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
public class SyncTablesCreateInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "SyncTablesCreateInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public SyncTablesCreateInput() {
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
			

	/**
	 * LogicalName : map
	 * Comments    : 
	 */		

	private String map = EMPTY_STRING;
	
			
	private boolean map_nullable = false;
	
	public boolean isNullableMap() {
		return this.map_nullable;
	}	
	
	private boolean map_invalidation = false;
	
	public void setInvalidationMap(boolean invalidation) { 
		this.map_invalidation = invalidation;
	}
	
	public boolean isInvalidationMap() {
		return this.map_invalidation;
	}
	
	private boolean map_modified = false;
	

	public boolean isModifiedMap() {
		return this.map_modified;
	}
	
	public void unModifiedMap() {
		this.map_modified = false;
	}

	public String getMap() {
		return map;
	}
	public String getNvlMap() {
		if(getMap() == null) {
			return  EMPTY_STRING;
		} else {
			return getMap();
		}
	}
	public void setMap(String map) {
		if(map == null) {
			this.map  = EMPTY_STRING;
		} else {
			this.map = map;
		}
		this.map_modified = true;
		this.isModified = true;
	}	
			

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
		this.topId_modified = false;
		this.targetDBName_modified = false;
		this.ownerTable_modified = false;
		this.map_modified = false;
		this.groupNum_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.targetDBName_modified == true)
			modifiedFields.add("targetDBName");
		if(this.ownerTable_modified == true)
			modifiedFields.add("ownerTable");
		if(this.map_modified == true)
			modifiedFields.add("map");
		if(this.groupNum_modified == true)
			modifiedFields.add("groupNum");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		SyncTablesCreateInput copyObj = new SyncTablesCreateInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _syncTablesCreateInput) {
		if(this == _syncTablesCreateInput) return;
		SyncTablesCreateInput __syncTablesCreateInput = (SyncTablesCreateInput) _syncTablesCreateInput;
		
		this.setTopId(__syncTablesCreateInput.getTopId());
		this.setTargetDBName(__syncTablesCreateInput.getTargetDBName());
		this.setOwnerTable(__syncTablesCreateInput.getOwnerTable());
		this.setMap(__syncTablesCreateInput.getMap());
		this.setGroupNum(__syncTablesCreateInput.getGroupNum());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("targetDBName : ").append(targetDBName).append("\n");				
		buffer.append("ownerTable : ").append(ownerTable).append("\n");				
		buffer.append("map : ").append(map).append("\n");				
		buffer.append("groupNum : ").append(groupNum).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(5);
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("targetDBName"
							, FieldPropertyFactory.getFieldProperty( "targetDBName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("ownerTable"
							, FieldPropertyFactory.getFieldProperty( "ownerTable","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 256 , -1, null, null));		
		fieldPropertyMap.put("map"
							, FieldPropertyFactory.getFieldProperty( "map","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 1000 , -1, null, null));		
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
			case "topId" : return getTopId();
			case "targetDBName" : return getTargetDBName();
			case "ownerTable" : return getOwnerTable();
			case "map" : return getMap();
			case "groupNum" : return getGroupNum();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topId" : setTopId((String)arg);break;
			case "targetDBName" : setTargetDBName((String)arg);break;
			case "ownerTable" : setOwnerTable((String)arg);break;
			case "map" : setMap((String)arg);break;
			case "groupNum" : setGroupNum((Integer)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(SyncTablesCreateInput obj) {
		if (obj == this) return true;					
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.targetDBName != null ? !this.targetDBName.equals(obj.getTargetDBName()) : obj.getTargetDBName() != null) return false; 										
		if(this.ownerTable != null ? !this.ownerTable.equals(obj.getOwnerTable()) : obj.getOwnerTable() != null) return false; 										
		if(this.map != null ? !this.map.equals(obj.getMap()) : obj.getMap() != null) return false; 									
		if(this.groupNum != obj.getGroupNum()) return false; 				
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
