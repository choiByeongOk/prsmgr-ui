	
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
public class SrcDbInfo extends DataObject {
	private static final String DTO_LOGICAL_NAME = "SrcDbInfo";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public SrcDbInfo() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : instance
	 * Comments    : 
	 */		

	private String instance = EMPTY_STRING;
	
			
	private boolean instance_nullable = false;
	
	public boolean isNullableInstance() {
		return this.instance_nullable;
	}	
	
	private boolean instance_invalidation = false;
	
	public void setInvalidationInstance(boolean invalidation) { 
		this.instance_invalidation = invalidation;
	}
	
	public boolean isInvalidationInstance() {
		return this.instance_invalidation;
	}
	
	private boolean instance_modified = false;
	

	public boolean isModifiedInstance() {
		return this.instance_modified;
	}
	
	public void unModifiedInstance() {
		this.instance_modified = false;
	}

	public String getInstance() {
		return instance;
	}
	public String getNvlInstance() {
		if(getInstance() == null) {
			return  EMPTY_STRING;
		} else {
			return getInstance();
		}
	}
	public void setInstance(String instance) {
		if(instance == null) {
			this.instance  = EMPTY_STRING;
		} else {
			this.instance = instance;
		}
		this.instance_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : engineType
	 * Comments    : 
	 */		

	private String engineType = EMPTY_STRING;
	
			
	private boolean engineType_nullable = false;
	
	public boolean isNullableEngineType() {
		return this.engineType_nullable;
	}	
	
	private boolean engineType_invalidation = false;
	
	public void setInvalidationEngineType(boolean invalidation) { 
		this.engineType_invalidation = invalidation;
	}
	
	public boolean isInvalidationEngineType() {
		return this.engineType_invalidation;
	}
	
	private boolean engineType_modified = false;
	

	public boolean isModifiedEngineType() {
		return this.engineType_modified;
	}
	
	public void unModifiedEngineType() {
		this.engineType_modified = false;
	}

	public String getEngineType() {
		return engineType;
	}
	public String getNvlEngineType() {
		if(getEngineType() == null) {
			return  EMPTY_STRING;
		} else {
			return getEngineType();
		}
	}
	public void setEngineType(String engineType) {
		if(engineType == null) {
			this.engineType  = EMPTY_STRING;
		} else {
			this.engineType = engineType;
		}
		this.engineType_modified = true;
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
	 * LogicalName : cluster
	 * Comments    : 
	 */		

	private String cluster = EMPTY_STRING;
	
			
	private boolean cluster_nullable = false;
	
	public boolean isNullableCluster() {
		return this.cluster_nullable;
	}	
	
	private boolean cluster_invalidation = false;
	
	public void setInvalidationCluster(boolean invalidation) { 
		this.cluster_invalidation = invalidation;
	}
	
	public boolean isInvalidationCluster() {
		return this.cluster_invalidation;
	}
	
	private boolean cluster_modified = false;
	

	public boolean isModifiedCluster() {
		return this.cluster_modified;
	}
	
	public void unModifiedCluster() {
		this.cluster_modified = false;
	}

	public String getCluster() {
		return cluster;
	}
	public String getNvlCluster() {
		if(getCluster() == null) {
			return  EMPTY_STRING;
		} else {
			return getCluster();
		}
	}
	public void setCluster(String cluster) {
		if(cluster == null) {
			this.cluster  = EMPTY_STRING;
		} else {
			this.cluster = cluster;
		}
		this.cluster_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : charset
	 * Comments    : 
	 */		

	private String charset = EMPTY_STRING;
	
			
	private boolean charset_nullable = false;
	
	public boolean isNullableCharset() {
		return this.charset_nullable;
	}	
	
	private boolean charset_invalidation = false;
	
	public void setInvalidationCharset(boolean invalidation) { 
		this.charset_invalidation = invalidation;
	}
	
	public boolean isInvalidationCharset() {
		return this.charset_invalidation;
	}
	
	private boolean charset_modified = false;
	

	public boolean isModifiedCharset() {
		return this.charset_modified;
	}
	
	public void unModifiedCharset() {
		this.charset_modified = false;
	}

	public String getCharset() {
		return charset;
	}
	public String getNvlCharset() {
		if(getCharset() == null) {
			return  EMPTY_STRING;
		} else {
			return getCharset();
		}
	}
	public void setCharset(String charset) {
		if(charset == null) {
			this.charset  = EMPTY_STRING;
		} else {
			this.charset = charset;
		}
		this.charset_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : ncharset
	 * Comments    : 
	 */		

	private String ncharset = EMPTY_STRING;
	
			
	private boolean ncharset_nullable = false;
	
	public boolean isNullableNcharset() {
		return this.ncharset_nullable;
	}	
	
	private boolean ncharset_invalidation = false;
	
	public void setInvalidationNcharset(boolean invalidation) { 
		this.ncharset_invalidation = invalidation;
	}
	
	public boolean isInvalidationNcharset() {
		return this.ncharset_invalidation;
	}
	
	private boolean ncharset_modified = false;
	

	public boolean isModifiedNcharset() {
		return this.ncharset_modified;
	}
	
	public void unModifiedNcharset() {
		this.ncharset_modified = false;
	}

	public String getNcharset() {
		return ncharset;
	}
	public String getNvlNcharset() {
		if(getNcharset() == null) {
			return  EMPTY_STRING;
		} else {
			return getNcharset();
		}
	}
	public void setNcharset(String ncharset) {
		if(ncharset == null) {
			this.ncharset  = EMPTY_STRING;
		} else {
			this.ncharset = ncharset;
		}
		this.ncharset_modified = true;
		this.isModified = true;
	}	
			

	@Override
	public void clearAllIsModified() {
		this.instance_modified = false;
		this.engineType_modified = false;
		this.ip_modified = false;
		this.cluster_modified = false;
		this.charset_modified = false;
		this.ncharset_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.instance_modified == true)
			modifiedFields.add("instance");
		if(this.engineType_modified == true)
			modifiedFields.add("engineType");
		if(this.ip_modified == true)
			modifiedFields.add("ip");
		if(this.cluster_modified == true)
			modifiedFields.add("cluster");
		if(this.charset_modified == true)
			modifiedFields.add("charset");
		if(this.ncharset_modified == true)
			modifiedFields.add("ncharset");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		SrcDbInfo copyObj = new SrcDbInfo();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _srcDbInfo) {
		if(this == _srcDbInfo) return;
		SrcDbInfo __srcDbInfo = (SrcDbInfo) _srcDbInfo;
		
		this.setInstance(__srcDbInfo.getInstance());
		this.setEngineType(__srcDbInfo.getEngineType());
		this.setIp(__srcDbInfo.getIp());
		this.setCluster(__srcDbInfo.getCluster());
		this.setCharset(__srcDbInfo.getCharset());
		this.setNcharset(__srcDbInfo.getNcharset());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("instance : ").append(instance).append("\n");				
		buffer.append("engineType : ").append(engineType).append("\n");				
		buffer.append("ip : ").append(ip).append("\n");				
		buffer.append("cluster : ").append(cluster).append("\n");				
		buffer.append("charset : ").append(charset).append("\n");				
		buffer.append("ncharset : ").append(ncharset).append("\n");		
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(6);
		fieldPropertyMap.put("instance"
							, FieldPropertyFactory.getFieldProperty( "instance","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 64 , -1, null, null));		
		fieldPropertyMap.put("engineType"
							, FieldPropertyFactory.getFieldProperty( "engineType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("ip"
							, FieldPropertyFactory.getFieldProperty( "ip","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("cluster"
							, FieldPropertyFactory.getFieldProperty( "cluster","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("charset"
							, FieldPropertyFactory.getFieldProperty( "charset","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
		fieldPropertyMap.put("ncharset"
							, FieldPropertyFactory.getFieldProperty( "ncharset","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 32 , -1, null, null));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "instance" : return getInstance();
			case "engineType" : return getEngineType();
			case "ip" : return getIp();
			case "cluster" : return getCluster();
			case "charset" : return getCharset();
			case "ncharset" : return getNcharset();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "instance" : setInstance((String)arg);break;
			case "engineType" : setEngineType((String)arg);break;
			case "ip" : setIp((String)arg);break;
			case "cluster" : setCluster((String)arg);break;
			case "charset" : setCharset((String)arg);break;
			case "ncharset" : setNcharset((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(SrcDbInfo obj) {
		if (obj == this) return true;					
		if(this.instance != null ? !this.instance.equals(obj.getInstance()) : obj.getInstance() != null) return false; 										
		if(this.engineType != null ? !this.engineType.equals(obj.getEngineType()) : obj.getEngineType() != null) return false; 										
		if(this.ip != null ? !this.ip.equals(obj.getIp()) : obj.getIp() != null) return false; 										
		if(this.cluster != null ? !this.cluster.equals(obj.getCluster()) : obj.getCluster() != null) return false; 										
		if(this.charset != null ? !this.charset.equals(obj.getCharset()) : obj.getCharset() != null) return false; 										
		if(this.ncharset != null ? !this.ncharset.equals(obj.getNcharset()) : obj.getNcharset() != null) return false; 					
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
