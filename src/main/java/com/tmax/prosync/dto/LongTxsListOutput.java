	
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




import com.tmax.prosync.dto.LongTx;




@com.tmax.proobject.core.DataObject
public class LongTxsListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "LongTxsListOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public LongTxsListOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : longTx
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.LongTx> longTx = new ArrayList<com.tmax.prosync.dto.LongTx>(2);
	
	public List<com.tmax.prosync.dto.LongTx> getLongTxList() {
		return longTx;
	}
	private boolean longTx_invalidation = false;
	
	public void setInvalidationLongTx(boolean invalidation) { 
		this.longTx_invalidation = invalidation;
	}
	
	public boolean isInvalidationLongTx() {
		return this.longTx_invalidation;
	}
	
	private boolean longTx_modified = false;
	
	public boolean isModifiedLongTx() {
		if(this.longTx_modified) return true;
		for(int index=0; index < this.sizeLongTx(); index++) {
			if(this.getLongTx(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedLongTx() {
		this.longTx_modified = false;
	}
	
	public void clearLongTx() {
		longTx.clear();
		this.longTx_modified = false;
	}
	
	public void ensureCapacityLongTx(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.LongTx>)longTx).ensureCapacity( minCapacity );	
	}	
	public void createLongTx(int _size) {
		((ArrayList<com.tmax.prosync.dto.LongTx>)longTx).ensureCapacity(_size);
		for(int i = longTx.size(); i < _size; i++) {
			longTx.add( new com.tmax.prosync.dto.LongTx());
			this.longTx_modified = true;
		}
	}
	public LongTxsListOutput fillLongTx(int _index) {
		ensureCapacityLongTx(_index+1);
		for (int i = sizeLongTx(); i <  _index + 1; i++) {
			this.longTx.add(i, new com.tmax.prosync.dto.LongTx());
			this.longTx_modified = true;
		}
		return this;
	}
	
	public int sizeLongTx() {
		return longTx.size();
	}
	
	public com.tmax.prosync.dto.LongTx[] getLongTx() {	
		return (com.tmax.prosync.dto.LongTx[])longTx.toArray(new com.tmax.prosync.dto.LongTx[longTx.size()]);
		}
	public com.tmax.prosync.dto.LongTx getLongTx(int _index) {
		return (com.tmax.prosync.dto.LongTx)longTx.get(_index);
	}
	public void setLongTx(List<com.tmax.prosync.dto.LongTx> longTx) {
		this.longTx.clear();
		if(longTx == null) {
			return;
		} else {
			for(int i = 0, n=longTx.size(); i < n; i++) {
				if( longTx.get(i) == null ) {
					this.longTx.add( new com.tmax.prosync.dto.LongTx());					
				}
				else {
					this.longTx.add(longTx.get(i));
				}
			}
		}
		this.longTx_modified = true;
		this.isModified = true;
	}
	
	public void setLongTx(com.tmax.prosync.dto.LongTx[] longTx) {
		this.longTx.clear();
		if(longTx == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.LongTx>)this.longTx).ensureCapacity(longTx.length);
			for(int i = 0, n=longTx.length; i < n; i++) {
				if( longTx[i] == null ) {
					this.longTx.add( new com.tmax.prosync.dto.LongTx());					
				}
				else {
					this.longTx.add(longTx[i]);
				}
			}
		}
		this.longTx_modified = true;
		this.isModified = true;
	}
	public void setLongTx(int _index, com.tmax.prosync.dto.LongTx longTx) {
		if(longTx == null) {
			this.longTx.set(_index,  new com.tmax.prosync.dto.LongTx());
		} else {
			this.longTx.set(_index, longTx);
		}
		this.longTx_modified = true;
		this.isModified = true;
	}				
		
	public void addLongTx(int _index, com.tmax.prosync.dto.LongTx longTx) {
		if(longTx == null) {
			this.longTx.add(_index,  new com.tmax.prosync.dto.LongTx());
		} else {
			this.longTx.add(_index, longTx);
		}
		this.longTx_modified = true;
		this.isModified = true;
	}
	public void addLongTx(com.tmax.prosync.dto.LongTx longTx) {
		if(longTx == null) {
			this.longTx.add( new com.tmax.prosync.dto.LongTx());
		} else {
			this.longTx.add(longTx);
		}
		this.longTx_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.LongTx removeLongTx(int _index) {
		this.longTx_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.LongTx)this.longTx.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.longTx_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.longTx_modified == true)
			modifiedFields.add("longTx");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		LongTxsListOutput copyObj = new LongTxsListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _longTxsListOutput) {
		if(this == _longTxsListOutput) return;
		LongTxsListOutput __longTxsListOutput = (LongTxsListOutput) _longTxsListOutput;
		
		this.clearLongTx();
		for (int index = 0; index < __longTxsListOutput.sizeLongTx(); index++) {
			this.addLongTx(index, (com.tmax.prosync.dto.LongTx)__longTxsListOutput.getLongTx(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeLongTx(); index++) {

			buffer.append("longTx(").append(index).append(") : ").append(getLongTx(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("longTx"
							, FieldPropertyFactory.getFieldProperty( "longTx","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.LongTx"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "longTx" : return getLongTxList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "longTx" : setLongTx((List<com.tmax.prosync.dto.LongTx>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(LongTxsListOutput obj) {
		if (obj == this) return true;
		if(this.longTx.size() != obj.sizeLongTx()) return false;
		else {
			for(int i=0, n=this.longTx.size(); i<n; i++ ){ 
				if(!this.getLongTx(i).equals(obj.getLongTx(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
