	
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




import com.tmax.prosync.dto.Groups;




@com.tmax.proobject.core.DataObject
public class GroupsListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "GroupsListOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public GroupsListOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : groups
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.Groups> groups = new ArrayList<com.tmax.prosync.dto.Groups>(2);
	
	public List<com.tmax.prosync.dto.Groups> getGroupsList() {
		return groups;
	}
	private boolean groups_invalidation = false;
	
	public void setInvalidationGroups(boolean invalidation) { 
		this.groups_invalidation = invalidation;
	}
	
	public boolean isInvalidationGroups() {
		return this.groups_invalidation;
	}
	
	private boolean groups_modified = false;
	
	public boolean isModifiedGroups() {
		if(this.groups_modified) return true;
		for(int index=0; index < this.sizeGroups(); index++) {
			if(this.getGroups(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedGroups() {
		this.groups_modified = false;
	}
	
	public void clearGroups() {
		groups.clear();
		this.groups_modified = false;
	}
	
	public void ensureCapacityGroups(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.Groups>)groups).ensureCapacity( minCapacity );	
	}	
	public void createGroups(int _size) {
		((ArrayList<com.tmax.prosync.dto.Groups>)groups).ensureCapacity(_size);
		for(int i = groups.size(); i < _size; i++) {
			groups.add( new com.tmax.prosync.dto.Groups());
			this.groups_modified = true;
		}
	}
	public GroupsListOutput fillGroups(int _index) {
		ensureCapacityGroups(_index+1);
		for (int i = sizeGroups(); i <  _index + 1; i++) {
			this.groups.add(i, new com.tmax.prosync.dto.Groups());
			this.groups_modified = true;
		}
		return this;
	}
	
	public int sizeGroups() {
		return groups.size();
	}
	
	public com.tmax.prosync.dto.Groups[] getGroups() {	
		return (com.tmax.prosync.dto.Groups[])groups.toArray(new com.tmax.prosync.dto.Groups[groups.size()]);
		}
	public com.tmax.prosync.dto.Groups getGroups(int _index) {
		return (com.tmax.prosync.dto.Groups)groups.get(_index);
	}
	public void setGroups(List<com.tmax.prosync.dto.Groups> groups) {
		this.groups.clear();
		if(groups == null) {
			return;
		} else {
			for(int i = 0, n=groups.size(); i < n; i++) {
				if( groups.get(i) == null ) {
					this.groups.add( new com.tmax.prosync.dto.Groups());					
				}
				else {
					this.groups.add(groups.get(i));
				}
			}
		}
		this.groups_modified = true;
		this.isModified = true;
	}
	
	public void setGroups(com.tmax.prosync.dto.Groups[] groups) {
		this.groups.clear();
		if(groups == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.Groups>)this.groups).ensureCapacity(groups.length);
			for(int i = 0, n=groups.length; i < n; i++) {
				if( groups[i] == null ) {
					this.groups.add( new com.tmax.prosync.dto.Groups());					
				}
				else {
					this.groups.add(groups[i]);
				}
			}
		}
		this.groups_modified = true;
		this.isModified = true;
	}
	public void setGroups(int _index, com.tmax.prosync.dto.Groups groups) {
		if(groups == null) {
			this.groups.set(_index,  new com.tmax.prosync.dto.Groups());
		} else {
			this.groups.set(_index, groups);
		}
		this.groups_modified = true;
		this.isModified = true;
	}				
		
	public void addGroups(int _index, com.tmax.prosync.dto.Groups groups) {
		if(groups == null) {
			this.groups.add(_index,  new com.tmax.prosync.dto.Groups());
		} else {
			this.groups.add(_index, groups);
		}
		this.groups_modified = true;
		this.isModified = true;
	}
	public void addGroups(com.tmax.prosync.dto.Groups groups) {
		if(groups == null) {
			this.groups.add( new com.tmax.prosync.dto.Groups());
		} else {
			this.groups.add(groups);
		}
		this.groups_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.Groups removeGroups(int _index) {
		this.groups_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.Groups)this.groups.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.groups_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.groups_modified == true)
			modifiedFields.add("groups");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		GroupsListOutput copyObj = new GroupsListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _groupsListOutput) {
		if(this == _groupsListOutput) return;
		GroupsListOutput __groupsListOutput = (GroupsListOutput) _groupsListOutput;
		
		this.clearGroups();
		for (int index = 0; index < __groupsListOutput.sizeGroups(); index++) {
			this.addGroups(index, (com.tmax.prosync.dto.Groups)__groupsListOutput.getGroups(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeGroups(); index++) {

			buffer.append("groups(").append(index).append(") : ").append(getGroups(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("groups"
							, FieldPropertyFactory.getFieldProperty( "groups","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.Groups"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "groups" : return getGroupsList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "groups" : setGroups((List<com.tmax.prosync.dto.Groups>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(GroupsListOutput obj) {
		if (obj == this) return true;
		if(this.groups.size() != obj.sizeGroups()) return false;
		else {
			for(int i=0, n=this.groups.size(); i<n; i++ ){ 
				if(!this.getGroups(i).equals(obj.getGroups(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
