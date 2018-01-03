	
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




import com.tmax.prosync.dto.Stat;




@com.tmax.proobject.core.DataObject
public class StatsPeriodOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "StatsPeriodOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public StatsPeriodOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : stat
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.Stat> stat = new ArrayList<com.tmax.prosync.dto.Stat>(2);
	
	public List<com.tmax.prosync.dto.Stat> getStatList() {
		return stat;
	}
	private boolean stat_invalidation = false;
	
	public void setInvalidationStat(boolean invalidation) { 
		this.stat_invalidation = invalidation;
	}
	
	public boolean isInvalidationStat() {
		return this.stat_invalidation;
	}
	
	private boolean stat_modified = false;
	
	public boolean isModifiedStat() {
		if(this.stat_modified) return true;
		for(int index=0; index < this.sizeStat(); index++) {
			if(this.getStat(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedStat() {
		this.stat_modified = false;
	}
	
	public void clearStat() {
		stat.clear();
		this.stat_modified = false;
	}
	
	public void ensureCapacityStat(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.Stat>)stat).ensureCapacity( minCapacity );	
	}	
	public void createStat(int _size) {
		((ArrayList<com.tmax.prosync.dto.Stat>)stat).ensureCapacity(_size);
		for(int i = stat.size(); i < _size; i++) {
			stat.add( new com.tmax.prosync.dto.Stat());
			this.stat_modified = true;
		}
	}
	public StatsPeriodOutput fillStat(int _index) {
		ensureCapacityStat(_index+1);
		for (int i = sizeStat(); i <  _index + 1; i++) {
			this.stat.add(i, new com.tmax.prosync.dto.Stat());
			this.stat_modified = true;
		}
		return this;
	}
	
	public int sizeStat() {
		return stat.size();
	}
	
	public com.tmax.prosync.dto.Stat[] getStat() {	
		return (com.tmax.prosync.dto.Stat[])stat.toArray(new com.tmax.prosync.dto.Stat[stat.size()]);
		}
	public com.tmax.prosync.dto.Stat getStat(int _index) {
		return (com.tmax.prosync.dto.Stat)stat.get(_index);
	}
	public void setStat(List<com.tmax.prosync.dto.Stat> stat) {
		this.stat.clear();
		if(stat == null) {
			return;
		} else {
			for(int i = 0, n=stat.size(); i < n; i++) {
				if( stat.get(i) == null ) {
					this.stat.add( new com.tmax.prosync.dto.Stat());					
				}
				else {
					this.stat.add(stat.get(i));
				}
			}
		}
		this.stat_modified = true;
		this.isModified = true;
	}
	
	public void setStat(com.tmax.prosync.dto.Stat[] stat) {
		this.stat.clear();
		if(stat == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.Stat>)this.stat).ensureCapacity(stat.length);
			for(int i = 0, n=stat.length; i < n; i++) {
				if( stat[i] == null ) {
					this.stat.add( new com.tmax.prosync.dto.Stat());					
				}
				else {
					this.stat.add(stat[i]);
				}
			}
		}
		this.stat_modified = true;
		this.isModified = true;
	}
	public void setStat(int _index, com.tmax.prosync.dto.Stat stat) {
		if(stat == null) {
			this.stat.set(_index,  new com.tmax.prosync.dto.Stat());
		} else {
			this.stat.set(_index, stat);
		}
		this.stat_modified = true;
		this.isModified = true;
	}				
		
	public void addStat(int _index, com.tmax.prosync.dto.Stat stat) {
		if(stat == null) {
			this.stat.add(_index,  new com.tmax.prosync.dto.Stat());
		} else {
			this.stat.add(_index, stat);
		}
		this.stat_modified = true;
		this.isModified = true;
	}
	public void addStat(com.tmax.prosync.dto.Stat stat) {
		if(stat == null) {
			this.stat.add( new com.tmax.prosync.dto.Stat());
		} else {
			this.stat.add(stat);
		}
		this.stat_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.Stat removeStat(int _index) {
		this.stat_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.Stat)this.stat.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.stat_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.stat_modified == true)
			modifiedFields.add("stat");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		StatsPeriodOutput copyObj = new StatsPeriodOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _statsPeriodOutput) {
		if(this == _statsPeriodOutput) return;
		StatsPeriodOutput __statsPeriodOutput = (StatsPeriodOutput) _statsPeriodOutput;
		
		this.clearStat();
		for (int index = 0; index < __statsPeriodOutput.sizeStat(); index++) {
			this.addStat(index, (com.tmax.prosync.dto.Stat)__statsPeriodOutput.getStat(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeStat(); index++) {

			buffer.append("stat(").append(index).append(") : ").append(getStat(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("stat"
							, FieldPropertyFactory.getFieldProperty( "stat","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.Stat"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "stat" : return getStatList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "stat" : setStat((List<com.tmax.prosync.dto.Stat>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(StatsPeriodOutput obj) {
		if (obj == this) return true;
		if(this.stat.size() != obj.sizeStat()) return false;
		else {
			for(int i=0, n=this.stat.size(); i<n; i++ ){ 
				if(!this.getStat(i).equals(obj.getStat(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
