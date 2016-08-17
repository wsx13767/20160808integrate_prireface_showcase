package controller;

import javax.faces.bean.ManagedBean;

import dao.RegisterDAO;
@ManagedBean(name="registerBean", eager= true )
public class RegisterBean {
	 private String account;
	 private String password;
	 private String name;
	 private String phone;
	 private String email;
	 
	 public void register(){
		 
		 try {
			new  RegisterDAO().Register(account,password,name,phone,email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("register");
		 return;
	 }

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
