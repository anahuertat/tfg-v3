package anahuerta.tfg.electronicsstorev3.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	public Integer user_id;
	
	@Column(name = "name")
	public String name;
	
	@Column(name = "last_name")
	public String last_name;
	
	@Column(name = "address")
	public String address;
	
	@Column(name = "email")
	public String email;
	
	@Column(name = "password")
	public String password;
	
	@OneToMany(cascade = CascadeType.ALL)
    public List<Orders> orders;
	
	public User() {
		user_id = null;
		name = null;
		last_name = null;
		address = null;
		email = null;
		password = null;
		orders = null;
	}
	
	public Integer getUserId() {
		return user_id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}

}
