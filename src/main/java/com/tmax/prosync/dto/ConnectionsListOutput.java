	
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
public class ConnectionsListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ConnectionsListOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ConnectionsListOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

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
	public ConnectionsListOutput fillConnection(int _index) {
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
		this.connection_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.connection_modified == true)
			modifiedFields.add("connection");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ConnectionsListOutput copyObj = new ConnectionsListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _connectionsListOutput) {
		if(this == _connectionsListOutput) return;
		ConnectionsListOutput __connectionsListOutput = (ConnectionsListOutput) _connectionsListOutput;
		
		this.clearConnection();
		for (int index = 0; index < __connectionsListOutput.sizeConnection(); index++) {
			this.addConnection(index, (com.tmax.prosync.dto.Connection)__connectionsListOutput.getConnection(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeConnection(); index++) {

			buffer.append("connection(").append(index).append(") : ").append(getConnection(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
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
			case "connection" : return getConnectionList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "connection" : setConnection((List<com.tmax.prosync.dto.Connection>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ConnectionsListOutput obj) {
		if (obj == this) return true;
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
