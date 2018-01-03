	
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




import com.tmax.prosync.dto.Data;




@com.tmax.proobject.core.DataObject
public class Elements extends DataObject {
	private static final String DTO_LOGICAL_NAME = "Elements";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public Elements() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : group
	 * Comments    : 
	 */		

	private String group = EMPTY_STRING;
	
			
	private boolean group_nullable = false;
	
	public boolean isNullableGroup() {
		return this.group_nullable;
	}	
	
	private boolean group_invalidation = false;
	
	public void setInvalidationGroup(boolean invalidation) { 
		this.group_invalidation = invalidation;
	}
	
	public boolean isInvalidationGroup() {
		return this.group_invalidation;
	}
	
	private boolean group_modified = false;
	

	public boolean isModifiedGroup() {
		return this.group_modified;
	}
	
	public void unModifiedGroup() {
		this.group_modified = false;
	}

	public String getGroup() {
		return group;
	}
	public String getNvlGroup() {
		if(getGroup() == null) {
			return  EMPTY_STRING;
		} else {
			return getGroup();
		}
	}
	public void setGroup(String group) {
		if(group == null) {
			this.group  = EMPTY_STRING;
		} else {
			this.group = group;
		}
		this.group_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : classes
	 * Comments    : 
	 */		

	private String classes = EMPTY_STRING;
	
			
	private boolean classes_nullable = false;
	
	public boolean isNullableClasses() {
		return this.classes_nullable;
	}	
	
	private boolean classes_invalidation = false;
	
	public void setInvalidationClasses(boolean invalidation) { 
		this.classes_invalidation = invalidation;
	}
	
	public boolean isInvalidationClasses() {
		return this.classes_invalidation;
	}
	
	private boolean classes_modified = false;
	

	public boolean isModifiedClasses() {
		return this.classes_modified;
	}
	
	public void unModifiedClasses() {
		this.classes_modified = false;
	}

	public String getClasses() {
		return classes;
	}
	public String getNvlClasses() {
		if(getClasses() == null) {
			return  EMPTY_STRING;
		} else {
			return getClasses();
		}
	}
	public void setClasses(String classes) {
		if(classes == null) {
			this.classes  = EMPTY_STRING;
		} else {
			this.classes = classes;
		}
		this.classes_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : data
	 * Comments    : 
	 */		

	private com.tmax.prosync.dto.Data data = new com.tmax.prosync.dto.Data();
	
		
	
	private boolean data_invalidation = false;
	
	public void setInvalidationData(boolean invalidation) { 
		this.data_invalidation = invalidation;
	}
	
	public boolean isInvalidationData() {
		return this.data_invalidation;
	}
	
	private boolean data_modified = false;
	

	public boolean isModifiedData() {
		if(this.data_modified) return true;
		if(data.isModified()) return true;
		return false;
	}
	
	public void unModifiedData() {
		this.data_modified = false;
	}

	public com.tmax.prosync.dto.Data getData() {
		return data;
	}
	public void setData(com.tmax.prosync.dto.Data data) {
		if(data == null) {
			this.data  = new com.tmax.prosync.dto.Data();
		} else {
			this.data = data;
		}
		this.data_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.group_modified = false;
		this.classes_modified = false;
		this.data_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.group_modified == true)
			modifiedFields.add("group");
		if(this.classes_modified == true)
			modifiedFields.add("classes");
		if(this.data_modified == true)
			modifiedFields.add("data");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		Elements copyObj = new Elements();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _elements) {
		if(this == _elements) return;
		Elements __elements = (Elements) _elements;
		
		this.setGroup(__elements.getGroup());
		this.setClasses(__elements.getClasses());
		this.setData((com.tmax.prosync.dto.Data)__elements.getData().clone());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("group : ").append(group).append("\n");				
		buffer.append("classes : ").append(classes).append("\n");				
		buffer.append("data : ").append(data).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(3);
		fieldPropertyMap.put("group"
							, FieldPropertyFactory.getFieldProperty( "group","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("classes"
							, FieldPropertyFactory.getFieldProperty( "classes","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("data"
							, FieldPropertyFactory.getFieldProperty( "data","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, -1, -1, null, "com.tmax.prosync.dto.Data"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "group" : return getGroup();
			case "classes" : return getClasses();
			case "data" : return getData();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "group" : setGroup((String)arg);break;
			case "classes" : setClasses((String)arg);break;
			case "data" : setData((com.tmax.prosync.dto.Data)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(Elements obj) {
		if (obj == this) return true;					
		if(this.group != null ? !this.group.equals(obj.getGroup()) : obj.getGroup() != null) return false; 										
		if(this.classes != null ? !this.classes.equals(obj.getClasses()) : obj.getClasses() != null) return false; 								
		if(!this.getData().equals(obj.getData())) return false;			
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
