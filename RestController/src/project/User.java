
	package project;
	
	import java.util.Objects;
	
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	
	@Entity
	class User {
	
	  private @Id @GeneratedValue Long id;
	  private String name;
	  private String role;
	
	  User() {}
	
	  User(String name, String role) {
	
	    this.name = name;
	    this.role = role;
	  }
	
	  public Long getId() {
	    return this.id;
	  }
	
	  public String getName() {
	    return this.name;
	  }
	
	  public String getRole() {
	    return this.role;
	  }
	
	  public void setId(Long id) {
	    this.id = id;
	  }
	
	  public void setName(String name) {
	    this.name = name;
	  }
	
	  public void setRole(String role) {
	    this.role = role;
	  }
}


