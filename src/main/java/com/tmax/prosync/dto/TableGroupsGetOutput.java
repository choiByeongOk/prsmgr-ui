	
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




import com.tmax.prosync.dto.TableGroup;




@com.tmax.proobject.core.DataObject
public class TableGroupsGetOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "tableGroupsGetOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public TableGroupsGetOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : tableGroup
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.TableGroup> tableGroup = new ArrayList<com.tmax.prosync.dto.TableGroup>(2);
	
	public List<com.tmax.prosync.dto.TableGroup> getTableGroupList() {
		return tableGroup;
	}
	private boolean tableGroup_invalidation = false;
	
	public void setInvalidationTableGroup(boolean invalidation) { 
		this.tableGroup_invalidation = invalidation;
	}
	
	public boolean isInvalidationTableGroup() {
		return this.tableGroup_invalidation;
	}
	
	private boolean tableGroup_modified = false;
	
	public boolean isModifiedTableGroup() {
		if(this.tableGroup_modified) return true;
		for(int index=0; index < this.sizeTableGroup(); index++) {
			if(this.getTableGroup(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedTableGroup() {
		this.tableGroup_modified = false;
	}
	
	public void clearTableGroup() {
		tableGroup.clear();
		this.tableGroup_modified = false;
	}
	
	public void ensureCapacityTableGroup(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.TableGroup>)tableGroup).ensureCapacity( minCapacity );	
	}	
	public void createTableGroup(int _size) {
		((ArrayList<com.tmax.prosync.dto.TableGroup>)tableGroup).ensureCapacity(_size);
		for(int i = tableGroup.size(); i < _size; i++) {
			tableGroup.add( new com.tmax.prosync.dto.TableGroup());
			this.tableGroup_modified = true;
		}
	}
	public TableGroupsGetOutput fillTableGroup(int _index) {
		ensureCapacityTableGroup(_index+1);
		for (int i = sizeTableGroup(); i <  _index + 1; i++) {
			this.tableGroup.add(i, new com.tmax.prosync.dto.TableGroup());
			this.tableGroup_modified = true;
		}
		return this;
	}
	
	public int sizeTableGroup() {
		return tableGroup.size();
	}
	
	public com.tmax.prosync.dto.TableGroup[] getTableGroup() {	
		return (com.tmax.prosync.dto.TableGroup[])tableGroup.toArray(new com.tmax.prosync.dto.TableGroup[tableGroup.size()]);
		}
	public com.tmax.prosync.dto.TableGroup getTableGroup(int _index) {
		return (com.tmax.prosync.dto.TableGroup)tableGroup.get(_index);
	}
	public void setTableGroup(List<com.tmax.prosync.dto.TableGroup> tableGroup) {
		this.tableGroup.clear();
		if(tableGroup == null) {
			return;
		} else {
			for(int i = 0, n=tableGroup.size(); i < n; i++) {
				if( tableGroup.get(i) == null ) {
					this.tableGroup.add( new com.tmax.prosync.dto.TableGroup());					
				}
				else {
					this.tableGroup.add(tableGroup.get(i));
				}
			}
		}
		this.tableGroup_modified = true;
		this.isModified = true;
	}
	
	public void setTableGroup(com.tmax.prosync.dto.TableGroup[] tableGroup) {
		this.tableGroup.clear();
		if(tableGroup == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.TableGroup>)this.tableGroup).ensureCapacity(tableGroup.length);
			for(int i = 0, n=tableGroup.length; i < n; i++) {
				if( tableGroup[i] == null ) {
					this.tableGroup.add( new com.tmax.prosync.dto.TableGroup());					
				}
				else {
					this.tableGroup.add(tableGroup[i]);
				}
			}
		}
		this.tableGroup_modified = true;
		this.isModified = true;
	}
	public void setTableGroup(int _index, com.tmax.prosync.dto.TableGroup tableGroup) {
		if(tableGroup == null) {
			this.tableGroup.set(_index,  new com.tmax.prosync.dto.TableGroup());
		} else {
			this.tableGroup.set(_index, tableGroup);
		}
		this.tableGroup_modified = true;
		this.isModified = true;
	}				
		
	public void addTableGroup(int _index, com.tmax.prosync.dto.TableGroup tableGroup) {
		if(tableGroup == null) {
			this.tableGroup.add(_index,  new com.tmax.prosync.dto.TableGroup());
		} else {
			this.tableGroup.add(_index, tableGroup);
		}
		this.tableGroup_modified = true;
		this.isModified = true;
	}
	public void addTableGroup(com.tmax.prosync.dto.TableGroup tableGroup) {
		if(tableGroup == null) {
			this.tableGroup.add( new com.tmax.prosync.dto.TableGroup());
		} else {
			this.tableGroup.add(tableGroup);
		}
		this.tableGroup_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.TableGroup removeTableGroup(int _index) {
		this.tableGroup_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.TableGroup)this.tableGroup.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.tableGroup_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.tableGroup_modified == true)
			modifiedFields.add("tableGroup");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		TableGroupsGetOutput copyObj = new TableGroupsGetOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _tableGroupsGetOutput) {
		if(this == _tableGroupsGetOutput) return;
		TableGroupsGetOutput __tableGroupsGetOutput = (TableGroupsGetOutput) _tableGroupsGetOutput;
		
		this.clearTableGroup();
		for (int index = 0; index < __tableGroupsGetOutput.sizeTableGroup(); index++) {
			this.addTableGroup(index, (com.tmax.prosync.dto.TableGroup)__tableGroupsGetOutput.getTableGroup(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeTableGroup(); index++) {

			buffer.append("tableGroup(").append(index).append(") : ").append(getTableGroup(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("tableGroup"
							, FieldPropertyFactory.getFieldProperty( "tableGroup","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.TableGroup"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "tableGroup" : return getTableGroupList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "tableGroup" : setTableGroup((List<com.tmax.prosync.dto.TableGroup>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(TableGroupsGetOutput obj) {
		if (obj == this) return true;
		if(this.tableGroup.size() != obj.sizeTableGroup()) return false;
		else {
			for(int i=0, n=this.tableGroup.size(); i<n; i++ ){ 
				if(!this.getTableGroup(i).equals(obj.getTableGroup(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
