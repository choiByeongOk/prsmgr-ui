	
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
public class LongTx extends DataObject {
	private static final String DTO_LOGICAL_NAME = "LongTx";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public LongTx() {
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
	 * LogicalName : xId
	 * Comments    : 
	 */		

	private int xId;
	
		
	
	private boolean xId_invalidation = false;
	
	public void setInvalidationXId(boolean invalidation) { 
		this.xId_invalidation = invalidation;
	}
	
	public boolean isInvalidationXId() {
		return this.xId_invalidation;
	}
	
	private boolean xId_modified = false;
	

	public boolean isModifiedXId() {
		return this.xId_modified;
	}
	
	public void unModifiedXId() {
		this.xId_modified = false;
	}

	public int getXId() {
		return xId;
	}
	public void setXId(int xId) {
		this.xId = xId;
		this.xId_modified = true;
		this.isModified = true;
	}
	
	public void setXId(Integer xId) {
		if( xId == null) {
			this.xId = 0;
		} else{
			this.xId = xId.intValue();
		}
		this.xId_modified = true;
		this.isModified = true;
	}
	public void setXId(String xId) {
		if  (xId==null || xId.length() == 0) {
			this.xId = 0;
		} else {
			this.xId = Integer.parseInt(xId);
		}
		this.xId_modified = true;
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
			

	@Override
	public void clearAllIsModified() {
		this.topId_modified = false;
		this.xId_modified = false;
		this.insertCount_modified = false;
		this.updateCount_modified = false;
		this.deleteCount_modified = false;
		this.startTime_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.topId_modified == true)
			modifiedFields.add("topId");
		if(this.xId_modified == true)
			modifiedFields.add("xId");
		if(this.insertCount_modified == true)
			modifiedFields.add("insertCount");
		if(this.updateCount_modified == true)
			modifiedFields.add("updateCount");
		if(this.deleteCount_modified == true)
			modifiedFields.add("deleteCount");
		if(this.startTime_modified == true)
			modifiedFields.add("startTime");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		LongTx copyObj = new LongTx();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _longTx) {
		if(this == _longTx) return;
		LongTx __longTx = (LongTx) _longTx;
		
		this.setTopId(__longTx.getTopId());
		this.setXId(__longTx.getXId());
		this.setInsertCount(__longTx.getInsertCount());
		this.setUpdateCount(__longTx.getUpdateCount());
		this.setDeleteCount(__longTx.getDeleteCount());
		this.setStartTime(__longTx.getStartTime());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topId : ").append(topId).append("\n");				
		buffer.append("xId : ").append(xId).append("\n");				
		buffer.append("insertCount : ").append(insertCount).append("\n");				
		buffer.append("updateCount : ").append(updateCount).append("\n");				
		buffer.append("deleteCount : ").append(deleteCount).append("\n");				
		buffer.append("startTime : ").append(startTime).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(6);
		fieldPropertyMap.put("topId"
							, FieldPropertyFactory.getFieldProperty( "topId","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 128 , -1, null, null));		
		fieldPropertyMap.put("xId"
							, FieldPropertyFactory.getFieldProperty( "xId","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("insertCount"
							, FieldPropertyFactory.getFieldProperty( "insertCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("updateCount"
							, FieldPropertyFactory.getFieldProperty( "updateCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("deleteCount"
							, FieldPropertyFactory.getFieldProperty( "deleteCount","", "", "", false, false, false,  FieldProperty.TYPE_PRIMITIVE_INT, 5 , -1, null, null));		
		fieldPropertyMap.put("startTime"
							, FieldPropertyFactory.getFieldProperty( "startTime","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
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
			case "xId" : return getXId();
			case "insertCount" : return getInsertCount();
			case "updateCount" : return getUpdateCount();
			case "deleteCount" : return getDeleteCount();
			case "startTime" : return getStartTime();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topId" : setTopId((String)arg);break;
			case "xId" : setXId((Integer)arg);break;
			case "insertCount" : setInsertCount((Integer)arg);break;
			case "updateCount" : setUpdateCount((Integer)arg);break;
			case "deleteCount" : setDeleteCount((Integer)arg);break;
			case "startTime" : setStartTime((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(LongTx obj) {
		if (obj == this) return true;					
		if(this.topId != null ? !this.topId.equals(obj.getTopId()) : obj.getTopId() != null) return false; 									
		if(this.xId != obj.getXId()) return false; 								
		if(this.insertCount != obj.getInsertCount()) return false; 								
		if(this.updateCount != obj.getUpdateCount()) return false; 								
		if(this.deleteCount != obj.getDeleteCount()) return false; 									
		if(this.startTime != null ? !this.startTime.equals(obj.getStartTime()) : obj.getStartTime() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
