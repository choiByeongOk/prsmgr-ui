	
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




import com.tmax.prosync.dto.SyncTables;




@com.tmax.proobject.core.DataObject
public class SyncTablesListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "SyncTablesListOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public SyncTablesListOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : syncTables
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.SyncTables> syncTables = new ArrayList<com.tmax.prosync.dto.SyncTables>(2);
	
	public List<com.tmax.prosync.dto.SyncTables> getSyncTablesList() {
		return syncTables;
	}
	private boolean syncTables_invalidation = false;
	
	public void setInvalidationSyncTables(boolean invalidation) { 
		this.syncTables_invalidation = invalidation;
	}
	
	public boolean isInvalidationSyncTables() {
		return this.syncTables_invalidation;
	}
	
	private boolean syncTables_modified = false;
	
	public boolean isModifiedSyncTables() {
		if(this.syncTables_modified) return true;
		for(int index=0; index < this.sizeSyncTables(); index++) {
			if(this.getSyncTables(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedSyncTables() {
		this.syncTables_modified = false;
	}
	
	public void clearSyncTables() {
		syncTables.clear();
		this.syncTables_modified = false;
	}
	
	public void ensureCapacitySyncTables(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.SyncTables>)syncTables).ensureCapacity( minCapacity );	
	}	
	public void createSyncTables(int _size) {
		((ArrayList<com.tmax.prosync.dto.SyncTables>)syncTables).ensureCapacity(_size);
		for(int i = syncTables.size(); i < _size; i++) {
			syncTables.add( new com.tmax.prosync.dto.SyncTables());
			this.syncTables_modified = true;
		}
	}
	public SyncTablesListOutput fillSyncTables(int _index) {
		ensureCapacitySyncTables(_index+1);
		for (int i = sizeSyncTables(); i <  _index + 1; i++) {
			this.syncTables.add(i, new com.tmax.prosync.dto.SyncTables());
			this.syncTables_modified = true;
		}
		return this;
	}
	
	public int sizeSyncTables() {
		return syncTables.size();
	}
	
	public com.tmax.prosync.dto.SyncTables[] getSyncTables() {	
		return (com.tmax.prosync.dto.SyncTables[])syncTables.toArray(new com.tmax.prosync.dto.SyncTables[syncTables.size()]);
		}
	public com.tmax.prosync.dto.SyncTables getSyncTables(int _index) {
		return (com.tmax.prosync.dto.SyncTables)syncTables.get(_index);
	}
	public void setSyncTables(List<com.tmax.prosync.dto.SyncTables> syncTables) {
		this.syncTables.clear();
		if(syncTables == null) {
			return;
		} else {
			for(int i = 0, n=syncTables.size(); i < n; i++) {
				if( syncTables.get(i) == null ) {
					this.syncTables.add( new com.tmax.prosync.dto.SyncTables());					
				}
				else {
					this.syncTables.add(syncTables.get(i));
				}
			}
		}
		this.syncTables_modified = true;
		this.isModified = true;
	}
	
	public void setSyncTables(com.tmax.prosync.dto.SyncTables[] syncTables) {
		this.syncTables.clear();
		if(syncTables == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.SyncTables>)this.syncTables).ensureCapacity(syncTables.length);
			for(int i = 0, n=syncTables.length; i < n; i++) {
				if( syncTables[i] == null ) {
					this.syncTables.add( new com.tmax.prosync.dto.SyncTables());					
				}
				else {
					this.syncTables.add(syncTables[i]);
				}
			}
		}
		this.syncTables_modified = true;
		this.isModified = true;
	}
	public void setSyncTables(int _index, com.tmax.prosync.dto.SyncTables syncTables) {
		if(syncTables == null) {
			this.syncTables.set(_index,  new com.tmax.prosync.dto.SyncTables());
		} else {
			this.syncTables.set(_index, syncTables);
		}
		this.syncTables_modified = true;
		this.isModified = true;
	}				
		
	public void addSyncTables(int _index, com.tmax.prosync.dto.SyncTables syncTables) {
		if(syncTables == null) {
			this.syncTables.add(_index,  new com.tmax.prosync.dto.SyncTables());
		} else {
			this.syncTables.add(_index, syncTables);
		}
		this.syncTables_modified = true;
		this.isModified = true;
	}
	public void addSyncTables(com.tmax.prosync.dto.SyncTables syncTables) {
		if(syncTables == null) {
			this.syncTables.add( new com.tmax.prosync.dto.SyncTables());
		} else {
			this.syncTables.add(syncTables);
		}
		this.syncTables_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.SyncTables removeSyncTables(int _index) {
		this.syncTables_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.SyncTables)this.syncTables.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.syncTables_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.syncTables_modified == true)
			modifiedFields.add("syncTables");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		SyncTablesListOutput copyObj = new SyncTablesListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _syncTablesListOutput) {
		if(this == _syncTablesListOutput) return;
		SyncTablesListOutput __syncTablesListOutput = (SyncTablesListOutput) _syncTablesListOutput;
		
		this.clearSyncTables();
		for (int index = 0; index < __syncTablesListOutput.sizeSyncTables(); index++) {
			this.addSyncTables(index, (com.tmax.prosync.dto.SyncTables)__syncTablesListOutput.getSyncTables(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeSyncTables(); index++) {

			buffer.append("syncTables(").append(index).append(") : ").append(getSyncTables(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("syncTables"
							, FieldPropertyFactory.getFieldProperty( "syncTables","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.SyncTables"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "syncTables" : return getSyncTablesList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "syncTables" : setSyncTables((List<com.tmax.prosync.dto.SyncTables>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(SyncTablesListOutput obj) {
		if (obj == this) return true;
		if(this.syncTables.size() != obj.sizeSyncTables()) return false;
		else {
			for(int i=0, n=this.syncTables.size(); i<n; i++ ){ 
				if(!this.getSyncTables(i).equals(obj.getSyncTables(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
