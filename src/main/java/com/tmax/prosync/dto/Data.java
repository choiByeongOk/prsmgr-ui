	
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
public class Data extends DataObject {
	private static final String DTO_LOGICAL_NAME = "Data";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public Data() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : id
	 * Comments    : 
	 */		

	private String id = EMPTY_STRING;
	
			
	private boolean id_nullable = false;
	
	public boolean isNullableId() {
		return this.id_nullable;
	}	
	
	private boolean id_invalidation = false;
	
	public void setInvalidationId(boolean invalidation) { 
		this.id_invalidation = invalidation;
	}
	
	public boolean isInvalidationId() {
		return this.id_invalidation;
	}
	
	private boolean id_modified = false;
	

	public boolean isModifiedId() {
		return this.id_modified;
	}
	
	public void unModifiedId() {
		this.id_modified = false;
	}

	public String getId() {
		return id;
	}
	public String getNvlId() {
		if(getId() == null) {
			return  EMPTY_STRING;
		} else {
			return getId();
		}
	}
	public void setId(String id) {
		if(id == null) {
			this.id  = EMPTY_STRING;
		} else {
			this.id = id;
		}
		this.id_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : label
	 * Comments    : 
	 */		

	private String label = EMPTY_STRING;
	
			
	private boolean label_nullable = false;
	
	public boolean isNullableLabel() {
		return this.label_nullable;
	}	
	
	private boolean label_invalidation = false;
	
	public void setInvalidationLabel(boolean invalidation) { 
		this.label_invalidation = invalidation;
	}
	
	public boolean isInvalidationLabel() {
		return this.label_invalidation;
	}
	
	private boolean label_modified = false;
	

	public boolean isModifiedLabel() {
		return this.label_modified;
	}
	
	public void unModifiedLabel() {
		this.label_modified = false;
	}

	public String getLabel() {
		return label;
	}
	public String getNvlLabel() {
		if(getLabel() == null) {
			return  EMPTY_STRING;
		} else {
			return getLabel();
		}
	}
	public void setLabel(String label) {
		if(label == null) {
			this.label  = EMPTY_STRING;
		} else {
			this.label = label;
		}
		this.label_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : source
	 * Comments    : 
	 */		

	private String source = EMPTY_STRING;
	
			
	private boolean source_nullable = false;
	
	public boolean isNullableSource() {
		return this.source_nullable;
	}	
	
	private boolean source_invalidation = false;
	
	public void setInvalidationSource(boolean invalidation) { 
		this.source_invalidation = invalidation;
	}
	
	public boolean isInvalidationSource() {
		return this.source_invalidation;
	}
	
	private boolean source_modified = false;
	

	public boolean isModifiedSource() {
		return this.source_modified;
	}
	
	public void unModifiedSource() {
		this.source_modified = false;
	}

	public String getSource() {
		return source;
	}
	public String getNvlSource() {
		if(getSource() == null) {
			return  EMPTY_STRING;
		} else {
			return getSource();
		}
	}
	public void setSource(String source) {
		if(source == null) {
			this.source  = EMPTY_STRING;
		} else {
			this.source = source;
		}
		this.source_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : target
	 * Comments    : 
	 */		

	private String target = EMPTY_STRING;
	
			
	private boolean target_nullable = false;
	
	public boolean isNullableTarget() {
		return this.target_nullable;
	}	
	
	private boolean target_invalidation = false;
	
	public void setInvalidationTarget(boolean invalidation) { 
		this.target_invalidation = invalidation;
	}
	
	public boolean isInvalidationTarget() {
		return this.target_invalidation;
	}
	
	private boolean target_modified = false;
	

	public boolean isModifiedTarget() {
		return this.target_modified;
	}
	
	public void unModifiedTarget() {
		this.target_modified = false;
	}

	public String getTarget() {
		return target;
	}
	public String getNvlTarget() {
		if(getTarget() == null) {
			return  EMPTY_STRING;
		} else {
			return getTarget();
		}
	}
	public void setTarget(String target) {
		if(target == null) {
			this.target  = EMPTY_STRING;
		} else {
			this.target = target;
		}
		this.target_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.id_modified = false;
		this.label_modified = false;
		this.source_modified = false;
		this.target_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.id_modified == true)
			modifiedFields.add("id");
		if(this.label_modified == true)
			modifiedFields.add("label");
		if(this.source_modified == true)
			modifiedFields.add("source");
		if(this.target_modified == true)
			modifiedFields.add("target");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		Data copyObj = new Data();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _data) {
		if(this == _data) return;
		Data __data = (Data) _data;
		
		this.setId(__data.getId());
		this.setLabel(__data.getLabel());
		this.setSource(__data.getSource());
		this.setTarget(__data.getTarget());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("id : ").append(id).append("\n");				
		buffer.append("label : ").append(label).append("\n");				
		buffer.append("source : ").append(source).append("\n");				
		buffer.append("target : ").append(target).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(4);
		fieldPropertyMap.put("id"
							, FieldPropertyFactory.getFieldProperty( "id","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("label"
							, FieldPropertyFactory.getFieldProperty( "label","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("source"
							, FieldPropertyFactory.getFieldProperty( "source","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("target"
							, FieldPropertyFactory.getFieldProperty( "target","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "id" : return getId();
			case "label" : return getLabel();
			case "source" : return getSource();
			case "target" : return getTarget();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "id" : setId((String)arg);break;
			case "label" : setLabel((String)arg);break;
			case "source" : setSource((String)arg);break;
			case "target" : setTarget((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(Data obj) {
		if (obj == this) return true;					
		if(this.id != null ? !this.id.equals(obj.getId()) : obj.getId() != null) return false; 										
		if(this.label != null ? !this.label.equals(obj.getLabel()) : obj.getLabel() != null) return false; 										
		if(this.source != null ? !this.source.equals(obj.getSource()) : obj.getSource() != null) return false; 										
		if(this.target != null ? !this.target.equals(obj.getTarget()) : obj.getTarget() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
