package ar.com.dag.rest.city;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.dag.rest.utils.GenericService;
import ar.com.dag.rest.utils.ServiceMap;
import ar.com.dag.rest.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.CITY_PATH)
public class CityService extends GenericService<CityEntidad, Long> implements ServiceMap{
	
	@Override
	public CityEntidad save(@RequestBody CityEntidad entity) {
		// TODO Auto-generated method stub
		return super.save(entity);
	}
	
	@Override
	public void update(@RequestBody CityEntidad entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}
	
	@Override
	public void delete(@RequestBody CityEntidad entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}
	
	@Override
	public CityEntidad getById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}
	
	@Override
	public List<CityEntidad> getAll() {
		// TODO Auto-generated method stub
		return super.getAll();
	}
	
	
}
