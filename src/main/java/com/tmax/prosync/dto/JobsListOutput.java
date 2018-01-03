	
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




import com.tmax.prosync.dto.Job;




@com.tmax.proobject.core.DataObject
public class JobsListOutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "JobsListOutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public JobsListOutput() {
			super();
			
	}	 
	
	private boolean isModified = false;

	/**
	 * LogicalName : job
	 * Comments    : 
	 */
	private List<com.tmax.prosync.dto.Job> job = new ArrayList<com.tmax.prosync.dto.Job>(2);
	
	public List<com.tmax.prosync.dto.Job> getJobList() {
		return job;
	}
	private boolean job_invalidation = false;
	
	public void setInvalidationJob(boolean invalidation) { 
		this.job_invalidation = invalidation;
	}
	
	public boolean isInvalidationJob() {
		return this.job_invalidation;
	}
	
	private boolean job_modified = false;
	
	public boolean isModifiedJob() {
		if(this.job_modified) return true;
		for(int index=0; index < this.sizeJob(); index++) {
			if(this.getJob(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedJob() {
		this.job_modified = false;
	}
	
	public void clearJob() {
		job.clear();
		this.job_modified = false;
	}
	
	public void ensureCapacityJob(int minCapacity) {
		((ArrayList<com.tmax.prosync.dto.Job>)job).ensureCapacity( minCapacity );	
	}	
	public void createJob(int _size) {
		((ArrayList<com.tmax.prosync.dto.Job>)job).ensureCapacity(_size);
		for(int i = job.size(); i < _size; i++) {
			job.add( new com.tmax.prosync.dto.Job());
			this.job_modified = true;
		}
	}
	public JobsListOutput fillJob(int _index) {
		ensureCapacityJob(_index+1);
		for (int i = sizeJob(); i <  _index + 1; i++) {
			this.job.add(i, new com.tmax.prosync.dto.Job());
			this.job_modified = true;
		}
		return this;
	}
	
	public int sizeJob() {
		return job.size();
	}
	
	public com.tmax.prosync.dto.Job[] getJob() {	
		return (com.tmax.prosync.dto.Job[])job.toArray(new com.tmax.prosync.dto.Job[job.size()]);
		}
	public com.tmax.prosync.dto.Job getJob(int _index) {
		return (com.tmax.prosync.dto.Job)job.get(_index);
	}
	public void setJob(List<com.tmax.prosync.dto.Job> job) {
		this.job.clear();
		if(job == null) {
			return;
		} else {
			for(int i = 0, n=job.size(); i < n; i++) {
				if( job.get(i) == null ) {
					this.job.add( new com.tmax.prosync.dto.Job());					
				}
				else {
					this.job.add(job.get(i));
				}
			}
		}
		this.job_modified = true;
		this.isModified = true;
	}
	
	public void setJob(com.tmax.prosync.dto.Job[] job) {
		this.job.clear();
		if(job == null) {
			return;
		} else {
			((ArrayList<com.tmax.prosync.dto.Job>)this.job).ensureCapacity(job.length);
			for(int i = 0, n=job.length; i < n; i++) {
				if( job[i] == null ) {
					this.job.add( new com.tmax.prosync.dto.Job());					
				}
				else {
					this.job.add(job[i]);
				}
			}
		}
		this.job_modified = true;
		this.isModified = true;
	}
	public void setJob(int _index, com.tmax.prosync.dto.Job job) {
		if(job == null) {
			this.job.set(_index,  new com.tmax.prosync.dto.Job());
		} else {
			this.job.set(_index, job);
		}
		this.job_modified = true;
		this.isModified = true;
	}				
		
	public void addJob(int _index, com.tmax.prosync.dto.Job job) {
		if(job == null) {
			this.job.add(_index,  new com.tmax.prosync.dto.Job());
		} else {
			this.job.add(_index, job);
		}
		this.job_modified = true;
		this.isModified = true;
	}
	public void addJob(com.tmax.prosync.dto.Job job) {
		if(job == null) {
			this.job.add( new com.tmax.prosync.dto.Job());
		} else {
			this.job.add(job);
		}
		this.job_modified = true;
		this.isModified = true;
	}
	public com.tmax.prosync.dto.Job removeJob(int _index) {
		this.job_modified = true;
		this.isModified = true;
		return (com.tmax.prosync.dto.Job)this.job.remove(_index);
	}

	@Override
	public void clearAllIsModified() {
		this.job_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.job_modified == true)
			modifiedFields.add("job");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	} 
	public Object clone() {
		JobsListOutput copyObj = new JobsListOutput();	
		copyObj.clone(this);
		return copyObj;
	}
	public void clone(DataObject _jobsListOutput) {
		if(this == _jobsListOutput) return;
		JobsListOutput __jobsListOutput = (JobsListOutput) _jobsListOutput;
		
		this.clearJob();
		for (int index = 0; index < __jobsListOutput.sizeJob(); index++) {
			this.addJob(index, (com.tmax.prosync.dto.Job)__jobsListOutput.getJob(index).clone());		
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		for (int index = 0; index < sizeJob(); index++) {

			buffer.append("job(").append(index).append(") : ").append(getJob(index)).append(" ");
		}
		buffer.append("\n");
		return buffer.toString();
	}
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("job"
							, FieldPropertyFactory.getFieldProperty( "job","", "", "", false, false, false, FieldProperty.TYPE_ABSTRACT_INCLUDE, 30 , -1, "2" , "com.tmax.prosync.dto.Job"));		
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "job" : return getJobList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}




	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "job" : setJob((List<com.tmax.prosync.dto.Job>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	

	public boolean equals(JobsListOutput obj) {
		if (obj == this) return true;
		if(this.job.size() != obj.sizeJob()) return false;
		else {
			for(int i=0, n=this.job.size(); i<n; i++ ){ 
				if(!this.getJob(i).equals(obj.getJob(i))) return false;
			}
		}
		return true;
	}
	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
