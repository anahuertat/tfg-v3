package anahuerta.tfg.electronicsstorev3.service;

import java.util.List;

import anahuerta.tfg.electronicsstorev3.domain.Component;
import anahuerta.tfg.electronicsstorev3.domain.Cart;

public interface ElectronicsStoreService {

	boolean addToCart(Integer reference);
	
	Cart checkout();
	
	List<Component> getCartItems();
	
	void confirm();

}
