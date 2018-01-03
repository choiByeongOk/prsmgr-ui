	
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
public class SourceTable extends DataObject {
	private static final String DTO_LOGICAL_NAME = "SourceTable";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public SourceTable() {
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

	@Override
	public void clearAllIsModified() {
		this.topId_modified = false;
		this.xId_modified = false;
		this.tsn_modified = false;
		this.ddSeqNum_modified = false;
		this.userId_modified = false;
		this.tableName_modified = false;
		this.instanceId_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
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
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		SourceTable copyObj = new SourceTable();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _sourceTable) {
		if(this == _sourceTable) return;
		SourceTable __sourceTable = (SourceTable) _sourceTable;
		
		this.setTopId(__sourceTable.getTopId());
		this.setXId(__sourceTable.getXId());
		this.setTsn(__sourceTable.getTsn());
		this.setDdSeqNum(__sourceTable.getDdSeqNum());
		this.setUserId(__sourceTable.getUserId());
		this.setTableName(__sourceTable.getTableName());
		this.setInstanceId(__sourceTable.getInstanceId());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("xId : ").append(xId).append("\n");				
		buffer.append("tsn : ").append(tsn).append("\n");				
		buffer.append("ddSeqNum : ").append(ddSeqNum).append("\n");				
		buffer.append("userId : ").append(userId).append("\n");				
		buffer.append("tableName : ").append(tableName).append("\n");				
		buffer.append("instanceId : ").append(instanceId).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(7);
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
			case "xId" : return getXId();
			case "tsn" : return getTsn();
			case "ddSeqNum" : return getDdSeqNum();
			case "userId" : return getUserId();
			case "tableName" : return getTableName();
			case "instanceId" : return getInstanceId();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topId" : setTopId((String)arg);break;
			case "xId" : setXId((Integer)arg);break;
			case "tsn" : setTsn((Integer)arg);break;
			case "ddSeqNum" : setDdSeqNum((Integer)arg);break;
			case "userId" : setUserId((String)arg);break;
			case "tableName" : setTableName((String)arg);break;
			case "instanceId" : setInstanceId((Integer)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(SourceTable obj) {
		if (obj == this) return true;					
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 									
		if(this.xId != obj.getXId()) return false; 								
		if(this.tsn != obj.getTsn()) return false; 								
		if(this.ddSeqNum != obj.getDdSeqNum()) return false; 									
		if(this.userId != null ? !this.userId.equals(obj.getUserId()) : obj.getUserId() != null) return false; 										
		if(this.tableName != null ? !this.tableName.equals(obj.getTableName()) : obj.getTableName() != null) return false; 									
		if(this.instanceId != obj.getInstanceId()) return false; 				
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
