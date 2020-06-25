package anahuerta.tfg.electronicsstorev3.persistence.orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anahuerta.tfg.electronicsstorev3.domain.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>, OrdersRepositoryCustom{
	
	
}
