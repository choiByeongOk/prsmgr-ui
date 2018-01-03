	
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




import com.tmax.prosync.dto.Event;




@com.tmax.proobject.core.DataObject
public class EventsListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "EventsListOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public EventsListOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : event
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.Event> event = new ArrayList<com.tmax.prosync.dto.Event>(2);
	
	public List<com.tmax.prosync.dto.Event> getEventList() {
		return event;
	}
	private boolean event_invalidation = false;
	
	public void setInvalidationEvent(boolean invalidation) { 
		this.event_invalidation = invalidation;
	}
	
	public boolean isInvalidationEvent() {
		return this.event_invalidation;
	}
	
	private boolean event_modified = false;
	
	public boolean isModifiedEvent() {
		if(this.event_modified) return true;
		for(int index=0; index < this.sizeEvent(); index++) {
			if(this.getEvent(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedEvent() {
		this.event_modified = false;
	}
	
	public void clearEvent() {
		event.clear();
		this.event_modified = false;
	}
	
	public void ensureCapacityEvent(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.Event>)event).ensureCapacity( minCapacity );	
	}	
	public void createEvent(int _size) {
		((ArrayList<com.tmax.prosync.dto.Event>)event).ensureCapacity(_size);
		for(int i = event.size(); i < _size; i++) {
			event.add( new com.tmax.prosync.dto.Event());
			this.event_modified = true;
		}
	}
	public EventsListOutput fillEvent(int _index) {
		ensureCapacityEvent(_index+1);
		for (int i = sizeEvent(); i <  _index + 1; i++) {
			this.event.add(i, new com.tmax.prosync.dto.Event());
			this.event_modified = true;
		}
		return this;
	}
	
	public int sizeEvent() {
		return event.size();
	}
	
	public com.tmax.prosync.dto.Event[] getEvent() {	
		return (com.tmax.prosync.dto.Event[])event.toArray(new com.tmax.prosync.dto.Event[event.size()]);
		}
	public com.tmax.prosync.dto.Event getEvent(int _index) {
		return (com.tmax.prosync.dto.Event)event.get(_index);
	}
	public void setEvent(List<com.tmax.prosync.dto.Event> event) {
		this.event.clear();
		if(event == null) {
			return;
		} else {
			for(int i = 0, n=event.size(); i < n; i++) {
				if( event.get(i) == null ) {
					this.event.add( new com.tmax.prosync.dto.Event());					
				}
				else {
					this.event.add(event.get(i));
				}
			}
		}
		this.event_modified = true;
		this.isModified = true;
	}
	
	public void setEvent(com.tmax.prosync.dto.Event[] event) {
		this.event.clear();
		if(event == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.Event>)this.event).ensureCapacity(event.length);
			for(int i = 0, n=event.length; i < n; i++) {
				if( event[i] == null ) {
					this.event.add( new com.tmax.prosync.dto.Event());					
				}
				else {
					this.event.add(event[i]);
				}
			}
		}
		this.event_modified = true;
		this.isModified = true;
	}
	public void setEvent(int _index, com.tmax.prosync.dto.Event event) {
		if(event == null) {
			this.event.set(_index,  new com.tmax.prosync.dto.Event());
		} else {
			this.event.set(_index, event);
		}
		this.event_modified = true;
		this.isModified = true;
	}				
		
	public void addEvent(int _index, com.tmax.prosync.dto.Event event) {
		if(event == null) {
			this.event.add(_index,  new com.tmax.prosync.dto.Event());
		} else {
			this.event.add(_index, event);
		}
		this.event_modified = true;
		this.isModified = true;
	}
	public void addEvent(com.tmax.prosync.dto.Event event) {
		if(event == null) {
			this.event.add( new com.tmax.prosync.dto.Event());
		} else {
			this.event.add(event);
		}
		this.event_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.Event removeEvent(int _index) {
		this.event_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.Event)this.event.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.event_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.event_modified == true)
			modifiedFields.add("event");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		EventsListOutput copyObj = new EventsListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _eventsListOutput) {
		if(this == _eventsListOutput) return;
		EventsListOutput __eventsListOutput = (EventsListOutput) _eventsListOutput;
		
		this.clearEvent();
		for (int index = 0; index < __eventsListOutput.sizeEvent(); index++) {
			this.addEvent(index, (com.tmax.prosync.dto.Event)__eventsListOutput.getEvent(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeEvent(); index++) {

			buffer.append("event(").append(index).append(") : ").append(getEvent(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("event"
							, FieldPropertyFactory.getFieldProperty( "event","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.Event"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "event" : return getEventList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "event" : setEvent((List<com.tmax.prosync.dto.Event>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(EventsListOutput obj) {
		if (obj == this) return true;
		if(this.event.size() != obj.sizeEvent()) return false;
		else {
			for(int i=0, n=this.event.size(); i<n; i++ ){ 
				if(!this.getEvent(i).equals(obj.getEvent(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
