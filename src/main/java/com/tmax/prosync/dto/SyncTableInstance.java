	
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
public class SyncTableInstance extends DataObject {
	private static final String DTO_LOGICAL_NAME = "SyncTableInstance";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public SyncTableInstance() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : syncTableId
	 * Comments    : 
	 */		

	private int syncTableId;
	
		
	
	private boolean syncTableId_invalidation = false;
	
	public void setInvalidationSyncTableId(boolean invalidation) { 
		this.syncTableId_invalidation = invalidation;
	}
	
	public boolean isInvalidationSyncTableId() {
		return this.syncTableId_invalidation;
	}
	
	private boolean syncTableId_modified = false;
	

	public boolean isModifiedSyncTableId() {
		return this.syncTableId_modified;
	}
	
	public void unModifiedSyncTableId() {
		this.syncTableId_modified = false;
	}

	public int getSyncTableId() {
		return syncTableId;
	}
	public void setSyncTableId(int syncTableId) {
		this.syncTableId = syncTableId;
		this.syncTableId_modified = true;
		this.isModified = true;
	}
	
	public void setSyncTableId(Integer syncTableId) {
		if( syncTableId == null) {
			this.syncTableId = 0;
		} else{
			this.syncTableId = syncTableId.intValue();
		}
		this.syncTableId_modified = true;
		this.isModified = true;
	}
	public void setSyncTableId(String syncTableId) {
		if  (syncTableId==null || syncTableId.length() == 0) {
			this.syncTableId = 0;
		} else {
			this.syncTableId = Integer.parseInt(syncTableId);
		}
		this.syncTableId_modified = true;
		this.isModified = true;
	}		

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
	 * LogicalName : xId
	 * Comments    : 
	 */		

	private int xId;
	
		
	
	private boolean xId_invalidation = false;
	
	public void setInvalidationXId(boolean invalidation) { 
		this.xId_invalidation = invalidation;
	}
	
	public boolean isInvalidationXId() {
		return this.xId_invalidation;
	}
	
	private boolean xId_modified = false;
	

	public boolean isModifiedXId() {
		return this.xId_modified;
	}
	
	public void unModifiedXId() {
		this.xId_modified = false;
	}

	public int getXId() {
		return xId;
	}
	public void setXId(int xId) {
		this.xId = xId;
		this.xId_modified = true;
		this.isModified = true;
	}
	
