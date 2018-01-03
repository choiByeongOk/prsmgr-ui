	
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
public class ProjectsListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ProjectTop";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ProjectsListOutput() {
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
	 * LogicalName : topIds
	 * Comments    : 
	 */		

	private String topIds = EMPTY_STRING;
	
			
	private boolean topIds_nullable = false;
	
	public boolean isNullableTopIds() {
		return this.topIds_nullable;
	}	
	
	private boolean topIds_invalidation = false;
	
	public void setInvalidationTopIds(boolean invalidation) { 
		this.topIds_invalidation = invalidation;
	}
	
	public boolean isInvalidationTopIds() {
		return this.topIds_invalidation;
	}
	
	private boolean topIds_modified = false;
	

	public boolean isModifiedTopIds() {
		return this.topIds_modified;
	}
	
	public void unModifiedTopIds() {
		this.topIds_modified = false;
	}

	public String getTopIds() {
		return topIds;
	}
	public String getNvlTopIds() {
		if(getTopIds() == null) {
			return  EMPTY_STRING;
		} else {
			return getTopIds();
		}
	}
	public void setTopIds(String topIds) {
		if(topIds == null) {
			this.topIds  = EMPTY_STRING;
		} else {
			this.topIds = topIds;
		}
		this.topIds_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : ip
	 * Comments    : 
	 */		

	private String ip = EMPTY_STRING;
	
			
	private boolean ip_nullable = false;
	
	public boolean isNullableIp() {
		return this.ip_nullable;
	}	
	
	private boolean ip_invalidation = false;
	
	public void setInvalidationIp(boolean invalidation) { 
		this.ip_invalidation = invalidation;
	}
	
	public boolean isInvalidationIp() {
		return this.ip_invalidation;
	}
	
	private boolean ip_modified = false;
	

	public boolean isModifiedIp() {
		return this.ip_modified;
	}
	
	public void unModifiedIp() {
		this.ip_modified = false;
	}

	public String getIp() {
		return ip;
	}
	public String getNvlIp() {
		if(getIp() == null) {
			return  EMPTY_STRING;
		} else {
			return getIp();
		}
	}
	public void setIp(String ip) {
		if(ip == null) {
			this.ip  = EMPTY_STRING;
		} else {
			this.ip = ip;
		}
		this.ip_modified = true;
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
			

	@Override
	public void clearAllIsModified() {
		this.projectId_modified = false;
		this.name_modified = false;
		this.type_modified = false;
		this.topIds_modified = false;
		this.ip_modified = false;
		this.description_modified = false;
		this.createdUser_modified = false;
		this.createdTime_modified = false;
		this.lastModifiedUser_modified = false;
		this.lastModifiedTime_modified = false;
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
		if(this.topIds_modified == true)
			modifiedFields.add("topIds");
		if(this.ip_modified == true)
			modifiedFields.add("ip");
		if(this.description_modified == true)
			modifiedFields.add("description");
		if(this.createdUser_modified == true)
			modifiedFields.add("createdUser");
		if(this.createdTime_modified == true)
			modifiedFields.add("createdTime");
		if(this.lastModifiedUser_modified == true)
			modifiedFields.add("lastModifiedUser");
		if(this.lastModifiedTime_modified == true)
			modifiedFields.add("lastModifiedTime");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ProjectsListOutput copyObj = new ProjectsListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _projectTop) {
		if(this == _projectTop) return;
		ProjectsListOutput __projectTop = (ProjectsListOutput) _projectTop;
		
		this.setProjectId(__projectTop.getProjectId());
		this.setName(__projectTop.getName());
		this.setType(__projectTop.getType());
		this.setTopIds(__projectTop.getTopIds());
		this.setIp(__projectTop.getIp());
		this.setDescription(__projectTop.getDescription());
		this.setCreatedUser(__projectTop.getCreatedUser());
		this.setCreatedTime(__projectTop.getCreatedTime());
		this.setLastModifiedUser(__projectTop.getLastModifiedUser());
		this.setLastModifiedTime(__projectTop.getLastModifiedTime());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("projectId : ").append(projectId).append("\n");				
		buffer.append("name : ").append(name).append("\n");				
		buffer.append("type : ").append(type).append("\n");				
		buffer.append("topIds : ").append(topIds).append("\n");				
		buffer.append("ip : ").append(ip).append("\n");				
		buffer.append("description : ").append(description).append("\n");				
		buffer.append("createdUser : ").append(createdUser).append("\n");				
		buffer.append("createdTime : ").append(createdTime).append("\n");				
		buffer.append("lastModifiedUser : ").append(lastModifiedUser).append("\n");				
		buffer.append("lastModifiedTime : ").append(lastModifiedTime).append("\n");		
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
		fieldPropertyMap.put("topIds"
							, FieldPropertyFactory.getFieldProperty( "topIds","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 1024 , -1, null, null));		
		fieldPropertyMap.put("ip"
							, FieldPropertyFactory.getFieldProperty( "ip","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 512 , -1, null, null));		
		fieldPropertyMap.put("description"
							, FieldPropertyFactory.getFieldProperty( "description","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 4000 , -1, null, null));		
		fieldPropertyMap.put("createdUser"
							, FieldPropertyFactory.getFieldProperty( "createdUser","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("createdTime"
							, FieldPropertyFactory.getFieldProperty( "createdTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("lastModifiedUser"
							, FieldPropertyFactory.getFieldProperty( "lastModifiedUser","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("lastModifiedTime"
							, FieldPropertyFactory.getFieldProperty( "lastModifiedTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
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
			case "topIds" : return getTopIds();
			case "ip" : return getIp();
			case "description" : return getDescription();
			case "createdUser" : return getCreatedUser();
			case "createdTime" : return getCreatedTime();
			case "lastModifiedUser" : return getLastModifiedUser();
			case "lastModifiedTime" : return getLastModifiedTime();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "projectId" : setProjectId((String)arg);break;
			case "name" : setName((String)arg);break;
			case "type" : setType((String)arg);break;
			case "topIds" : setTopIds((String)arg);break;
			case "ip" : setIp((String)arg);break;
			case "description" : setDescription((String)arg);break;
			case "createdUser" : setCreatedUser((String)arg);break;
			case "createdTime" : setCreatedTime((String)arg);break;
			case "lastModifiedUser" : setLastModifiedUser((String)arg);break;
			case "lastModifiedTime" : setLastModifiedTime((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ProjectsListOutput obj) {
		if (obj == this) return true;					
		if(this.projectId != null ? !this.projectId.equals(obj.getProjectId()) : obj.getProjectId() != null) return false; 										
		if(this.name != null ? !this.name.equals(obj.getName()) : obj.getName() != null) return false; 										
		if(this.type != null ? !this.type.equals(obj.getType()) : obj.getType() != null) return false; 										
		if(this.topIds != null ? !this.topIds.equals(obj.getTopIds()) : obj.getTopIds() != null) return false; 										
		if(this.ip != null ? !this.ip.equals(obj.getIp()) : obj.getIp() != null) return false; 										
		if(this.description != null ? !this.description.equals(obj.getDescription()) : obj.getDescription() != null) return false; 										
		if(this.createdUser != null ? !this.createdUser.equals(obj.getCreatedUser()) : obj.getCreatedUser() != null) return false; 										
		if(this.createdTime != null ? !this.createdTime.equals(obj.getCreatedTime()) : obj.getCreatedTime() != null) return false; 										
		if(this.lastModifiedUser != null ? !this.lastModifiedUser.equals(obj.getLastModifiedUser()) : obj.getLastModifiedUser() != null) return false; 										
		if(this.lastModifiedTime != null ? !this.lastModifiedTime.equals(obj.getLastModifiedTime()) : obj.getLastModifiedTime() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
