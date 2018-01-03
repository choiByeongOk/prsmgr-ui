	
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




import com.tmax.prosync.dto.KeyValue;




@com.tmax.proobject.core.DataObject
public class ParameterEdit extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ParameterEdit";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ParameterEdit() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : processNum
	 * Comments    : 
	 */		

	private int processNum;
	
		
	
	private boolean processNum_invalidation = false;
	
	public void setInvalidationProcessNum(boolean invalidation) { 
		this.processNum_invalidation = invalidation;
	}
	
	public boolean isInvalidationProcessNum() {
		return this.processNum_invalidation;
	}
	
	private boolean processNum_modified = false;
	

	public boolean isModifiedProcessNum() {
		return this.processNum_modified;
	}
	
	public void unModifiedProcessNum() {
		this.processNum_modified = false;
	}

	public int getProcessNum() {
		return processNum;
	}
	public void setProcessNum(int processNum) {
		this.processNum = processNum;
		this.processNum_modified = true;
		this.isModified = true;
	}
	
	public void setProcessNum(Integer processNum) {
		if( processNum == null) {
			this.processNum = 0;
		} else{
			this.processNum = processNum.intValue();
		}
		this.processNum_modified = true;
		this.isModified = true;
	}
	public void setProcessNum(String processNum) {
		if  (processNum==null || processNum.length() == 0) {
			this.processNum = 0;
		} else {
			this.processNum = Integer.parseInt(processNum);
		}
		this.processNum_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : processType
	 * Comments    : 
	 */		

	private String processType = EMPTY_STRING;
	
			
	private boolean processType_nullable = false;
	
	public boolean isNullableProcessType() {
		return this.processType_nullable;
	}	
	
	private boolean processType_invalidation = false;
	
	public void setInvalidationProcessType(boolean invalidation) { 
		this.processType_invalidation = invalidation;
	}
	
	public boolean isInvalidationProcessType() {
		return this.processType_invalidation;
	}
	
	private boolean processType_modified = false;
	

	public boolean isModifiedProcessType() {
		return this.processType_modified;
	}
	
	public void unModifiedProcessType() {
		this.processType_modified = false;
	}

	public String getProcessType() {
		return processType;
	}
	public String getNvlProcessType() {
		if(getProcessType() == null) {
			return  EMPTY_STRING;
		} else {
			return getProcessType();
		}
	}
	public void setProcessType(String processType) {
		if(processType == null) {
			this.processType  = EMPTY_STRING;
		} else {
			this.processType = processType;
		}
		this.processType_modified = true;
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
	 * LogicalName : keyValue
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.KeyValue> keyValue = new ArrayList<com.tmax.prosync.dto.KeyValue>(2);
	
	public List<com.tmax.prosync.dto.KeyValue> getKeyValueList() {
		return keyValue;
	}
	private boolean keyValue_invalidation = false;
	
	public void setInvalidationKeyValue(boolean invalidation) { 
		this.keyValue_invalidation = invalidation;
	}
	
	public boolean isInvalidationKeyValue() {
		return this.keyValue_invalidation;
	}
	
	private boolean keyValue_modified = false;
	
	public boolean isModifiedKeyValue() {
		if(this.keyValue_modified) return true;
		for(int index=0; index < this.sizeKeyValue(); index++) {
			if(this.getKeyValue(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedKeyValue() {
		this.keyValue_modified = false;
	}
	
	public void clearKeyValue() {
		keyValue.clear();
		this.keyValue_modified = false;
	}
	
	public void ensureCapacityKeyValue(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.KeyValue>)keyValue).ensureCapacity( minCapacity );	
	}	
	public void createKeyValue(int _size) {
		((ArrayList<com.tmax.prosync.dto.KeyValue>)keyValue).ensureCapacity(_size);
		for(int i = keyValue.size(); i < _size; i++) {
			keyValue.add( new com.tmax.prosync.dto.KeyValue());
			this.keyValue_modified = true;
		}
	}
	public ParameterEdit fillKeyValue(int _index) {
		ensureCapacityKeyValue(_index+1);
		for (int i = sizeKeyValue(); i <  _index + 1; i++) {
			this.keyValue.add(i, new com.tmax.prosync.dto.KeyValue());
			this.keyValue_modified = true;
		}
		return this;
	}
	
	public int sizeKeyValue() {
		return keyValue.size();
	}
	
	public com.tmax.prosync.dto.KeyValue[] getKeyValue() {	
		return (com.tmax.prosync.dto.KeyValue[])keyValue.toArray(new com.tmax.prosync.dto.KeyValue[keyValue.size()]);
		}
	public com.tmax.prosync.dto.KeyValue getKeyValue(int _index) {
		return (com.tmax.prosync.dto.KeyValue)keyValue.get(_index);
	}
	public void setKeyValue(List<com.tmax.prosync.dto.KeyValue> keyValue) {
		this.keyValue.clear();
		if(keyValue == null) {
			return;
		} else {
			for(int i = 0, n=keyValue.size(); i < n; i++) {
				if( keyValue.get(i) == null ) {
					this.keyValue.add( new com.tmax.prosync.dto.KeyValue());					
				}
				else {
					this.keyValue.add(keyValue.get(i));
				}
			}
		}
		this.keyValue_modified = true;
		this.isModified = true;
	}
	
	public void setKeyValue(com.tmax.prosync.dto.KeyValue[] keyValue) {
		this.keyValue.clear();
		if(keyValue == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.KeyValue>)this.keyValue).ensureCapacity(keyValue.length);
			for(int i = 0, n=keyValue.length; i < n; i++) {
				if( keyValue[i] == null ) {
					this.keyValue.add( new com.tmax.prosync.dto.KeyValue());					
				}
				else {
					this.keyValue.add(keyValue[i]);
				}
			}
		}
		this.keyValue_modified = true;
		this.isModified = true;
	}
	public void setKeyValue(int _index, com.tmax.prosync.dto.KeyValue keyValue) {
		if(keyValue == null) {
			this.keyValue.set(_index,  new com.tmax.prosync.dto.KeyValue());
		} else {
			this.keyValue.set(_index, keyValue);
		}
		this.keyValue_modified = true;
		this.isModified = true;
	}				
		
	public void addKeyValue(int _index, com.tmax.prosync.dto.KeyValue keyValue) {
		if(keyValue == null) {
			this.keyValue.add(_index,  new com.tmax.prosync.dto.KeyValue());
		} else {
			this.keyValue.add(_index, keyValue);
		}
		this.keyValue_modified = true;
		this.isModified = true;
	}
	public void addKeyValue(com.tmax.prosync.dto.KeyValue keyValue) {
		if(keyValue == null) {
			this.keyValue.add( new com.tmax.prosync.dto.KeyValue());
		} else {
			this.keyValue.add(keyValue);
		}
		this.keyValue_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.KeyValue removeKeyValue(int _index) {
		this.keyValue_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.KeyValue)this.keyValue.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.processNum_modified = false;
		this.processType_modified = false;
		this.topId_modified = false;
		this.type_modified = false;
		this.keyValue_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.processNum_modified == true)
			modifiedFields.add("processNum");
		if(this.processType_modified == true)
			modifiedFields.add("processType");
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.type_modified == true)
			modifiedFields.add("type");
		if(this.keyValue_modified == true)
			modifiedFields.add("keyValue");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ParameterEdit copyObj = new ParameterEdit();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _parameterEdit) {
		if(this == _parameterEdit) return;
		ParameterEdit __parameterEdit = (ParameterEdit) _parameterEdit;
		
		this.setProcessNum(__parameterEdit.getProcessNum());
		this.setProcessType(__parameterEdit.getProcessType());
		this.setTopId(__parameterEdit.getTopId());
		this.setType(__parameterEdit.getType());
		this.clearKeyValue();
		for (int index = 0; index < __parameterEdit.sizeKeyValue(); index++) {
			this.addKeyValue(index, (com.tmax.prosync.dto.KeyValue)__parameterEdit.getKeyValue(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("processNum : ").append(processNum).append("\n");				
		buffer.append("processType : ").append(processType).append("\n");				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("type : ").append(type).append("\n");		
		for (int index = 0; index < sizeKeyValue(); index++) {

			buffer.append("keyValue(").append(index).append(") : ").append(getKeyValue(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(5);
		fieldPropertyMap.put("processNum"
							, FieldPropertyFactory.getFieldProperty( "processNum","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("processType"
							, FieldPropertyFactory.getFieldProperty( "processType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 25 , -1, null, null));		
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("type"
							, FieldPropertyFactory.getFieldProperty( "type","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 8 , -1, null, null));		
		fieldPropertyMap.put("keyValue"
							, FieldPropertyFactory.getFieldProperty( "keyValue","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.KeyValue"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "processNum" : return getProcessNum();
			case "processType" : return getProcessType();
			case "topId" : return getTopId();
			case "type" : return getType();
			case "keyValue" : return getKeyValueList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "processNum" : setProcessNum((Integer)arg);break;
			case "processType" : setProcessType((String)arg);break;
			case "topId" : setTopId((String)arg);break;
			case "type" : setType((String)arg);break;
			case "keyValue" : setKeyValue((List<com.tmax.prosync.dto.KeyValue>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ParameterEdit obj) {
		if (obj == this) return true;				
		if(this.processNum != obj.getProcessNum()) return false; 									
		if(this.processType != null ? !this.processType.equals(obj.getProcessType()) : obj.getProcessType() != null) return false; 										
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.type != null ? !this.type.equals(obj.getType()) : obj.getType() != null) return false; 					
		if(this.keyValue.size() != obj.sizeKeyValue()) return false;
		else {
			for(int i=0, n=this.keyValue.size(); i<n; i++ ){ 
				if(!this.getKeyValue(i).equals(obj.getKeyValue(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
