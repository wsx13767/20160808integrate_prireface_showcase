package controller;

import dao.UserDataDA0;

public class AccountInfoBean {
	private String nName;
	public void up(){
		new UserDataDA0.updateName(user_id, nName);
	}
}
