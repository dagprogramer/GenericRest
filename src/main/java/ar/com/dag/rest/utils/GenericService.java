package ar.com.dag.rest.utils;



import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class GenericService<T extends BaseEntidad<ID>,ID extends Serializable> {

	private final Logger LOGGER=Logger.getLogger(getClass());
	
	@Autowired
	protected JpaRepository<T, ID>jpaRepository;
	
	@RequestMapping(method=RequestMethod.POST)
	public T save(@RequestBody T entity){
		this.LOGGER.info(String.format("saving entity", entity));
		return this.jpaRepository.save(entity);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void update(@RequestBody T entity){
		this.LOGGER.info(String.format("updating entiy", entity));
		if(entity.getId()==null){
			this.LOGGER.error(String.format("id cannot be null", entity.getClass()));
		}
		this.jpaRepository.save(entity);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void delete(@RequestBody T entity){
		this.LOGGER.info(String.format("deleting entity", entity));
		this.jpaRepository.delete(entity);
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.GET)
	public T getById(@PathVariable ID id){
		this.LOGGER.info(String.format("getting entity by id", id));
		if(id==null){
			this.LOGGER.error(String.format("id not exists", id));
			return null;
		}
		return this.jpaRepository.findOne(id);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<T> getAll(){
		 List<T> lista = this.jpaRepository.findAll();
		 this.LOGGER.info(lista);
		 return lista;
	}
	
	
}
