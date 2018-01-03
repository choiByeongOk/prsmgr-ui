	
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
public class Job extends DataObject {
	private static final String DTO_LOGICAL_NAME = "Job";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public Job() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : jobName
	 * Comments    : 
	 */		

	private String jobName = EMPTY_STRING;
	
			
	private boolean jobName_nullable = false;
	
	public boolean isNullableJobName() {
		return this.jobName_nullable;
	}	
	
	private boolean jobName_invalidation = false;
	
	public void setInvalidationJobName(boolean invalidation) { 
		this.jobName_invalidation = invalidation;
	}
	
	public boolean isInvalidationJobName() {
		return this.jobName_invalidation;
	}
	
	private boolean jobName_modified = false;
	

	public boolean isModifiedJobName() {
		return this.jobName_modified;
	}
	
	public void unModifiedJobName() {
		this.jobName_modified = false;
	}

	public String getJobName() {
		return jobName;
	}
	public String getNvlJobName() {
		if(getJobName() == null) {
			return  EMPTY_STRING;
		} else {
			return getJobName();
		}
	}
	public void setJobName(String jobName) {
		if(jobName == null) {
			this.jobName  = EMPTY_STRING;
		} else {
			this.jobName = jobName;
		}
		this.jobName_modified = true;
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
	 * LogicalName : srcTable
	 * Comments    : 
	 */		

	private String srcTable = EMPTY_STRING;
	
			
	private boolean srcTable_nullable = false;
	
	public boolean isNullableSrcTable() {
		return this.srcTable_nullable;
	}	
	
	private boolean srcTable_invalidation = false;
	
	public void setInvalidationSrcTable(boolean invalidation) { 
		this.srcTable_invalidation = invalidation;
	}
	
	public boolean isInvalidationSrcTable() {
		return this.srcTable_invalidation;
	}
	
	private boolean srcTable_modified = false;
	

	public boolean isModifiedSrcTable() {
		return this.srcTable_modified;
	}
	
	public void unModifiedSrcTable() {
		this.srcTable_modified = false;
	}

	public String getSrcTable() {
		return srcTable;
	}
	public String getNvlSrcTable() {
		if(getSrcTable() == null) {
			return  EMPTY_STRING;
		} else {
			return getSrcTable();
		}
	}
	public void setSrcTable(String srcTable) {
		if(srcTable == null) {
			this.srcTable  = EMPTY_STRING;
		} else {
			this.srcTable = srcTable;
		}
		this.srcTable_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : tarTable
	 * Comments    : 
	 */		

	private String tarTable = EMPTY_STRING;
	
			
	private boolean tarTable_nullable = false;
	
	public boolean isNullableTarTable() {
		return this.tarTable_nullable;
	}	
	
	private boolean tarTable_invalidation = false;
	
	public void setInvalidationTarTable(boolean invalidation) { 
		this.tarTable_invalidation = invalidation;
	}
	
	public boolean isInvalidationTarTable() {
		return this.tarTable_invalidation;
	}
	
	private boolean tarTable_modified = false;
	

	public boolean isModifiedTarTable() {
		return this.tarTable_modified;
	}
	
	public void unModifiedTarTable() {
		this.tarTable_modified = false;
	}

	public String getTarTable() {
		return tarTable;
	}
	public String getNvlTarTable() {
		if(getTarTable() == null) {
			return  EMPTY_STRING;
		} else {
			return getTarTable();
		}
	}
	public void setTarTable(String tarTable) {
		if(tarTable == null) {
			this.tarTable  = EMPTY_STRING;
		} else {
			this.tarTable = tarTable;
		}
		this.tarTable_modified = true;
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
	 * LogicalName : sqlCount
	 * Comments    : 
	 */		

	private int sqlCount;
	
		
	
	private boolean sqlCount_invalidation = false;
	
	public void setInvalidationSqlCount(boolean invalidation) { 
		this.sqlCount_invalidation = invalidation;
	}
	
	public boolean isInvalidationSqlCount() {
		return this.sqlCount_invalidation;
	}
	
	private boolean sqlCount_modified = false;
	

	public boolean isModifiedSqlCount() {
		return this.sqlCount_modified;
	}
	
	public void unModifiedSqlCount() {
		this.sqlCount_modified = false;
	}

	public int getSqlCount() {
		return sqlCount;
	}
	public void setSqlCount(int sqlCount) {
		this.sqlCount = sqlCount;
		this.sqlCount_modified = true;
		this.isModified = true;
	}
	
	public void setSqlCount(Integer sqlCount) {
		if( sqlCount == null) {
			this.sqlCount = 0;
		} else{
			this.sqlCount = sqlCount.intValue();
		}
		this.sqlCount_modified = true;
		this.isModified = true;
	}
	public void setSqlCount(String sqlCount) {
		if  (sqlCount==null || sqlCount.length() == 0) {
			this.sqlCount = 0;
		} else {
			this.sqlCount = Integer.parseInt(sqlCount);
		}
		this.sqlCount_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : ip
	 * Comments    : 
	 */		

	private String ip = EMPTY_STRING;
	
			
	private boolean ip_nullable = false;
	
	public boolean isNullableIp() {
		return this.ip_nullable;
	}	
	
	private boolean ip_invalidation = false;
	
	public void setInvalidationIp(boolean invalidation) { 
		this.ip_invalidation = invalidation;
	}
	
	public boolean isInvalidationIp() {
		return this.ip_invalidation;
	}
	
	private boolean ip_modified = false;
	

	public boolean isModifiedIp() {
		return this.ip_modified;
	}
	
	public void unModifiedIp() {
		this.ip_modified = false;
	}

	public String getIp() {
		return ip;
	}
	public String getNvlIp() {
		if(getIp() == null) {
			return  EMPTY_STRING;
		} else {
			return getIp();
		}
	}
	public void setIp(String ip) {
		if(ip == null) {
			this.ip  = EMPTY_STRING;
		} else {
			this.ip = ip;
		}
		this.ip_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : reportPath
	 * Comments    : 
	 */		

	private String reportPath = EMPTY_STRING;
	
			
	private boolean reportPath_nullable = false;
	
	public boolean isNullableReportPath() {
		return this.reportPath_nullable;
	}	
	
	private boolean reportPath_invalidation = false;
	
	public void setInvalidationReportPath(boolean invalidation) { 
		this.reportPath_invalidation = invalidation;
	}
	
	public boolean isInvalidationReportPath() {
		return this.reportPath_invalidation;
	}
	
	private boolean reportPath_modified = false;
	

	public boolean isModifiedReportPath() {
		return this.reportPath_modified;
	}
	
	public void unModifiedReportPath() {
		this.reportPath_modified = false;
	}

	public String getReportPath() {
		return reportPath;
	}
	public String getNvlReportPath() {
		if(getReportPath() == null) {
			return  EMPTY_STRING;
		} else {
			return getReportPath();
		}
	}
	public void setReportPath(String reportPath) {
		if(reportPath == null) {
			this.reportPath  = EMPTY_STRING;
		} else {
			this.reportPath = reportPath;
		}
		this.reportPath_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : time
	 * Comments    : 
	 */		

	private String time = EMPTY_STRING;
	
			
	private boolean time_nullable = false;
	
	public boolean isNullableTime() {
		return this.time_nullable;
	}	
	
	private boolean time_invalidation = false;
	
	public void setInvalidationTime(boolean invalidation) { 
		this.time_invalidation = invalidation;
	}
	
	public boolean isInvalidationTime() {
		return this.time_invalidation;
	}
	
	private boolean time_modified = false;
	

	public boolean isModifiedTime() {
		return this.time_modified;
	}
	
	public void unModifiedTime() {
		this.time_modified = false;
	}

	public String getTime() {
		return time;
	}
	public String getNvlTime() {
		if(getTime() == null) {
			return  EMPTY_STRING;
		} else {
			return getTime();
		}
	}
	public void setTime(String time) {
		if(time == null) {
			this.time  = EMPTY_STRING;
		} else {
			this.time = time;
		}
		this.time_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.jobName_modified = false;
		this.topId_modified = false;
		this.srcTable_modified = false;
		this.tarTable_modified = false;
		this.status_modified = false;
		this.sqlCount_modified = false;
		this.ip_modified = false;
		this.reportPath_modified = false;
		this.time_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.jobName_modified == true)
			modifiedFields.add("jobName");
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.srcTable_modified == true)
			modifiedFields.add("srcTable");
		if(this.tarTable_modified == true)
			modifiedFields.add("tarTable");
		if(this.status_modified == true)
			modifiedFields.add("status");
		if(this.sqlCount_modified == true)
			modifiedFields.add("sqlCount");
		if(this.ip_modified == true)
			modifiedFields.add("ip");
		if(this.reportPath_modified == true)
			modifiedFields.add("reportPath");
		if(this.time_modified == true)
			modifiedFields.add("time");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		Job copyObj = new Job();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _job) {
		if(this == _job) return;
		Job __job = (Job) _job;
		
		this.setJobName(__job.getJobName());
		this.setTopId(__job.getTopId());
		this.setSrcTable(__job.getSrcTable());
		this.setTarTable(__job.getTarTable());
		this.setStatus(__job.getStatus());
		this.setSqlCount(__job.getSqlCount());
		this.setIp(__job.getIp());
		this.setReportPath(__job.getReportPath());
		this.setTime(__job.getTime());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("jobName : ").append(jobName).append("\n");				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("srcTable : ").append(srcTable).append("\n");				
		buffer.append("tarTable : ").append(tarTable).append("\n");				
		buffer.append("status : ").append(status).append("\n");				
		buffer.append("sqlCount : ").append(sqlCount).append("\n");				
		buffer.append("ip : ").append(ip).append("\n");				
		buffer.append("reportPath : ").append(reportPath).append("\n");				
		buffer.append("time : ").append(time).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(9);
		fieldPropertyMap.put("jobName"
							, FieldPropertyFactory.getFieldProperty( "jobName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("srcTable"
							, FieldPropertyFactory.getFieldProperty( "srcTable","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("tarTable"
							, FieldPropertyFactory.getFieldProperty( "tarTable","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("status"
							, FieldPropertyFactory.getFieldProperty( "status","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("sqlCount"
							, FieldPropertyFactory.getFieldProperty( "sqlCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 10 , -1, null, null));		
		fieldPropertyMap.put("ip"
							, FieldPropertyFactory.getFieldProperty( "ip","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("reportPath"
							, FieldPropertyFactory.getFieldProperty( "reportPath","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("time"
							, FieldPropertyFactory.getFieldProperty( "time","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "jobName" : return getJobName();
			case "topId" : return getTopId();
			case "srcTable" : return getSrcTable();
			case "tarTable" : return getTarTable();
			case "status" : return getStatus();
			case "sqlCount" : return getSqlCount();
			case "ip" : return getIp();
			case "reportPath" : return getReportPath();
			case "time" : return getTime();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "jobName" : setJobName((String)arg);break;
			case "topId" : setTopId((String)arg);break;
			case "srcTable" : setSrcTable((String)arg);break;
			case "tarTable" : setTarTable((String)arg);break;
			case "status" : setStatus((String)arg);break;
			case "sqlCount" : setSqlCount((Integer)arg);break;
			case "ip" : setIp((String)arg);break;
			case "reportPath" : setReportPath((String)arg);break;
			case "time" : setTime((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(Job obj) {
		if (obj == this) return true;					
		if(this.jobName != null ? !this.jobName.equals(obj.getJobName()) : obj.getJobName() != null) return false; 										
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.srcTable != null ? !this.srcTable.equals(obj.getSrcTable()) : obj.getSrcTable() != null) return false; 										
		if(this.tarTable != null ? !this.tarTable.equals(obj.getTarTable()) : obj.getTarTable() != null) return false; 										
		if(this.status != null ? !this.status.equals(obj.getStatus()) : obj.getStatus() != null) return false; 									
		if(this.sqlCount != obj.getSqlCount()) return false; 									
		if(this.ip != null ? !this.ip.equals(obj.getIp()) : obj.getIp() != null) return false; 										
		if(this.reportPath != null ? !this.reportPath.equals(obj.getReportPath()) : obj.getReportPath() != null) return false; 										
		if(this.time != null ? !this.time.equals(obj.getTime()) : obj.getTime() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
