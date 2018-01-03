	
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




import com.tmax.prosync.dto.Connection;




@com.tmax.proobject.core.DataObject
public class ProjectsCreateInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ProjectsCreateInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ProjectsCreateInput() {
			super();
			
	}	 
	
	private boolean isModified = false;

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
	 * LogicalName : connection
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.Connection> connection = new ArrayList<com.tmax.prosync.dto.Connection>(2);
	
	public List<com.tmax.prosync.dto.Connection> getConnectionList() {
		return connection;
	}
	private boolean connection_invalidation = false;
	
	public void setInvalidationConnection(boolean invalidation) { 
		this.connection_invalidation = invalidation;
	}
	
	public boolean isInvalidationConnection() {
		return this.connection_invalidation;
	}
	
	private boolean connection_modified = false;
	
	public boolean isModifiedConnection() {
		if(this.connection_modified) return true;
		for(int index=0; index < this.sizeConnection(); index++) {
			if(this.getConnection(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedConnection() {
		this.connection_modified = false;
	}
	
	public void clearConnection() {
		connection.clear();
		this.connection_modified = false;
	}
	
	public void ensureCapacityConnection(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.Connection>)connection).ensureCapacity( minCapacity );	
	}	
	public void createConnection(int _size) {
		((ArrayList<com.tmax.prosync.dto.Connection>)connection).ensureCapacity(_size);
		for(int i = connection.size(); i < _size; i++) {
			connection.add( new com.tmax.prosync.dto.Connection());
			this.connection_modified = true;
		}
	}
	public ProjectsCreateInput fillConnection(int _index) {
		ensureCapacityConnection(_index+1);
		for (int i = sizeConnection(); i <  _index + 1; i++) {
			this.connection.add(i, new com.tmax.prosync.dto.Connection());
			this.connection_modified = true;
		}
		return this;
	}
	
	public int sizeConnection() {
		return connection.size();
	}
	
	public com.tmax.prosync.dto.Connection[] getConnection() {	
		return (com.tmax.prosync.dto.Connection[])connection.toArray(new com.tmax.prosync.dto.Connection[connection.size()]);
		}
	public com.tmax.prosync.dto.Connection getConnection(int _index) {
		return (com.tmax.prosync.dto.Connection)connection.get(_index);
	}
	public void setConnection(List<com.tmax.prosync.dto.Connection> connection) {
		this.connection.clear();
		if(connection == null) {
			return;
		} else {
			for(int i = 0, n=connection.size(); i < n; i++) {
				if( connection.get(i) == null ) {
					this.connection.add( new com.tmax.prosync.dto.Connection());					
				}
				else {
					this.connection.add(connection.get(i));
				}
			}
		}
		this.connection_modified = true;
		this.isModified = true;
	}
	
	public void setConnection(com.tmax.prosync.dto.Connection[] connection) {
		this.connection.clear();
		if(connection == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.Connection>)this.connection).ensureCapacity(connection.length);
			for(int i = 0, n=connection.length; i < n; i++) {
				if( connection[i] == null ) {
					this.connection.add( new com.tmax.prosync.dto.Connection());					
				}
				else {
					this.connection.add(connection[i]);
				}
			}
		}
		this.connection_modified = true;
		this.isModified = true;
	}
	public void setConnection(int _index, com.tmax.prosync.dto.Connection connection) {
		if(connection == null) {
			this.connection.set(_index,  new com.tmax.prosync.dto.Connection());
		} else {
			this.connection.set(_index, connection);
		}
		this.connection_modified = true;
		this.isModified = true;
	}				
		
	public void addConnection(int _index, com.tmax.prosync.dto.Connection connection) {
		if(connection == null) {
			this.connection.add(_index,  new com.tmax.prosync.dto.Connection());
		} else {
			this.connection.add(_index, connection);
		}
		this.connection_modified = true;
		this.isModified = true;
	}
	public void addConnection(com.tmax.prosync.dto.Connection connection) {
		if(connection == null) {
			this.connection.add( new com.tmax.prosync.dto.Connection());
		} else {
			this.connection.add(connection);
		}
		this.connection_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.Connection removeConnection(int _index) {
		this.connection_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.Connection)this.connection.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.name_modified = false;
		this.description_modified = false;
		this.userId_modified = false;
		this.connection_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.name_modified == true)
			modifiedFields.add("name");
		if(this.description_modified == true)
			modifiedFields.add("description");
		if(this.userId_modified == true)
			modifiedFields.add("userId");
		if(this.connection_modified == true)
			modifiedFields.add("connection");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ProjectsCreateInput copyObj = new ProjectsCreateInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _projectsCreateInput) {
		if(this == _projectsCreateInput) return;
		ProjectsCreateInput __projectsCreateInput = (ProjectsCreateInput) _projectsCreateInput;
		
		this.setName(__projectsCreateInput.getName());
		this.setDescription(__projectsCreateInput.getDescription());
		this.setUserId(__projectsCreateInput.getUserId());
		this.clearConnection();
		for (int index = 0; index < __projectsCreateInput.sizeConnection(); index++) {
			this.addConnection(index, (com.tmax.prosync.dto.Connection)__projectsCreateInput.getConnection(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("name : ").append(name).append("\n");				
		buffer.append("description : ").append(description).append("\n");				
		buffer.append("userId : ").append(userId).append("\n");		
		for (int index = 0; index < sizeConnection(); index++) {

			buffer.append("connection(").append(index).append(") : ").append(getConnection(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(4);
		fieldPropertyMap.put("name"
							, FieldPropertyFactory.getFieldProperty( "name","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("description"
							, FieldPropertyFactory.getFieldProperty( "description","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 4000 , -1, null, null));		
		fieldPropertyMap.put("userId"
							, FieldPropertyFactory.getFieldProperty( "userId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("connection"
							, FieldPropertyFactory.getFieldProperty( "connection","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.Connection"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "name" : return getName();
			case "description" : return getDescription();
			case "userId" : return getUserId();
			case "connection" : return getConnectionList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "name" : setName((String)arg);break;
			case "description" : setDescription((String)arg);break;
			case "userId" : setUserId((String)arg);break;
			case "connection" : setConnection((List<com.tmax.prosync.dto.Connection>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ProjectsCreateInput obj) {
		if (obj == this) return true;					
		if(this.name != null ? !this.name.equals(obj.getName()) : obj.getName() != null) return false; 										
		if(this.description != null ? !this.description.equals(obj.getDescription()) : obj.getDescription() != null) return false; 										
		if(this.userId != null ? !this.userId.equals(obj.getUserId()) : obj.getUserId() != null) return false; 					
		if(this.connection.size() != obj.sizeConnection()) return false;
		else {
			for(int i=0, n=this.connection.size(); i<n; i++ ){ 
				if(!this.getConnection(i).equals(obj.getConnection(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
