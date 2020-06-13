package anahuerta.tfg.electronicsstorev3.persistence;

import anahuerta.tfg.electronicsstorev3.domain.Component;
import org.springframework.data.repository.CrudRepository;

public interface ComponentRepository extends CrudRepository<Component, Integer>{
	//get stock of a component
	int getStockByReference(Integer reference);
	
	//update stock of a component
	void updateStockByReference(Integer reference);
	
	//get component
	Component findComponentById(Integer reference);
}
