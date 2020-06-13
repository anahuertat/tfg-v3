package anahuerta.tfg.electronicsstorev3.persistence;

import anahuerta.tfg.electronicsstorev3.domain.Order;
import anahuerta.tfg.electronicsstorev3.domain.User;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
	//create user
	void createUser(User user);
	
	//get user's orders
	List<Order> getUserOrders(Integer user_id);

}
