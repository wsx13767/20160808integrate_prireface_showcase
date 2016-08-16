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
    
    public void check(){
	    // 判斷帳號密碼是否為NULL
	    if(account==null || passwd == null)
	    {  	sendRedirect("index.jsp");
	    	return;
	    }    
	    //查詢DB是否有帳號密碼 回傳 T or F
	    try {
	    	
	    	boolean n =  new LoginCheckDAO().FindIDPW(account, passwd);
	    	if(n){
	    		UserData userdata = new UserDataDAO().findByAccount(account);
	    	}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("success");
    }
    
    
    
    
    
    
	private void sendRedirect(String string) {
		// TODO Auto-generated method stub
		
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
}