package ar.com.dag.rest.statususer;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.dag.rest.utils.GenericService;
import ar.com.dag.rest.utils.ServiceMap;
import ar.com.dag.rest.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.STATUS_USER_PATH)
public class StatusUserService extends GenericService<StatusUserEntidad, Long> implements ServiceMap{

	@Override
	public StatusUserEntidad save(@RequestBody StatusUserEntidad entity) {
		// TODO Auto-generated method stub
		return super.save(entity);
	}
	
	@Override
	public void update(@RequestBody StatusUserEntidad entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}
	
	@Override
	public void delete(@RequestBody StatusUserEntidad entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}
	
	@Override
	public StatusUserEntidad getById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}
	
	@Override
	public List<StatusUserEntidad> getAll() {
		// TODO Auto-generated method stub
		return super.getAll();
	}
	
}
