package anahuerta.tfg.electronicsstorev3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import anahuerta.tfg.electronicsstorev3.domain.Component;
import anahuerta.tfg.electronicsstorev3.domain.User;
import anahuerta.tfg.electronicsstorev3.domain.Cart;

@Service
public interface ElectronicsStoreService {

	boolean addToCart(Integer reference);
	
	Cart checkout();
	
	List<Component> getCartItems();
	
	void confirm();

	User login(String email, String password);

	boolean createUser(User user);

}
