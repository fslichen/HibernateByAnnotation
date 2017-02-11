package evolution;  

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;  

@Data
@Entity  
@Table(name= "employee")  
public class Employee {  
	@Id  
	private int id;  
	private String firstName;
	private String lastName;  
}  