	
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




import com.tmax.prosync.dto.EventCount;




@com.tmax.proobject.core.DataObject
public class EventsCountOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "EventsCountOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public EventsCountOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : eventCount
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.EventCount> eventCount = new ArrayList<com.tmax.prosync.dto.EventCount>(2);
	
	public List<com.tmax.prosync.dto.EventCount> getEventCountList() {
		return eventCount;
	}
	private boolean eventCount_invalidation = false;
	
	public void setInvalidationEventCount(boolean invalidation) { 
		this.eventCount_invalidation = invalidation;
	}
	
	public boolean isInvalidationEventCount() {
		return this.eventCount_invalidation;
	}
	
	private boolean eventCount_modified = false;
	
	public boolean isModifiedEventCount() {
		if(this.eventCount_modified) return true;
		for(int index=0; index < this.sizeEventCount(); index++) {
			if(this.getEventCount(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedEventCount() {
		this.eventCount_modified = false;
	}
	
	public void clearEventCount() {
		eventCount.clear();
		this.eventCount_modified = false;
	}
	
	public void ensureCapacityEventCount(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.EventCount>)eventCount).ensureCapacity( minCapacity );	
	}	
	public void createEventCount(int _size) {
		((ArrayList<com.tmax.prosync.dto.EventCount>)eventCount).ensureCapacity(_size);
		for(int i = eventCount.size(); i < _size; i++) {
			eventCount.add( new com.tmax.prosync.dto.EventCount());
			this.eventCount_modified = true;
		}
	}
	public EventsCountOutput fillEventCount(int _index) {
		ensureCapacityEventCount(_index+1);
		for (int i = sizeEventCount(); i <  _index + 1; i++) {
			this.eventCount.add(i, new com.tmax.prosync.dto.EventCount());
			this.eventCount_modified = true;
		}
		return this;
	}
	
	public int sizeEventCount() {
		return eventCount.size();
	}
	
	public com.tmax.prosync.dto.EventCount[] getEventCount() {	
		return (com.tmax.prosync.dto.EventCount[])eventCount.toArray(new com.tmax.prosync.dto.EventCount[eventCount.size()]);
		}
	public com.tmax.prosync.dto.EventCount getEventCount(int _index) {
		return (com.tmax.prosync.dto.EventCount)eventCount.get(_index);
	}
	public void setEventCount(List<com.tmax.prosync.dto.EventCount> eventCount) {
		this.eventCount.clear();
		if(eventCount == null) {
			return;
		} else {
			for(int i = 0, n=eventCount.size(); i < n; i++) {
				if( eventCount.get(i) == null ) {
					this.eventCount.add( new com.tmax.prosync.dto.EventCount());					
				}
				else {
					this.eventCount.add(eventCount.get(i));
				}
			}
		}
		this.eventCount_modified = true;
		this.isModified = true;
	}
	
	public void setEventCount(com.tmax.prosync.dto.EventCount[] eventCount) {
		this.eventCount.clear();
		if(eventCount == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.EventCount>)this.eventCount).ensureCapacity(eventCount.length);
			for(int i = 0, n=eventCount.length; i < n; i++) {
				if( eventCount[i] == null ) {
					this.eventCount.add( new com.tmax.prosync.dto.EventCount());					
				}
				else {
					this.eventCount.add(eventCount[i]);
				}
			}
		}
		this.eventCount_modified = true;
		this.isModified = true;
	}
	public void setEventCount(int _index, com.tmax.prosync.dto.EventCount eventCount) {
		if(eventCount == null) {
			this.eventCount.set(_index,  new com.tmax.prosync.dto.EventCount());
		} else {
			this.eventCount.set(_index, eventCount);
		}
		this.eventCount_modified = true;
		this.isModified = true;
	}				
		
	public void addEventCount(int _index, com.tmax.prosync.dto.EventCount eventCount) {
		if(eventCount == null) {
			this.eventCount.add(_index,  new com.tmax.prosync.dto.EventCount());
		} else {
			this.eventCount.add(_index, eventCount);
		}
		this.eventCount_modified = true;
		this.isModified = true;
	}
	public void addEventCount(com.tmax.prosync.dto.EventCount eventCount) {
		if(eventCount == null) {
			this.eventCount.add( new com.tmax.prosync.dto.EventCount());
		} else {
			this.eventCount.add(eventCount);
		}
		this.eventCount_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.EventCount removeEventCount(int _index) {
		this.eventCount_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.EventCount)this.eventCount.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.eventCount_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.eventCount_modified == true)
			modifiedFields.add("eventCount");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		EventsCountOutput copyObj = new EventsCountOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _eventsCountOutput) {
		if(this == _eventsCountOutput) return;
		EventsCountOutput __eventsCountOutput = (EventsCountOutput) _eventsCountOutput;
		
		this.clearEventCount();
		for (int index = 0; index < __eventsCountOutput.sizeEventCount(); index++) {
			this.addEventCount(index, (com.tmax.prosync.dto.EventCount)__eventsCountOutput.getEventCount(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeEventCount(); index++) {

			buffer.append("eventCount(").append(index).append(") : ").append(getEventCount(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("eventCount"
							, FieldPropertyFactory.getFieldProperty( "eventCount","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.EventCount"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "eventCount" : return getEventCountList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "eventCount" : setEventCount((List<com.tmax.prosync.dto.EventCount>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(EventsCountOutput obj) {
		if (obj == this) return true;
		if(this.eventCount.size() != obj.sizeEventCount()) return false;
		else {
			for(int i=0, n=this.eventCount.size(); i<n; i++ ){ 
				if(!this.getEventCount(i).equals(obj.getEventCount(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
