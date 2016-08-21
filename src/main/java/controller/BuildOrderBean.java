package controller;

import javax.faces.bean.ManagedBean;

import dao.BuildItemDAO;
import dto.BuildOrderDto;

@ManagedBean(name = "buildOrderBean", eager = true)
public class BuildOrderBean {	 
	
	private BuildOrderDto data = new BuildOrderDto();
	
	public void add() {
		System.out.println("add");
		/*int n = 0;*/
		try {
			// 抓取食品訂單內容宣告
			String title = this.data.getTitle();
			String deadline =this.data.getDeadline() ;
			String itemNeedCounter=this.data.getItemNeedCounter();
			String itemInformation=this.data.getItemInformation();
			String itemName=this.data.getItemName();
			String money=this.data.getMoney();
			String counter=this.data.getCounter();
			String picture=this.data.getPicture();
			String userID=this.data.getUserID();

			// 新增食品
			String itemName2=this.data.getItemName2();
			String money2=this.data.getMoney2();
		/*	String counter2=this.data.getCounter2();*/
			String itemName3=this.data.getItemName3();
			String money3=this.data.getMoney3();
		/*	String counter3=this.data.getCounter3();*/
			String itemName4=this.data.getItemName4();
			String money4=this.data.getMoney4();
		/*	String counter4=this.data.getCounter4();*/
			// 只有1樣商品
			if (itemName2 == null && itemName3 == null && itemName4 == null) {

				/*n =*/ new BuildItemDAO().BuildOrder(title, itemInformation, deadline, itemName, itemNeedCounter, money,
						counter, userID, picture);

				// 兩樣商品
			} else if (itemName3 == null && itemName4 == null) {

				/*n =*/ new BuildItemDAO().BuildOrder2(title, itemInformation, deadline, itemName, itemNeedCounter, money,
						counter, userID, itemName2, money2, picture);

				// 三樣商品
			} else if (itemName4 == null) {

				/*n =*/ new BuildItemDAO().BuildOrder3(title, itemInformation, deadline, itemName, itemNeedCounter, money,
						counter, userID, itemName2, money2, itemName3, money3, picture);

				// 四樣商品
			} else {

				/*n =*/ new BuildItemDAO().BuildOrder4(title, itemInformation, deadline, itemName, itemNeedCounter, money,
						counter, userID, itemName2, money2, itemName3, money3, itemName4, money4, picture);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*	return n;*/
		return;
	}

	public BuildOrderDto getData() {
		return data;
	}

	public void setData(BuildOrderDto data) {
		this.data = data;
	}
  
}
