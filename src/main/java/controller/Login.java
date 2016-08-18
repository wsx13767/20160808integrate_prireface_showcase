package controller;

import java.io.PrintWriter;
import javax.faces.bean.ManagedBean;

import dao.LoginCheckDAO;
import dao.UserDataDAO;
import model.UserData;

@ManagedBean(name = "login", eager = true)
public class Login{
	private String account;
    private String passwd;
    private String message;


	public String check() throws Exception{
	    	 boolean user = new LoginCheckDAO().FindIDPW(account, passwd);
	    	 if(user == true){
	    		 setMessage("Login Success");
		    	}else{
		    		setMessage("Login false");
		    	}
    	return message;
    }

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}