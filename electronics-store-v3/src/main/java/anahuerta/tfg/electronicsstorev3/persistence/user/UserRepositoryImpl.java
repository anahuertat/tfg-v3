package anahuerta.tfg.electronicsstorev3.persistence.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import anahuerta.tfg.electronicsstorev3.domain.Orders;
import anahuerta.tfg.electronicsstorev3.domain.User;

public class UserRepositoryImpl implements UserRepositoryCustom{
	@PersistenceContext
	EntityManager entityManager;
	
		
	//get user's orders
	public List<Orders> getOrdersById(Integer user_id){
		Query query = entityManager.createNativeQuery("SELECT * FROM User u WHERE u.user_id = ?");
		query.setParameter(1, user_id + "%");
		User u = (User) query.getResultList().get(0);
		return u.orders;
		
	}
}
