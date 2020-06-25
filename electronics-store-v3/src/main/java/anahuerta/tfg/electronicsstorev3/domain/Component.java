package anahuerta.tfg.electronicsstorev3.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Component{
	@Id
	@GeneratedValue
	@Column(name = "reference")
	public Integer reference;
	
	@Column(name = "category")
	public String category;
	
	@Column(name = "name")
	public String name;
	
	@Column(name = "price")
	public Double price;
	
	@Column(name = "stock")
	public Integer stock;
	
	public Component() {
		reference = null;
		category = null;
		name = null;
		price = null;
		stock = null;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Integer getReference() {
		return reference;
	}
	
	public Integer getStock() {
		return stock;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		
		if(this.getClass() != o.getClass())
			return false;
		
		final Component c = (Component) o;
		if(!Objects.equals(this.name, c.name))
			return false;
			
		if(!Objects.equals(this.category, c.category))
			return false;
		
        if (!Objects.equals(this.price, c.price))
            return false;
        
        if (!Objects.equals(this.reference, c.reference))
            return false;
        
        if (!Objects.equals(this.stock, c.stock))
            return false;
        
        return true;
	}
}
