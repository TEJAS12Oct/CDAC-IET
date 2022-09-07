package Study.JpaRest.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@Column
	private String uname;
	
	@Column
	private String pass;

	public UserEntity(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}

	public UserEntity() {
		super();
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "UserEntity [uname=" + uname + ", pass=" + pass + "]";
	}
	
	
	
	
	
	
}
