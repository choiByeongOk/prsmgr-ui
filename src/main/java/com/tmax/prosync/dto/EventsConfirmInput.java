	
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
public class EventsConfirmInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "EventsConfirmInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public EventsConfirmInput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : userId
	 * Comments    : 
	 */		

	private String userId = EMPTY_STRING;
	
			
	private boolean userId_nullable = false;
	
	public boolean isNullableUserId() {
		return this.userId_nullable;
	}	
	
	private boolean userId_invalidation = false;
	
	public void setInvalidationUserId(boolean invalidation) { 
		this.userId_invalidation = invalidation;
	}
	
	public boolean isInvalidationUserId() {
		return this.userId_invalidation;
	}
	
	private boolean userId_modified = false;
	

	public boolean isModifiedUserId() {
		return this.userId_modified;
	}
	
	public void unModifiedUserId() {
		this.userId_modified = false;
	}

	public String getUserId() {
		return userId;
	}
	public String getNvlUserId() {
		if(getUserId() == null) {
			return  EMPTY_STRING;
		} else {
			return getUserId();
		}
	}
	public void setUserId(String userId) {
		if(userId == null) {
			this.userId  = EMPTY_STRING;
		} else {
			this.userId = userId;
		}
		this.userId_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : eventId
	 * Comments    : 
	 */		

	private int eventId;
	
		
	
	private boolean eventId_invalidation = false;
	
	public void setInvalidationEventId(boolean invalidation) { 
		this.eventId_invalidation = invalidation;
	}
	
	public boolean isInvalidationEventId() {
		return this.eventId_invalidation;
	}
	
	private boolean eventId_modified = false;
	

	public boolean isModifiedEventId() {
		return this.eventId_modified;
	}
	
	public void unModifiedEventId() {
		this.eventId_modified = false;
	}

	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
		this.eventId_modified = true;
		this.isModified = true;
	}
	
	public void setEventId(Integer eventId) {
		if( eventId == null) {
			this.eventId = 0;
		} else{
			this.eventId = eventId.intValue();
		}
		this.eventId_modified = true;
		this.isModified = true;
	}
	public void setEventId(String eventId) {
		if  (eventId==null || eventId.length() == 0) {
			this.eventId = 0;
		} else {
			this.eventId = Integer.parseInt(eventId);
		}
		this.eventId_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : projectId
	 * Comments    : 
	 */		

	private String projectId = EMPTY_STRING;
	
			
	private boolean projectId_nullable = false;
	
	public boolean isNullableProjectId() {
		return this.projectId_nullable;
	}	
	
	private boolean projectId_invalidation = false;
	
	public void setInvalidationProjectId(boolean invalidation) { 
		this.projectId_invalidation = invalidation;
	}
	
	public boolean isInvalidationProjectId() {
		return this.projectId_invalidation;
	}
	
	private boolean projectId_modified = false;
	

	public boolean isModifiedProjectId() {
		return this.projectId_modified;
	}
	
	public void unModifiedProjectId() {
		this.projectId_modified = false;
	}

	public String getProjectId() {
		return projectId;
	}
	public String getNvlProjectId() {
		if(getProjectId() == null) {
			return  EMPTY_STRING;
		} else {
			return getProjectId();
		}
	}
	public void setProjectId(String projectId) {
		if(projectId == null) {
			this.projectId  = EMPTY_STRING;
		} else {
			this.projectId = projectId;
		}
		this.projectId_modified = true;
		this.isModified = true;
	}	
			

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
			

	@Override
	public void clearAllIsModified() {
		this.userId_modified = false;
		this.eventId_modified = false;
		this.projectId_modified = false;
		this.topId_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.userId_modified == true)
			modifiedFields.add("userId");
		if(this.eventId_modified == true)
			modifiedFields.add("eventId");
		if(this.projectId_modified == true)
			modifiedFields.add("projectId");
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		EventsConfirmInput copyObj = new EventsConfirmInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _eventsConfirmInput) {
		if(this == _eventsConfirmInput) return;
		EventsConfirmInput __eventsConfirmInput = (EventsConfirmInput) _eventsConfirmInput;
		
		this.setUserId(__eventsConfirmInput.getUserId());
		this.setEventId(__eventsConfirmInput.getEventId());
		this.setProjectId(__eventsConfirmInput.getProjectId());
		this.setTopId(__eventsConfirmInput.getTopId());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("userId : ").append(userId).append("\n");				
		buffer.append("eventId : ").append(eventId).append("\n");				
		buffer.append("projectId : ").append(projectId).append("\n");				
		buffer.append("topId : ").append(topId).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(4);
		fieldPropertyMap.put("userId"
							, FieldPropertyFactory.getFieldProperty( "userId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("eventId"
							, FieldPropertyFactory.getFieldProperty( "eventId","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 128 , -1, null, null));		
		fieldPropertyMap.put("projectId"
							, FieldPropertyFactory.getFieldProperty( "projectId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "userId" : return getUserId();
			case "eventId" : return getEventId();
			case "projectId" : return getProjectId();
			case "topId" : return getTopId();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "userId" : setUserId((String)arg);break;
			case "eventId" : setEventId((Integer)arg);break;
			case "projectId" : setProjectId((String)arg);break;
			case "topId" : setTopId((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(EventsConfirmInput obj) {
		if (obj == this) return true;					
		if(this.userId != null ? !this.userId.equals(obj.getUserId()) : obj.getUserId() != null) return false; 									
		if(this.eventId != obj.getEventId()) return false; 									
		if(this.projectId != null ? !this.projectId.equals(obj.getProjectId()) : obj.getProjectId() != null) return false; 										
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
