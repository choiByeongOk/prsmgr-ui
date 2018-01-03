	
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
public class ProjectsListInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ProjectsListInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ProjectsListInput() {
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
			

	@Override
	public void clearAllIsModified() {
		this.projectId_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.projectId_modified == true)
			modifiedFields.add("projectId");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ProjectsListInput copyObj = new ProjectsListInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _projectsListInput) {
		if(this == _projectsListInput) return;
		ProjectsListInput __projectsListInput = (ProjectsListInput) _projectsListInput;
		
		this.setProjectId(__projectsListInput.getProjectId());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("projectId : ").append(projectId).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("projectId"
							, FieldPropertyFactory.getFieldProperty( "projectId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
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
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "projectId" : setProjectId((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ProjectsListInput obj) {
		if (obj == this) return true;					
		if(this.projectId != null ? !this.projectId.equals(obj.getProjectId()) : obj.getProjectId() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
