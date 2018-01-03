	
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




import com.tmax.prosync.dto.Columns;




@com.tmax.proobject.core.DataObject
public class ColumnsListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ColumnsListOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ColumnsListOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : columns
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.Columns> columns = new ArrayList<com.tmax.prosync.dto.Columns>(2);
	
	public List<com.tmax.prosync.dto.Columns> getColumnsList() {
		return columns;
	}
	private boolean columns_invalidation = false;
	
	public void setInvalidationColumns(boolean invalidation) { 
		this.columns_invalidation = invalidation;
	}
	
	public boolean isInvalidationColumns() {
		return this.columns_invalidation;
	}
	
	private boolean columns_modified = false;
	
	public boolean isModifiedColumns() {
		if(this.columns_modified) return true;
		for(int index=0; index < this.sizeColumns(); index++) {
			if(this.getColumns(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedColumns() {
		this.columns_modified = false;
	}
	
	public void clearColumns() {
		columns.clear();
		this.columns_modified = false;
	}
	
	public void ensureCapacityColumns(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.Columns>)columns).ensureCapacity( minCapacity );	
	}	
	public void createColumns(int _size) {
		((ArrayList<com.tmax.prosync.dto.Columns>)columns).ensureCapacity(_size);
		for(int i = columns.size(); i < _size; i++) {
			columns.add( new com.tmax.prosync.dto.Columns());
			this.columns_modified = true;
		}
	}
	public ColumnsListOutput fillColumns(int _index) {
		ensureCapacityColumns(_index+1);
		for (int i = sizeColumns(); i <  _index + 1; i++) {
			this.columns.add(i, new com.tmax.prosync.dto.Columns());
			this.columns_modified = true;
		}
		return this;
	}
	
	public int sizeColumns() {
		return columns.size();
	}
	
	public com.tmax.prosync.dto.Columns[] getColumns() {	
		return (com.tmax.prosync.dto.Columns[])columns.toArray(new com.tmax.prosync.dto.Columns[columns.size()]);
		}
	public com.tmax.prosync.dto.Columns getColumns(int _index) {
		return (com.tmax.prosync.dto.Columns)columns.get(_index);
	}
	public void setColumns(List<com.tmax.prosync.dto.Columns> columns) {
		this.columns.clear();
		if(columns == null) {
			return;
		} else {
			for(int i = 0, n=columns.size(); i < n; i++) {
				if( columns.get(i) == null ) {
					this.columns.add( new com.tmax.prosync.dto.Columns());					
				}
				else {
					this.columns.add(columns.get(i));
				}
			}
		}
		this.columns_modified = true;
		this.isModified = true;
	}
	
	public void setColumns(com.tmax.prosync.dto.Columns[] columns) {
		this.columns.clear();
		if(columns == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.Columns>)this.columns).ensureCapacity(columns.length);
			for(int i = 0, n=columns.length; i < n; i++) {
				if( columns[i] == null ) {
					this.columns.add( new com.tmax.prosync.dto.Columns());					
				}
				else {
					this.columns.add(columns[i]);
				}
			}
		}
		this.columns_modified = true;
		this.isModified = true;
	}
	public void setColumns(int _index, com.tmax.prosync.dto.Columns columns) {
		if(columns == null) {
			this.columns.set(_index,  new com.tmax.prosync.dto.Columns());
		} else {
			this.columns.set(_index, columns);
		}
		this.columns_modified = true;
		this.isModified = true;
	}				
		
	public void addColumns(int _index, com.tmax.prosync.dto.Columns columns) {
		if(columns == null) {
			this.columns.add(_index,  new com.tmax.prosync.dto.Columns());
		} else {
			this.columns.add(_index, columns);
		}
		this.columns_modified = true;
		this.isModified = true;
	}
	public void addColumns(com.tmax.prosync.dto.Columns columns) {
		if(columns == null) {
			this.columns.add( new com.tmax.prosync.dto.Columns());
		} else {
			this.columns.add(columns);
		}
		this.columns_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.Columns removeColumns(int _index) {
		this.columns_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.Columns)this.columns.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.columns_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.columns_modified == true)
			modifiedFields.add("columns");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ColumnsListOutput copyObj = new ColumnsListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _columnsListOutput) {
		if(this == _columnsListOutput) return;
		ColumnsListOutput __columnsListOutput = (ColumnsListOutput) _columnsListOutput;
		
		this.clearColumns();
		for (int index = 0; index < __columnsListOutput.sizeColumns(); index++) {
			this.addColumns(index, (com.tmax.prosync.dto.Columns)__columnsListOutput.getColumns(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeColumns(); index++) {

			buffer.append("columns(").append(index).append(") : ").append(getColumns(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("columns"
							, FieldPropertyFactory.getFieldProperty( "columns","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.Columns"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "columns" : return getColumnsList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "columns" : setColumns((List<com.tmax.prosync.dto.Columns>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ColumnsListOutput obj) {
		if (obj == this) return true;
		if(this.columns.size() != obj.sizeColumns()) return false;
		else {
			for(int i=0, n=this.columns.size(); i<n; i++ ){ 
				if(!this.getColumns(i).equals(obj.getColumns(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
