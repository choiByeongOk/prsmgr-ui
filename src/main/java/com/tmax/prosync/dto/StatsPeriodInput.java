	
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
public class StatsPeriodInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "StatsPeriodInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public StatsPeriodInput() {
			super();
			
	}	 
	
	private boolean isModified = false;

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
	 * LogicalName : metric
	 * Comments    : 
	 */		

	private String metric = EMPTY_STRING;
	
			
	private boolean metric_nullable = false;
	
	public boolean isNullableMetric() {
		return this.metric_nullable;
	}	
	
	private boolean metric_invalidation = false;
	
	public void setInvalidationMetric(boolean invalidation) { 
		this.metric_invalidation = invalidation;
	}
	
	public boolean isInvalidationMetric() {
		return this.metric_invalidation;
	}
	
	private boolean metric_modified = false;
	

	public boolean isModifiedMetric() {
		return this.metric_modified;
	}
	
	public void unModifiedMetric() {
		this.metric_modified = false;
	}

	public String getMetric() {
		return metric;
	}
	public String getNvlMetric() {
		if(getMetric() == null) {
			return  EMPTY_STRING;
		} else {
			return getMetric();
		}
	}
	public void setMetric(String metric) {
		if(metric == null) {
			this.metric  = EMPTY_STRING;
		} else {
			this.metric = metric;
		}
		this.metric_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : timeType
	 * Comments    : 
	 */		

	private String timeType = EMPTY_STRING;
	
			
	private boolean timeType_nullable = false;
	
	public boolean isNullableTimeType() {
		return this.timeType_nullable;
	}	
	
	private boolean timeType_invalidation = false;
	
	public void setInvalidationTimeType(boolean invalidation) { 
		this.timeType_invalidation = invalidation;
	}
	
	public boolean isInvalidationTimeType() {
		return this.timeType_invalidation;
	}
	
	private boolean timeType_modified = false;
	

	public boolean isModifiedTimeType() {
		return this.timeType_modified;
	}
	
	public void unModifiedTimeType() {
		this.timeType_modified = false;
	}

	public String getTimeType() {
		return timeType;
	}
	public String getNvlTimeType() {
		if(getTimeType() == null) {
			return  EMPTY_STRING;
		} else {
			return getTimeType();
		}
	}
	public void setTimeType(String timeType) {
		if(timeType == null) {
			this.timeType  = EMPTY_STRING;
		} else {
			this.timeType = timeType;
		}
		this.timeType_modified = true;
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
			

	/**
	 * LogicalName : numOfPoints
	 * Comments    : 
	 */		

	private long numOfPoints;
	
		
	
	private boolean numOfPoints_invalidation = false;
	
	public void setInvalidationNumOfPoints(boolean invalidation) { 
		this.numOfPoints_invalidation = invalidation;
	}
	
	public boolean isInvalidationNumOfPoints() {
		return this.numOfPoints_invalidation;
	}
	
	private boolean numOfPoints_modified = false;
	

	public boolean isModifiedNumOfPoints() {
		return this.numOfPoints_modified;
	}
	
	public void unModifiedNumOfPoints() {
		this.numOfPoints_modified = false;
	}

	public long getNumOfPoints() {
		return numOfPoints;
	}
	public void setNumOfPoints(long numOfPoints) {
		this.numOfPoints = numOfPoints;
		this.numOfPoints_modified = true;
		this.isModified = true;
	}
	
	public void setNumOfPoints(Long numOfPoints) {
		if(numOfPoints == null) {
			this.numOfPoints = 0;
		} else {
			this.numOfPoints = numOfPoints.longValue();
		}
		this.numOfPoints_modified = true;
		this.isModified = true;
	}
	public void setNumOfPoints(String numOfPoints) {
		if(numOfPoints == null || numOfPoints.length() == 0) {
			this.numOfPoints = 0;
		} else {
			this.numOfPoints = Long.parseLong( numOfPoints);
		}
		this.numOfPoints_modified = true;
		this.isModified = true;
	}			

	@Override
	public void clearAllIsModified() {
		this.topId_modified = false;
		this.processType_modified = false;
		this.processNum_modified = false;
		this.metric_modified = false;
		this.timeType_modified = false;
		this.startTime_modified = false;
		this.endTime_modified = false;
		this.numOfPoints_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.processType_modified == true)
			modifiedFields.add("processType");
		if(this.processNum_modified == true)
			modifiedFields.add("processNum");
		if(this.metric_modified == true)
			modifiedFields.add("metric");
		if(this.timeType_modified == true)
			modifiedFields.add("timeType");
		if(this.startTime_modified == true)
			modifiedFields.add("startTime");
		if(this.endTime_modified == true)
			modifiedFields.add("endTime");
		if(this.numOfPoints_modified == true)
			modifiedFields.add("numOfPoints");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		StatsPeriodInput copyObj = new StatsPeriodInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _statsPeriodInput) {
		if(this == _statsPeriodInput) return;
		StatsPeriodInput __statsPeriodInput = (StatsPeriodInput) _statsPeriodInput;
		
		this.setTopId(__statsPeriodInput.getTopId());
		this.setProcessType(__statsPeriodInput.getProcessType());
		this.setProcessNum(__statsPeriodInput.getProcessNum());
		this.setMetric(__statsPeriodInput.getMetric());
		this.setTimeType(__statsPeriodInput.getTimeType());
		this.setStartTime(__statsPeriodInput.getStartTime());
		this.setEndTime(__statsPeriodInput.getEndTime());
		this.setNumOfPoints(__statsPeriodInput.getNumOfPoints());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("processType : ").append(processType).append("\n");				
		buffer.append("processNum : ").append(processNum).append("\n");				
		buffer.append("metric : ").append(metric).append("\n");				
		buffer.append("timeType : ").append(timeType).append("\n");				
		buffer.append("startTime : ").append(startTime).append("\n");				
		buffer.append("endTime : ").append(endTime).append("\n");				
		buffer.append("numOfPoints : ").append(numOfPoints).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(8);
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("processType"
							, FieldPropertyFactory.getFieldProperty( "processType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 25 , -1, null, null));		
		fieldPropertyMap.put("processNum"
							, FieldPropertyFactory.getFieldProperty( "processNum","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("metric"
							, FieldPropertyFactory.getFieldProperty( "metric","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 24 , -1, null, null));		
		fieldPropertyMap.put("timeType"
							, FieldPropertyFactory.getFieldProperty( "timeType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("startTime"
							, FieldPropertyFactory.getFieldProperty( "startTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("endTime"
							, FieldPropertyFactory.getFieldProperty( "endTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("numOfPoints"
							, FieldPropertyFactory.getFieldProperty( "numOfPoints","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_LONG, 64 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "topId" : return getTopId();
			case "processType" : return getProcessType();
			case "processNum" : return getProcessNum();
			case "metric" : return getMetric();
			case "timeType" : return getTimeType();
			case "startTime" : return getStartTime();
			case "endTime" : return getEndTime();
			case "numOfPoints" : return getNumOfPoints();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topId" : setTopId((String)arg);break;
			case "processType" : setProcessType((String)arg);break;
			case "processNum" : setProcessNum((Integer)arg);break;
			case "metric" : setMetric((String)arg);break;
			case "timeType" : setTimeType((String)arg);break;
			case "startTime" : setStartTime((String)arg);break;
			case "endTime" : setEndTime((String)arg);break;
			case "numOfPoints" : setNumOfPoints((Long)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(StatsPeriodInput obj) {
		if (obj == this) return true;					
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.processType != null ? !this.processType.equals(obj.getProcessType()) : obj.getProcessType() != null) return false; 									
		if(this.processNum != obj.getProcessNum()) return false; 									
		if(this.metric != null ? !this.metric.equals(obj.getMetric()) : obj.getMetric() != null) return false; 										
		if(this.timeType != null ? !this.timeType.equals(obj.getTimeType()) : obj.getTimeType() != null) return false; 										
		if(this.startTime != null ? !this.startTime.equals(obj.getStartTime()) : obj.getStartTime() != null) return false; 										
		if(this.endTime != null ? !this.endTime.equals(obj.getEndTime()) : obj.getEndTime() != null) return false; 									
		if(this.numOfPoints != obj.getNumOfPoints()) return false; 				
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
