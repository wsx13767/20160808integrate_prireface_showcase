package controller;

import javax.faces.bean.ManagedBean;

import dao.BuildItemDAO;
import dto.BuildOrderDrinkDto;

@ManagedBean(name = "buildOrderDrink", eager = true)
public class BuildOrderDrink {
	BuildOrderDrinkDto data = new BuildOrderDrinkDto();
	
	public BuildOrderDrinkDto getData() {
		return data;
	}
	
	public void setData(BuildOrderDrinkDto data) {
		this.data = data;
	}
	
	public int insert(){
		System.out.println("aa");
		try{
			String itemInformation =this.data.getItemInformation();
			String title =this.data.getTitle();
			String deadline = this.data.getDeadline();
			String userID = this.data.getUserID();
			String itemNeedCounter = this.data.getItemNeedCounter();
			String bigMoney = this.data.getBigMoney();
			String bigMoney2 = this.data.getBigMoney2();
			String bigMoney3 = this.data.getBigMoney3();
			String bigMoney4 = this.data.getBigMoney4();
			String midMoney = this.data.getMidMoney();
			String midMoney2 = this.data.getMidMoney2();
			String midMoney3 = this.data.getMidMoney3();
			String midMoney4 = this.data.getMidMoney4();
			String smallMoney = this.data.getSmallMoney();
			String smallMoney2 = this.data.getSmallMoney2();
			String smallMoney3 = this.data.getSmallMoney3();
			String smallMoney4 = this.data.getSmallMoney4();
			String counter = this.data.getCounter();
			String counter2 = this.data.getCounter2();
			String counter3 = this.data.getCounter3();
			String counter4 = this.data.getCounter4();
			String iceString = this.data.getIceString();
			String iceString2 = this.data.getIceString2();
			String iceString3 = this.data.getIceString3();
			String iceString4 = this.data.getIceString4();
			String sugarString = this.data.getSugarString();
			String sugarString2 = this.data.getSugarString2();
			String sugarString3 = this.data.getSugarString3();
			String sugarString4 = this.data.getSugarString4();
			String sizeString = this.data.getSizeString();
			String sizeString2 = this.data.getSizeString2();
			String sizeString3 = this.data.getSizeString3();
			String sizeString4 = this.data.getSizeString4();
			String picture = this.data.getPicture();
			String itemName = this.data.getItemName();
			String itemName2=this.data.getItemName2();
			String itemName3=this.data.getItemName3();
			String itemName4=this.data.getItemName4();

		if(itemName2 ==null && itemName3 == null && itemName4 ==null){
			new BuildItemDAO().BuildOrderDrink(itemInformation,title,deadline,userID,itemName,itemNeedCounter,bigMoney,midMoney,smallMoney,counter,iceString,sugarString,sizeString,picture);
		//兩樣商品
		}else if(itemName3 == null && itemName4 ==null){   
			new BuildItemDAO().BuildOrderDrink2(itemInformation,title,deadline,userID,itemName,itemNeedCounter,bigMoney,midMoney,smallMoney,counter,iceString,sugarString,sizeString,itemName2,bigMoney2,midMoney2,smallMoney2,iceString2,sugarString2,sizeString2,picture);
			
		//三樣商品
		}else if(itemName4 == null){
			new BuildItemDAO().BuildOrderDrink3(itemInformation,title,deadline,userID,itemName,itemNeedCounter,bigMoney,midMoney,smallMoney,counter,iceString,sugarString,sizeString,itemName2,bigMoney2,midMoney2,smallMoney2,iceString2,sugarString2,sizeString2,itemName3,bigMoney3,midMoney3,smallMoney3,iceString3,sugarString3,sizeString3,picture);
				
		//四樣商品
		}else{            
			new BuildItemDAO().BuildOrderDrink4(itemInformation,title,deadline,userID,itemName,itemNeedCounter,bigMoney,midMoney,smallMoney,counter,iceString,sugarString,sizeString,itemName2,bigMoney2,midMoney2,smallMoney2,iceString2,sugarString2,sizeString2,itemName3,bigMoney3,midMoney3,smallMoney3,iceString3,sugarString3,sizeString3,itemName4,bigMoney4,midMoney4,smallMoney4,iceString4,sugarString4,sizeString4,picture);
		}
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
