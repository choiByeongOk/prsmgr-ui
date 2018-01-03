	
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
public class SrcDb extends DataObject {
	private static final String DTO_LOGICAL_NAME = "SrcDb";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public SrcDb() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : dbName
	 * Comments    : 
	 */		

	private String dbName = EMPTY_STRING;
	
			
	private boolean dbName_nullable = false;
	
	public boolean isNullableDbName() {
		return this.dbName_nullable;
	}	
	
	private boolean dbName_invalidation = false;
	
	public void setInvalidationDbName(boolean invalidation) { 
		this.dbName_invalidation = invalidation;
	}
	
	public boolean isInvalidationDbName() {
		return this.dbName_invalidation;
	}
	
	private boolean dbName_modified = false;
	

	public boolean isModifiedDbName() {
		return this.dbName_modified;
	}
	
	public void unModifiedDbName() {
		this.dbName_modified = false;
	}

	public String getDbName() {
		return dbName;
	}
	public String getNvlDbName() {
		if(getDbName() == null) {
			return  EMPTY_STRING;
		} else {
			return getDbName();
		}
	}
	public void setDbName(String dbName) {
		if(dbName == null) {
			this.dbName  = EMPTY_STRING;
		} else {
			this.dbName = dbName;
		}
		this.dbName_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : projectType
	 * Comments    : 
	 */		

	private String projectType = EMPTY_STRING;
	
			
	private boolean projectType_nullable = false;
	
	public boolean isNullableProjectType() {
		return this.projectType_nullable;
	}	
	
	private boolean projectType_invalidation = false;
	
	public void setInvalidationProjectType(boolean invalidation) { 
		this.projectType_invalidation = invalidation;
	}
	
	public boolean isInvalidationProjectType() {
		return this.projectType_invalidation;
	}
	
	private boolean projectType_modified = false;
	

	public boolean isModifiedProjectType() {
		return this.projectType_modified;
	}
	
	public void unModifiedProjectType() {
		this.projectType_modified = false;
	}

	public String getProjectType() {
		return projectType;
	}
	public String getNvlProjectType() {
		if(getProjectType() == null) {
			return  EMPTY_STRING;
		} else {
			return getProjectType();
		}
	}
	public void setProjectType(String projectType) {
		if(projectType == null) {
			this.projectType  = EMPTY_STRING;
		} else {
			this.projectType = projectType;
		}
		this.projectType_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : processNum
	 * Comments    : 
	 */		

	private int processNum;
	
		
	
	private boolean processNum_invalidation = false;
	
	public void setInvalidationProcessNum(boolean invalidation) { 
		this.processNum_invalidation = invalidation;
	}
	
	public boolean isInvalidationProcessNum() {
		return this.processNum_invalidation;
	}
	
	private boolean processNum_modified = false;
	

	public boolean isModifiedProcessNum() {
		return this.processNum_modified;
	}
	
	public void unModifiedProcessNum() {
		this.processNum_modified = false;
	}

	public int getProcessNum() {
		return processNum;
	}
	public void setProcessNum(int processNum) {
		this.processNum = processNum;
		this.processNum_modified = true;
		this.isModified = true;
	}
	
	public void setProcessNum(Integer processNum) {
		if( processNum == null) {
			this.processNum = 0;
		} else{
			this.processNum = processNum.intValue();
		}
		this.processNum_modified = true;
		this.isModified = true;
	}
	public void setProcessNum(String processNum) {
		if  (processNum==null || processNum.length() == 0) {
			this.processNum = 0;
		} else {
			this.processNum = Integer.parseInt(processNum);
		}
		this.processNum_modified = true;
		this.isModified = true;
	}		

	@Override
	public void clearAllIsModified() {
		this.dbName_modified = false;
		this.projectType_modified = false;
		this.processNum_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.dbName_modified == true)
			modifiedFields.add("dbName");
		if(this.projectType_modified == true)
			modifiedFields.add("projectType");
		if(this.processNum_modified == true)
			modifiedFields.add("processNum");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		SrcDb copyObj = new SrcDb();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _srcDb) {
		if(this == _srcDb) return;
		SrcDb __srcDb = (SrcDb) _srcDb;
		
		this.setDbName(__srcDb.getDbName());
		this.setProjectType(__srcDb.getProjectType());
		this.setProcessNum(__srcDb.getProcessNum());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("dbName : ").append(dbName).append("\n");				
		buffer.append("projectType : ").append(projectType).append("\n");				
		buffer.append("processNum : ").append(processNum).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(3);
		fieldPropertyMap.put("dbName"
							, FieldPropertyFactory.getFieldProperty( "dbName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("projectType"
							, FieldPropertyFactory.getFieldProperty( "projectType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("processNum"
							, FieldPropertyFactory.getFieldProperty( "processNum","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "dbName" : return getDbName();
			case "projectType" : return getProjectType();
			case "processNum" : return getProcessNum();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "dbName" : setDbName((String)arg);break;
			case "projectType" : setProjectType((String)arg);break;
			case "processNum" : setProcessNum((Integer)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(SrcDb obj) {
		if (obj == this) return true;					
		if(this.dbName != null ? !this.dbName.equals(obj.getDbName()) : obj.getDbName() != null) return false; 										
		if(this.projectType != null ? !this.projectType.equals(obj.getProjectType()) : obj.getProjectType() != null) return false; 									
		if(this.processNum != obj.getProcessNum()) return false; 				
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
