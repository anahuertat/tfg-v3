package anahuerta.tfg.electronicsstorev3.domain;

import java.util.List;

import java.util.ArrayList;

public class Cart {
	
	List<Integer> cartItemsReferences = new ArrayList<Integer>();
	
	public void addToCartByRef(Integer reference) {
		cartItemsReferences.add(reference);
	}
	
	public List<Integer> getCartItemsReferences(){
		return cartItemsReferences;
	}
    
    /*public void addToCartByRef(Integer reference) {
        Component component = getComponentByRef(reference);
        addToCart(component);
    }*/

    /*private Component getComponentByRef(Integer reference) {
        Component component = null;
        ComponentRepository cRepository;
        component = cRepository.findComponentByReference(reference);
        return component;
    }*/

    /*private void addToCart(Component component) {
    		cartItems.add(component);
    }*/

    /*public void removeComponentByRef(Integer reference) {
        Component c = getComponentByRef(reference);
        cartItems.remove(c);
    }*/

   /* public void printCartItems() {
        for (Component c: cartItems) {
            System.out.println(c.getName());
        }
    }*/
    
    /*public List<Component> getCartItems() {
    		return cartItems;
    }*/
}
