package ar.com.dag.rest.statususer;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import ar.com.dag.rest.utils.BaseEntidad;

@Entity
@Table(name="status_user")
@AttributeOverride(name="id",column=@Column(name="id"))
public class StatusUserEntidad extends BaseEntidad<Long> implements Serializable{
	private static final long serialVersionUID=4L;
	
	@Column(name="status",nullable=false)
	private int status;

	public StatusUserEntidad() {
		super();
	}

	public StatusUserEntidad(int status) {
		super();
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
