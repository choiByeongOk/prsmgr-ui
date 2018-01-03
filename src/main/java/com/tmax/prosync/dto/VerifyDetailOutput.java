	
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
public class VerifyDetailOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "VerifyDetailOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public VerifyDetailOutput() {
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
	 * LogicalName : byKey
	 * Comments    : 
	 */		

	private String byKey = EMPTY_STRING;
	
			
	private boolean byKey_nullable = false;
	
	public boolean isNullableByKey() {
		return this.byKey_nullable;
	}	
	
	private boolean byKey_invalidation = false;
	
	public void setInvalidationByKey(boolean invalidation) { 
		this.byKey_invalidation = invalidation;
	}
	
	public boolean isInvalidationByKey() {
		return this.byKey_invalidation;
	}
	
	private boolean byKey_modified = false;
	

	public boolean isModifiedByKey() {
		return this.byKey_modified;
	}
	
	public void unModifiedByKey() {
		this.byKey_modified = false;
	}

	public String getByKey() {
		return byKey;
	}
	public String getNvlByKey() {
		if(getByKey() == null) {
			return  EMPTY_STRING;
		} else {
			return getByKey();
		}
	}
	public void setByKey(String byKey) {
		if(byKey == null) {
			this.byKey  = EMPTY_STRING;
		} else {
			this.byKey = byKey;
		}
		this.byKey_modified = true;
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
	 * LogicalName : srcTableOwner
	 * Comments    : 
	 */		

	private String srcTableOwner = EMPTY_STRING;
	
			
	private boolean srcTableOwner_nullable = false;
	
	public boolean isNullableSrcTableOwner() {
		return this.srcTableOwner_nullable;
	}	
	
	private boolean srcTableOwner_invalidation = false;
	
	public void setInvalidationSrcTableOwner(boolean invalidation) { 
		this.srcTableOwner_invalidation = invalidation;
	}
	
	public boolean isInvalidationSrcTableOwner() {
		return this.srcTableOwner_invalidation;
	}
	
	private boolean srcTableOwner_modified = false;
	

	public boolean isModifiedSrcTableOwner() {
		return this.srcTableOwner_modified;
	}
	
	public void unModifiedSrcTableOwner() {
		this.srcTableOwner_modified = false;
	}

	public String getSrcTableOwner() {
		return srcTableOwner;
	}
	public String getNvlSrcTableOwner() {
		if(getSrcTableOwner() == null) {
			return  EMPTY_STRING;
		} else {
			return getSrcTableOwner();
		}
	}
	public void setSrcTableOwner(String srcTableOwner) {
		if(srcTableOwner == null) {
			this.srcTableOwner  = EMPTY_STRING;
		} else {
			this.srcTableOwner = srcTableOwner;
		}
		this.srcTableOwner_modified = true;
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
	 * LogicalName : srcPartition
	 * Comments    : 
	 */		

	private String srcPartition = EMPTY_STRING;
	
			
	private boolean srcPartition_nullable = false;
	
	public boolean isNullableSrcPartition() {
		return this.srcPartition_nullable;
	}	
	
	private boolean srcPartition_invalidation = false;
	
	public void setInvalidationSrcPartition(boolean invalidation) { 
		this.srcPartition_invalidation = invalidation;
	}
	
	public boolean isInvalidationSrcPartition() {
		return this.srcPartition_invalidation;
	}
	
	private boolean srcPartition_modified = false;
	

	public boolean isModifiedSrcPartition() {
		return this.srcPartition_modified;
	}
	
	public void unModifiedSrcPartition() {
		this.srcPartition_modified = false;
	}

	public String getSrcPartition() {
		return srcPartition;
	}
	public String getNvlSrcPartition() {
		if(getSrcPartition() == null) {
			return  EMPTY_STRING;
		} else {
			return getSrcPartition();
		}
	}
	public void setSrcPartition(String srcPartition) {
		if(srcPartition == null) {
			this.srcPartition  = EMPTY_STRING;
		} else {
			this.srcPartition = srcPartition;
		}
		this.srcPartition_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : srcWhere
	 * Comments    : 
	 */		

	private String srcWhere = EMPTY_STRING;
	
			
	private boolean srcWhere_nullable = false;
	
	public boolean isNullableSrcWhere() {
		return this.srcWhere_nullable;
	}	
	
	private boolean srcWhere_invalidation = false;
	
	public void setInvalidationSrcWhere(boolean invalidation) { 
		this.srcWhere_invalidation = invalidation;
	}
	
	public boolean isInvalidationSrcWhere() {
		return this.srcWhere_invalidation;
	}
	
	private boolean srcWhere_modified = false;
	

	public boolean isModifiedSrcWhere() {
		return this.srcWhere_modified;
	}
	
	public void unModifiedSrcWhere() {
		this.srcWhere_modified = false;
	}

	public String getSrcWhere() {
		return srcWhere;
	}
	public String getNvlSrcWhere() {
		if(getSrcWhere() == null) {
			return  EMPTY_STRING;
		} else {
			return getSrcWhere();
		}
	}
	public void setSrcWhere(String srcWhere) {
		if(srcWhere == null) {
			this.srcWhere  = EMPTY_STRING;
		} else {
			this.srcWhere = srcWhere;
		}
		this.srcWhere_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : tarTableOwner
	 * Comments    : 
	 */		

	private String tarTableOwner = EMPTY_STRING;
	
			
	private boolean tarTableOwner_nullable = false;
	
	public boolean isNullableTarTableOwner() {
		return this.tarTableOwner_nullable;
	}	
	
	private boolean tarTableOwner_invalidation = false;
	
	public void setInvalidationTarTableOwner(boolean invalidation) { 
		this.tarTableOwner_invalidation = invalidation;
	}
	
	public boolean isInvalidationTarTableOwner() {
		return this.tarTableOwner_invalidation;
	}
	
	private boolean tarTableOwner_modified = false;
	

	public boolean isModifiedTarTableOwner() {
		return this.tarTableOwner_modified;
	}
	
	public void unModifiedTarTableOwner() {
		this.tarTableOwner_modified = false;
	}

	public String getTarTableOwner() {
		return tarTableOwner;
	}
	public String getNvlTarTableOwner() {
		if(getTarTableOwner() == null) {
			return  EMPTY_STRING;
		} else {
			return getTarTableOwner();
		}
	}
	public void setTarTableOwner(String tarTableOwner) {
		if(tarTableOwner == null) {
			this.tarTableOwner  = EMPTY_STRING;
		} else {
			this.tarTableOwner = tarTableOwner;
		}
		this.tarTableOwner_modified = true;
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
	 * LogicalName : tarPartition
	 * Comments    : 
	 */		

	private String tarPartition = EMPTY_STRING;
	
			
	private boolean tarPartition_nullable = false;
	
	public boolean isNullableTarPartition() {
		return this.tarPartition_nullable;
	}	
	
	private boolean tarPartition_invalidation = false;
	
	public void setInvalidationTarPartition(boolean invalidation) { 
		this.tarPartition_invalidation = invalidation;
	}
	
	public boolean isInvalidationTarPartition() {
		return this.tarPartition_invalidation;
	}
	
	private boolean tarPartition_modified = false;
	

	public boolean isModifiedTarPartition() {
		return this.tarPartition_modified;
	}
	
	public void unModifiedTarPartition() {
		this.tarPartition_modified = false;
	}

	public String getTarPartition() {
		return tarPartition;
	}
	public String getNvlTarPartition() {
		if(getTarPartition() == null) {
			return  EMPTY_STRING;
		} else {
			return getTarPartition();
		}
	}
	public void setTarPartition(String tarPartition) {
		if(tarPartition == null) {
			this.tarPartition  = EMPTY_STRING;
		} else {
			this.tarPartition = tarPartition;
		}
		this.tarPartition_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : tarWhere
	 * Comments    : 
	 */		

	private String tarWhere = EMPTY_STRING;
	
			
	private boolean tarWhere_nullable = false;
	
	public boolean isNullableTarWhere() {
		return this.tarWhere_nullable;
	}	
	
	private boolean tarWhere_invalidation = false;
	
	public void setInvalidationTarWhere(boolean invalidation) { 
		this.tarWhere_invalidation = invalidation;
	}
	
	public boolean isInvalidationTarWhere() {
		return this.tarWhere_invalidation;
	}
	
	private boolean tarWhere_modified = false;
	

	public boolean isModifiedTarWhere() {
		return this.tarWhere_modified;
	}
	
	public void unModifiedTarWhere() {
		this.tarWhere_modified = false;
	}

	public String getTarWhere() {
		return tarWhere;
	}
	public String getNvlTarWhere() {
		if(getTarWhere() == null) {
			return  EMPTY_STRING;
		} else {
			return getTarWhere();
		}
	}
	public void setTarWhere(String tarWhere) {
		if(tarWhere == null) {
			this.tarWhere  = EMPTY_STRING;
		} else {
			this.tarWhere = tarWhere;
		}
		this.tarWhere_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : hint
	 * Comments    : 
	 */		

	private String hint = EMPTY_STRING;
	
			
	private boolean hint_nullable = false;
	
	public boolean isNullableHint() {
		return this.hint_nullable;
	}	
	
	private boolean hint_invalidation = false;
	
	public void setInvalidationHint(boolean invalidation) { 
		this.hint_invalidation = invalidation;
	}
	
	public boolean isInvalidationHint() {
		return this.hint_invalidation;
	}
	
	private boolean hint_modified = false;
	

	public boolean isModifiedHint() {
		return this.hint_modified;
	}
	
	public void unModifiedHint() {
		this.hint_modified = false;
	}

	public String getHint() {
		return hint;
	}
	public String getNvlHint() {
		if(getHint() == null) {
			return  EMPTY_STRING;
		} else {
			return getHint();
		}
	}
	public void setHint(String hint) {
		if(hint == null) {
			this.hint  = EMPTY_STRING;
		} else {
			this.hint = hint;
		}
		this.hint_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : where
	 * Comments    : 
	 */		

	private String where = EMPTY_STRING;
	
			
	private boolean where_nullable = false;
	
	public boolean isNullableWhere() {
		return this.where_nullable;
	}	
	
	private boolean where_invalidation = false;
	
	public void setInvalidationWhere(boolean invalidation) { 
		this.where_invalidation = invalidation;
	}
	
	public boolean isInvalidationWhere() {
		return this.where_invalidation;
	}
	
	private boolean where_modified = false;
	

	public boolean isModifiedWhere() {
		return this.where_modified;
	}
	
	public void unModifiedWhere() {
		this.where_modified = false;
	}

	public String getWhere() {
		return where;
	}
	public String getNvlWhere() {
		if(getWhere() == null) {
			return  EMPTY_STRING;
		} else {
			return getWhere();
		}
	}
	public void setWhere(String where) {
		if(where == null) {
			this.where  = EMPTY_STRING;
		} else {
			this.where = where;
		}
		this.where_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : orderBy
	 * Comments    : 
	 */		

	private String orderBy = EMPTY_STRING;
	
			
	private boolean orderBy_nullable = false;
	
	public boolean isNullableOrderBy() {
		return this.orderBy_nullable;
	}	
	
	private boolean orderBy_invalidation = false;
	
	public void setInvalidationOrderBy(boolean invalidation) { 
		this.orderBy_invalidation = invalidation;
	}
	
	public boolean isInvalidationOrderBy() {
		return this.orderBy_invalidation;
	}
	
	private boolean orderBy_modified = false;
	

	public boolean isModifiedOrderBy() {
		return this.orderBy_modified;
	}
	
	public void unModifiedOrderBy() {
		this.orderBy_modified = false;
	}

	public String getOrderBy() {
		return orderBy;
	}
	public String getNvlOrderBy() {
		if(getOrderBy() == null) {
			return  EMPTY_STRING;
		} else {
			return getOrderBy();
		}
	}
	public void setOrderBy(String orderBy) {
		if(orderBy == null) {
			this.orderBy  = EMPTY_STRING;
		} else {
			this.orderBy = orderBy;
		}
		this.orderBy_modified = true;
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
	 * LogicalName : insertCount
	 * Comments    : 
	 */		

	private int insertCount;
	
		
	
	private boolean insertCount_invalidation = false;
	
	public void setInvalidationInsertCount(boolean invalidation) { 
		this.insertCount_invalidation = invalidation;
	}
	
	public boolean isInvalidationInsertCount() {
		return this.insertCount_invalidation;
	}
	
	private boolean insertCount_modified = false;
	

	public boolean isModifiedInsertCount() {
		return this.insertCount_modified;
	}
	
	public void unModifiedInsertCount() {
		this.insertCount_modified = false;
	}

	public int getInsertCount() {
		return insertCount;
	}
	public void setInsertCount(int insertCount) {
		this.insertCount = insertCount;
		this.insertCount_modified = true;
		this.isModified = true;
	}
	
	public void setInsertCount(Integer insertCount) {
		if( insertCount == null) {
			this.insertCount = 0;
		} else{
			this.insertCount = insertCount.intValue();
		}
		this.insertCount_modified = true;
		this.isModified = true;
	}
	public void setInsertCount(String insertCount) {
		if  (insertCount==null || insertCount.length() == 0) {
			this.insertCount = 0;
		} else {
			this.insertCount = Integer.parseInt(insertCount);
		}
		this.insertCount_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : updateCount
	 * Comments    : 
	 */		

	private int updateCount;
	
		
	
	private boolean updateCount_invalidation = false;
	
	public void setInvalidationUpdateCount(boolean invalidation) { 
		this.updateCount_invalidation = invalidation;
	}
	
	public boolean isInvalidationUpdateCount() {
		return this.updateCount_invalidation;
	}
	
	private boolean updateCount_modified = false;
	

	public boolean isModifiedUpdateCount() {
		return this.updateCount_modified;
	}
	
	public void unModifiedUpdateCount() {
		this.updateCount_modified = false;
	}

	public int getUpdateCount() {
		return updateCount;
	}
	public void setUpdateCount(int updateCount) {
		this.updateCount = updateCount;
		this.updateCount_modified = true;
		this.isModified = true;
	}
	
	public void setUpdateCount(Integer updateCount) {
		if( updateCount == null) {
			this.updateCount = 0;
		} else{
			this.updateCount = updateCount.intValue();
		}
		this.updateCount_modified = true;
		this.isModified = true;
	}
	public void setUpdateCount(String updateCount) {
		if  (updateCount==null || updateCount.length() == 0) {
			this.updateCount = 0;
		} else {
			this.updateCount = Integer.parseInt(updateCount);
		}
		this.updateCount_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : deleteCount
	 * Comments    : 
	 */		

	private int deleteCount;
	
		
	
	private boolean deleteCount_invalidation = false;
	
	public void setInvalidationDeleteCount(boolean invalidation) { 
		this.deleteCount_invalidation = invalidation;
	}
	
	public boolean isInvalidationDeleteCount() {
		return this.deleteCount_invalidation;
	}
	
	private boolean deleteCount_modified = false;
	

	public boolean isModifiedDeleteCount() {
		return this.deleteCount_modified;
	}
	
	public void unModifiedDeleteCount() {
		this.deleteCount_modified = false;
	}

	public int getDeleteCount() {
		return deleteCount;
	}
	public void setDeleteCount(int deleteCount) {
		this.deleteCount = deleteCount;
		this.deleteCount_modified = true;
		this.isModified = true;
	}
	
	public void setDeleteCount(Integer deleteCount) {
		if( deleteCount == null) {
			this.deleteCount = 0;
		} else{
			this.deleteCount = deleteCount.intValue();
		}
		this.deleteCount_modified = true;
		this.isModified = true;
	}
	public void setDeleteCount(String deleteCount) {
		if  (deleteCount==null || deleteCount.length() == 0) {
			this.deleteCount = 0;
		} else {
			this.deleteCount = Integer.parseInt(deleteCount);
		}
		this.deleteCount_modified = true;
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
	 * LogicalName : errorDetail
	 * Comments    : 
	 */		

	private String errorDetail = EMPTY_STRING;
	
			
	private boolean errorDetail_nullable = false;
	
	public boolean isNullableErrorDetail() {
		return this.errorDetail_nullable;
	}	
	
	private boolean errorDetail_invalidation = false;
	
	public void setInvalidationErrorDetail(boolean invalidation) { 
		this.errorDetail_invalidation = invalidation;
	}
	
	public boolean isInvalidationErrorDetail() {
		return this.errorDetail_invalidation;
	}
	
	private boolean errorDetail_modified = false;
	

	public boolean isModifiedErrorDetail() {
		return this.errorDetail_modified;
	}
	
	public void unModifiedErrorDetail() {
		this.errorDetail_modified = false;
	}

	public String getErrorDetail() {
		return errorDetail;
	}
	public String getNvlErrorDetail() {
		if(getErrorDetail() == null) {
			return  EMPTY_STRING;
		} else {
			return getErrorDetail();
		}
	}
	public void setErrorDetail(String errorDetail) {
		if(errorDetail == null) {
			this.errorDetail  = EMPTY_STRING;
		} else {
			this.errorDetail = errorDetail;
		}
		this.errorDetail_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.jobName_modified = false;
		this.topId_modified = false;
		this.byKey_modified = false;
		this.processType_modified = false;
		this.srcTableOwner_modified = false;
		this.srcTable_modified = false;
		this.srcPartition_modified = false;
		this.srcWhere_modified = false;
		this.tarTableOwner_modified = false;
		this.tarTable_modified = false;
		this.tarPartition_modified = false;
		this.tarWhere_modified = false;
		this.hint_modified = false;
		this.where_modified = false;
		this.orderBy_modified = false;
		this.status_modified = false;
		this.insertCount_modified = false;
		this.updateCount_modified = false;
		this.deleteCount_modified = false;
		this.ip_modified = false;
		this.reportPath_modified = false;
		this.errorDetail_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.jobName_modified == true)
			modifiedFields.add("jobName");
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.byKey_modified == true)
			modifiedFields.add("byKey");
		if(this.processType_modified == true)
			modifiedFields.add("processType");
		if(this.srcTableOwner_modified == true)
			modifiedFields.add("srcTableOwner");
		if(this.srcTable_modified == true)
			modifiedFields.add("srcTable");
		if(this.srcPartition_modified == true)
			modifiedFields.add("srcPartition");
		if(this.srcWhere_modified == true)
			modifiedFields.add("srcWhere");
		if(this.tarTableOwner_modified == true)
			modifiedFields.add("tarTableOwner");
		if(this.tarTable_modified == true)
			modifiedFields.add("tarTable");
		if(this.tarPartition_modified == true)
			modifiedFields.add("tarPartition");
		if(this.tarWhere_modified == true)
			modifiedFields.add("tarWhere");
		if(this.hint_modified == true)
			modifiedFields.add("hint");
		if(this.where_modified == true)
			modifiedFields.add("where");
		if(this.orderBy_modified == true)
			modifiedFields.add("orderBy");
		if(this.status_modified == true)
			modifiedFields.add("status");
		if(this.insertCount_modified == true)
			modifiedFields.add("insertCount");
		if(this.updateCount_modified == true)
			modifiedFields.add("updateCount");
		if(this.deleteCount_modified == true)
			modifiedFields.add("deleteCount");
		if(this.ip_modified == true)
			modifiedFields.add("ip");
		if(this.reportPath_modified == true)
			modifiedFields.add("reportPath");
		if(this.errorDetail_modified == true)
			modifiedFields.add("errorDetail");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		VerifyDetailOutput copyObj = new VerifyDetailOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _verifyDetailOutput) {
		if(this == _verifyDetailOutput) return;
		VerifyDetailOutput __verifyDetailOutput = (VerifyDetailOutput) _verifyDetailOutput;
		
		this.setJobName(__verifyDetailOutput.getJobName());
		this.setTopId(__verifyDetailOutput.getTopId());
		this.setByKey(__verifyDetailOutput.getByKey());
		this.setProcessType(__verifyDetailOutput.getProcessType());
		this.setSrcTableOwner(__verifyDetailOutput.getSrcTableOwner());
		this.setSrcTable(__verifyDetailOutput.getSrcTable());
		this.setSrcPartition(__verifyDetailOutput.getSrcPartition());
		this.setSrcWhere(__verifyDetailOutput.getSrcWhere());
		this.setTarTableOwner(__verifyDetailOutput.getTarTableOwner());
		this.setTarTable(__verifyDetailOutput.getTarTable());
		this.setTarPartition(__verifyDetailOutput.getTarPartition());
		this.setTarWhere(__verifyDetailOutput.getTarWhere());
		this.setHint(__verifyDetailOutput.getHint());
		this.setWhere(__verifyDetailOutput.getWhere());
		this.setOrderBy(__verifyDetailOutput.getOrderBy());
		this.setStatus(__verifyDetailOutput.getStatus());
		this.setInsertCount(__verifyDetailOutput.getInsertCount());
		this.setUpdateCount(__verifyDetailOutput.getUpdateCount());
		this.setDeleteCount(__verifyDetailOutput.getDeleteCount());
		this.setIp(__verifyDetailOutput.getIp());
		this.setReportPath(__verifyDetailOutput.getReportPath());
		this.setErrorDetail(__verifyDetailOutput.getErrorDetail());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("jobName : ").append(jobName).append("\n");				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("byKey : ").append(byKey).append("\n");				
		buffer.append("processType : ").append(processType).append("\n");				
		buffer.append("srcTableOwner : ").append(srcTableOwner).append("\n");				
		buffer.append("srcTable : ").append(srcTable).append("\n");				
		buffer.append("srcPartition : ").append(srcPartition).append("\n");				
		buffer.append("srcWhere : ").append(srcWhere).append("\n");				
		buffer.append("tarTableOwner : ").append(tarTableOwner).append("\n");				
		buffer.append("tarTable : ").append(tarTable).append("\n");				
		buffer.append("tarPartition : ").append(tarPartition).append("\n");				
		buffer.append("tarWhere : ").append(tarWhere).append("\n");				
		buffer.append("hint : ").append(hint).append("\n");				
		buffer.append("where : ").append(where).append("\n");				
		buffer.append("orderBy : ").append(orderBy).append("\n");				
		buffer.append("status : ").append(status).append("\n");				
		buffer.append("insertCount : ").append(insertCount).append("\n");				
		buffer.append("updateCount : ").append(updateCount).append("\n");				
		buffer.append("deleteCount : ").append(deleteCount).append("\n");				
		buffer.append("ip : ").append(ip).append("\n");				
		buffer.append("reportPath : ").append(reportPath).append("\n");				
		buffer.append("errorDetail : ").append(errorDetail).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(22);
		fieldPropertyMap.put("jobName"
							, FieldPropertyFactory.getFieldProperty( "jobName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("byKey"
							, FieldPropertyFactory.getFieldProperty( "byKey","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("processType"
							, FieldPropertyFactory.getFieldProperty( "processType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 25 , -1, null, null));		
		fieldPropertyMap.put("srcTableOwner"
							, FieldPropertyFactory.getFieldProperty( "srcTableOwner","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("srcTable"
							, FieldPropertyFactory.getFieldProperty( "srcTable","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("srcPartition"
							, FieldPropertyFactory.getFieldProperty( "srcPartition","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("srcWhere"
							, FieldPropertyFactory.getFieldProperty( "srcWhere","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 512 , -1, null, null));		
		fieldPropertyMap.put("tarTableOwner"
							, FieldPropertyFactory.getFieldProperty( "tarTableOwner","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("tarTable"
							, FieldPropertyFactory.getFieldProperty( "tarTable","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("tarPartition"
							, FieldPropertyFactory.getFieldProperty( "tarPartition","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("tarWhere"
							, FieldPropertyFactory.getFieldProperty( "tarWhere","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 512 , -1, null, null));		
		fieldPropertyMap.put("hint"
							, FieldPropertyFactory.getFieldProperty( "hint","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 512 , -1, null, null));		
		fieldPropertyMap.put("where"
							, FieldPropertyFactory.getFieldProperty( "where","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 512 , -1, null, null));		
		fieldPropertyMap.put("orderBy"
							, FieldPropertyFactory.getFieldProperty( "orderBy","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 512 , -1, null, null));		
		fieldPropertyMap.put("status"
							, FieldPropertyFactory.getFieldProperty( "status","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("insertCount"
							, FieldPropertyFactory.getFieldProperty( "insertCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("updateCount"
							, FieldPropertyFactory.getFieldProperty( "updateCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("deleteCount"
							, FieldPropertyFactory.getFieldProperty( "deleteCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("ip"
							, FieldPropertyFactory.getFieldProperty( "ip","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("reportPath"
							, FieldPropertyFactory.getFieldProperty( "reportPath","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("errorDetail"
							, FieldPropertyFactory.getFieldProperty( "errorDetail","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 4000 , -1, null, null));		
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
			case "byKey" : return getByKey();
			case "processType" : return getProcessType();
			case "srcTableOwner" : return getSrcTableOwner();
			case "srcTable" : return getSrcTable();
			case "srcPartition" : return getSrcPartition();
			case "srcWhere" : return getSrcWhere();
			case "tarTableOwner" : return getTarTableOwner();
			case "tarTable" : return getTarTable();
			case "tarPartition" : return getTarPartition();
			case "tarWhere" : return getTarWhere();
			case "hint" : return getHint();
			case "where" : return getWhere();
			case "orderBy" : return getOrderBy();
			case "status" : return getStatus();
			case "insertCount" : return getInsertCount();
			case "updateCount" : return getUpdateCount();
			case "deleteCount" : return getDeleteCount();
			case "ip" : return getIp();
			case "reportPath" : return getReportPath();
			case "errorDetail" : return getErrorDetail();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "jobName" : setJobName((String)arg);break;
			case "topId" : setTopId((String)arg);break;
			case "byKey" : setByKey((String)arg);break;
			case "processType" : setProcessType((String)arg);break;
			case "srcTableOwner" : setSrcTableOwner((String)arg);break;
			case "srcTable" : setSrcTable((String)arg);break;
			case "srcPartition" : setSrcPartition((String)arg);break;
			case "srcWhere" : setSrcWhere((String)arg);break;
			case "tarTableOwner" : setTarTableOwner((String)arg);break;
			case "tarTable" : setTarTable((String)arg);break;
			case "tarPartition" : setTarPartition((String)arg);break;
			case "tarWhere" : setTarWhere((String)arg);break;
			case "hint" : setHint((String)arg);break;
			case "where" : setWhere((String)arg);break;
			case "orderBy" : setOrderBy((String)arg);break;
			case "status" : setStatus((String)arg);break;
			case "insertCount" : setInsertCount((Integer)arg);break;
			case "updateCount" : setUpdateCount((Integer)arg);break;
			case "deleteCount" : setDeleteCount((Integer)arg);break;
			case "ip" : setIp((String)arg);break;
			case "reportPath" : setReportPath((String)arg);break;
			case "errorDetail" : setErrorDetail((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(VerifyDetailOutput obj) {
		if (obj == this) return true;					
		if(this.jobName != null ? !this.jobName.equals(obj.getJobName()) : obj.getJobName() != null) return false; 										
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.byKey != null ? !this.byKey.equals(obj.getByKey()) : obj.getByKey() != null) return false; 										
		if(this.processType != null ? !this.processType.equals(obj.getProcessType()) : obj.getProcessType() != null) return false; 										
		if(this.srcTableOwner != null ? !this.srcTableOwner.equals(obj.getSrcTableOwner()) : obj.getSrcTableOwner() != null) return false; 										
		if(this.srcTable != null ? !this.srcTable.equals(obj.getSrcTable()) : obj.getSrcTable() != null) return false; 										
		if(this.srcPartition != null ? !this.srcPartition.equals(obj.getSrcPartition()) : obj.getSrcPartition() != null) return false; 										
		if(this.srcWhere != null ? !this.srcWhere.equals(obj.getSrcWhere()) : obj.getSrcWhere() != null) return false; 										
		if(this.tarTableOwner != null ? !this.tarTableOwner.equals(obj.getTarTableOwner()) : obj.getTarTableOwner() != null) return false; 										
		if(this.tarTable != null ? !this.tarTable.equals(obj.getTarTable()) : obj.getTarTable() != null) return false; 										
		if(this.tarPartition != null ? !this.tarPartition.equals(obj.getTarPartition()) : obj.getTarPartition() != null) return false; 										
		if(this.tarWhere != null ? !this.tarWhere.equals(obj.getTarWhere()) : obj.getTarWhere() != null) return false; 										
		if(this.hint != null ? !this.hint.equals(obj.getHint()) : obj.getHint() != null) return false; 										
		if(this.where != null ? !this.where.equals(obj.getWhere()) : obj.getWhere() != null) return false; 										
		if(this.orderBy != null ? !this.orderBy.equals(obj.getOrderBy()) : obj.getOrderBy() != null) return false; 										
		if(this.status != null ? !this.status.equals(obj.getStatus()) : obj.getStatus() != null) return false; 									
		if(this.insertCount != obj.getInsertCount()) return false; 								
		if(this.updateCount != obj.getUpdateCount()) return false; 								
		if(this.deleteCount != obj.getDeleteCount()) return false; 									
		if(this.ip != null ? !this.ip.equals(obj.getIp()) : obj.getIp() != null) return false; 										
		if(this.reportPath != null ? !this.reportPath.equals(obj.getReportPath()) : obj.getReportPath() != null) return false; 										
		if(this.errorDetail != null ? !this.errorDetail.equals(obj.getErrorDetail()) : obj.getErrorDetail() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
