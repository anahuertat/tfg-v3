package anahuerta.tfg.electronicsstorev3.persistence.user;

import java.util.List;

import anahuerta.tfg.electronicsstorev3.domain.Orders;
import anahuerta.tfg.electronicsstorev3.domain.User;

public interface UserRepositoryCustom {
		
	List<Orders> getOrdersById(Integer user_id);
}
