package ar.com.dag.rest.user;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.dag.rest.utils.GenericService;
import ar.com.dag.rest.utils.ServiceMap;
import ar.com.dag.rest.utils.ServicePath;

@RestController
@RequestMapping(path=ServicePath.USER_PATH)
public class UserService extends GenericService<UserEntidad, Long> implements ServiceMap{

	@Override
	public UserEntidad save(@RequestBody UserEntidad entity) {
		// TODO Auto-generated method stub
		return super.save(entity);
	}
	
	@Override
	public void update(@RequestBody UserEntidad entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}
	
	@Override
	public void delete(@RequestBody UserEntidad entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}
	
	@Override
	public UserEntidad getById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}
	
	@Override
	public List<UserEntidad> getAll() {
		// TODO Auto-generated method stub
		return super.getAll();
	}
	
}
