	
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
public class KeyValue extends DataObject {
	private static final String DTO_LOGICAL_NAME = "KeyValue";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public KeyValue() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : key
	 * Comments    : 
	 */		

	private String key = EMPTY_STRING;
	
			
	private boolean key_nullable = false;
	
	public boolean isNullableKey() {
		return this.key_nullable;
	}	
	
	private boolean key_invalidation = false;
	
	public void setInvalidationKey(boolean invalidation) { 
		this.key_invalidation = invalidation;
	}
	
	public boolean isInvalidationKey() {
		return this.key_invalidation;
	}
	
	private boolean key_modified = false;
	

	public boolean isModifiedKey() {
		return this.key_modified;
	}
	
	public void unModifiedKey() {
		this.key_modified = false;
	}

	public String getKey() {
		return key;
	}
	public String getNvlKey() {
		if(getKey() == null) {
			return  EMPTY_STRING;
		} else {
			return getKey();
		}
	}
	public void setKey(String key) {
		if(key == null) {
			this.key  = EMPTY_STRING;
		} else {
			this.key = key;
		}
		this.key_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : value
	 * Comments    : 
	 */		

	private String value = EMPTY_STRING;
	
			
	private boolean value_nullable = false;
	
	public boolean isNullableValue() {
		return this.value_nullable;
	}	
	
	private boolean value_invalidation = false;
	
	public void setInvalidationValue(boolean invalidation) { 
		this.value_invalidation = invalidation;
	}
	
	public boolean isInvalidationValue() {
		return this.value_invalidation;
	}
	
	private boolean value_modified = false;
	

	public boolean isModifiedValue() {
		return this.value_modified;
	}
	
	public void unModifiedValue() {
		this.value_modified = false;
	}

	public String getValue() {
		return value;
	}
	public String getNvlValue() {
		if(getValue() == null) {
			return  EMPTY_STRING;
		} else {
			return getValue();
		}
	}
	public void setValue(String value) {
		if(value == null) {
			this.value  = EMPTY_STRING;
		} else {
			this.value = value;
		}
		this.value_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.key_modified = false;
		this.value_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.key_modified == true)
			modifiedFields.add("key");
		if(this.value_modified == true)
			modifiedFields.add("value");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		KeyValue copyObj = new KeyValue();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _keyValue) {
		if(this == _keyValue) return;
		KeyValue __keyValue = (KeyValue) _keyValue;
		
		this.setKey(__keyValue.getKey());
		this.setValue(__keyValue.getValue());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("key : ").append(key).append("\n");				
		buffer.append("value : ").append(value).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(2);
		fieldPropertyMap.put("key"
							, FieldPropertyFactory.getFieldProperty( "key","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 256 , -1, null, null));		
		fieldPropertyMap.put("value"
							, FieldPropertyFactory.getFieldProperty( "value","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 256 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "key" : return getKey();
			case "value" : return getValue();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "key" : setKey((String)arg);break;
			case "value" : setValue((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(KeyValue obj) {
		if (obj == this) return true;					
		if(this.key != null ? !this.key.equals(obj.getKey()) : obj.getKey() != null) return false; 										
		if(this.value != null ? !this.value.equals(obj.getValue()) : obj.getValue() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
