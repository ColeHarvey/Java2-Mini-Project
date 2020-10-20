package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class ListUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_Id")
	private int user_Id;
	@Column(name="FIRST_NAME")
	private String first_Name;
	@Column(name="LAST_NAME")
	private String last_Name;
	@Column(name="AGE")
	private String age;
	
	public ListUser() {
		super();
	}
	public ListUser(String first_Name, String last_Name, String age) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.age = age;
	}
	
	public ListUser(String first_Name, String last_Name) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
	}
	public ListUser(String first_Name) {
		super();
		this.first_Name = first_Name;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getFirstName() {
		return first_Name;
	}
	public void setFirstName(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLastName() {
		return last_Name;
	}
	public void setLastName(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [user_Id=" + user_Id + ", first_Name=" + first_Name + ", last_Name" + last_Name + "]";
	}
}
