package ar.com.dag.rest.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;


import org.hibernate.engine.internal.Cascade;
import org.springframework.beans.factory.annotation.Autowired;

import ar.com.dag.rest.city.CityEntidad;
import ar.com.dag.rest.statususer.StatusUserEntidad;
import ar.com.dag.rest.utils.BaseEntidad;

@Entity
@Table(name="user")
@AttributeOverride(name="id",column=@Column(name="id"))
public class UserEntidad extends BaseEntidad<Long> implements Serializable{

	private static final long serialVersionUID=2L;
	
	@Column(name="name",length=45,nullable=false)
	private String name;
	
	@Column(name="email",length=45,nullable=false)
	private String email;
	
	@Column(name="password",length=45,nullable=false)
	private String password;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="city_id",nullable=false)
	private CityEntidad cityEntidad;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="status_user_id",nullable=false)
	private StatusUserEntidad statusUserEntidad;
	
	public UserEntidad() {
		super();
	}

	public UserEntidad(String name, String email, String password, CityEntidad cityEntidad,
			StatusUserEntidad statusUserEntidad) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.cityEntidad = cityEntidad;
		this.statusUserEntidad = statusUserEntidad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CityEntidad getCityEntidad() {
		return cityEntidad;
	}

	public void setCityEntidad(CityEntidad cityEntidad) {
		this.cityEntidad = cityEntidad;
	}

	public StatusUserEntidad getStatusUserEntidad() {
		return statusUserEntidad;
	}

	public void setStatusUserEntidad(StatusUserEntidad statusUserEntidad) {
		this.statusUserEntidad = statusUserEntidad;
	}
	
	
	
}
