	
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
public class SyncTables extends DataObject {
	private static final String DTO_LOGICAL_NAME = "SyncTables";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public SyncTables() {
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
			

	/**
	 * LogicalName : srcOwnerTable
	 * Comments    : 
	 */		

	private String srcOwnerTable = EMPTY_STRING;
	
			
	private boolean srcOwnerTable_nullable = false;
	
	public boolean isNullableSrcOwnerTable() {
		return this.srcOwnerTable_nullable;
	}	
	
	private boolean srcOwnerTable_invalidation = false;
	
	public void setInvalidationSrcOwnerTable(boolean invalidation) { 
		this.srcOwnerTable_invalidation = invalidation;
	}
	
	public boolean isInvalidationSrcOwnerTable() {
		return this.srcOwnerTable_invalidation;
	}
	
	private boolean srcOwnerTable_modified = false;
	

	public boolean isModifiedSrcOwnerTable() {
		return this.srcOwnerTable_modified;
	}
	
	public void unModifiedSrcOwnerTable() {
		this.srcOwnerTable_modified = false;
	}

	public String getSrcOwnerTable() {
		return srcOwnerTable;
	}
	public String getNvlSrcOwnerTable() {
		if(getSrcOwnerTable() == null) {
			return  EMPTY_STRING;
		} else {
			return getSrcOwnerTable();
		}
	}
	public void setSrcOwnerTable(String srcOwnerTable) {
		if(srcOwnerTable == null) {
			this.srcOwnerTable  = EMPTY_STRING;
		} else {
			this.srcOwnerTable = srcOwnerTable;
		}
		this.srcOwnerTable_modified = true;
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
	 * LogicalName : tarOwnerTable
	 * Comments    : 
	 */		

	private String tarOwnerTable = EMPTY_STRING;
	
			
	private boolean tarOwnerTable_nullable = false;
	
	public boolean isNullableTarOwnerTable() {
		return this.tarOwnerTable_nullable;
	}	
	
	private boolean tarOwnerTable_invalidation = false;
	
	public void setInvalidationTarOwnerTable(boolean invalidation) { 
		this.tarOwnerTable_invalidation = invalidation;
	}
	
	public boolean isInvalidationTarOwnerTable() {
		return this.tarOwnerTable_invalidation;
	}
	
	private boolean tarOwnerTable_modified = false;
	

	public boolean isModifiedTarOwnerTable() {
		return this.tarOwnerTable_modified;
	}
	
	public void unModifiedTarOwnerTable() {
		this.tarOwnerTable_modified = false;
	}

	public String getTarOwnerTable() {
		return tarOwnerTable;
	}
	public String getNvlTarOwnerTable() {
		if(getTarOwnerTable() == null) {
			return  EMPTY_STRING;
		} else {
			return getTarOwnerTable();
		}
	}
	public void setTarOwnerTable(String tarOwnerTable) {
		if(tarOwnerTable == null) {
			this.tarOwnerTable  = EMPTY_STRING;
		} else {
			this.tarOwnerTable = tarOwnerTable;
		}
		this.tarOwnerTable_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : group
	 * Comments    : 
	 */		

	private String group = EMPTY_STRING;
	
			
	private boolean group_nullable = false;
	
	public boolean isNullableGroup() {
		return this.group_nullable;
	}	
	
	private boolean group_invalidation = false;
	
	public void setInvalidationGroup(boolean invalidation) { 
		this.group_invalidation = invalidation;
	}
	
	public boolean isInvalidationGroup() {
		return this.group_invalidation;
	}
	
	private boolean group_modified = false;
	

	public boolean isModifiedGroup() {
		return this.group_modified;
	}
	
	public void unModifiedGroup() {
		this.group_modified = false;
	}

	public String getGroup() {
		return group;
	}
	public String getNvlGroup() {
		if(getGroup() == null) {
			return  EMPTY_STRING;
		} else {
			return getGroup();
		}
	}
	public void setGroup(String group) {
		if(group == null) {
			this.group  = EMPTY_STRING;
		} else {
			this.group = group;
		}
		this.group_modified = true;
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
	 * LogicalName : Action
	 * Comments    : 
	 */		

	private String Action = EMPTY_STRING;
	
			
	private boolean Action_nullable = false;
	
	public boolean isNullableAction() {
		return this.Action_nullable;
	}	
	
	private boolean Action_invalidation = false;
	
	public void setInvalidationAction(boolean invalidation) { 
		this.Action_invalidation = invalidation;
	}
	
	public boolean isInvalidationAction() {
		return this.Action_invalidation;
	}
	
	private boolean Action_modified = false;
	

	public boolean isModifiedAction() {
		return this.Action_modified;
	}
	
	public void unModifiedAction() {
		this.Action_modified = false;
	}

	public String getAction() {
		return Action;
	}
	public String getNvlAction() {
		if(getAction() == null) {
			return  EMPTY_STRING;
		} else {
			return getAction();
		}
	}
	public void setAction(String Action) {
		if(Action == null) {
			this.Action  = EMPTY_STRING;
		} else {
			this.Action = Action;
		}
		this.Action_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.topId_modified = false;
		this.sourceDBName_modified = false;
		this.srcOwnerTable_modified = false;
		this.targetDBName_modified = false;
		this.tarOwnerTable_modified = false;
		this.group_modified = false;
		this.map_modified = false;
		this.Action_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.sourceDBName_modified == true)
			modifiedFields.add("sourceDBName");
		if(this.srcOwnerTable_modified == true)
			modifiedFields.add("srcOwnerTable");
		if(this.targetDBName_modified == true)
			modifiedFields.add("targetDBName");
		if(this.tarOwnerTable_modified == true)
			modifiedFields.add("tarOwnerTable");
		if(this.group_modified == true)
			modifiedFields.add("group");
		if(this.map_modified == true)
			modifiedFields.add("map");
		if(this.Action_modified == true)
			modifiedFields.add("Action");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		SyncTables copyObj = new SyncTables();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _syncTables) {
		if(this == _syncTables) return;
		SyncTables __syncTables = (SyncTables) _syncTables;
		
		this.setTopId(__syncTables.getTopId());
		this.setSourceDBName(__syncTables.getSourceDBName());
		this.setSrcOwnerTable(__syncTables.getSrcOwnerTable());
		this.setTargetDBName(__syncTables.getTargetDBName());
		this.setTarOwnerTable(__syncTables.getTarOwnerTable());
		this.setGroup(__syncTables.getGroup());
		this.setMap(__syncTables.getMap());
		this.setAction(__syncTables.getAction());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("sourceDBName : ").append(sourceDBName).append("\n");				
		buffer.append("srcOwnerTable : ").append(srcOwnerTable).append("\n");				
		buffer.append("targetDBName : ").append(targetDBName).append("\n");				
		buffer.append("tarOwnerTable : ").append(tarOwnerTable).append("\n");				
		buffer.append("group : ").append(group).append("\n");				
		buffer.append("map : ").append(map).append("\n");				
		buffer.append("Action : ").append(Action).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(8);
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("sourceDBName"
							, FieldPropertyFactory.getFieldProperty( "sourceDBName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("srcOwnerTable"
							, FieldPropertyFactory.getFieldProperty( "srcOwnerTable","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("targetDBName"
							, FieldPropertyFactory.getFieldProperty( "targetDBName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("tarOwnerTable"
							, FieldPropertyFactory.getFieldProperty( "tarOwnerTable","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("group"
							, FieldPropertyFactory.getFieldProperty( "group","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("map"
							, FieldPropertyFactory.getFieldProperty( "map","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 1000 , -1, null, null));		
		fieldPropertyMap.put("Action"
							, FieldPropertyFactory.getFieldProperty( "Action","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
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
			case "sourceDBName" : return getSourceDBName();
			case "srcOwnerTable" : return getSrcOwnerTable();
			case "targetDBName" : return getTargetDBName();
			case "tarOwnerTable" : return getTarOwnerTable();
			case "group" : return getGroup();
			case "map" : return getMap();
			case "Action" : return getAction();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topId" : setTopId((String)arg);break;
			case "sourceDBName" : setSourceDBName((String)arg);break;
			case "srcOwnerTable" : setSrcOwnerTable((String)arg);break;
			case "targetDBName" : setTargetDBName((String)arg);break;
			case "tarOwnerTable" : setTarOwnerTable((String)arg);break;
			case "group" : setGroup((String)arg);break;
			case "map" : setMap((String)arg);break;
			case "Action" : setAction((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(SyncTables obj) {
		if (obj == this) return true;					
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.sourceDBName != null ? !this.sourceDBName.equals(obj.getSourceDBName()) : obj.getSourceDBName() != null) return false; 										
		if(this.srcOwnerTable != null ? !this.srcOwnerTable.equals(obj.getSrcOwnerTable()) : obj.getSrcOwnerTable() != null) return false; 										
		if(this.targetDBName != null ? !this.targetDBName.equals(obj.getTargetDBName()) : obj.getTargetDBName() != null) return false; 										
		if(this.tarOwnerTable != null ? !this.tarOwnerTable.equals(obj.getTarOwnerTable()) : obj.getTarOwnerTable() != null) return false; 										
		if(this.group != null ? !this.group.equals(obj.getGroup()) : obj.getGroup() != null) return false; 										
		if(this.map != null ? !this.map.equals(obj.getMap()) : obj.getMap() != null) return false; 										
		if(this.Action != null ? !this.Action.equals(obj.getAction()) : obj.getAction() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
