package anahuerta.tfg.electronicsstorev3.persistence;

import org.springframework.data.repository.CrudRepository;
import anahuerta.tfg.electronicsstorev3.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{
	// create order
	void createOrder(Order order);
}
