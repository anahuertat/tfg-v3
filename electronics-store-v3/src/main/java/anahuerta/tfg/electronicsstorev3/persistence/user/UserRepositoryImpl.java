package anahuerta.tfg.electronicsstorev3.persistence.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import anahuerta.tfg.electronicsstorev3.domain.Orders;
import anahuerta.tfg.electronicsstorev3.domain.User;
import anahuerta.tfg.electronicsstorev3.domain.request.RequestSignUp;

public class UserRepositoryImpl implements UserRepositoryCustom{
	@PersistenceContext
	EntityManager entityManager;
	
	//get user's orders
	public List<Orders> getOrdersById(Integer user_id){
		Query query = entityManager.createNativeQuery("SELECT * FROM User u WHERE u.user_id = ?");
		query.setParameter(1, user_id);
		User u = (User) query.getResultList().get(0);
		return u.orders;
	}

	@Transactional
	public int createUser(RequestSignUp requestSignUp) {
		entityManager.createNativeQuery("INSERT INTO User (email, name, last_name, password, address) VALUES (?,?,?,?,?)")
			.setParameter(1, requestSignUp.getEmail())
			.setParameter(2, requestSignUp.getName())
			.setParameter(3, requestSignUp.getLastName())
			.setParameter(4, requestSignUp.getPassword())
			.setParameter(5, requestSignUp.getAddress())
			.executeUpdate();
		return 0;
	}
	

	/*@Transactional
	public int createUser(RequestSignUp requestSignUp) {
		entityManager.createNativeQuery("INSERT INTO User (email, name, last_name, password, address) VALUES (?,?,?,?,?)")
			.setParameter(1, requestSignUp.getEmail())
			.setParameter(2, requestSignUp.getName())
			.setParameter(3, requestSignUp.getLastName())
			.setParameter(4, requestSignUp.getPassword())
			.setParameter(5, requestSignUp.getAddress())
			.executeUpdate();
		return 0;
	}*/
	
	
	
}
