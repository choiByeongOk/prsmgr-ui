	
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
public class Stat extends DataObject {
	private static final String DTO_LOGICAL_NAME = "Stat";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public Stat() {
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
	 * LogicalName : dmlInsert
	 * Comments    : 
	 */		

	private int dmlInsert;
	
		
	
	private boolean dmlInsert_invalidation = false;
	
	public void setInvalidationDmlInsert(boolean invalidation) { 
		this.dmlInsert_invalidation = invalidation;
	}
	
	public boolean isInvalidationDmlInsert() {
		return this.dmlInsert_invalidation;
	}
	
	private boolean dmlInsert_modified = false;
	

	public boolean isModifiedDmlInsert() {
		return this.dmlInsert_modified;
	}
	
	public void unModifiedDmlInsert() {
		this.dmlInsert_modified = false;
	}

	public int getDmlInsert() {
		return dmlInsert;
	}
	public void setDmlInsert(int dmlInsert) {
		this.dmlInsert = dmlInsert;
		this.dmlInsert_modified = true;
		this.isModified = true;
	}
	
	public void setDmlInsert(Integer dmlInsert) {
		if( dmlInsert == null) {
			this.dmlInsert = 0;
		} else{
			this.dmlInsert = dmlInsert.intValue();
		}
		this.dmlInsert_modified = true;
		this.isModified = true;
	}
	public void setDmlInsert(String dmlInsert) {
		if  (dmlInsert==null || dmlInsert.length() == 0) {
			this.dmlInsert = 0;
		} else {
			this.dmlInsert = Integer.parseInt(dmlInsert);
		}
		this.dmlInsert_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : dmlUpdate
	 * Comments    : 
	 */		

	private int dmlUpdate;
	
		
	
	private boolean dmlUpdate_invalidation = false;
	
	public void setInvalidationDmlUpdate(boolean invalidation) { 
		this.dmlUpdate_invalidation = invalidation;
	}
	
	public boolean isInvalidationDmlUpdate() {
		return this.dmlUpdate_invalidation;
	}
	
	private boolean dmlUpdate_modified = false;
	

	public boolean isModifiedDmlUpdate() {
		return this.dmlUpdate_modified;
	}
	
	public void unModifiedDmlUpdate() {
		this.dmlUpdate_modified = false;
	}

	public int getDmlUpdate() {
		return dmlUpdate;
	}
	public void setDmlUpdate(int dmlUpdate) {
		this.dmlUpdate = dmlUpdate;
		this.dmlUpdate_modified = true;
		this.isModified = true;
	}
	
	public void setDmlUpdate(Integer dmlUpdate) {
		if( dmlUpdate == null) {
			this.dmlUpdate = 0;
		} else{
			this.dmlUpdate = dmlUpdate.intValue();
		}
		this.dmlUpdate_modified = true;
		this.isModified = true;
	}
	public void setDmlUpdate(String dmlUpdate) {
		if  (dmlUpdate==null || dmlUpdate.length() == 0) {
			this.dmlUpdate = 0;
		} else {
			this.dmlUpdate = Integer.parseInt(dmlUpdate);
		}
		this.dmlUpdate_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : dmlDelete
	 * Comments    : 
	 */		

	private int dmlDelete;
	
		
	
	private boolean dmlDelete_invalidation = false;
	
	public void setInvalidationDmlDelete(boolean invalidation) { 
		this.dmlDelete_invalidation = invalidation;
	}
	
	public boolean isInvalidationDmlDelete() {
		return this.dmlDelete_invalidation;
	}
	
	private boolean dmlDelete_modified = false;
	

	public boolean isModifiedDmlDelete() {
		return this.dmlDelete_modified;
	}
	
	public void unModifiedDmlDelete() {
		this.dmlDelete_modified = false;
	}

	public int getDmlDelete() {
		return dmlDelete;
	}
	public void setDmlDelete(int dmlDelete) {
		this.dmlDelete = dmlDelete;
		this.dmlDelete_modified = true;
		this.isModified = true;
	}
	
	public void setDmlDelete(Integer dmlDelete) {
		if( dmlDelete == null) {
			this.dmlDelete = 0;
		} else{
			this.dmlDelete = dmlDelete.intValue();
		}
		this.dmlDelete_modified = true;
		this.isModified = true;
	}
	public void setDmlDelete(String dmlDelete) {
		if  (dmlDelete==null || dmlDelete.length() == 0) {
			this.dmlDelete = 0;
		} else {
			this.dmlDelete = Integer.parseInt(dmlDelete);
		}
		this.dmlDelete_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : tx
	 * Comments    : 
	 */		

	private int tx;
	
		
	
	private boolean tx_invalidation = false;
	
	public void setInvalidationTx(boolean invalidation) { 
		this.tx_invalidation = invalidation;
	}
	
	public boolean isInvalidationTx() {
		return this.tx_invalidation;
	}
	
	private boolean tx_modified = false;
	

	public boolean isModifiedTx() {
		return this.tx_modified;
	}
	
	public void unModifiedTx() {
		this.tx_modified = false;
	}

	public int getTx() {
		return tx;
	}
	public void setTx(int tx) {
		this.tx = tx;
		this.tx_modified = true;
		this.isModified = true;
	}
	
	public void setTx(Integer tx) {
		if( tx == null) {
			this.tx = 0;
		} else{
			this.tx = tx.intValue();
		}
		this.tx_modified = true;
		this.isModified = true;
	}
	public void setTx(String tx) {
		if  (tx==null || tx.length() == 0) {
			this.tx = 0;
		} else {
			this.tx = Integer.parseInt(tx);
		}
		this.tx_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : ddl
	 * Comments    : 
	 */		

	private int ddl;
	
		
	
	private boolean ddl_invalidation = false;
	
	public void setInvalidationDdl(boolean invalidation) { 
		this.ddl_invalidation = invalidation;
	}
	
	public boolean isInvalidationDdl() {
		return this.ddl_invalidation;
	}
	
	private boolean ddl_modified = false;
	

	public boolean isModifiedDdl() {
		return this.ddl_modified;
	}
	
	public void unModifiedDdl() {
		this.ddl_modified = false;
	}

	public int getDdl() {
		return ddl;
	}
	public void setDdl(int ddl) {
		this.ddl = ddl;
		this.ddl_modified = true;
		this.isModified = true;
	}
	
	public void setDdl(Integer ddl) {
		if( ddl == null) {
			this.ddl = 0;
		} else{
			this.ddl = ddl.intValue();
		}
		this.ddl_modified = true;
		this.isModified = true;
	}
	public void setDdl(String ddl) {
		if  (ddl==null || ddl.length() == 0) {
			this.ddl = 0;
		} else {
			this.ddl = Integer.parseInt(ddl);
		}
		this.ddl_modified = true;
		this.isModified = true;
	}		

	/**
	 * LogicalName : skipDml
	 * Comments    : 
	 */		

	private int skipDml;
	
		
	
	private boolean skipDml_invalidation = false;
	
	public void setInvalidationSkipDml(boolean invalidation) { 
		this.skipDml_invalidation = invalidation;
	}
	
	public boolean isInvalidationSkipDml() {
		return this.skipDml_invalidation;
	}
	
	private boolean skipDml_modified = false;
	

	public boolean isModifiedSkipDml() {
		return this.skipDml_modified;
	}
	
	public void unModifiedSkipDml() {
		this.skipDml_modified = false;
	}

	public int getSkipDml() {
		return skipDml;
	}
	public void setSkipDml(int skipDml) {
		this.skipDml = skipDml;
		this.skipDml_modified = true;
		this.isModified = true;
	}
	
	public void setSkipDml(Integer skipDml) {
		if( skipDml == null) {
			this.skipDml = 0;
		} else{
			this.skipDml = skipDml.intValue();
		}
		this.skipDml_modified = true;
		this.isModified = true;
	}
	public void setSkipDml(String skipDml) {
		if  (skipDml==null || skipDml.length() == 0) {
			this.skipDml = 0;
		} else {
			this.skipDml = Integer.parseInt(skipDml);
		}
		this.skipDml_modified = true;
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
		this.topId_modified = false;
		this.processType_modified = false;
		this.processNum_modified = false;
		this.timeType_modified = false;
		this.dmlInsert_modified = false;
		this.dmlUpdate_modified = false;
		this.dmlDelete_modified = false;
		this.tx_modified = false;
		this.ddl_modified = false;
		this.skipDml_modified = false;
		this.time_modified = false;
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
		if(this.timeType_modified == true)
			modifiedFields.add("timeType");
		if(this.dmlInsert_modified == true)
			modifiedFields.add("dmlInsert");
		if(this.dmlUpdate_modified == true)
			modifiedFields.add("dmlUpdate");
		if(this.dmlDelete_modified == true)
			modifiedFields.add("dmlDelete");
		if(this.tx_modified == true)
			modifiedFields.add("tx");
		if(this.ddl_modified == true)
			modifiedFields.add("ddl");
		if(this.skipDml_modified == true)
			modifiedFields.add("skipDml");
		if(this.time_modified == true)
			modifiedFields.add("time");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		Stat copyObj = new Stat();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _stat) {
		if(this == _stat) return;
		Stat __stat = (Stat) _stat;
		
		this.setTopId(__stat.getTopId());
		this.setProcessType(__stat.getProcessType());
		this.setProcessNum(__stat.getProcessNum());
		this.setTimeType(__stat.getTimeType());
		this.setDmlInsert(__stat.getDmlInsert());
		this.setDmlUpdate(__stat.getDmlUpdate());
		this.setDmlDelete(__stat.getDmlDelete());
		this.setTx(__stat.getTx());
		this.setDdl(__stat.getDdl());
		this.setSkipDml(__stat.getSkipDml());
		this.setTime(__stat.getTime());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("processType : ").append(processType).append("\n");				
		buffer.append("processNum : ").append(processNum).append("\n");				
		buffer.append("timeType : ").append(timeType).append("\n");				
		buffer.append("dmlInsert : ").append(dmlInsert).append("\n");				
		buffer.append("dmlUpdate : ").append(dmlUpdate).append("\n");				
		buffer.append("dmlDelete : ").append(dmlDelete).append("\n");				
		buffer.append("tx : ").append(tx).append("\n");				
		buffer.append("ddl : ").append(ddl).append("\n");				
		buffer.append("skipDml : ").append(skipDml).append("\n");				
		buffer.append("time : ").append(time).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(11);
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("processType"
							, FieldPropertyFactory.getFieldProperty( "processType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 25 , -1, null, null));		
		fieldPropertyMap.put("processNum"
							, FieldPropertyFactory.getFieldProperty( "processNum","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("timeType"
							, FieldPropertyFactory.getFieldProperty( "timeType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("dmlInsert"
							, FieldPropertyFactory.getFieldProperty( "dmlInsert","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 20 , -1, null, null));		
		fieldPropertyMap.put("dmlUpdate"
							, FieldPropertyFactory.getFieldProperty( "dmlUpdate","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 20 , -1, null, null));		
		fieldPropertyMap.put("dmlDelete"
							, FieldPropertyFactory.getFieldProperty( "dmlDelete","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 20 , -1, null, null));		
		fieldPropertyMap.put("tx"
							, FieldPropertyFactory.getFieldProperty( "tx","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 20 , -1, null, null));		
		fieldPropertyMap.put("ddl"
							, FieldPropertyFactory.getFieldProperty( "ddl","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 20 , -1, null, null));		
		fieldPropertyMap.put("skipDml"
							, FieldPropertyFactory.getFieldProperty( "skipDml","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 20 , -1, null, null));		
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
			case "topId" : return getTopId();
			case "processType" : return getProcessType();
			case "processNum" : return getProcessNum();
			case "timeType" : return getTimeType();
			case "dmlInsert" : return getDmlInsert();
			case "dmlUpdate" : return getDmlUpdate();
			case "dmlDelete" : return getDmlDelete();
			case "tx" : return getTx();
			case "ddl" : return getDdl();
			case "skipDml" : return getSkipDml();
			case "time" : return getTime();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topId" : setTopId((String)arg);break;
			case "processType" : setProcessType((String)arg);break;
			case "processNum" : setProcessNum((Integer)arg);break;
			case "timeType" : setTimeType((String)arg);break;
			case "dmlInsert" : setDmlInsert((Integer)arg);break;
			case "dmlUpdate" : setDmlUpdate((Integer)arg);break;
			case "dmlDelete" : setDmlDelete((Integer)arg);break;
			case "tx" : setTx((Integer)arg);break;
			case "ddl" : setDdl((Integer)arg);break;
			case "skipDml" : setSkipDml((Integer)arg);break;
			case "time" : setTime((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(Stat obj) {
		if (obj == this) return true;					
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 										
		if(this.processType != null ? !this.processType.equals(obj.getProcessType()) : obj.getProcessType() != null) return false; 									
		if(this.processNum != obj.getProcessNum()) return false; 									
		if(this.timeType != null ? !this.timeType.equals(obj.getTimeType()) : obj.getTimeType() != null) return false; 									
		if(this.dmlInsert != obj.getDmlInsert()) return false; 								
		if(this.dmlUpdate != obj.getDmlUpdate()) return false; 								
		if(this.dmlDelete != obj.getDmlDelete()) return false; 								
		if(this.tx != obj.getTx()) return false; 								
		if(this.ddl != obj.getDdl()) return false; 								
		if(this.skipDml != obj.getSkipDml()) return false; 									
		if(this.time != null ? !this.time.equals(obj.getTime()) : obj.getTime() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
