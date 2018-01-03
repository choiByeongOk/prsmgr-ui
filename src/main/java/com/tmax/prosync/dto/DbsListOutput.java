	
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




import com.tmax.prosync.dto.SourceDbs;
import com.tmax.prosync.dto.TargetDbs;




@com.tmax.proobject.core.DataObject
public class DbsListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "DbsListOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public DbsListOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : sourceDbs
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.SourceDbs> sourceDbs = new ArrayList<com.tmax.prosync.dto.SourceDbs>(2);
	
	public List<com.tmax.prosync.dto.SourceDbs> getSourceDbsList() {
		return sourceDbs;
	}
	private boolean sourceDbs_invalidation = false;
	
	public void setInvalidationSourceDbs(boolean invalidation) { 
		this.sourceDbs_invalidation = invalidation;
	}
	
	public boolean isInvalidationSourceDbs() {
		return this.sourceDbs_invalidation;
	}
	
	private boolean sourceDbs_modified = false;
	
	public boolean isModifiedSourceDbs() {
		if(this.sourceDbs_modified) return true;
		for(int index=0; index < this.sizeSourceDbs(); index++) {
			if(this.getSourceDbs(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedSourceDbs() {
		this.sourceDbs_modified = false;
	}
	
	public void clearSourceDbs() {
		sourceDbs.clear();
		this.sourceDbs_modified = false;
	}
	
	public void ensureCapacitySourceDbs(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.SourceDbs>)sourceDbs).ensureCapacity( minCapacity );	
	}	
	public void createSourceDbs(int _size) {
		((ArrayList<com.tmax.prosync.dto.SourceDbs>)sourceDbs).ensureCapacity(_size);
		for(int i = sourceDbs.size(); i < _size; i++) {
			sourceDbs.add( new com.tmax.prosync.dto.SourceDbs());
			this.sourceDbs_modified = true;
		}
	}
	public DbsListOutput fillSourceDbs(int _index) {
		ensureCapacitySourceDbs(_index+1);
		for (int i = sizeSourceDbs(); i <  _index + 1; i++) {
			this.sourceDbs.add(i, new com.tmax.prosync.dto.SourceDbs());
			this.sourceDbs_modified = true;
		}
		return this;
	}
	
	public int sizeSourceDbs() {
		return sourceDbs.size();
	}
	
	public com.tmax.prosync.dto.SourceDbs[] getSourceDbs() {	
		return (com.tmax.prosync.dto.SourceDbs[])sourceDbs.toArray(new com.tmax.prosync.dto.SourceDbs[sourceDbs.size()]);
		}
	public com.tmax.prosync.dto.SourceDbs getSourceDbs(int _index) {
		return (com.tmax.prosync.dto.SourceDbs)sourceDbs.get(_index);
	}
	public void setSourceDbs(List<com.tmax.prosync.dto.SourceDbs> sourceDbs) {
		this.sourceDbs.clear();
		if(sourceDbs == null) {
			return;
		} else {
			for(int i = 0, n=sourceDbs.size(); i < n; i++) {
				if( sourceDbs.get(i) == null ) {
					this.sourceDbs.add( new com.tmax.prosync.dto.SourceDbs());					
				}
				else {
					this.sourceDbs.add(sourceDbs.get(i));
				}
			}
		}
		this.sourceDbs_modified = true;
		this.isModified = true;
	}
	
	public void setSourceDbs(com.tmax.prosync.dto.SourceDbs[] sourceDbs) {
		this.sourceDbs.clear();
		if(sourceDbs == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.SourceDbs>)this.sourceDbs).ensureCapacity(sourceDbs.length);
			for(int i = 0, n=sourceDbs.length; i < n; i++) {
				if( sourceDbs[i] == null ) {
					this.sourceDbs.add( new com.tmax.prosync.dto.SourceDbs());					
				}
				else {
					this.sourceDbs.add(sourceDbs[i]);
				}
			}
		}
		this.sourceDbs_modified = true;
		this.isModified = true;
	}
	public void setSourceDbs(int _index, com.tmax.prosync.dto.SourceDbs sourceDbs) {
		if(sourceDbs == null) {
			this.sourceDbs.set(_index,  new com.tmax.prosync.dto.SourceDbs());
		} else {
			this.sourceDbs.set(_index, sourceDbs);
		}
		this.sourceDbs_modified = true;
		this.isModified = true;
	}				
		
	public void addSourceDbs(int _index, com.tmax.prosync.dto.SourceDbs sourceDbs) {
		if(sourceDbs == null) {
			this.sourceDbs.add(_index,  new com.tmax.prosync.dto.SourceDbs());
		} else {
			this.sourceDbs.add(_index, sourceDbs);
		}
		this.sourceDbs_modified = true;
		this.isModified = true;
	}
	public void addSourceDbs(com.tmax.prosync.dto.SourceDbs sourceDbs) {
		if(sourceDbs == null) {
			this.sourceDbs.add( new com.tmax.prosync.dto.SourceDbs());
		} else {
			this.sourceDbs.add(sourceDbs);
		}
		this.sourceDbs_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.SourceDbs removeSourceDbs(int _index) {
		this.sourceDbs_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.SourceDbs)this.sourceDbs.remove(_index);
	}

	/**
	 * LogicalName : targetDbs
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.TargetDbs> targetDbs = new ArrayList<com.tmax.prosync.dto.TargetDbs>(2);
	
	public List<com.tmax.prosync.dto.TargetDbs> getTargetDbsList() {
		return targetDbs;
	}
	private boolean targetDbs_invalidation = false;
	
	public void setInvalidationTargetDbs(boolean invalidation) { 
		this.targetDbs_invalidation = invalidation;
	}
	
	public boolean isInvalidationTargetDbs() {
		return this.targetDbs_invalidation;
	}
	
	private boolean targetDbs_modified = false;
	
	public boolean isModifiedTargetDbs() {
		if(this.targetDbs_modified) return true;
		for(int index=0; index < this.sizeTargetDbs(); index++) {
			if(this.getTargetDbs(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedTargetDbs() {
		this.targetDbs_modified = false;
	}
	
	public void clearTargetDbs() {
		targetDbs.clear();
		this.targetDbs_modified = false;
	}
	
	public void ensureCapacityTargetDbs(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.TargetDbs>)targetDbs).ensureCapacity( minCapacity );	
	}	
	public void createTargetDbs(int _size) {
		((ArrayList<com.tmax.prosync.dto.TargetDbs>)targetDbs).ensureCapacity(_size);
		for(int i = targetDbs.size(); i < _size; i++) {
			targetDbs.add( new com.tmax.prosync.dto.TargetDbs());
			this.targetDbs_modified = true;
		}
	}
	public DbsListOutput fillTargetDbs(int _index) {
		ensureCapacityTargetDbs(_index+1);
		for (int i = sizeTargetDbs(); i <  _index + 1; i++) {
			this.targetDbs.add(i, new com.tmax.prosync.dto.TargetDbs());
			this.targetDbs_modified = true;
		}
		return this;
	}
	
	public int sizeTargetDbs() {
		return targetDbs.size();
	}
	
	public com.tmax.prosync.dto.TargetDbs[] getTargetDbs() {	
		return (com.tmax.prosync.dto.TargetDbs[])targetDbs.toArray(new com.tmax.prosync.dto.TargetDbs[targetDbs.size()]);
		}
	public com.tmax.prosync.dto.TargetDbs getTargetDbs(int _index) {
		return (com.tmax.prosync.dto.TargetDbs)targetDbs.get(_index);
	}
	public void setTargetDbs(List<com.tmax.prosync.dto.TargetDbs> targetDbs) {
		this.targetDbs.clear();
		if(targetDbs == null) {
			return;
		} else {
			for(int i = 0, n=targetDbs.size(); i < n; i++) {
				if( targetDbs.get(i) == null ) {
					this.targetDbs.add( new com.tmax.prosync.dto.TargetDbs());					
				}
				else {
					this.targetDbs.add(targetDbs.get(i));
				}
			}
		}
		this.targetDbs_modified = true;
		this.isModified = true;
	}
	
	public void setTargetDbs(com.tmax.prosync.dto.TargetDbs[] targetDbs) {
		this.targetDbs.clear();
		if(targetDbs == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.TargetDbs>)this.targetDbs).ensureCapacity(targetDbs.length);
			for(int i = 0, n=targetDbs.length; i < n; i++) {
				if( targetDbs[i] == null ) {
					this.targetDbs.add( new com.tmax.prosync.dto.TargetDbs());					
				}
				else {
					this.targetDbs.add(targetDbs[i]);
				}
			}
		}
		this.targetDbs_modified = true;
		this.isModified = true;
	}
	public void setTargetDbs(int _index, com.tmax.prosync.dto.TargetDbs targetDbs) {
		if(targetDbs == null) {
			this.targetDbs.set(_index,  new com.tmax.prosync.dto.TargetDbs());
		} else {
			this.targetDbs.set(_index, targetDbs);
		}
		this.targetDbs_modified = true;
		this.isModified = true;
	}				
		
	public void addTargetDbs(int _index, com.tmax.prosync.dto.TargetDbs targetDbs) {
		if(targetDbs == null) {
			this.targetDbs.add(_index,  new com.tmax.prosync.dto.TargetDbs());
		} else {
			this.targetDbs.add(_index, targetDbs);
		}
		this.targetDbs_modified = true;
		this.isModified = true;
	}
	public void addTargetDbs(com.tmax.prosync.dto.TargetDbs targetDbs) {
		if(targetDbs == null) {
			this.targetDbs.add( new com.tmax.prosync.dto.TargetDbs());
		} else {
			this.targetDbs.add(targetDbs);
		}
		this.targetDbs_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.TargetDbs removeTargetDbs(int _index) {
		this.targetDbs_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.TargetDbs)this.targetDbs.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.sourceDbs_modified = false;
		this.targetDbs_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.sourceDbs_modified == true)
			modifiedFields.add("sourceDbs");
		if(this.targetDbs_modified == true)
			modifiedFields.add("targetDbs");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		DbsListOutput copyObj = new DbsListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _dbsListOutput) {
		if(this == _dbsListOutput) return;
		DbsListOutput __dbsListOutput = (DbsListOutput) _dbsListOutput;
		
		this.clearSourceDbs();
		for (int index = 0; index < __dbsListOutput.sizeSourceDbs(); index++) {
			this.addSourceDbs(index, (com.tmax.prosync.dto.SourceDbs)__dbsListOutput.getSourceDbs(index).clone());		
		}
		this.clearTargetDbs();
		for (int index = 0; index < __dbsListOutput.sizeTargetDbs(); index++) {
			this.addTargetDbs(index, (com.tmax.prosync.dto.TargetDbs)__dbsListOutput.getTargetDbs(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeSourceDbs(); index++) {

			buffer.append("sourceDbs(").append(index).append(") : ").append(getSourceDbs(index)).append(" ");
		}
		buffer.append("\n");
		for (int index = 0; index < sizeTargetDbs(); index++) {

			buffer.append("targetDbs(").append(index).append(") : ").append(getTargetDbs(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(2);
		fieldPropertyMap.put("sourceDbs"
							, FieldPropertyFactory.getFieldProperty( "sourceDbs","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.SourceDbs"));		
		fieldPropertyMap.put("targetDbs"
							, FieldPropertyFactory.getFieldProperty( "targetDbs","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.TargetDbs"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "sourceDbs" : return getSourceDbsList();
			case "targetDbs" : return getTargetDbsList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "sourceDbs" : setSourceDbs((List<com.tmax.prosync.dto.SourceDbs>)arg);break;
			case "targetDbs" : setTargetDbs((List<com.tmax.prosync.dto.TargetDbs>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(DbsListOutput obj) {
		if (obj == this) return true;
		if(this.sourceDbs.size() != obj.sizeSourceDbs()) return false;
		else {
			for(int i=0, n=this.sourceDbs.size(); i<n; i++ ){ 
				if(!this.getSourceDbs(i).equals(obj.getSourceDbs(i))) return false;
			}
		}
		if(this.targetDbs.size() != obj.sizeTargetDbs()) return false;
		else {
			for(int i=0, n=this.targetDbs.size(); i<n; i++ ){ 
				if(!this.getTargetDbs(i).equals(obj.getTargetDbs(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
