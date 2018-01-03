	
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




import com.tmax.prosync.dto.Elements;
import com.tmax.prosync.dto.SrcDbInfo;
import com.tmax.prosync.dto.TarDbInfo;




@com.tmax.proobject.core.DataObject
public class ConnectionsCreateOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ConnectionsCreateOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ConnectionsCreateOutput() {
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
	 * LogicalName : projectType
	 * Comments    : 
	 */		

	private String projectType = EMPTY_STRING;
	
			
	private boolean projectType_nullable = false;
	
	public boolean isNullableProjectType() {
		return this.projectType_nullable;
	}	
	
	private boolean projectType_invalidation = false;
	
	public void setInvalidationProjectType(boolean invalidation) { 
		this.projectType_invalidation = invalidation;
	}
	
	public boolean isInvalidationProjectType() {
		return this.projectType_invalidation;
	}
	
	private boolean projectType_modified = false;
	

	public boolean isModifiedProjectType() {
		return this.projectType_modified;
	}
	
	public void unModifiedProjectType() {
		this.projectType_modified = false;
	}

	public String getProjectType() {
		return projectType;
	}
	public String getNvlProjectType() {
		if(getProjectType() == null) {
			return  EMPTY_STRING;
		} else {
			return getProjectType();
		}
	}
	public void setProjectType(String projectType) {
		if(projectType == null) {
			this.projectType  = EMPTY_STRING;
		} else {
			this.projectType = projectType;
		}
		this.projectType_modified = true;
		this.isModified = true;
	}	
			

