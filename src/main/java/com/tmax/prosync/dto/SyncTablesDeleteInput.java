	
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
public class SyncTablesDeleteInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "SyncTablesDeleteInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public SyncTablesDeleteInput() {
			super();
			
	}	 
	
	private boolean isModified = false;

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
	 * LogicalName : owner
	 * Comments    : 
	 */		

	private String owner = EMPTY_STRING;
	
			
	private boolean owner_nullable = false;
	
	public boolean isNullableOwner() {
		return this.owner_nullable;
	}	
	
	private boolean owner_invalidation = false;
	
	public void setInvalidationOwner(boolean invalidation) { 
		this.owner_invalidation = invalidation;
	}
	
	public boolean isInvalidationOwner() {
		return this.owner_invalidation;
	}
	
	private boolean owner_modified = false;
	

	public boolean isModifiedOwner() {
		return this.owner_modified;
	}
	
	public void unModifiedOwner() {
		this.owner_modified = false;
	}

	public String getOwner() {
		return owner;
	}
	public String getNvlOwner() {
		if(getOwner() == null) {
			return  EMPTY_STRING;
		} else {
			return getOwner();
		}
	}
	public void setOwner(String owner) {
		if(owner == null) {
			this.owner  = EMPTY_STRING;
		} else {
			this.owner = owner;
		}
		this.owner_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.topId_modified = false;
		this.type_modified = false;
		this.name_modified = false;
		this.owner_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.type_modified == true)
			modifiedFields.add("type");
		if(this.name_modified == true)
			modifiedFields.add("name");
		if(this.owner_modified == true)
			modifiedFields.add("owner");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		SyncTablesDeleteInput copyObj = new SyncTablesDeleteInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _syncTablesDeleteInput) {
		if(this == _syncTablesDeleteInput) return;
		SyncTablesDeleteInput __syncTablesDeleteInput = (SyncTablesDeleteInput) _syncTablesDeleteInput;
		
		this.setTopId(__syncTablesDeleteInput.getTopId());
		this.setType(__syncTablesDeleteInput.getType());
		this.setName(__syncTablesDeleteInput.getName());
		this.setOwner(__syncTablesDeleteInput.getOwner());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("type : ").append(type).append("\n");				
		buffer.append("name : ").append(name).append("\n");				
		buffer.append("owner : ").append(owner).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(4);
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("type"
							, FieldPropertyFactory.getFieldProperty( "type","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 8 , -1, null, null));		
		fieldPropertyMap.put("name"
							, FieldPropertyFactory.getFieldProperty( "name","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("owner"
							, FieldPropertyFactory.getFieldProperty( "owner","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "topId" : return getTopId();
			case "type" : return getType();
			case "name" : return getName();
			case "owner" : return getOwner();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topId" : setTopId((String)arg);break;
			case "type" : setType((String)arg);break;
			case "name" : setName((String)arg);break;
			case "owner" : setOwner((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(SyncTablesDeleteInput obj) {
		if (obj == this) return true;					
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.type != null ? !this.type.equals(obj.getType()) : obj.getType() != null) return false; 										
		if(this.name != null ? !this.name.equals(obj.getName()) : obj.getName() != null) return false; 										
		if(this.owner != null ? !this.owner.equals(obj.getOwner()) : obj.getOwner() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
