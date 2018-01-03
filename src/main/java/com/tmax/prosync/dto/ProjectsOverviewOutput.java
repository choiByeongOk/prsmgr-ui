	
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




import com.tmax.prosync.dto.ProjectEventInstance;




@com.tmax.proobject.core.DataObject
public class ProjectsOverviewOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ProjectsOverviewOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ProjectsOverviewOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : projectEventInstance
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.ProjectEventInstance> projectEventInstance = new ArrayList<com.tmax.prosync.dto.ProjectEventInstance>(2);
	
	public List<com.tmax.prosync.dto.ProjectEventInstance> getProjectEventInstanceList() {
		return projectEventInstance;
	}
	private boolean projectEventInstance_invalidation = false;
	
	public void setInvalidationProjectEventInstance(boolean invalidation) { 
		this.projectEventInstance_invalidation = invalidation;
	}
	
	public boolean isInvalidationProjectEventInstance() {
		return this.projectEventInstance_invalidation;
	}
	
	private boolean projectEventInstance_modified = false;
	
	public boolean isModifiedProjectEventInstance() {
		if(this.projectEventInstance_modified) return true;
		for(int index=0; index < this.sizeProjectEventInstance(); index++) {
			if(this.getProjectEventInstance(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedProjectEventInstance() {
		this.projectEventInstance_modified = false;
	}
	
	public void clearProjectEventInstance() {
		projectEventInstance.clear();
		this.projectEventInstance_modified = false;
	}
	
	public void ensureCapacityProjectEventInstance(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.ProjectEventInstance>)projectEventInstance).ensureCapacity( minCapacity );	
	}	
	public void createProjectEventInstance(int _size) {
		((ArrayList<com.tmax.prosync.dto.ProjectEventInstance>)projectEventInstance).ensureCapacity(_size);
		for(int i = projectEventInstance.size(); i < _size; i++) {
			projectEventInstance.add( new com.tmax.prosync.dto.ProjectEventInstance());
			this.projectEventInstance_modified = true;
		}
	}
	public ProjectsOverviewOutput fillProjectEventInstance(int _index) {
		ensureCapacityProjectEventInstance(_index+1);
		for (int i = sizeProjectEventInstance(); i <  _index + 1; i++) {
			this.projectEventInstance.add(i, new com.tmax.prosync.dto.ProjectEventInstance());
			this.projectEventInstance_modified = true;
		}
		return this;
	}
	
	public int sizeProjectEventInstance() {
		return projectEventInstance.size();
	}
	
	public com.tmax.prosync.dto.ProjectEventInstance[] getProjectEventInstance() {	
		return (com.tmax.prosync.dto.ProjectEventInstance[])projectEventInstance.toArray(new com.tmax.prosync.dto.ProjectEventInstance[projectEventInstance.size()]);
		}
	public com.tmax.prosync.dto.ProjectEventInstance getProjectEventInstance(int _index) {
		return (com.tmax.prosync.dto.ProjectEventInstance)projectEventInstance.get(_index);
	}
	public void setProjectEventInstance(List<com.tmax.prosync.dto.ProjectEventInstance> projectEventInstance) {
		this.projectEventInstance.clear();
		if(projectEventInstance == null) {
			return;
		} else {
			for(int i = 0, n=projectEventInstance.size(); i < n; i++) {
				if( projectEventInstance.get(i) == null ) {
					this.projectEventInstance.add( new com.tmax.prosync.dto.ProjectEventInstance());					
				}
				else {
					this.projectEventInstance.add(projectEventInstance.get(i));
				}
			}
		}
		this.projectEventInstance_modified = true;
		this.isModified = true;
	}
	
	public void setProjectEventInstance(com.tmax.prosync.dto.ProjectEventInstance[] projectEventInstance) {
		this.projectEventInstance.clear();
		if(projectEventInstance == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.ProjectEventInstance>)this.projectEventInstance).ensureCapacity(projectEventInstance.length);
			for(int i = 0, n=projectEventInstance.length; i < n; i++) {
				if( projectEventInstance[i] == null ) {
					this.projectEventInstance.add( new com.tmax.prosync.dto.ProjectEventInstance());					
				}
				else {
					this.projectEventInstance.add(projectEventInstance[i]);
				}
			}
		}
		this.projectEventInstance_modified = true;
		this.isModified = true;
	}
	public void setProjectEventInstance(int _index, com.tmax.prosync.dto.ProjectEventInstance projectEventInstance) {
		if(projectEventInstance == null) {
			this.projectEventInstance.set(_index,  new com.tmax.prosync.dto.ProjectEventInstance());
		} else {
			this.projectEventInstance.set(_index, projectEventInstance);
		}
		this.projectEventInstance_modified = true;
		this.isModified = true;
	}				
		
	public void addProjectEventInstance(int _index, com.tmax.prosync.dto.ProjectEventInstance projectEventInstance) {
		if(projectEventInstance == null) {
			this.projectEventInstance.add(_index,  new com.tmax.prosync.dto.ProjectEventInstance());
		} else {
			this.projectEventInstance.add(_index, projectEventInstance);
		}
		this.projectEventInstance_modified = true;
		this.isModified = true;
	}
	public void addProjectEventInstance(com.tmax.prosync.dto.ProjectEventInstance projectEventInstance) {
		if(projectEventInstance == null) {
			this.projectEventInstance.add( new com.tmax.prosync.dto.ProjectEventInstance());
		} else {
			this.projectEventInstance.add(projectEventInstance);
		}
		this.projectEventInstance_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.ProjectEventInstance removeProjectEventInstance(int _index) {
		this.projectEventInstance_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.ProjectEventInstance)this.projectEventInstance.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.projectEventInstance_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.projectEventInstance_modified == true)
			modifiedFields.add("projectEventInstance");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ProjectsOverviewOutput copyObj = new ProjectsOverviewOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _projectsOverviewOutput) {
		if(this == _projectsOverviewOutput) return;
		ProjectsOverviewOutput __projectsOverviewOutput = (ProjectsOverviewOutput) _projectsOverviewOutput;
		
		this.clearProjectEventInstance();
		for (int index = 0; index < __projectsOverviewOutput.sizeProjectEventInstance(); index++) {
			this.addProjectEventInstance(index, (com.tmax.prosync.dto.ProjectEventInstance)__projectsOverviewOutput.getProjectEventInstance(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeProjectEventInstance(); index++) {

			buffer.append("projectEventInstance(").append(index).append(") : ").append(getProjectEventInstance(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("projectEventInstance"
							, FieldPropertyFactory.getFieldProperty( "projectEventInstance","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.ProjectEventInstance"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "projectEventInstance" : return getProjectEventInstanceList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "projectEventInstance" : setProjectEventInstance((List<com.tmax.prosync.dto.ProjectEventInstance>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ProjectsOverviewOutput obj) {
		if (obj == this) return true;
		if(this.projectEventInstance.size() != obj.sizeProjectEventInstance()) return false;
		else {
			for(int i=0, n=this.projectEventInstance.size(); i<n; i++ ){ 
				if(!this.getProjectEventInstance(i).equals(obj.getProjectEventInstance(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
