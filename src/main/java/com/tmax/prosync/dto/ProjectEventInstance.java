	
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
public class ProjectEventInstance extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ProjectEventInstance";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ProjectEventInstance() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : projectId
	 * Comments    : 
	 */		

	private String projectId = EMPTY_STRING;
	
			
	private boolean projectId_nullable = false;
	
	public boolean isNullableProjectId() {
		return this.projectId_nullable;
	}	
	
	private boolean projectId_invalidation = false;
	
	public void setInvalidationProjectId(boolean invalidation) { 
		this.projectId_invalidation = invalidation;
	}
	
	public boolean isInvalidationProjectId() {
		return this.projectId_invalidation;
	}
	
	private boolean projectId_modified = false;
	

	public boolean isModifiedProjectId() {
		return this.projectId_modified;
	}
	
	public void unModifiedProjectId() {
		this.projectId_modified = false;
	}

	public String getProjectId() {
		return projectId;
	}
	public String getNvlProjectId() {
		if(getProjectId() == null) {
			return  EMPTY_STRING;
		} else {
			return getProjectId();
		}
	}
	public void setProjectId(String projectId) {
		if(projectId == null) {
			this.projectId  = EMPTY_STRING;
		} else {
			this.projectId = projectId;
		}
		this.projectId_modified = true;
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
	 * LogicalName : type
	 * Comments    : 
	 */		

	private String type = EMPTY_STRING;
	
			
	private boolean type_nullable = false;
	
	public boolean isNullableType() {
		return this.type_nullable;
	}	
	
	private boolean type_invalidation = false;
	
	public void setInvalidationType(boolean invalidation) { 
		this.type_invalidation = invalidation;
	}
	
	public boolean isInvalidationType() {
		return this.type_invalidation;
	}
	
	private boolean type_modified = false;
	

	public boolean isModifiedType() {
		return this.type_modified;
	}
	
	public void unModifiedType() {
		this.type_modified = false;
	}

	public String getType() {
		return type;
	}
	public String getNvlType() {
		if(getType() == null) {
			return  EMPTY_STRING;
		} else {
			return getType();
		}
	}
	public void setType(String type) {
		if(type == null) {
			this.type  = EMPTY_STRING;
		} else {
			this.type = type;
		}
		this.type_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : status
	 * Comments    : 
	 */		

	private String status = EMPTY_STRING;
	
			
	private boolean status_nullable = false;
	
	public boolean isNullableStatus() {
		return this.status_nullable;
	}	
	
	private boolean status_invalidation = false;
	
	public void setInvalidationStatus(boolean invalidation) { 
		this.status_invalidation = invalidation;
	}
	
	public boolean isInvalidationStatus() {
		return this.status_invalidation;
	}
	
	private boolean status_modified = false;
	

	public boolean isModifiedStatus() {
		return this.status_modified;
	}
	
	public void unModifiedStatus() {
		this.status_modified = false;
	}

	public String getStatus() {
		return status;
	}
	public String getNvlStatus() {
		if(getStatus() == null) {
			return  EMPTY_STRING;
		} else {
			return getStatus();
		}
	}
	public void setStatus(String status) {
		if(status == null) {
			this.status  = EMPTY_STRING;
		} else {
			this.status = status;
		}
		this.status_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : syncTableNum
	 * Comments    : 
	 */		

	private int syncTableNum;
	
		
	
	private boolean syncTableNum_invalidation = false;
	
	public void setInvalidationSyncTableNum(boolean invalidation) { 
		this.syncTableNum_invalidation = invalidation;
	}
	
	public boolean isInvalidationSyncTableNum() {
		return this.syncTableNum_invalidation;
	}
	
	private boolean syncTableNum_modified = false;
	

	public boolean isModifiedSyncTableNum() {
		return this.syncTableNum_modified;
	}
	
	public void unModifiedSyncTableNum() {
		this.syncTableNum_modified = false;
	}

	public int getSyncTableNum() {
		return syncTableNum;
	}
	public void setSyncTableNum(int syncTableNum) {
		this.syncTableNum = syncTableNum;
		this.syncTableNum_modified = true;
		this.isModified = true;
	}
	
	public void setSyncTableNum(Integer syncTableNum) {
		if( syncTableNum == null) {
			this.syncTableNum = 0;
		} else{
			this.syncTableNum = syncTableNum.intValue();
		}
		this.syncTableNum_modified = true;
		this.isModified = true;
	}
	public void setSyncTableNum(String syncTableNum) {
		if  (syncTableNum==null || syncTableNum.length() == 0) {
			this.syncTableNum = 0;
		} else {
			this.syncTableNum = Integer.parseInt(syncTableNum);
		}
		this.syncTableNum_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : failEventCount
	 * Comments    : 
	 */		

	private int failEventCount;
	
		
	
	private boolean failEventCount_invalidation = false;
	
	public void setInvalidationFailEventCount(boolean invalidation) { 
		this.failEventCount_invalidation = invalidation;
	}
	
	public boolean isInvalidationFailEventCount() {
		return this.failEventCount_invalidation;
	}
	
	private boolean failEventCount_modified = false;
	

	public boolean isModifiedFailEventCount() {
		return this.failEventCount_modified;
	}
	
	public void unModifiedFailEventCount() {
		this.failEventCount_modified = false;
	}

	public int getFailEventCount() {
		return failEventCount;
	}
	public void setFailEventCount(int failEventCount) {
		this.failEventCount = failEventCount;
		this.failEventCount_modified = true;
		this.isModified = true;
	}
	
	public void setFailEventCount(Integer failEventCount) {
		if( failEventCount == null) {
			this.failEventCount = 0;
		} else{
			this.failEventCount = failEventCount.intValue();
		}
		this.failEventCount_modified = true;
		this.isModified = true;
	}
	public void setFailEventCount(String failEventCount) {
		if  (failEventCount==null || failEventCount.length() == 0) {
			this.failEventCount = 0;
		} else {
			this.failEventCount = Integer.parseInt(failEventCount);
		}
		this.failEventCount_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : errorEventCount
	 * Comments    : 
	 */		

	private int errorEventCount;
	
		
	
	private boolean errorEventCount_invalidation = false;
	
	public void setInvalidationErrorEventCount(boolean invalidation) { 
		this.errorEventCount_invalidation = invalidation;
	}
	
	public boolean isInvalidationErrorEventCount() {
		return this.errorEventCount_invalidation;
	}
	
	private boolean errorEventCount_modified = false;
	

	public boolean isModifiedErrorEventCount() {
		return this.errorEventCount_modified;
	}
	
	public void unModifiedErrorEventCount() {
		this.errorEventCount_modified = false;
	}

	public int getErrorEventCount() {
		return errorEventCount;
	}
	public void setErrorEventCount(int errorEventCount) {
		this.errorEventCount = errorEventCount;
		this.errorEventCount_modified = true;
		this.isModified = true;
	}
	
	public void setErrorEventCount(Integer errorEventCount) {
		if( errorEventCount == null) {
			this.errorEventCount = 0;
		} else{
			this.errorEventCount = errorEventCount.intValue();
		}
		this.errorEventCount_modified = true;
		this.isModified = true;
	}
	public void setErrorEventCount(String errorEventCount) {
		if  (errorEventCount==null || errorEventCount.length() == 0) {
			this.errorEventCount = 0;
		} else {
			this.errorEventCount = Integer.parseInt(errorEventCount);
		}
		this.errorEventCount_modified = true;
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
		this.projectId_modified = false;
		this.name_modified = false;
		this.type_modified = false;
		this.status_modified = false;
		this.syncTableNum_modified = false;
		this.failEventCount_modified = false;
		this.errorEventCount_modified = false;
		this.sourceDBName_modified = false;
		this.targetDBName_modified = false;
		this.Action_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.projectId_modified == true)
			modifiedFields.add("projectId");
		if(this.name_modified == true)
			modifiedFields.add("name");
		if(this.type_modified == true)
			modifiedFields.add("type");
		if(this.status_modified == true)
			modifiedFields.add("status");
		if(this.syncTableNum_modified == true)
			modifiedFields.add("syncTableNum");
		if(this.failEventCount_modified == true)
			modifiedFields.add("failEventCount");
		if(this.errorEventCount_modified == true)
			modifiedFields.add("errorEventCount");
		if(this.sourceDBName_modified == true)
			modifiedFields.add("sourceDBName");
		if(this.targetDBName_modified == true)
			modifiedFields.add("targetDBName");
		if(this.Action_modified == true)
			modifiedFields.add("Action");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ProjectEventInstance copyObj = new ProjectEventInstance();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _projectEventInstance) {
		if(this == _projectEventInstance) return;
		ProjectEventInstance __projectEventInstance = (ProjectEventInstance) _projectEventInstance;
		
		this.setProjectId(__projectEventInstance.getProjectId());
		this.setName(__projectEventInstance.getName());
		this.setType(__projectEventInstance.getType());
		this.setStatus(__projectEventInstance.getStatus());
		this.setSyncTableNum(__projectEventInstance.getSyncTableNum());
		this.setFailEventCount(__projectEventInstance.getFailEventCount());
		this.setErrorEventCount(__projectEventInstance.getErrorEventCount());
		this.setSourceDBName(__projectEventInstance.getSourceDBName());
		this.setTargetDBName(__projectEventInstance.getTargetDBName());
		this.setAction(__projectEventInstance.getAction());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("projectId : ").append(projectId).append("\n");				
		buffer.append("name : ").append(name).append("\n");				
		buffer.append("type : ").append(type).append("\n");				
		buffer.append("status : ").append(status).append("\n");				
		buffer.append("syncTableNum : ").append(syncTableNum).append("\n");				
		buffer.append("failEventCount : ").append(failEventCount).append("\n");				
		buffer.append("errorEventCount : ").append(errorEventCount).append("\n");				
		buffer.append("sourceDBName : ").append(sourceDBName).append("\n");				
		buffer.append("targetDBName : ").append(targetDBName).append("\n");				
		buffer.append("Action : ").append(Action).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(10);
		fieldPropertyMap.put("projectId"
							, FieldPropertyFactory.getFieldProperty( "projectId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("name"
							, FieldPropertyFactory.getFieldProperty( "name","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("type"
							, FieldPropertyFactory.getFieldProperty( "type","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 8 , -1, null, null));		
		fieldPropertyMap.put("status"
							, FieldPropertyFactory.getFieldProperty( "status","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("syncTableNum"
							, FieldPropertyFactory.getFieldProperty( "syncTableNum","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("failEventCount"
							, FieldPropertyFactory.getFieldProperty( "failEventCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("errorEventCount"
							, FieldPropertyFactory.getFieldProperty( "errorEventCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("sourceDBName"
							, FieldPropertyFactory.getFieldProperty( "sourceDBName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("targetDBName"
							, FieldPropertyFactory.getFieldProperty( "targetDBName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
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
			case "projectId" : return getProjectId();
			case "name" : return getName();
			case "type" : return getType();
			case "status" : return getStatus();
			case "syncTableNum" : return getSyncTableNum();
			case "failEventCount" : return getFailEventCount();
			case "errorEventCount" : return getErrorEventCount();
			case "sourceDBName" : return getSourceDBName();
			case "targetDBName" : return getTargetDBName();
			case "Action" : return getAction();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "projectId" : setProjectId((String)arg);break;
			case "name" : setName((String)arg);break;
			case "type" : setType((String)arg);break;
			case "status" : setStatus((String)arg);break;
			case "syncTableNum" : setSyncTableNum((Integer)arg);break;
			case "failEventCount" : setFailEventCount((Integer)arg);break;
			case "errorEventCount" : setErrorEventCount((Integer)arg);break;
			case "sourceDBName" : setSourceDBName((String)arg);break;
			case "targetDBName" : setTargetDBName((String)arg);break;
			case "Action" : setAction((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ProjectEventInstance obj) {
		if (obj == this) return true;					
		if(this.projectId != null ? !this.projectId.equals(obj.getProjectId()) : obj.getProjectId() != null) return false; 										
		if(this.name != null ? !this.name.equals(obj.getName()) : obj.getName() != null) return false; 										
		if(this.type != null ? !this.type.equals(obj.getType()) : obj.getType() != null) return false; 										
		if(this.status != null ? !this.status.equals(obj.getStatus()) : obj.getStatus() != null) return false; 									
		if(this.syncTableNum != obj.getSyncTableNum()) return false; 								
		if(this.failEventCount != obj.getFailEventCount()) return false; 								
		if(this.errorEventCount != obj.getErrorEventCount()) return false; 									
		if(this.sourceDBName != null ? !this.sourceDBName.equals(obj.getSourceDBName()) : obj.getSourceDBName() != null) return false; 										
		if(this.targetDBName != null ? !this.targetDBName.equals(obj.getTargetDBName()) : obj.getTargetDBName() != null) return false; 										
		if(this.Action != null ? !this.Action.equals(obj.getAction()) : obj.getAction() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
