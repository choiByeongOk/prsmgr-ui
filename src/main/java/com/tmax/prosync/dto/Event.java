	
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
public class Event extends DataObject {
	private static final String DTO_LOGICAL_NAME = "Event";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public Event() {
			super();
			
	}	 
	
	private boolean isModified = false;

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
	 * LogicalName : processNum
	 * Comments    : 
	 */		

	private int processNum;
	
		
	
	private boolean processNum_invalidation = false;
	
	public void setInvalidationProcessNum(boolean invalidation) { 
		this.processNum_invalidation = invalidation;
	}
	
	public boolean isInvalidationProcessNum() {
		return this.processNum_invalidation;
	}
	
	private boolean processNum_modified = false;
	

	public boolean isModifiedProcessNum() {
		return this.processNum_modified;
	}
	
	public void unModifiedProcessNum() {
		this.processNum_modified = false;
	}

	public int getProcessNum() {
		return processNum;
	}
	public void setProcessNum(int processNum) {
		this.processNum = processNum;
		this.processNum_modified = true;
		this.isModified = true;
	}
	
	public void setProcessNum(Integer processNum) {
		if( processNum == null) {
			this.processNum = 0;
		} else{
			this.processNum = processNum.intValue();
		}
		this.processNum_modified = true;
		this.isModified = true;
	}
	public void setProcessNum(String processNum) {
		if  (processNum==null || processNum.length() == 0) {
			this.processNum = 0;
		} else {
			this.processNum = Integer.parseInt(processNum);
		}
		this.processNum_modified = true;
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
	 * LogicalName : detail
	 * Comments    : 
	 */		

	private String detail = EMPTY_STRING;
	
			
	private boolean detail_nullable = false;
	
	public boolean isNullableDetail() {
		return this.detail_nullable;
	}	
	
	private boolean detail_invalidation = false;
	
	public void setInvalidationDetail(boolean invalidation) { 
		this.detail_invalidation = invalidation;
	}
	
	public boolean isInvalidationDetail() {
		return this.detail_invalidation;
	}
	
	private boolean detail_modified = false;
	

	public boolean isModifiedDetail() {
		return this.detail_modified;
	}
	
	public void unModifiedDetail() {
		this.detail_modified = false;
	}

	public String getDetail() {
		return detail;
	}
	public String getNvlDetail() {
		if(getDetail() == null) {
			return  EMPTY_STRING;
		} else {
			return getDetail();
		}
	}
	public void setDetail(String detail) {
		if(detail == null) {
			this.detail  = EMPTY_STRING;
		} else {
			this.detail = detail;
		}
		this.detail_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : occurredTime
	 * Comments    : 
	 */		

	private String occurredTime = EMPTY_STRING;
	
			
	private boolean occurredTime_nullable = false;
	
	public boolean isNullableOccurredTime() {
		return this.occurredTime_nullable;
	}	
	
	private boolean occurredTime_invalidation = false;
	
	public void setInvalidationOccurredTime(boolean invalidation) { 
		this.occurredTime_invalidation = invalidation;
	}
	
	public boolean isInvalidationOccurredTime() {
		return this.occurredTime_invalidation;
	}
	
	private boolean occurredTime_modified = false;
	

	public boolean isModifiedOccurredTime() {
		return this.occurredTime_modified;
	}
	
	public void unModifiedOccurredTime() {
		this.occurredTime_modified = false;
	}

	public String getOccurredTime() {
		return occurredTime;
	}
	public String getNvlOccurredTime() {
		if(getOccurredTime() == null) {
			return  EMPTY_STRING;
		} else {
			return getOccurredTime();
		}
	}
	public void setOccurredTime(String occurredTime) {
		if(occurredTime == null) {
			this.occurredTime  = EMPTY_STRING;
		} else {
			this.occurredTime = occurredTime;
		}
		this.occurredTime_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : confirmedTime
	 * Comments    : 
	 */		

	private String confirmedTime = EMPTY_STRING;
	
			
	private boolean confirmedTime_nullable = false;
	
	public boolean isNullableConfirmedTime() {
		return this.confirmedTime_nullable;
	}	
	
	private boolean confirmedTime_invalidation = false;
	
	public void setInvalidationConfirmedTime(boolean invalidation) { 
		this.confirmedTime_invalidation = invalidation;
	}
	
	public boolean isInvalidationConfirmedTime() {
		return this.confirmedTime_invalidation;
	}
	
	private boolean confirmedTime_modified = false;
	

	public boolean isModifiedConfirmedTime() {
		return this.confirmedTime_modified;
	}
	
	public void unModifiedConfirmedTime() {
		this.confirmedTime_modified = false;
	}

	public String getConfirmedTime() {
		return confirmedTime;
	}
	public String getNvlConfirmedTime() {
		if(getConfirmedTime() == null) {
			return  EMPTY_STRING;
		} else {
			return getConfirmedTime();
		}
	}
	public void setConfirmedTime(String confirmedTime) {
		if(confirmedTime == null) {
			this.confirmedTime  = EMPTY_STRING;
		} else {
			this.confirmedTime = confirmedTime;
		}
		this.confirmedTime_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : confirmedBy
	 * Comments    : 
	 */		

	private String confirmedBy = EMPTY_STRING;
	
			
	private boolean confirmedBy_nullable = false;
	
	public boolean isNullableConfirmedBy() {
		return this.confirmedBy_nullable;
	}	
	
	private boolean confirmedBy_invalidation = false;
	
	public void setInvalidationConfirmedBy(boolean invalidation) { 
		this.confirmedBy_invalidation = invalidation;
	}
	
	public boolean isInvalidationConfirmedBy() {
		return this.confirmedBy_invalidation;
	}
	
	private boolean confirmedBy_modified = false;
	

	public boolean isModifiedConfirmedBy() {
		return this.confirmedBy_modified;
	}
	
	public void unModifiedConfirmedBy() {
		this.confirmedBy_modified = false;
	}

	public String getConfirmedBy() {
		return confirmedBy;
	}
	public String getNvlConfirmedBy() {
		if(getConfirmedBy() == null) {
			return  EMPTY_STRING;
		} else {
			return getConfirmedBy();
		}
	}
	public void setConfirmedBy(String confirmedBy) {
		if(confirmedBy == null) {
			this.confirmedBy  = EMPTY_STRING;
		} else {
			this.confirmedBy = confirmedBy;
		}
		this.confirmedBy_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : Action
	 * Comments    : 
	 */		

	private String Action = EMPTY_STRING;
	
			
	private boolean Action_nullable = false;
	
	public boolean isNullableAction() {
		return this.Action_nullable;
	}	
	
	private boolean Action_invalidation = false;
	
	public void setInvalidationAction(boolean invalidation) { 
		this.Action_invalidation = invalidation;
	}
	
	public boolean isInvalidationAction() {
		return this.Action_invalidation;
	}
	
	private boolean Action_modified = false;
	

	public boolean isModifiedAction() {
		return this.Action_modified;
	}
	
	public void unModifiedAction() {
		this.Action_modified = false;
	}

	public String getAction() {
		return Action;
	}
	public String getNvlAction() {
		if(getAction() == null) {
			return  EMPTY_STRING;
		} else {
			return getAction();
		}
	}
	public void setAction(String Action) {
		if(Action == null) {
			this.Action  = EMPTY_STRING;
		} else {
			this.Action = Action;
		}
		this.Action_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.eventId_modified = false;
		this.projectId_modified = false;
		this.topId_modified = false;
		this.eventLevel_modified = false;
		this.status_modified = false;
		this.processType_modified = false;
		this.processNum_modified = false;
		this.threadType_modified = false;
		this.detail_modified = false;
		this.occurredTime_modified = false;
		this.confirmedTime_modified = false;
		this.confirmedBy_modified = false;
		this.Action_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.eventId_modified == true)
			modifiedFields.add("eventId");
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
		if(this.processNum_modified == true)
			modifiedFields.add("processNum");
		if(this.threadType_modified == true)
			modifiedFields.add("threadType");
		if(this.detail_modified == true)
			modifiedFields.add("detail");
		if(this.occurredTime_modified == true)
			modifiedFields.add("occurredTime");
		if(this.confirmedTime_modified == true)
			modifiedFields.add("confirmedTime");
		if(this.confirmedBy_modified == true)
			modifiedFields.add("confirmedBy");
		if(this.Action_modified == true)
			modifiedFields.add("Action");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		Event copyObj = new Event();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _event) {
		if(this == _event) return;
		Event __event = (Event) _event;
		
		this.setEventId(__event.getEventId());
		this.setProjectId(__event.getProjectId());
		this.setTopId(__event.getTopId());
		this.setEventLevel(__event.getEventLevel());
		this.setStatus(__event.getStatus());
		this.setProcessType(__event.getProcessType());
		this.setProcessNum(__event.getProcessNum());
		this.setThreadType(__event.getThreadType());
		this.setDetail(__event.getDetail());
		this.setOccurredTime(__event.getOccurredTime());
		this.setConfirmedTime(__event.getConfirmedTime());
		this.setConfirmedBy(__event.getConfirmedBy());
		this.setAction(__event.getAction());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("eventId : ").append(eventId).append("\n");				
		buffer.append("projectId : ").append(projectId).append("\n");				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("eventLevel : ").append(eventLevel).append("\n");				
		buffer.append("status : ").append(status).append("\n");				
		buffer.append("processType : ").append(processType).append("\n");				
		buffer.append("processNum : ").append(processNum).append("\n");				
		buffer.append("threadType : ").append(threadType).append("\n");				
		buffer.append("detail : ").append(detail).append("\n");				
		buffer.append("occurredTime : ").append(occurredTime).append("\n");				
		buffer.append("confirmedTime : ").append(confirmedTime).append("\n");				
		buffer.append("confirmedBy : ").append(confirmedBy).append("\n");				
		buffer.append("Action : ").append(Action).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(13);
		fieldPropertyMap.put("eventId"
							, FieldPropertyFactory.getFieldProperty( "eventId","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 128 , -1, null, null));		
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
		fieldPropertyMap.put("processNum"
							, FieldPropertyFactory.getFieldProperty( "processNum","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("threadType"
							, FieldPropertyFactory.getFieldProperty( "threadType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 25 , -1, null, null));		
		fieldPropertyMap.put("detail"
							, FieldPropertyFactory.getFieldProperty( "detail","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 4000 , -1, null, null));		
		fieldPropertyMap.put("occurredTime"
							, FieldPropertyFactory.getFieldProperty( "occurredTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("confirmedTime"
							, FieldPropertyFactory.getFieldProperty( "confirmedTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("confirmedBy"
							, FieldPropertyFactory.getFieldProperty( "confirmedBy","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("Action"
							, FieldPropertyFactory.getFieldProperty( "Action","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "eventId" : return getEventId();
			case "projectId" : return getProjectId();
			case "topId" : return getTopId();
			case "eventLevel" : return getEventLevel();
			case "status" : return getStatus();
			case "processType" : return getProcessType();
			case "processNum" : return getProcessNum();
			case "threadType" : return getThreadType();
			case "detail" : return getDetail();
			case "occurredTime" : return getOccurredTime();
			case "confirmedTime" : return getConfirmedTime();
			case "confirmedBy" : return getConfirmedBy();
			case "Action" : return getAction();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "eventId" : setEventId((Integer)arg);break;
			case "projectId" : setProjectId((String)arg);break;
			case "topId" : setTopId((String)arg);break;
			case "eventLevel" : setEventLevel((String)arg);break;
			case "status" : setStatus((String)arg);break;
			case "processType" : setProcessType((String)arg);break;
			case "processNum" : setProcessNum((Integer)arg);break;
			case "threadType" : setThreadType((String)arg);break;
			case "detail" : setDetail((String)arg);break;
			case "occurredTime" : setOccurredTime((String)arg);break;
			case "confirmedTime" : setConfirmedTime((String)arg);break;
			case "confirmedBy" : setConfirmedBy((String)arg);break;
			case "Action" : setAction((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(Event obj) {
		if (obj == this) return true;				
		if(this.eventId != obj.getEventId()) return false; 									
		if(this.projectId != null ? !this.projectId.equals(obj.getProjectId()) : obj.getProjectId() != null) return false; 										
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.eventLevel != null ? !this.eventLevel.equals(obj.getEventLevel()) : obj.getEventLevel() != null) return false; 										
		if(this.status != null ? !this.status.equals(obj.getStatus()) : obj.getStatus() != null) return false; 										
		if(this.processType != null ? !this.processType.equals(obj.getProcessType()) : obj.getProcessType() != null) return false; 									
		if(this.processNum != obj.getProcessNum()) return false; 									
		if(this.threadType != null ? !this.threadType.equals(obj.getThreadType()) : obj.getThreadType() != null) return false; 										
		if(this.detail != null ? !this.detail.equals(obj.getDetail()) : obj.getDetail() != null) return false; 										
		if(this.occurredTime != null ? !this.occurredTime.equals(obj.getOccurredTime()) : obj.getOccurredTime() != null) return false; 										
		if(this.confirmedTime != null ? !this.confirmedTime.equals(obj.getConfirmedTime()) : obj.getConfirmedTime() != null) return false; 										
		if(this.confirmedBy != null ? !this.confirmedBy.equals(obj.getConfirmedBy()) : obj.getConfirmedBy() != null) return false; 										
		if(this.Action != null ? !this.Action.equals(obj.getAction()) : obj.getAction() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