	public void setXId(Integer xId) {
		if( xId == null) {
			this.xId = 0;
		} else{
			this.xId = xId.intValue();
		}
		this.xId_modified = true;
		this.isModified = true;
	}
	public void setXId(String xId) {
		if  (xId==null || xId.length() == 0) {
			this.xId = 0;
		} else {
			this.xId = Integer.parseInt(xId);
		}
		this.xId_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : tsn
	 * Comments    : 
	 */		

	private int tsn;
	
		
	
	private boolean tsn_invalidation = false;
	
	public void setInvalidationTsn(boolean invalidation) { 
		this.tsn_invalidation = invalidation;
	}
	
	public boolean isInvalidationTsn() {
		return this.tsn_invalidation;
	}
	
	private boolean tsn_modified = false;
	

	public boolean isModifiedTsn() {
		return this.tsn_modified;
	}
	
	public void unModifiedTsn() {
		this.tsn_modified = false;
	}

	public int getTsn() {
		return tsn;
	}
	public void setTsn(int tsn) {
		this.tsn = tsn;
		this.tsn_modified = true;
		this.isModified = true;
	}
	
	public void setTsn(Integer tsn) {
		if( tsn == null) {
			this.tsn = 0;
		} else{
			this.tsn = tsn.intValue();
		}
		this.tsn_modified = true;
		this.isModified = true;
	}
	public void setTsn(String tsn) {
		if  (tsn==null || tsn.length() == 0) {
			this.tsn = 0;
		} else {
			this.tsn = Integer.parseInt(tsn);
		}
		this.tsn_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : ddSeqNum
	 * Comments    : 
	 */		

	private int ddSeqNum;
	
		
	
	private boolean ddSeqNum_invalidation = false;
	
	public void setInvalidationDdSeqNum(boolean invalidation) { 
		this.ddSeqNum_invalidation = invalidation;
	}
	
	public boolean isInvalidationDdSeqNum() {
		return this.ddSeqNum_invalidation;
	}
	
	private boolean ddSeqNum_modified = false;
	

	public boolean isModifiedDdSeqNum() {
		return this.ddSeqNum_modified;
	}
	
	public void unModifiedDdSeqNum() {
		this.ddSeqNum_modified = false;
	}

	public int getDdSeqNum() {
		return ddSeqNum;
	}
	public void setDdSeqNum(int ddSeqNum) {
		this.ddSeqNum = ddSeqNum;
		this.ddSeqNum_modified = true;
		this.isModified = true;
	}
	
	public void setDdSeqNum(Integer ddSeqNum) {
		if( ddSeqNum == null) {
			this.ddSeqNum = 0;
		} else{
			this.ddSeqNum = ddSeqNum.intValue();
		}
		this.ddSeqNum_modified = true;
		this.isModified = true;
	}
	public void setDdSeqNum(String ddSeqNum) {
		if  (ddSeqNum==null || ddSeqNum.length() == 0) {
			this.ddSeqNum = 0;
		} else {
			this.ddSeqNum = Integer.parseInt(ddSeqNum);
		}
		this.ddSeqNum_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : userId
	 * Comments    : 
	 */		

	private String userId = EMPTY_STRING;
	
			
	private boolean userId_nullable = false;
	
	public boolean isNullableUserId() {
		return this.userId_nullable;
	}	
	
	private boolean userId_invalidation = false;
	
	public void setInvalidationUserId(boolean invalidation) { 
		this.userId_invalidation = invalidation;
	}
	
	public boolean isInvalidationUserId() {
		return this.userId_invalidation;
	}
	
	private boolean userId_modified = false;
	

	public boolean isModifiedUserId() {
		return this.userId_modified;
	}
	
	public void unModifiedUserId() {
		this.userId_modified = false;
	}

	public String getUserId() {
		return userId;
	}
	public String getNvlUserId() {
		if(getUserId() == null) {
			return  EMPTY_STRING;
		} else {
			return getUserId();
		}
	}
	public void setUserId(String userId) {
		if(userId == null) {
			this.userId  = EMPTY_STRING;
		} else {
			this.userId = userId;
		}
		this.userId_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : tableName
	 * Comments    : 
	 */		

	private String tableName = EMPTY_STRING;
	
			
	private boolean tableName_nullable = false;
	
	public boolean isNullableTableName() {
		return this.tableName_nullable;
	}	
	
	private boolean tableName_invalidation = false;
	
	public void setInvalidationTableName(boolean invalidation) { 
		this.tableName_invalidation = invalidation;
	}
	
	public boolean isInvalidationTableName() {
		return this.tableName_invalidation;
	}
	
	private boolean tableName_modified = false;
	

	public boolean isModifiedTableName() {
		return this.tableName_modified;
	}
	
	public void unModifiedTableName() {
		this.tableName_modified = false;
	}

	public String getTableName() {
		return tableName;
	}
	public String getNvlTableName() {
		if(getTableName() == null) {
			return  EMPTY_STRING;
		} else {
			return getTableName();
		}
	}
	public void setTableName(String tableName) {
		if(tableName == null) {
			this.tableName  = EMPTY_STRING;
		} else {
			this.tableName = tableName;
		}
		this.tableName_modified = true;
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

	/**
	 * LogicalName : syncType
	 * Comments    : 
	 */		

	private String syncType = EMPTY_STRING;
	
			
	private boolean syncType_nullable = false;
	
	public boolean isNullableSyncType() {
		return this.syncType_nullable;
	}	
	
	private boolean syncType_invalidation = false;
	
	public void setInvalidationSyncType(boolean invalidation) { 
		this.syncType_invalidation = invalidation;
	}
	
	public boolean isInvalidationSyncType() {
		return this.syncType_invalidation;
	}
	
	private boolean syncType_modified = false;
	

	public boolean isModifiedSyncType() {
		return this.syncType_modified;
	}
	
	public void unModifiedSyncType() {
		this.syncType_modified = false;
	}

	public String getSyncType() {
		return syncType;
	}
	public String getNvlSyncType() {
		if(getSyncType() == null) {
			return  EMPTY_STRING;
		} else {
			return getSyncType();
		}
	}
	public void setSyncType(String syncType) {
		if(syncType == null) {
			this.syncType  = EMPTY_STRING;
		} else {
			this.syncType = syncType;
		}
		this.syncType_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : name
	 * Comments    : 
	 */		

	private String name = EMPTY_STRING;
	
			
	private boolean name_nullable = false;
	
	public boolean isNullableName() {
		return this.name_nullable;
	}	
	
	private boolean name_invalidation = false;
	
	public void setInvalidationName(boolean invalidation) { 
		this.name_invalidation = invalidation;
	}
	
	public boolean isInvalidationName() {
		return this.name_invalidation;
	}
	
	private boolean name_modified = false;
	

	public boolean isModifiedName() {
		return this.name_modified;
	}
	
	public void unModifiedName() {
		this.name_modified = false;
	}

	public String getName() {
		return name;
	}
	public String getNvlName() {
		if(getName() == null) {
			return  EMPTY_STRING;
		} else {
			return getName();
		}
	}
	public void setName(String name) {
		if(name == null) {
			this.name  = EMPTY_STRING;
		} else {
			this.name = name;
		}
		this.name_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : mappingTableId
	 * Comments    : 
	 */		

	private int mappingTableId;
	
		
	
	private boolean mappingTableId_invalidation = false;
	
	public void setInvalidationMappingTableId(boolean invalidation) { 
		this.mappingTableId_invalidation = invalidation;
	}
	
	public boolean isInvalidationMappingTableId() {
		return this.mappingTableId_invalidation;
	}
	
	private boolean mappingTableId_modified = false;
	

	public boolean isModifiedMappingTableId() {
		return this.mappingTableId_modified;
	}
	
	public void unModifiedMappingTableId() {
		this.mappingTableId_modified = false;
	}

	public int getMappingTableId() {
		return mappingTableId;
	}
	public void setMappingTableId(int mappingTableId) {
		this.mappingTableId = mappingTableId;
		this.mappingTableId_modified = true;
		this.isModified = true;
	}
	
	public void setMappingTableId(Integer mappingTableId) {
		if( mappingTableId == null) {
			this.mappingTableId = 0;
		} else{
			this.mappingTableId = mappingTableId.intValue();
		}
		this.mappingTableId_modified = true;
		this.isModified = true;
	}
	public void setMappingTableId(String mappingTableId) {
		if  (mappingTableId==null || mappingTableId.length() == 0) {
			this.mappingTableId = 0;
		} else {
			this.mappingTableId = Integer.parseInt(mappingTableId);
		}
		this.mappingTableId_modified = true;
		this.isModified = true;
	}		

	@Override
	public void clearAllIsModified() {
		this.syncTableId_modified = false;
		this.topId_modified = false;
		this.xId_modified = false;
		this.tsn_modified = false;
		this.ddSeqNum_modified = false;
		this.userId_modified = false;
		this.tableName_modified = false;
		this.instanceId_modified = false;
		this.syncType_modified = false;
		this.name_modified = false;
		this.mappingTableId_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.syncTableId_modified == true)
			modifiedFields.add("syncTableId");
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.xId_modified == true)
			modifiedFields.add("xId");
		if(this.tsn_modified == true)
			modifiedFields.add("tsn");
		if(this.ddSeqNum_modified == true)
			modifiedFields.add("ddSeqNum");
		if(this.userId_modified == true)
			modifiedFields.add("userId");
		if(this.tableName_modified == true)
			modifiedFields.add("tableName");
		if(this.instanceId_modified == true)
			modifiedFields.add("instanceId");
		if(this.syncType_modified == true)
			modifiedFields.add("syncType");
		if(this.name_modified == true)
			modifiedFields.add("name");
		if(this.mappingTableId_modified == true)
			modifiedFields.add("mappingTableId");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		SyncTableInstance copyObj = new SyncTableInstance();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _syncTableInstance) {
		if(this == _syncTableInstance) return;
		SyncTableInstance __syncTableInstance = (SyncTableInstance) _syncTableInstance;
		
		this.setSyncTableId(__syncTableInstance.getSyncTableId());
		this.setTopId(__syncTableInstance.getTopId());
		this.setXId(__syncTableInstance.getXId());
		this.setTsn(__syncTableInstance.getTsn());
		this.setDdSeqNum(__syncTableInstance.getDdSeqNum());
		this.setUserId(__syncTableInstance.getUserId());
		this.setTableName(__syncTableInstance.getTableName());
		this.setInstanceId(__syncTableInstance.getInstanceId());
		this.setSyncType(__syncTableInstance.getSyncType());
		this.setName(__syncTableInstance.getName());
		this.setMappingTableId(__syncTableInstance.getMappingTableId());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("syncTableId : ").append(syncTableId).append("\n");				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("xId : ").append(xId).append("\n");				
		buffer.append("tsn : ").append(tsn).append("\n");				
		buffer.append("ddSeqNum : ").append(ddSeqNum).append("\n");				
		buffer.append("userId : ").append(userId).append("\n");				
		buffer.append("tableName : ").append(tableName).append("\n");				
		buffer.append("instanceId : ").append(instanceId).append("\n");				
		buffer.append("syncType : ").append(syncType).append("\n");				
		buffer.append("name : ").append(name).append("\n");				
		buffer.append("mappingTableId : ").append(mappingTableId).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(11);
		fieldPropertyMap.put("syncTableId"
							, FieldPropertyFactory.getFieldProperty( "syncTableId","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("xId"
							, FieldPropertyFactory.getFieldProperty( "xId","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("tsn"
							, FieldPropertyFactory.getFieldProperty( "tsn","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("ddSeqNum"
							, FieldPropertyFactory.getFieldProperty( "ddSeqNum","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("userId"
							, FieldPropertyFactory.getFieldProperty( "userId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("tableName"
							, FieldPropertyFactory.getFieldProperty( "tableName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("instanceId"
							, FieldPropertyFactory.getFieldProperty( "instanceId","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("syncType"
							, FieldPropertyFactory.getFieldProperty( "syncType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 10 , -1, null, null));		
		fieldPropertyMap.put("name"
							, FieldPropertyFactory.getFieldProperty( "name","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("mappingTableId"
							, FieldPropertyFactory.getFieldProperty( "mappingTableId","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "syncTableId" : return getSyncTableId();
			case "topId" : return getTopId();
			case "xId" : return getXId();
			case "tsn" : return getTsn();
			case "ddSeqNum" : return getDdSeqNum();
			case "userId" : return getUserId();
			case "tableName" : return getTableName();
			case "instanceId" : return getInstanceId();
			case "syncType" : return getSyncType();
			case "name" : return getName();
			case "mappingTableId" : return getMappingTableId();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "syncTableId" : setSyncTableId((Integer)arg);break;
			case "topId" : setTopId((String)arg);break;
			case "xId" : setXId((Integer)arg);break;
			case "tsn" : setTsn((Integer)arg);break;
			case "ddSeqNum" : setDdSeqNum((Integer)arg);break;
			case "userId" : setUserId((String)arg);break;
			case "tableName" : setTableName((String)arg);break;
			case "instanceId" : setInstanceId((Integer)arg);break;
			case "syncType" : setSyncType((String)arg);break;
			case "name" : setName((String)arg);break;
			case "mappingTableId" : setMappingTableId((Integer)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(SyncTableInstance obj) {
		if (obj == this) return true;				
		if(this.syncTableId != obj.getSyncTableId()) return false; 									
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 									
		if(this.xId != obj.getXId()) return false; 								
		if(this.tsn != obj.getTsn()) return false; 								
		if(this.ddSeqNum != obj.getDdSeqNum()) return false; 									
		if(this.userId != null ? !this.userId.equals(obj.getUserId()) : obj.getUserId() != null) return false; 										
		if(this.tableName != null ? !this.tableName.equals(obj.getTableName()) : obj.getTableName() != null) return false; 									
		if(this.instanceId != obj.getInstanceId()) return false; 									
		if(this.syncType != null ? !this.syncType.equals(obj.getSyncType()) : obj.getSyncType() != null) return false; 										
		if(this.name != null ? !this.name.equals(obj.getName()) : obj.getName() != null) return false; 									
		if(this.mappingTableId != obj.getMappingTableId()) return false; 				
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
