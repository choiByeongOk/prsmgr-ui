	
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
public class JobCreateInput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "JobCreateInput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public JobCreateInput() {
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
			

	@Override
	public void clearAllIsModified() {
		this.jobName_modified = false;
		this.topId_modified = false;
		this.byKey_modified = false;
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
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		JobCreateInput copyObj = new JobCreateInput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _jobCreateInput) {
		if(this == _jobCreateInput) return;
		JobCreateInput __jobCreateInput = (JobCreateInput) _jobCreateInput;
		
		this.setJobName(__jobCreateInput.getJobName());
		this.setTopId(__jobCreateInput.getTopId());
		this.setByKey(__jobCreateInput.getByKey());
		this.setSrcTableOwner(__jobCreateInput.getSrcTableOwner());
		this.setSrcTable(__jobCreateInput.getSrcTable());
		this.setSrcPartition(__jobCreateInput.getSrcPartition());
		this.setSrcWhere(__jobCreateInput.getSrcWhere());
		this.setTarTableOwner(__jobCreateInput.getTarTableOwner());
		this.setTarTable(__jobCreateInput.getTarTable());
		this.setTarPartition(__jobCreateInput.getTarPartition());
		this.setTarWhere(__jobCreateInput.getTarWhere());
		this.setHint(__jobCreateInput.getHint());
		this.setWhere(__jobCreateInput.getWhere());
		this.setOrderBy(__jobCreateInput.getOrderBy());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("jobName : ").append(jobName).append("\n");				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("byKey : ").append(byKey).append("\n");				
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
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(14);
		fieldPropertyMap.put("jobName"
							, FieldPropertyFactory.getFieldProperty( "jobName","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("byKey"
							, FieldPropertyFactory.getFieldProperty( "byKey","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
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
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "jobName" : setJobName((String)arg);break;
			case "topId" : setTopId((String)arg);break;
			case "byKey" : setByKey((String)arg);break;
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
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(JobCreateInput obj) {
		if (obj == this) return true;					
		if(this.jobName != null ? !this.jobName.equals(obj.getJobName()) : obj.getJobName() != null) return false; 										
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.byKey != null ? !this.byKey.equals(obj.getByKey()) : obj.getByKey() != null) return false; 										
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
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
