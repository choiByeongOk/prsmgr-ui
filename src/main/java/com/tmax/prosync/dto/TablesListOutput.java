	
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




import com.tmax.prosync.dto.OwnerTables;




@com.tmax.proobject.core.DataObject
public class TablesListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "TablesListOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public TablesListOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : ownerTables
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.OwnerTables> ownerTables = new ArrayList<com.tmax.prosync.dto.OwnerTables>(2);
	
	public List<com.tmax.prosync.dto.OwnerTables> getOwnerTablesList() {
		return ownerTables;
	}
	private boolean ownerTables_invalidation = false;
	
	public void setInvalidationOwnerTables(boolean invalidation) { 
		this.ownerTables_invalidation = invalidation;
	}
	
	public boolean isInvalidationOwnerTables() {
		return this.ownerTables_invalidation;
	}
	
	private boolean ownerTables_modified = false;
	
	public boolean isModifiedOwnerTables() {
		if(this.ownerTables_modified) return true;
		for(int index=0; index < this.sizeOwnerTables(); index++) {
			if(this.getOwnerTables(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedOwnerTables() {
		this.ownerTables_modified = false;
	}
	
	public void clearOwnerTables() {
		ownerTables.clear();
		this.ownerTables_modified = false;
	}
	
	public void ensureCapacityOwnerTables(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.OwnerTables>)ownerTables).ensureCapacity( minCapacity );	
	}	
	public void createOwnerTables(int _size) {
		((ArrayList<com.tmax.prosync.dto.OwnerTables>)ownerTables).ensureCapacity(_size);
		for(int i = ownerTables.size(); i < _size; i++) {
			ownerTables.add( new com.tmax.prosync.dto.OwnerTables());
			this.ownerTables_modified = true;
		}
	}
	public TablesListOutput fillOwnerTables(int _index) {
		ensureCapacityOwnerTables(_index+1);
		for (int i = sizeOwnerTables(); i <  _index + 1; i++) {
			this.ownerTables.add(i, new com.tmax.prosync.dto.OwnerTables());
			this.ownerTables_modified = true;
		}
		return this;
	}
	
	public int sizeOwnerTables() {
		return ownerTables.size();
	}
	
	public com.tmax.prosync.dto.OwnerTables[] getOwnerTables() {	
		return (com.tmax.prosync.dto.OwnerTables[])ownerTables.toArray(new com.tmax.prosync.dto.OwnerTables[ownerTables.size()]);
		}
	public com.tmax.prosync.dto.OwnerTables getOwnerTables(int _index) {
		return (com.tmax.prosync.dto.OwnerTables)ownerTables.get(_index);
	}
	public void setOwnerTables(List<com.tmax.prosync.dto.OwnerTables> ownerTables) {
		this.ownerTables.clear();
		if(ownerTables == null) {
			return;
		} else {
			for(int i = 0, n=ownerTables.size(); i < n; i++) {
				if( ownerTables.get(i) == null ) {
					this.ownerTables.add( new com.tmax.prosync.dto.OwnerTables());					
				}
				else {
					this.ownerTables.add(ownerTables.get(i));
				}
			}
		}
		this.ownerTables_modified = true;
		this.isModified = true;
	}
	
	public void setOwnerTables(com.tmax.prosync.dto.OwnerTables[] ownerTables) {
		this.ownerTables.clear();
		if(ownerTables == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.OwnerTables>)this.ownerTables).ensureCapacity(ownerTables.length);
			for(int i = 0, n=ownerTables.length; i < n; i++) {
				if( ownerTables[i] == null ) {
					this.ownerTables.add( new com.tmax.prosync.dto.OwnerTables());					
				}
				else {
					this.ownerTables.add(ownerTables[i]);
				}
			}
		}
		this.ownerTables_modified = true;
		this.isModified = true;
	}
	public void setOwnerTables(int _index, com.tmax.prosync.dto.OwnerTables ownerTables) {
		if(ownerTables == null) {
			this.ownerTables.set(_index,  new com.tmax.prosync.dto.OwnerTables());
		} else {
			this.ownerTables.set(_index, ownerTables);
		}
		this.ownerTables_modified = true;
		this.isModified = true;
	}				
		
	public void addOwnerTables(int _index, com.tmax.prosync.dto.OwnerTables ownerTables) {
		if(ownerTables == null) {
			this.ownerTables.add(_index,  new com.tmax.prosync.dto.OwnerTables());
		} else {
			this.ownerTables.add(_index, ownerTables);
		}
		this.ownerTables_modified = true;
		this.isModified = true;
	}
	public void addOwnerTables(com.tmax.prosync.dto.OwnerTables ownerTables) {
		if(ownerTables == null) {
			this.ownerTables.add( new com.tmax.prosync.dto.OwnerTables());
		} else {
			this.ownerTables.add(ownerTables);
		}
		this.ownerTables_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.OwnerTables removeOwnerTables(int _index) {
		this.ownerTables_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.OwnerTables)this.ownerTables.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.ownerTables_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.ownerTables_modified == true)
			modifiedFields.add("ownerTables");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		TablesListOutput copyObj = new TablesListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _tablesListOutput) {
		if(this == _tablesListOutput) return;
		TablesListOutput __tablesListOutput = (TablesListOutput) _tablesListOutput;
		
		this.clearOwnerTables();
		for (int index = 0; index < __tablesListOutput.sizeOwnerTables(); index++) {
			this.addOwnerTables(index, (com.tmax.prosync.dto.OwnerTables)__tablesListOutput.getOwnerTables(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeOwnerTables(); index++) {

			buffer.append("ownerTables(").append(index).append(") : ").append(getOwnerTables(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("ownerTables"
							, FieldPropertyFactory.getFieldProperty( "ownerTables","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.ownerTables"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "ownerTables" : return getOwnerTablesList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "ownerTables" : setOwnerTables((List<com.tmax.prosync.dto.OwnerTables>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(TablesListOutput obj) {
		if (obj == this) return true;
		if(this.ownerTables.size() != obj.sizeOwnerTables()) return false;
		else {
			for(int i=0, n=this.ownerTables.size(); i<n; i++ ){ 
				if(!this.getOwnerTables(i).equals(obj.getOwnerTables(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
