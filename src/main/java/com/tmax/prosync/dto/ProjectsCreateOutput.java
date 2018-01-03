	
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




import com.tmax.prosync.dto.Project;




@com.tmax.proobject.core.DataObject
public class ProjectsCreateOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ProjectsCreateOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ProjectsCreateOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : project
	 * Comments    : 
	 */		

	private com.tmax.prosync.dto.Project project = new com.tmax.prosync.dto.Project();
	
		
	
	private boolean project_invalidation = false;
	
	public void setInvalidationProject(boolean invalidation) { 
		this.project_invalidation = invalidation;
	}
	
	public boolean isInvalidationProject() {
		return this.project_invalidation;
	}
	
	private boolean project_modified = false;
	

	public boolean isModifiedProject() {
		if(this.project_modified) return true;
		if(project.isModified()) return true;
		return false;
	}
	
	public void unModifiedProject() {
		this.project_modified = false;
	}

	public com.tmax.prosync.dto.Project getProject() {
		return project;
	}
	public void setProject(com.tmax.prosync.dto.Project project) {
		if(project == null) {
			this.project  = new com.tmax.prosync.dto.Project();
		} else {
			this.project = project;
		}
		this.project_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.project_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.project_modified == true)
			modifiedFields.add("project");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ProjectsCreateOutput copyObj = new ProjectsCreateOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _projectsCreateOutput) {
		if(this == _projectsCreateOutput) return;
		ProjectsCreateOutput __projectsCreateOutput = (ProjectsCreateOutput) _projectsCreateOutput;
		
		this.setProject((com.tmax.prosync.dto.Project)__projectsCreateOutput.getProject().clone());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("project : ").append(project).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("project"
							, FieldPropertyFactory.getFieldProperty( "project","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, null, "com.tmax.prosync.dto.Project"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "project" : return getProject();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "project" : setProject((com.tmax.prosync.dto.Project)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ProjectsCreateOutput obj) {
		if (obj == this) return true;			
		if(!this.getProject().equals(obj.getProject())) return false;			
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
