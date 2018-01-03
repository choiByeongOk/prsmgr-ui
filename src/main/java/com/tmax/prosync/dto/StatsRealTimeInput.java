	
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
public class StatsRealTimeInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "StatsRealTimeInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public StatsRealTimeInput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : topIds
	 * Comments    : 
	 */		

	private String topIds = EMPTY_STRING;
	
			
	private boolean topIds_nullable = false;
	
	public boolean isNullableTopIds() {
		return this.topIds_nullable;
	}	
	
	private boolean topIds_invalidation = false;
	
	public void setInvalidationTopIds(boolean invalidation) { 
		this.topIds_invalidation = invalidation;
	}
	
	public boolean isInvalidationTopIds() {
		return this.topIds_invalidation;
	}
	
	private boolean topIds_modified = false;
	

	public boolean isModifiedTopIds() {
		return this.topIds_modified;
	}
	
	public void unModifiedTopIds() {
		this.topIds_modified = false;
	}

	public String getTopIds() {
		return topIds;
	}
	public String getNvlTopIds() {
		if(getTopIds() == null) {
			return  EMPTY_STRING;
		} else {
			return getTopIds();
		}
	}
	public void setTopIds(String topIds) {
		if(topIds == null) {
			this.topIds  = EMPTY_STRING;
		} else {
			this.topIds = topIds;
		}
		this.topIds_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : targetInstanceIds
	 * Comments    : 
	 */		

	private String targetInstanceIds = EMPTY_STRING;
	
			
	private boolean targetInstanceIds_nullable = false;
	
	public boolean isNullableTargetInstanceIds() {
		return this.targetInstanceIds_nullable;
	}	
	
	private boolean targetInstanceIds_invalidation = false;
	
	public void setInvalidationTargetInstanceIds(boolean invalidation) { 
		this.targetInstanceIds_invalidation = invalidation;
	}
	
	public boolean isInvalidationTargetInstanceIds() {
		return this.targetInstanceIds_invalidation;
	}
	
	private boolean targetInstanceIds_modified = false;
	

	public boolean isModifiedTargetInstanceIds() {
		return this.targetInstanceIds_modified;
	}
	
	public void unModifiedTargetInstanceIds() {
		this.targetInstanceIds_modified = false;
	}

	public String getTargetInstanceIds() {
		return targetInstanceIds;
	}
	public String getNvlTargetInstanceIds() {
		if(getTargetInstanceIds() == null) {
			return  EMPTY_STRING;
		} else {
			return getTargetInstanceIds();
		}
	}
	public void setTargetInstanceIds(String targetInstanceIds) {
		if(targetInstanceIds == null) {
			this.targetInstanceIds  = EMPTY_STRING;
		} else {
			this.targetInstanceIds = targetInstanceIds;
		}
		this.targetInstanceIds_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : threadTypes
	 * Comments    : 
	 */		

	private String threadTypes = EMPTY_STRING;
	
			
	private boolean threadTypes_nullable = false;
	
	public boolean isNullableThreadTypes() {
		return this.threadTypes_nullable;
	}	
	
	private boolean threadTypes_invalidation = false;
	
	public void setInvalidationThreadTypes(boolean invalidation) { 
		this.threadTypes_invalidation = invalidation;
	}
	
	public boolean isInvalidationThreadTypes() {
		return this.threadTypes_invalidation;
	}
	
	private boolean threadTypes_modified = false;
	

	public boolean isModifiedThreadTypes() {
		return this.threadTypes_modified;
	}
	
	public void unModifiedThreadTypes() {
		this.threadTypes_modified = false;
	}

	public String getThreadTypes() {
		return threadTypes;
	}
	public String getNvlThreadTypes() {
		if(getThreadTypes() == null) {
			return  EMPTY_STRING;
		} else {
			return getThreadTypes();
		}
	}
	public void setThreadTypes(String threadTypes) {
		if(threadTypes == null) {
			this.threadTypes  = EMPTY_STRING;
		} else {
			this.threadTypes = threadTypes;
		}
		this.threadTypes_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : metrics
	 * Comments    : 
	 */		

	private String metrics = EMPTY_STRING;
	
			
	private boolean metrics_nullable = false;
	
	public boolean isNullableMetrics() {
		return this.metrics_nullable;
	}	
	
	private boolean metrics_invalidation = false;
	
	public void setInvalidationMetrics(boolean invalidation) { 
		this.metrics_invalidation = invalidation;
	}
	
	public boolean isInvalidationMetrics() {
		return this.metrics_invalidation;
	}
	
	private boolean metrics_modified = false;
	

	public boolean isModifiedMetrics() {
		return this.metrics_modified;
	}
	
	public void unModifiedMetrics() {
		this.metrics_modified = false;
	}

	public String getMetrics() {
		return metrics;
	}
	public String getNvlMetrics() {
		if(getMetrics() == null) {
			return  EMPTY_STRING;
		} else {
			return getMetrics();
		}
	}
	public void setMetrics(String metrics) {
		if(metrics == null) {
			this.metrics  = EMPTY_STRING;
		} else {
			this.metrics = metrics;
		}
		this.metrics_modified = true;
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
	 * LogicalName : timeInterval
	 * Comments    : 
	 */		

	private int timeInterval;
	
		
	
	private boolean timeInterval_invalidation = false;
	
	public void setInvalidationTimeInterval(boolean invalidation) { 
		this.timeInterval_invalidation = invalidation;
	}
	
	public boolean isInvalidationTimeInterval() {
		return this.timeInterval_invalidation;
	}
	
	private boolean timeInterval_modified = false;
	

	public boolean isModifiedTimeInterval() {
		return this.timeInterval_modified;
	}
	
	public void unModifiedTimeInterval() {
		this.timeInterval_modified = false;
	}

	public int getTimeInterval() {
		return timeInterval;
	}
	public void setTimeInterval(int timeInterval) {
		this.timeInterval = timeInterval;
		this.timeInterval_modified = true;
		this.isModified = true;
	}
	
	public void setTimeInterval(Integer timeInterval) {
		if( timeInterval == null) {
			this.timeInterval = 0;
		} else{
			this.timeInterval = timeInterval.intValue();
		}
		this.timeInterval_modified = true;
		this.isModified = true;
	}
	public void setTimeInterval(String timeInterval) {
		if  (timeInterval==null || timeInterval.length() == 0) {
			this.timeInterval = 0;
		} else {
			this.timeInterval = Integer.parseInt(timeInterval);
		}
		this.timeInterval_modified = true;
		this.isModified = true;
	}		

	@Override
	public void clearAllIsModified() {
		this.topIds_modified = false;
		this.targetInstanceIds_modified = false;
		this.threadTypes_modified = false;
		this.metrics_modified = false;
		this.startTime_modified = false;
		this.timeInterval_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.topIds_modified == true)
			modifiedFields.add("topIds");
		if(this.targetInstanceIds_modified == true)
			modifiedFields.add("targetInstanceIds");
		if(this.threadTypes_modified == true)
			modifiedFields.add("threadTypes");
		if(this.metrics_modified == true)
			modifiedFields.add("metrics");
		if(this.startTime_modified == true)
			modifiedFields.add("startTime");
		if(this.timeInterval_modified == true)
			modifiedFields.add("timeInterval");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		StatsRealTimeInput copyObj = new StatsRealTimeInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _statsRealTimeInput) {
		if(this == _statsRealTimeInput) return;
		StatsRealTimeInput __statsRealTimeInput = (StatsRealTimeInput) _statsRealTimeInput;
		
		this.setTopIds(__statsRealTimeInput.getTopIds());
		this.setTargetInstanceIds(__statsRealTimeInput.getTargetInstanceIds());
		this.setThreadTypes(__statsRealTimeInput.getThreadTypes());
		this.setMetrics(__statsRealTimeInput.getMetrics());
		this.setStartTime(__statsRealTimeInput.getStartTime());
		this.setTimeInterval(__statsRealTimeInput.getTimeInterval());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topIds : ").append(topIds).append("\n");				
		buffer.append("targetInstanceIds : ").append(targetInstanceIds).append("\n");				
		buffer.append("threadTypes : ").append(threadTypes).append("\n");				
		buffer.append("metrics : ").append(metrics).append("\n");				
		buffer.append("startTime : ").append(startTime).append("\n");				
		buffer.append("timeInterval : ").append(timeInterval).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(6);
		fieldPropertyMap.put("topIds"
							, FieldPropertyFactory.getFieldProperty( "topIds","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 1024 , -1, null, null));		
		fieldPropertyMap.put("targetInstanceIds"
							, FieldPropertyFactory.getFieldProperty( "targetInstanceIds","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("threadTypes"
							, FieldPropertyFactory.getFieldProperty( "threadTypes","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 1024 , -1, null, null));		
		fieldPropertyMap.put("metrics"
							, FieldPropertyFactory.getFieldProperty( "metrics","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 1024 , -1, null, null));		
		fieldPropertyMap.put("startTime"
							, FieldPropertyFactory.getFieldProperty( "startTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("timeInterval"
							, FieldPropertyFactory.getFieldProperty( "timeInterval","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "topIds" : return getTopIds();
			case "targetInstanceIds" : return getTargetInstanceIds();
			case "threadTypes" : return getThreadTypes();
			case "metrics" : return getMetrics();
			case "startTime" : return getStartTime();
			case "timeInterval" : return getTimeInterval();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topIds" : setTopIds((String)arg);break;
			case "targetInstanceIds" : setTargetInstanceIds((String)arg);break;
			case "threadTypes" : setThreadTypes((String)arg);break;
			case "metrics" : setMetrics((String)arg);break;
			case "startTime" : setStartTime((String)arg);break;
			case "timeInterval" : setTimeInterval((Integer)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(StatsRealTimeInput obj) {
		if (obj == this) return true;					
		if(this.topIds != null ? !this.topIds.equals(obj.getTopIds()) : obj.getTopIds() != null) return false; 										
		if(this.targetInstanceIds != null ? !this.targetInstanceIds.equals(obj.getTargetInstanceIds()) : obj.getTargetInstanceIds() != null) return false; 										
		if(this.threadTypes != null ? !this.threadTypes.equals(obj.getThreadTypes()) : obj.getThreadTypes() != null) return false; 										
		if(this.metrics != null ? !this.metrics.equals(obj.getMetrics()) : obj.getMetrics() != null) return false; 										
		if(this.startTime != null ? !this.startTime.equals(obj.getStartTime()) : obj.getStartTime() != null) return false; 									
		if(this.timeInterval != obj.getTimeInterval()) return false; 				
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
