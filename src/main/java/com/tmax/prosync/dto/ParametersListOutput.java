	
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




import com.tmax.prosync.dto.Parameter;




@com.tmax.proobject.core.DataObject
public class ParametersListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ParametersListOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ParametersListOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : parameter
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.Parameter> parameter = new ArrayList<com.tmax.prosync.dto.Parameter>(2);
	
	public List<com.tmax.prosync.dto.Parameter> getParameterList() {
		return parameter;
	}
	private boolean parameter_invalidation = false;
	
	public void setInvalidationParameter(boolean invalidation) { 
		this.parameter_invalidation = invalidation;
	}
	
	public boolean isInvalidationParameter() {
		return this.parameter_invalidation;
	}
	
	private boolean parameter_modified = false;
	
	public boolean isModifiedParameter() {
		if(this.parameter_modified) return true;
		for(int index=0; index < this.sizeParameter(); index++) {
			if(this.getParameter(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedParameter() {
		this.parameter_modified = false;
	}
	
	public void clearParameter() {
		parameter.clear();
		this.parameter_modified = false;
	}
	
	public void ensureCapacityParameter(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.Parameter>)parameter).ensureCapacity( minCapacity );	
	}	
	public void createParameter(int _size) {
		((ArrayList<com.tmax.prosync.dto.Parameter>)parameter).ensureCapacity(_size);
		for(int i = parameter.size(); i < _size; i++) {
			parameter.add( new com.tmax.prosync.dto.Parameter());
			this.parameter_modified = true;
		}
	}
	public ParametersListOutput fillParameter(int _index) {
		ensureCapacityParameter(_index+1);
		for (int i = sizeParameter(); i <  _index + 1; i++) {
			this.parameter.add(i, new com.tmax.prosync.dto.Parameter());
			this.parameter_modified = true;
		}
		return this;
	}
	
	public int sizeParameter() {
		return parameter.size();
	}
	
	public com.tmax.prosync.dto.Parameter[] getParameter() {	
		return (com.tmax.prosync.dto.Parameter[])parameter.toArray(new com.tmax.prosync.dto.Parameter[parameter.size()]);
		}
	public com.tmax.prosync.dto.Parameter getParameter(int _index) {
		return (com.tmax.prosync.dto.Parameter)parameter.get(_index);
	}
	public void setParameter(List<com.tmax.prosync.dto.Parameter> parameter) {
		this.parameter.clear();
		if(parameter == null) {
			return;
		} else {
			for(int i = 0, n=parameter.size(); i < n; i++) {
				if( parameter.get(i) == null ) {
					this.parameter.add( new com.tmax.prosync.dto.Parameter());					
				}
				else {
					this.parameter.add(parameter.get(i));
				}
			}
		}
		this.parameter_modified = true;
		this.isModified = true;
	}
	
	public void setParameter(com.tmax.prosync.dto.Parameter[] parameter) {
		this.parameter.clear();
		if(parameter == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.Parameter>)this.parameter).ensureCapacity(parameter.length);
			for(int i = 0, n=parameter.length; i < n; i++) {
				if( parameter[i] == null ) {
					this.parameter.add( new com.tmax.prosync.dto.Parameter());					
				}
				else {
					this.parameter.add(parameter[i]);
				}
			}
		}
		this.parameter_modified = true;
		this.isModified = true;
	}
	public void setParameter(int _index, com.tmax.prosync.dto.Parameter parameter) {
		if(parameter == null) {
			this.parameter.set(_index,  new com.tmax.prosync.dto.Parameter());
		} else {
			this.parameter.set(_index, parameter);
		}
		this.parameter_modified = true;
		this.isModified = true;
	}				
		
	public void addParameter(int _index, com.tmax.prosync.dto.Parameter parameter) {
		if(parameter == null) {
			this.parameter.add(_index,  new com.tmax.prosync.dto.Parameter());
		} else {
			this.parameter.add(_index, parameter);
		}
		this.parameter_modified = true;
		this.isModified = true;
	}
	public void addParameter(com.tmax.prosync.dto.Parameter parameter) {
		if(parameter == null) {
			this.parameter.add( new com.tmax.prosync.dto.Parameter());
		} else {
			this.parameter.add(parameter);
		}
		this.parameter_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.Parameter removeParameter(int _index) {
		this.parameter_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.Parameter)this.parameter.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.parameter_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.parameter_modified == true)
			modifiedFields.add("parameter");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		ParametersListOutput copyObj = new ParametersListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _parametersListOutput) {
		if(this == _parametersListOutput) return;
		ParametersListOutput __parametersListOutput = (ParametersListOutput) _parametersListOutput;
		
		this.clearParameter();
		for (int index = 0; index < __parametersListOutput.sizeParameter(); index++) {
			this.addParameter(index, (com.tmax.prosync.dto.Parameter)__parametersListOutput.getParameter(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeParameter(); index++) {

			buffer.append("parameter(").append(index).append(") : ").append(getParameter(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("parameter"
							, FieldPropertyFactory.getFieldProperty( "parameter","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.Parameter"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "parameter" : return getParameterList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "parameter" : setParameter((List<com.tmax.prosync.dto.Parameter>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(ParametersListOutput obj) {
		if (obj == this) return true;
		if(this.parameter.size() != obj.sizeParameter()) return false;
		else {
			for(int i=0, n=this.parameter.size(); i<n; i++ ){ 
				if(!this.getParameter(i).equals(obj.getParameter(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
