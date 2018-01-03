	
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
public class UsersLoginInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "UsersLoginInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public UsersLoginInput() {
			super();
			
	}	 
	
	private boolean isModified = false;

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
	 * LogicalName : password
	 * Comments    : 
	 */		

	private String password = EMPTY_STRING;
	
			
	private boolean password_nullable = false;
	
	public boolean isNullablePassword() {
		return this.password_nullable;
	}	
	
	private boolean password_invalidation = false;
	
	public void setInvalidationPassword(boolean invalidation) { 
		this.password_invalidation = invalidation;
	}
	
	public boolean isInvalidationPassword() {
		return this.password_invalidation;
	}
	
	private boolean password_modified = false;
	

	public boolean isModifiedPassword() {
		return this.password_modified;
	}
	
	public void unModifiedPassword() {
		this.password_modified = false;
	}

	public String getPassword() {
		return password;
	}
	public String getNvlPassword() {
		if(getPassword() == null) {
			return  EMPTY_STRING;
		} else {
			return getPassword();
		}
	}
	public void setPassword(String password) {
		if(password == null) {
			this.password  = EMPTY_STRING;
		} else {
			this.password = password;
		}
		this.password_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.userId_modified = false;
		this.password_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.userId_modified == true)
			modifiedFields.add("userId");
		if(this.password_modified == true)
			modifiedFields.add("password");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		UsersLoginInput copyObj = new UsersLoginInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _usersLoginInput) {
		if(this == _usersLoginInput) return;
		UsersLoginInput __usersLoginInput = (UsersLoginInput) _usersLoginInput;
		
		this.setUserId(__usersLoginInput.getUserId());
		this.setPassword(__usersLoginInput.getPassword());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("userId : ").append(userId).append("\n");				
		buffer.append("password : ").append(password).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(2);
		fieldPropertyMap.put("userId"
							, FieldPropertyFactory.getFieldProperty( "userId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("password"
							, FieldPropertyFactory.getFieldProperty( "password","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "userId" : return getUserId();
			case "password" : return getPassword();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "userId" : setUserId((String)arg);break;
			case "password" : setPassword((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(UsersLoginInput obj) {
		if (obj == this) return true;					
		if(this.userId != null ? !this.userId.equals(obj.getUserId()) : obj.getUserId() != null) return false; 										
		if(this.password != null ? !this.password.equals(obj.getPassword()) : obj.getPassword() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
