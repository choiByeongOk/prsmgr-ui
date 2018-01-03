	
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
public class Connection extends DataObject {
	private static final String DTO_LOGICAL_NAME = "Connection";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public Connection() {
			super();
			
	}	 
	
	private boolean isModified = false;

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
	 * LogicalName : port
	 * Comments    : 
	 */		

	private int port;
	
		
	
	private boolean port_invalidation = false;
	
	public void setInvalidationPort(boolean invalidation) { 
		this.port_invalidation = invalidation;
	}
	
	public boolean isInvalidationPort() {
		return this.port_invalidation;
	}
	
	private boolean port_modified = false;
	

	public boolean isModifiedPort() {
		return this.port_modified;
	}
	
	public void unModifiedPort() {
		this.port_modified = false;
	}

	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
		this.port_modified = true;
		this.isModified = true;
	}
	
	public void setPort(Integer port) {
		if( port == null) {
			this.port = 0;
		} else{
			this.port = port.intValue();
		}
		this.port_modified = true;
		this.isModified = true;
	}
	public void setPort(String port) {
		if  (port==null || port.length() == 0) {
			this.port = 0;
		} else {
			this.port = Integer.parseInt(port);
		}
		this.port_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : topId
	 * Comments    : 
	 */		

	private String topId = EMPTY_STRING;
	
			
	private boolean topId_nullable = false;
	
	public boolean isNullableTopId() {
		return this.topId_nullable;
	}	
	
	private boolean topId_invalidation = false;
	
	public void setInvalidationTopId(boolean invalidation) { 
		this.topId_invalidation = invalidation;
	}
	
	public boolean isInvalidationTopId() {
		return this.topId_invalidation;
	}
	
	private boolean topId_modified = false;
	

	public boolean isModifiedTopId() {
		return this.topId_modified;
	}
	
	public void unModifiedTopId() {
		this.topId_modified = false;
	}

	public String getTopId() {
		return topId;
	}
	public String getNvlTopId() {
		if(getTopId() == null) {
			return  EMPTY_STRING;
		} else {
			return getTopId();
		}
	}
	public void setTopId(String topId) {
		if(topId == null) {
			this.topId  = EMPTY_STRING;
		} else {
			this.topId = topId;
		}
		this.topId_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.ip_modified = false;
		this.port_modified = false;
		this.topId_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.ip_modified == true)
			modifiedFields.add("ip");
		if(this.port_modified == true)
			modifiedFields.add("port");
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		Connection copyObj = new Connection();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _connection) {
		if(this == _connection) return;
		Connection __connection = (Connection) _connection;
		
		this.setIp(__connection.getIp());
		this.setPort(__connection.getPort());
		this.setTopId(__connection.getTopId());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("ip : ").append(ip).append("\n");				
		buffer.append("port : ").append(port).append("\n");				
		buffer.append("topId : ").append(topId).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(3);
		fieldPropertyMap.put("ip"
							, FieldPropertyFactory.getFieldProperty( "ip","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("port"
							, FieldPropertyFactory.getFieldProperty( "port","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "ip" : return getIp();
			case "port" : return getPort();
			case "topId" : return getTopId();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "ip" : setIp((String)arg);break;
			case "port" : setPort((Integer)arg);break;
			case "topId" : setTopId((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(Connection obj) {
		if (obj == this) return true;					
		if(this.ip != null ? !this.ip.equals(obj.getIp()) : obj.getIp() != null) return false; 									
		if(this.port != obj.getPort()) return false; 									
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
