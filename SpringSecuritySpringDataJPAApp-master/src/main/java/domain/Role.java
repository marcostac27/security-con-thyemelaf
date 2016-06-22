package domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
public class Role implements GrantedAuthority {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
	private Long id;

	String authority;

	@ManyToOne
	User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
