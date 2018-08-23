package ar.com.dag.rest.city;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;

import ar.com.dag.rest.user.UserEntidad;
import ar.com.dag.rest.utils.BaseEntidad;

@Entity
@Table(name="city")
@AttributeOverride(name="id",column=@Column(name="id"))
public class CityEntidad extends BaseEntidad<Long> implements Serializable{
	private static final long serialVersionUID=3L;
	
	@Column(name="name",length=45,nullable=false)
    private String name;

	public CityEntidad() {
		super();
	}

	public CityEntidad(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
