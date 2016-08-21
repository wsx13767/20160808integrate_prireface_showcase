package controller;

import javax.faces.bean.ManagedBean;

import dao.UserDataDAO;
@ManagedBean(name="accountInfoBean", eager=true)
public class AccountInfoBean {
	private String nName;
	UserDataDAO dao = null;
	public String up() throws Exception{
		dao = new UserDataDAO();
		dao.updateName(1,"dd");
		return nName;
	}
}
