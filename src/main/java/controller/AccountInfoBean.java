package controller;

import javax.faces.bean.ManagedBean;

import dao.UserDataDAO;
@ManagedBean(name="accountInfoBean", eager=true)
public class AccountInfoBean {
	private String nName;

	public String up() throws Exception{
		new UserDataDAO().updateName(1,"dd");
		return nName;
	}
}
