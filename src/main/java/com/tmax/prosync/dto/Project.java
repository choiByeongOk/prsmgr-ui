	
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
public class Project extends DataObject {
	private static final String DTO_LOGICAL_NAME = "Project";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public Project() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : projectId
	 * Comments    : 
	 */		

	private int projectId;
	
		
	
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

	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
		this.projectId_modified = true;
		this.isModified = true;
	}
	
	public void setProjectId(Integer projectId) {
		if( projectId == null) {
			this.projectId = 0;
		} else{
			this.projectId = projectId.intValue();
		}
		this.projectId_modified = true;
		this.isModified = true;
	}
	public void setProjectId(String projectId) {
		if  (projectId==null || projectId.length() == 0) {
			this.projectId = 0;
		} else {
			this.projectId = Integer.parseInt(projectId);
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
	 * LogicalName : maxThreadNum
	 * Comments    : 
	 */		

	private int maxThreadNum;
	
		
	
	private boolean maxThreadNum_invalidation = false;
	
	public void setInvalidationMaxThreadNum(boolean invalidation) { 
		this.maxThreadNum_invalidation = invalidation;
	}
	
	public boolean isInvalidationMaxThreadNum() {
		return this.maxThreadNum_invalidation;
	}
	
	private boolean maxThreadNum_modified = false;
	

	public boolean isModifiedMaxThreadNum() {
		return this.maxThreadNum_modified;
	}
	
	public void unModifiedMaxThreadNum() {
		this.maxThreadNum_modified = false;
	}

	public int getMaxThreadNum() {
		return maxThreadNum;
	}
	public void setMaxThreadNum(int maxThreadNum) {
		this.maxThreadNum = maxThreadNum;
		this.maxThreadNum_modified = true;
		this.isModified = true;
	}
	
	public void setMaxThreadNum(Integer maxThreadNum) {
		if( maxThreadNum == null) {
			this.maxThreadNum = 0;
		} else{
			this.maxThreadNum = maxThreadNum.intValue();
		}
		this.maxThreadNum_modified = true;
		this.isModified = true;
	}
	public void setMaxThreadNum(String maxThreadNum) {
		if  (maxThreadNum==null || maxThreadNum.length() == 0) {
			this.maxThreadNum = 0;
		} else {
			this.maxThreadNum = Integer.parseInt(maxThreadNum);
		}
		this.maxThreadNum_modified = true;
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
	 * LogicalName : createdUser
	 * Comments    : 
	 */		

	private String createdUser = EMPTY_STRING;
	
			
	private boolean createdUser_nullable = false;
	
	public boolean isNullableCreatedUser() {
		return this.createdUser_nullable;
	}	
	
	private boolean createdUser_invalidation = false;
	
	public void setInvalidationCreatedUser(boolean invalidation) { 
		this.createdUser_invalidation = invalidation;
	}
	
	public boolean isInvalidationCreatedUser() {
		return this.createdUser_invalidation;
	}
	
	private boolean createdUser_modified = false;
	

	public boolean isModifiedCreatedUser() {
		return this.createdUser_modified;
	}
	
	public void unModifiedCreatedUser() {
		this.createdUser_modified = false;
	}

	public String getCreatedUser() {
		return createdUser;
	}
	public String getNvlCreatedUser() {
		if(getCreatedUser() == null) {
			return  EMPTY_STRING;
		} else {
			return getCreatedUser();
		}
	}
	public void setCreatedUser(String createdUser) {
		if(createdUser == null) {
			this.createdUser  = EMPTY_STRING;
		} else {
			this.createdUser = createdUser;
		}
		this.createdUser_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : createdTime
	 * Comments    : 
	 */		

	private String createdTime = EMPTY_STRING;
	
			
	private boolean createdTime_nullable = false;
	
	public boolean isNullableCreatedTime() {
		return this.createdTime_nullable;
	}	
	
	private boolean createdTime_invalidation = false;
	
	public void setInvalidationCreatedTime(boolean invalidation) { 
		this.createdTime_invalidation = invalidation;
	}
	
	public boolean isInvalidationCreatedTime() {
		return this.createdTime_invalidation;
	}
	
	private boolean createdTime_modified = false;
	

	public boolean isModifiedCreatedTime() {
		return this.createdTime_modified;
	}
	
	public void unModifiedCreatedTime() {
		this.createdTime_modified = false;
	}

	public String getCreatedTime() {
		return createdTime;
	}
	public String getNvlCreatedTime() {
		if(getCreatedTime() == null) {
			return  EMPTY_STRING;
		} else {
			return getCreatedTime();
		}
	}
	public void setCreatedTime(String createdTime) {
		if(createdTime == null) {
			this.createdTime  = EMPTY_STRING;
		} else {
			this.createdTime = createdTime;
		}
		this.createdTime_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : lastModifiedUser
	 * Comments    : 
	 */		

	private String lastModifiedUser = EMPTY_STRING;
	
			
	private boolean lastModifiedUser_nullable = false;
	
	public boolean isNullableLastModifiedUser() {
		return this.lastModifiedUser_nullable;
	}	
	
	private boolean lastModifiedUser_invalidation = false;
	
	public void setInvalidationLastModifiedUser(boolean invalidation) { 
		this.lastModifiedUser_invalidation = invalidation;
	}
	
	public boolean isInvalidationLastModifiedUser() {
		return this.lastModifiedUser_invalidation;
	}
	
	private boolean lastModifiedUser_modified = false;
	

	public boolean isModifiedLastModifiedUser() {
		return this.lastModifiedUser_modified;
	}
	
	public void unModifiedLastModifiedUser() {
		this.lastModifiedUser_modified = false;
	}

	public String getLastModifiedUser() {
		return lastModifiedUser;
	}
	public String getNvlLastModifiedUser() {
		if(getLastModifiedUser() == null) {
			return  EMPTY_STRING;
		} else {
			return getLastModifiedUser();
		}
	}
	public void setLastModifiedUser(String lastModifiedUser) {
		if(lastModifiedUser == null) {
			this.lastModifiedUser  = EMPTY_STRING;
		} else {
			this.lastModifiedUser = lastModifiedUser;
		}
		this.lastModifiedUser_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : lastModifiedTime
	 * Comments    : 
	 */		

	private String lastModifiedTime = EMPTY_STRING;
	
			
	private boolean lastModifiedTime_nullable = false;
	
	public boolean isNullableLastModifiedTime() {
		return this.lastModifiedTime_nullable;
	}	
	
	private boolean lastModifiedTime_invalidation = false;
	
	public void setInvalidationLastModifiedTime(boolean invalidation) { 
		this.lastModifiedTime_invalidation = invalidation;
	}
	
	public boolean isInvalidationLastModifiedTime() {
		return this.lastModifiedTime_invalidation;
	}
	
	private boolean lastModifiedTime_modified = false;
	

	public boolean isModifiedLastModifiedTime() {
		return this.lastModifiedTime_modified;
	}
	
	public void unModifiedLastModifiedTime() {
		this.lastModifiedTime_modified = false;
	}

	public String getLastModifiedTime() {
		return lastModifiedTime;
	}
	public String getNvlLastModifiedTime() {
		if(getLastModifiedTime() == null) {
			return  EMPTY_STRING;
		} else {
			return getLastModifiedTime();
		}
	}
	public void setLastModifiedTime(String lastModifiedTime) {
		if(lastModifiedTime == null) {
			this.lastModifiedTime  = EMPTY_STRING;
		} else {
			this.lastModifiedTime = lastModifiedTime;
		}
		this.lastModifiedTime_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : description
	 * Comments    : 
	 */		

	private String description = EMPTY_STRING;
	
			
	private boolean description_nullable = false;
	
	public boolean isNullableDescription() {
		return this.description_nullable;
	}	
	
	private boolean description_invalidation = false;
	
	public void setInvalidationDescription(boolean invalidation) { 
		this.description_invalidation = invalidation;
	}
	
	public boolean isInvalidationDescription() {
		return this.description_invalidation;
	}
	
	private boolean description_modified = false;
	

	public boolean isModifiedDescription() {
		return this.description_modified;
	}
	
	public void unModifiedDescription() {
		this.description_modified = false;
	}

	public String getDescription() {
		return description;
	}
	public String getNvlDescription() {
		if(getDescription() == null) {
			return  EMPTY_STRING;
		} else {
			return getDescription();
		}
	}
	public void setDescription(String description) {
		if(description == null) {
			this.description  = EMPTY_STRING;
		} else {
			this.description = description;
		}
		this.description_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.projectId_modified = false;
		this.name_modified = false;
		this.type_modified = false;
		this.status_modified = false;
		this.maxThreadNum_modified = false;
		this.syncTableNum_modified = false;
		this.createdUser_modified = false;
		this.createdTime_modified = false;
		this.lastModifiedUser_modified = false;
		this.lastModifiedTime_modified = false;
		this.description_modified = false;
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
		if(this.maxThreadNum_modified == true)
			modifiedFields.add("maxThreadNum");
		if(this.syncTableNum_modified == true)
			modifiedFields.add("syncTableNum");
		if(this.createdUser_modified == true)
			modifiedFields.add("createdUser");
		if(this.createdTime_modified == true)
			modifiedFields.add("createdTime");
		if(this.lastModifiedUser_modified == true)
			modifiedFields.add("lastModifiedUser");
		if(this.lastModifiedTime_modified == true)
			modifiedFields.add("lastModifiedTime");
		if(this.description_modified == true)
			modifiedFields.add("description");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		Project copyObj = new Project();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _project) {
		if(this == _project) return;
		Project __project = (Project) _project;
		
		this.setProjectId(__project.getProjectId());
		this.setName(__project.getName());
		this.setType(__project.getType());
		this.setStatus(__project.getStatus());
		this.setMaxThreadNum(__project.getMaxThreadNum());
		this.setSyncTableNum(__project.getSyncTableNum());
		this.setCreatedUser(__project.getCreatedUser());
		this.setCreatedTime(__project.getCreatedTime());
		this.setLastModifiedUser(__project.getLastModifiedUser());
		this.setLastModifiedTime(__project.getLastModifiedTime());
		this.setDescription(__project.getDescription());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("projectId : ").append(projectId).append("\n");				
		buffer.append("name : ").append(name).append("\n");				
		buffer.append("type : ").append(type).append("\n");				
		buffer.append("status : ").append(status).append("\n");				
		buffer.append("maxThreadNum : ").append(maxThreadNum).append("\n");				
		buffer.append("syncTableNum : ").append(syncTableNum).append("\n");				
		buffer.append("createdUser : ").append(createdUser).append("\n");				
		buffer.append("createdTime : ").append(createdTime).append("\n");				
		buffer.append("lastModifiedUser : ").append(lastModifiedUser).append("\n");				
		buffer.append("lastModifiedTime : ").append(lastModifiedTime).append("\n");				
		buffer.append("description : ").append(description).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(11);
		fieldPropertyMap.put("projectId"
							, FieldPropertyFactory.getFieldProperty( "projectId","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("name"
							, FieldPropertyFactory.getFieldProperty( "name","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("type"
							, FieldPropertyFactory.getFieldProperty( "type","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 8 , -1, null, null));		
		fieldPropertyMap.put("status"
							, FieldPropertyFactory.getFieldProperty( "status","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("maxThreadNum"
							, FieldPropertyFactory.getFieldProperty( "maxThreadNum","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("syncTableNum"
							, FieldPropertyFactory.getFieldProperty( "syncTableNum","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("createdUser"
							, FieldPropertyFactory.getFieldProperty( "createdUser","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("createdTime"
							, FieldPropertyFactory.getFieldProperty( "createdTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("lastModifiedUser"
							, FieldPropertyFactory.getFieldProperty( "lastModifiedUser","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("lastModifiedTime"
							, FieldPropertyFactory.getFieldProperty( "lastModifiedTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("description"
							, FieldPropertyFactory.getFieldProperty( "description","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 4000 , -1, null, null));		
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
			case "maxThreadNum" : return getMaxThreadNum();
			case "syncTableNum" : return getSyncTableNum();
			case "createdUser" : return getCreatedUser();
			case "createdTime" : return getCreatedTime();
			case "lastModifiedUser" : return getLastModifiedUser();
			case "lastModifiedTime" : return getLastModifiedTime();
			case "description" : return getDescription();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "projectId" : setProjectId((Integer)arg);break;
			case "name" : setName((String)arg);break;
			case "type" : setType((String)arg);break;
			case "status" : setStatus((String)arg);break;
			case "maxThreadNum" : setMaxThreadNum((Integer)arg);break;
			case "syncTableNum" : setSyncTableNum((Integer)arg);break;
			case "createdUser" : setCreatedUser((String)arg);break;
			case "createdTime" : setCreatedTime((String)arg);break;
			case "lastModifiedUser" : setLastModifiedUser((String)arg);break;
			case "lastModifiedTime" : setLastModifiedTime((String)arg);break;
			case "description" : setDescription((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(Project obj) {
		if (obj == this) return true;				
		if(this.projectId != obj.getProjectId()) return false; 									
		if(this.name != null ? !this.name.equals(obj.getName()) : obj.getName() != null) return false; 										
		if(this.type != null ? !this.type.equals(obj.getType()) : obj.getType() != null) return false; 										
		if(this.status != null ? !this.status.equals(obj.getStatus()) : obj.getStatus() != null) return false; 									
		if(this.maxThreadNum != obj.getMaxThreadNum()) return false; 								
		if(this.syncTableNum != obj.getSyncTableNum()) return false; 									
		if(this.createdUser != null ? !this.createdUser.equals(obj.getCreatedUser()) : obj.getCreatedUser() != null) return false; 										
		if(this.createdTime != null ? !this.createdTime.equals(obj.getCreatedTime()) : obj.getCreatedTime() != null) return false; 										
		if(this.lastModifiedUser != null ? !this.lastModifiedUser.equals(obj.getLastModifiedUser()) : obj.getLastModifiedUser() != null) return false; 										
		if(this.lastModifiedTime != null ? !this.lastModifiedTime.equals(obj.getLastModifiedTime()) : obj.getLastModifiedTime() != null) return false; 										
		if(this.description != null ? !this.description.equals(obj.getDescription()) : obj.getDescription() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
