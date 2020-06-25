package anahuerta.tfg.electronicsstorev3.persistence.orders;

import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import anahuerta.tfg.electronicsstorev3.domain.Component;
import anahuerta.tfg.electronicsstorev3.domain.Orders;

public class OrdersRepositoryImpl implements OrdersRepositoryCustom{
	@PersistenceContext
	EntityManager entityManager;
	
	// create order
	public void createOrders(Orders order) {
		Iterator<Component> it = order.componentsInThisOrder.iterator();
		while(it.hasNext()) {
			Component c = it.next();
			Query query = entityManager.createNativeQuery("INSERT INTO Orders o (address, user_id, reference) VALUES (?,?,?)");
			query.setParameter(1, order.getAddress()+"%");
			query.setParameter(2, order.user.getUserId()+"%");
			query.setParameter(3, c.getReference()+"%");
		}
		
		
	}
}
