package ar.com.dag.rest.utils;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class BaseEntidad<ID extends Serializable> extends AbstractPersistable<ID>{
	private static final long serialVersionUID=1L;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	@Override
	protected void setId(ID id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	
	@JsonIgnore
	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return null==this.getId();
	}

}