	/**
	 * LogicalName : elements
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.Elements> elements = new ArrayList<com.tmax.prosync.dto.Elements>(2);
	
	public List<com.tmax.prosync.dto.Elements> getElementsList() {
		return elements;
	}
	private boolean elements_invalidation = false;
	
	public void setInvalidationElements(boolean invalidation) { 
		this.elements_invalidation = invalidation;
	}
	
	public boolean isInvalidationElements() {
		return this.elements_invalidation;
	}
	
	private boolean elements_modified = false;
	
	public boolean isModifiedElements() {
		if(this.elements_modified) return true;
		for(int index=0; index < this.sizeElements(); index++) {
			if(this.getElements(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedElements() {
		this.elements_modified = false;
	}
	
	public void clearElements() {
		elements.clear();
		this.elements_modified = false;
	}
	
	public void ensureCapacityElements(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.Elements>)elements).ensureCapacity( minCapacity );	
	}	
	public void createElements(int _size) {
		((ArrayList<com.tmax.prosync.dto.Elements>)elements).ensureCapacity(_size);
		for(int i = elements.size(); i < _size; i++) {
			elements.add( new com.tmax.prosync.dto.Elements());
			this.elements_modified = true;
		}
	}
	public ConnectionsCreateOutput fillElements(int _index) {
		ensureCapacityElements(_index+1);
		for (int i = sizeElements(); i <  _index + 1; i++) {
			this.elements.add(i, new com.tmax.prosync.dto.Elements());
			this.elements_modified = true;
		}
		return this;
	}
	
	public int sizeElements() {
		return elements.size();
	}
	
	public com.tmax.prosync.dto.Elements[] getElements() {	
		return (com.tmax.prosync.dto.Elements[])elements.toArray(new com.tmax.prosync.dto.Elements[elements.size()]);
		}
	public com.tmax.prosync.dto.Elements getElements(int _index) {
		return (com.tmax.prosync.dto.Elements)elements.get(_index);
	}
	public void setElements(List<com.tmax.prosync.dto.Elements> elements) {
		this.elements.clear();
		if(elements == null) {
			return;
		} else {
			for(int i = 0, n=elements.size(); i < n; i++) {
				if( elements.get(i) == null ) {
					this.elements.add( new com.tmax.prosync.dto.Elements());					
				}
				else {
					this.elements.add(elements.get(i));
				}
			}
		}
		this.elements_modified = true;
		this.isModified = true;
	}
	
	public void setElements(com.tmax.prosync.dto.Elements[] elements) {
		this.elements.clear();
		if(elements == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.Elements>)this.elements).ensureCapacity(elements.length);
			for(int i = 0, n=elements.length; i < n; i++) {
				if( elements[i] == null ) {
					this.elements.add( new com.tmax.prosync.dto.Elements());					
				}
				else {
					this.elements.add(elements[i]);
				}
			}
		}
		this.elements_modified = true;
		this.isModified = true;
	}
	public void setElements(int _index, com.tmax.prosync.dto.Elements elements) {
		if(elements == null) {
			this.elements.set(_index,  new com.tmax.prosync.dto.Elements());
		} else {
			this.elements.set(_index, elements);
		}
		this.elements_modified = true;
		this.isModified = true;
	}				
		
	public void addElements(int _index, com.tmax.prosync.dto.Elements elements) {
		if(elements == null) {
			this.elements.add(_index,  new com.tmax.prosync.dto.Elements());
		} else {
			this.elements.add(_index, elements);
		}
		this.elements_modified = true;
		this.isModified = true;
	}
	public void addElements(com.tmax.prosync.dto.Elements elements) {
		if(elements == null) {
			this.elements.add( new com.tmax.prosync.dto.Elements());
		} else {
			this.elements.add(elements);
		}
		this.elements_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.Elements removeElements(int _index) {
		this.elements_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.Elements)this.elements.remove(_index);
	}

	/**
	 * LogicalName : srcDbInfo
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.SrcDbInfo> srcDbInfo = new ArrayList<com.tmax.prosync.dto.SrcDbInfo>(2);
	
	public List<com.tmax.prosync.dto.SrcDbInfo> getSrcDbInfoList() {
		return srcDbInfo;
	}
	private boolean srcDbInfo_invalidation = false;
	
	public void setInvalidationSrcDbInfo(boolean invalidation) { 
		this.srcDbInfo_invalidation = invalidation;
	}
	
	public boolean isInvalidationSrcDbInfo() {
		return this.srcDbInfo_invalidation;
	}
	
	private boolean srcDbInfo_modified = false;
	
	public boolean isModifiedSrcDbInfo() {
		if(this.srcDbInfo_modified) return true;
		for(int index=0; index < this.sizeSrcDbInfo(); index++) {
			if(this.getSrcDbInfo(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedSrcDbInfo() {
		this.srcDbInfo_modified = false;
	}
	
	public void clearSrcDbInfo() {
		srcDbInfo.clear();
		this.srcDbInfo_modified = false;
	}
	
	public void ensureCapacitySrcDbInfo(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.SrcDbInfo>)srcDbInfo).ensureCapacity( minCapacity );	
	}	
	public void createSrcDbInfo(int _size) {
		((ArrayList<com.tmax.prosync.dto.SrcDbInfo>)srcDbInfo).ensureCapacity(_size);
		for(int i = srcDbInfo.size(); i < _size; i++) {
			srcDbInfo.add( new com.tmax.prosync.dto.SrcDbInfo());
			this.srcDbInfo_modified = true;
		}
	}
	public ConnectionsCreateOutput fillSrcDbInfo(int _index) {
		ensureCapacitySrcDbInfo(_index+1);
		for (int i = sizeSrcDbInfo(); i <  _index + 1; i++) {
			this.srcDbInfo.add(i, new com.tmax.prosync.dto.SrcDbInfo());
			this.srcDbInfo_modified = true;
		}
		return this;
	}
	
	public int sizeSrcDbInfo() {
		return srcDbInfo.size();
	}
	
	public com.tmax.prosync.dto.SrcDbInfo[] getSrcDbInfo() {	
		return (com.tmax.prosync.dto.SrcDbInfo[])srcDbInfo.toArray(new com.tmax.prosync.dto.SrcDbInfo[srcDbInfo.size()]);
		}
	public com.tmax.prosync.dto.SrcDbInfo getSrcDbInfo(int _index) {
		return (com.tmax.prosync.dto.SrcDbInfo)srcDbInfo.get(_index);
	}
	public void setSrcDbInfo(List<com.tmax.prosync.dto.SrcDbInfo> srcDbInfo) {
		this.srcDbInfo.clear();
		if(srcDbInfo == null) {
			return;
		} else {
			for(int i = 0, n=srcDbInfo.size(); i < n; i++) {
				if( srcDbInfo.get(i) == null ) {
					this.srcDbInfo.add( new com.tmax.prosync.dto.SrcDbInfo());					
				}
				else {
					this.srcDbInfo.add(srcDbInfo.get(i));
				}
			}
		}
		this.srcDbInfo_modified = true;
		this.isModified = true;
	}
	
	public void setSrcDbInfo(com.tmax.prosync.dto.SrcDbInfo[] srcDbInfo) {
		this.srcDbInfo.clear();
		if(srcDbInfo == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.SrcDbInfo>)this.srcDbInfo).ensureCapacity(srcDbInfo.length);
			for(int i = 0, n=srcDbInfo.length; i < n; i++) {
				if( srcDbInfo[i] == null ) {
					this.srcDbInfo.add( new com.tmax.prosync.dto.SrcDbInfo());					
				}
				else {
					this.srcDbInfo.add(srcDbInfo[i]);
				}
			}
		}
		this.srcDbInfo_modified = true;
		this.isModified = true;
	}
	public void setSrcDbInfo(int _index, com.tmax.prosync.dto.SrcDbInfo srcDbInfo) {
		if(srcDbInfo == null) {
			this.srcDbInfo.set(_index,  new com.tmax.prosync.dto.SrcDbInfo());
		} else {
			this.srcDbInfo.set(_index, srcDbInfo);
		}
		this.srcDbInfo_modified = true;
		this.isModified = true;
	}				
		
	public void addSrcDbInfo(int _index, com.tmax.prosync.dto.SrcDbInfo srcDbInfo) {
		if(srcDbInfo == null) {
			this.srcDbInfo.add(_index,  new com.tmax.prosync.dto.SrcDbInfo());
		} else {
			this.srcDbInfo.add(_index, srcDbInfo);
		}
		this.srcDbInfo_modified = true;
		this.isModified = true;
	}
	public void addSrcDbInfo(com.tmax.prosync.dto.SrcDbInfo srcDbInfo) {
		if(srcDbInfo == null) {
			this.srcDbInfo.add( new com.tmax.prosync.dto.SrcDbInfo());
		} else {
			this.srcDbInfo.add(srcDbInfo);
		}
		this.srcDbInfo_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.SrcDbInfo removeSrcDbInfo(int _index) {
		this.srcDbInfo_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.SrcDbInfo)this.srcDbInfo.remove(_index);
	}

	/**
	 * LogicalName : tarDbInfo
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.TarDbInfo> tarDbInfo = new ArrayList<com.tmax.prosync.dto.TarDbInfo>(2);
	
	public List<com.tmax.prosync.dto.TarDbInfo> getTarDbInfoList() {
		return tarDbInfo;
	}
	private boolean tarDbInfo_invalidation = false;
	
	public void setInvalidationTarDbInfo(boolean invalidation) { 
		this.tarDbInfo_invalidation = invalidation;
	}
	
	public boolean isInvalidationTarDbInfo() {
		return this.tarDbInfo_invalidation;
	}
	
	private boolean tarDbInfo_modified = false;
	
	public boolean isModifiedTarDbInfo() {
		if(this.tarDbInfo_modified) return true;
		for(int index=0; index < this.sizeTarDbInfo(); index++) {
			if(this.getTarDbInfo(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedTarDbInfo() {
		this.tarDbInfo_modified = false;
	}
	
	public void clearTarDbInfo() {
		tarDbInfo.clear();
		this.tarDbInfo_modified = false;
	}
	
	public void ensureCapacityTarDbInfo(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.TarDbInfo>)tarDbInfo).ensureCapacity( minCapacity );	
	}	
	public void createTarDbInfo(int _size) {
		((ArrayList<com.tmax.prosync.dto.TarDbInfo>)tarDbInfo).ensureCapacity(_size);
		for(int i = tarDbInfo.size(); i < _size; i++) {
			tarDbInfo.add( new com.tmax.prosync.dto.TarDbInfo());
			this.tarDbInfo_modified = true;
		}
	}
	public ConnectionsCreateOutput fillTarDbInfo(int _index) {
		ensureCapacityTarDbInfo(_index+1);
		for (int i = sizeTarDbInfo(); i <  _index + 1; i++) {
			this.tarDbInfo.add(i, new com.tmax.prosync.dto.TarDbInfo());
			this.tarDbInfo_modified = true;
		}
		return this;
	}
	
	public int sizeTarDbInfo() {
		return tarDbInfo.size();
	}
	
	public com.tmax.prosync.dto.TarDbInfo[] getTarDbInfo() {	
		return (com.tmax.prosync.dto.TarDbInfo[])tarDbInfo.toArray(new com.tmax.prosync.dto.TarDbInfo[tarDbInfo.size()]);
		}
	public com.tmax.prosync.dto.TarDbInfo getTarDbInfo(int _index) {
		return (com.tmax.prosync.dto.TarDbInfo)tarDbInfo.get(_index);
	}
	public void setTarDbInfo(List<com.tmax.prosync.dto.TarDbInfo> tarDbInfo) {
		this.tarDbInfo.clear();
		if(tarDbInfo == null) {
			return;
		} else {
			for(int i = 0, n=tarDbInfo.size(); i < n; i++) {
				if( tarDbInfo.get(i) == null ) {
					this.tarDbInfo.add( new com.tmax.prosync.dto.TarDbInfo());					
				}
				else {
					this.tarDbInfo.add(tarDbInfo.get(i));
				}
			}
		}
		this.tarDbInfo_modified = true;
		this.isModified = true;
	}
	
	public void setTarDbInfo(com.tmax.prosync.dto.TarDbInfo[] tarDbInfo) {
		this.tarDbInfo.clear();
		if(tarDbInfo == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.TarDbInfo>)this.tarDbInfo).ensureCapacity(tarDbInfo.length);
			for(int i = 0, n=tarDbInfo.length; i < n; i++) {
				if( tarDbInfo[i] == null ) {
					this.tarDbInfo.add( new com.tmax.prosync.dto.TarDbInfo());					
				}
				else {
					this.tarDbInfo.add(tarDbInfo[i]);
				}
			}
		}
		this.tarDbInfo_modified = true;
		this.isModified = true;
	}
	public void setTarDbInfo(int _index, com.tmax.prosync.dto.TarDbInfo tarDbInfo) {
		if(tarDbInfo == null) {
			this.tarDbInfo.set(_index,  new com.tmax.prosync.dto.TarDbInfo());
		} else {
			this.tarDbInfo.set(_index, tarDbInfo);
		}
		this.tarDbInfo_modified = true;
		this.isModified = true;
	}				
		
	public void addTarDbInfo(int _index, com.tmax.prosync.dto.TarDbInfo tarDbInfo) {
		if(tarDbInfo == null) {
			this.tarDbInfo.add(_index,  new com.tmax.prosync.dto.TarDbInfo());
		} else {
			this.tarDbInfo.add(_index, tarDbInfo);
		}
		this.tarDbInfo_modified = true;
		this.isModified = true;
	}
	public void addTarDbInfo(com.tmax.prosync.dto.TarDbInfo tarDbInfo) {
		if(tarDbInfo == null) {
			this.tarDbInfo.add( new com.tmax.prosync.dto.TarDbInfo());
		} else {
			this.tarDbInfo.add(tarDbInfo);
		}
		this.tarDbInfo_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.TarDbInfo removeTarDbInfo(int _index) {
		this.tarDbInfo_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.TarDbInfo)this.tarDbInfo.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.topIds_modified = false;
		this.projectType_modified = false;
		this.elements_modified = false;
		this.srcDbInfo_modified = false;
		this.tarDbInfo_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.topIds_modified == true)
			modifiedFields.add("topIds");
		if(this.projectType_modified == true)
			modifiedFields.add("projectType");
		if(this.elements_modified == true)
			modifiedFields.add("elements");
		if(this.srcDbInfo_modified == true)
			modifiedFields.add("srcDbInfo");
		if(this.tarDbInfo_modified == true)
			modifiedFields.add("tarDbInfo");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ConnectionsCreateOutput copyObj = new ConnectionsCreateOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _connectionsCreateOutput) {
		if(this == _connectionsCreateOutput) return;
		ConnectionsCreateOutput __connectionsCreateOutput = (ConnectionsCreateOutput) _connectionsCreateOutput;
		
		this.setTopIds(__connectionsCreateOutput.getTopIds());
		this.setProjectType(__connectionsCreateOutput.getProjectType());
		this.clearElements();
		for (int index = 0; index < __connectionsCreateOutput.sizeElements(); index++) {
			this.addElements(index, (com.tmax.prosync.dto.Elements)__connectionsCreateOutput.getElements(index).clone());		
		}
		this.clearSrcDbInfo();
		for (int index = 0; index < __connectionsCreateOutput.sizeSrcDbInfo(); index++) {
			this.addSrcDbInfo(index, (com.tmax.prosync.dto.SrcDbInfo)__connectionsCreateOutput.getSrcDbInfo(index).clone());		
		}
		this.clearTarDbInfo();
		for (int index = 0; index < __connectionsCreateOutput.sizeTarDbInfo(); index++) {
			this.addTarDbInfo(index, (com.tmax.prosync.dto.TarDbInfo)__connectionsCreateOutput.getTarDbInfo(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("topIds : ").append(topIds).append("\n");				
		buffer.append("projectType : ").append(projectType).append("\n");		
		for (int index = 0; index < sizeElements(); index++) {

			buffer.append("elements(").append(index).append(") : ").append(getElements(index)).append(" ");
		}
		buffer.append("\n");
		for (int index = 0; index < sizeSrcDbInfo(); index++) {

			buffer.append("srcDbInfo(").append(index).append(") : ").append(getSrcDbInfo(index)).append(" ");
		}
		buffer.append("\n");
		for (int index = 0; index < sizeTarDbInfo(); index++) {

			buffer.append("tarDbInfo(").append(index).append(") : ").append(getTarDbInfo(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(5);
		fieldPropertyMap.put("topIds"
							, FieldPropertyFactory.getFieldProperty( "topIds","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 1024 , -1, null, null));		
		fieldPropertyMap.put("projectType"
							, FieldPropertyFactory.getFieldProperty( "projectType","", "", "", false, false, false,  FieldProperty.TYPE_OBJECT_STRING, 16 , -1, null, null));		
		fieldPropertyMap.put("elements"
							, FieldPropertyFactory.getFieldProperty( "elements","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.Elements"));		
		fieldPropertyMap.put("srcDbInfo"
							, FieldPropertyFactory.getFieldProperty( "srcDbInfo","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.SrcDbInfo"));		
		fieldPropertyMap.put("tarDbInfo"
							, FieldPropertyFactory.getFieldProperty( "tarDbInfo","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.TarDbInfo"));		
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
			case "projectType" : return getProjectType();
			case "elements" : return getElementsList();
			case "srcDbInfo" : return getSrcDbInfoList();
			case "tarDbInfo" : return getTarDbInfoList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "topIds" : setTopIds((String)arg);break;
			case "projectType" : setProjectType((String)arg);break;
			case "elements" : setElements((List<com.tmax.prosync.dto.Elements>)arg);break;
			case "srcDbInfo" : setSrcDbInfo((List<com.tmax.prosync.dto.SrcDbInfo>)arg);break;
			case "tarDbInfo" : setTarDbInfo((List<com.tmax.prosync.dto.TarDbInfo>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ConnectionsCreateOutput obj) {
		if (obj == this) return true;					
		if(this.topIds != null ? !this.topIds.equals(obj.getTopIds()) : obj.getTopIds() != null) return false; 										
		if(this.projectType != null ? !this.projectType.equals(obj.getProjectType()) : obj.getProjectType() != null) return false; 					
		if(this.elements.size() != obj.sizeElements()) return false;
		else {
			for(int i=0, n=this.elements.size(); i<n; i++ ){ 
				if(!this.getElements(i).equals(obj.getElements(i))) return false;
			}
		}
		if(this.srcDbInfo.size() != obj.sizeSrcDbInfo()) return false;
		else {
			for(int i=0, n=this.srcDbInfo.size(); i<n; i++ ){ 
				if(!this.getSrcDbInfo(i).equals(obj.getSrcDbInfo(i))) return false;
			}
		}
		if(this.tarDbInfo.size() != obj.sizeTarDbInfo()) return false;
		else {
			for(int i=0, n=this.tarDbInfo.size(); i<n; i++ ){ 
				if(!this.getTarDbInfo(i).equals(obj.getTarDbInfo(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
