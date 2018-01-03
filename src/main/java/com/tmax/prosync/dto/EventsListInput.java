	
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
public class EventsListInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "EventsListInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public EventsListInput() {
			super();
			
	}	 
	
	private boolean isModified = false;

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
			

	/**
	 * LogicalName : eventLevel
	 * Comments    : 
	 */		

	private String eventLevel = EMPTY_STRING;
	
			
	private boolean eventLevel_nullable = false;
	
	public boolean isNullableEventLevel() {
		return this.eventLevel_nullable;
	}	
	
	private boolean eventLevel_invalidation = false;
	
	public void setInvalidationEventLevel(boolean invalidation) { 
		this.eventLevel_invalidation = invalidation;
	}
	
	public boolean isInvalidationEventLevel() {
		return this.eventLevel_invalidation;
	}
	
	private boolean eventLevel_modified = false;
	

	public boolean isModifiedEventLevel() {
		return this.eventLevel_modified;
	}
	
	public void unModifiedEventLevel() {
		this.eventLevel_modified = false;
	}

	public String getEventLevel() {
		return eventLevel;
	}
	public String getNvlEventLevel() {
		if(getEventLevel() == null) {
			return  EMPTY_STRING;
		} else {
			return getEventLevel();
		}
	}
	public void setEventLevel(String eventLevel) {
		if(eventLevel == null) {
			this.eventLevel  = EMPTY_STRING;
		} else {
			this.eventLevel = eventLevel;
		}
		this.eventLevel_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : status
	 * Comments    : 
	 */		

	private String status = EMPTY_STRING;
	
			
	private boolean status_nullable = false;
	
	public boolean isNullableStatus() {
		return this.status_nullable;
	}	
	
	private boolean status_invalidation = false;
	
	public void setInvalidationStatus(boolean invalidation) { 
		this.status_invalidation = invalidation;
	}
	
	public boolean isInvalidationStatus() {
		return this.status_invalidation;
	}
	
	private boolean status_modified = false;
	

	public boolean isModifiedStatus() {
		return this.status_modified;
	}
	
	public void unModifiedStatus() {
		this.status_modified = false;
	}

	public String getStatus() {
		return status;
	}
	public String getNvlStatus() {
		if(getStatus() == null) {
			return  EMPTY_STRING;
		} else {
			return getStatus();
		}
	}
	public void setStatus(String status) {
		if(status == null) {
			this.status  = EMPTY_STRING;
		} else {
			this.status = status;
		}
		this.status_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : processType
	 * Comments    : 
	 */		

	private String processType = EMPTY_STRING;
	
			
	private boolean processType_nullable = false;
	
	public boolean isNullableProcessType() {
		return this.processType_nullable;
	}	
	
	private boolean processType_invalidation = false;
	
	public void setInvalidationProcessType(boolean invalidation) { 
		this.processType_invalidation = invalidation;
	}
	
	public boolean isInvalidationProcessType() {
		return this.processType_invalidation;
	}
	
	private boolean processType_modified = false;
	

	public boolean isModifiedProcessType() {
		return this.processType_modified;
	}
	
	public void unModifiedProcessType() {
		this.processType_modified = false;
	}

	public String getProcessType() {
		return processType;
	}
	public String getNvlProcessType() {
		if(getProcessType() == null) {
			return  EMPTY_STRING;
		} else {
			return getProcessType();
		}
	}
	public void setProcessType(String processType) {
		if(processType == null) {
			this.processType  = EMPTY_STRING;
		} else {
			this.processType = processType;
		}
		this.processType_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : threadType
	 * Comments    : 
	 */		

	private String threadType = EMPTY_STRING;
	
			
	private boolean threadType_nullable = false;
	
	public boolean isNullableThreadType() {
		return this.threadType_nullable;
	}	
	
	private boolean threadType_invalidation = false;
	
	public void setInvalidationThreadType(boolean invalidation) { 
		this.threadType_invalidation = invalidation;
	}
	
	public boolean isInvalidationThreadType() {
		return this.threadType_invalidation;
	}
	
	private boolean threadType_modified = false;
	

	public boolean isModifiedThreadType() {
		return this.threadType_modified;
	}
	
	public void unModifiedThreadType() {
		this.threadType_modified = false;
	}

	public String getThreadType() {
		return threadType;
	}
	public String getNvlThreadType() {
		if(getThreadType() == null) {
			return  EMPTY_STRING;
		} else {
			return getThreadType();
		}
	}
	public void setThreadType(String threadType) {
		if(threadType == null) {
			this.threadType  = EMPTY_STRING;
		} else {
			this.threadType = threadType;
		}
		this.threadType_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : startTime
	 * Comments    : 
	 */		

	private String startTime = EMPTY_STRING;
	
			
	private boolean startTime_nullable = false;
	
	public boolean isNullableStartTime() {
		return this.startTime_nullable;
	}	
	
	private boolean startTime_invalidation = false;
	
	public void setInvalidationStartTime(boolean invalidation) { 
		this.startTime_invalidation = invalidation;
	}
	
	public boolean isInvalidationStartTime() {
		return this.startTime_invalidation;
	}
	
	private boolean startTime_modified = false;
	

	public boolean isModifiedStartTime() {
		return this.startTime_modified;
	}
	
	public void unModifiedStartTime() {
		this.startTime_modified = false;
	}

	public String getStartTime() {
		return startTime;
	}
	public String getNvlStartTime() {
		if(getStartTime() == null) {
			return  EMPTY_STRING;
		} else {
			return getStartTime();
		}
	}
	public void setStartTime(String startTime) {
		if(startTime == null) {
			this.startTime  = EMPTY_STRING;
		} else {
			this.startTime = startTime;
		}
		this.startTime_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : endTime
	 * Comments    : 
	 */		

	private String endTime = EMPTY_STRING;
	
			
	private boolean endTime_nullable = false;
	
	public boolean isNullableEndTime() {
		return this.endTime_nullable;
	}	
	
	private boolean endTime_invalidation = false;
	
	public void setInvalidationEndTime(boolean invalidation) { 
		this.endTime_invalidation = invalidation;
	}
	
	public boolean isInvalidationEndTime() {
		return this.endTime_invalidation;
	}
	
	private boolean endTime_modified = false;
	

	public boolean isModifiedEndTime() {
		return this.endTime_modified;
	}
	
	public void unModifiedEndTime() {
		this.endTime_modified = false;
	}

	public String getEndTime() {
		return endTime;
	}
	public String getNvlEndTime() {
		if(getEndTime() == null) {
			return  EMPTY_STRING;
		} else {
			return getEndTime();
		}
	}
	public void setEndTime(String endTime) {
		if(endTime == null) {
			this.endTime  = EMPTY_STRING;
		} else {
			this.endTime = endTime;
		}
		this.endTime_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.projectId_modified = false;
		this.topId_modified = false;
		this.eventLevel_modified = false;
		this.status_modified = false;
		this.processType_modified = false;
		this.threadType_modified = false;
		this.startTime_modified = false;
		this.endTime_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.projectId_modified == true)
			modifiedFields.add("projectId");
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.eventLevel_modified == true)
			modifiedFields.add("eventLevel");
		if(this.status_modified == true)
			modifiedFields.add("status");
		if(this.processType_modified == true)
			modifiedFields.add("processType");
		if(this.threadType_modified == true)
			modifiedFields.add("threadType");
		if(this.startTime_modified == true)
			modifiedFields.add("startTime");
		if(this.endTime_modified == true)
			modifiedFields.add("endTime");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		EventsListInput copyObj = new EventsListInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _eventsListInput) {
		if(this == _eventsListInput) return;
		EventsListInput __eventsListInput = (EventsListInput) _eventsListInput;
		
		this.setProjectId(__eventsListInput.getProjectId());
		this.setTopId(__eventsListInput.getTopId());
		this.setEventLevel(__eventsListInput.getEventLevel());
		this.setStatus(__eventsListInput.getStatus());
		this.setProcessType(__eventsListInput.getProcessType());
		this.setThreadType(__eventsListInput.getThreadType());
		this.setStartTime(__eventsListInput.getStartTime());
		this.setEndTime(__eventsListInput.getEndTime());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("projectId : ").append(projectId).append("\n");				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("eventLevel : ").append(eventLevel).append("\n");				
		buffer.append("status : ").append(status).append("\n");				
		buffer.append("processType : ").append(processType).append("\n");				
		buffer.append("threadType : ").append(threadType).append("\n");				
		buffer.append("startTime : ").append(startTime).append("\n");				
		buffer.append("endTime : ").append(endTime).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(8);
		fieldPropertyMap.put("projectId"
							, FieldPropertyFactory.getFieldProperty( "projectId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("eventLevel"
							, FieldPropertyFactory.getFieldProperty( "eventLevel","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("status"
							, FieldPropertyFactory.getFieldProperty( "status","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("processType"
							, FieldPropertyFactory.getFieldProperty( "processType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 25 , -1, null, null));		
		fieldPropertyMap.put("threadType"
							, FieldPropertyFactory.getFieldProperty( "threadType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 25 , -1, null, null));		
		fieldPropertyMap.put("startTime"
							, FieldPropertyFactory.getFieldProperty( "startTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("endTime"
							, FieldPropertyFactory.getFieldProperty( "endTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "projectId" : return getProjectId();
			case "topId" : return getTopId();
			case "eventLevel" : return getEventLevel();
			case "status" : return getStatus();
			case "processType" : return getProcessType();
			case "threadType" : return getThreadType();
			case "startTime" : return getStartTime();
			case "endTime" : return getEndTime();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "projectId" : setProjectId((String)arg);break;
			case "topId" : setTopId((String)arg);break;
			case "eventLevel" : setEventLevel((String)arg);break;
			case "status" : setStatus((String)arg);break;
			case "processType" : setProcessType((String)arg);break;
			case "threadType" : setThreadType((String)arg);break;
			case "startTime" : setStartTime((String)arg);break;
			case "endTime" : setEndTime((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(EventsListInput obj) {
		if (obj == this) return true;					
		if(this.projectId != null ? !this.projectId.equals(obj.getProjectId()) : obj.getProjectId() != null) return false; 										
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.eventLevel != null ? !this.eventLevel.equals(obj.getEventLevel()) : obj.getEventLevel() != null) return false; 										
		if(this.status != null ? !this.status.equals(obj.getStatus()) : obj.getStatus() != null) return false; 										
		if(this.processType != null ? !this.processType.equals(obj.getProcessType()) : obj.getProcessType() != null) return false; 										
		if(this.threadType != null ? !this.threadType.equals(obj.getThreadType()) : obj.getThreadType() != null) return false; 										
		if(this.startTime != null ? !this.startTime.equals(obj.getStartTime()) : obj.getStartTime() != null) return false; 										
		if(this.endTime != null ? !this.endTime.equals(obj.getEndTime()) : obj.getEndTime() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
