package dto;

public class BuildOrderDrinkDto {
	// 抓取飲料內容宣告
	private String title;
	private String deadline;
	private String itemNeedCounter;
	private String itemInformation;
	private String itemName;
	private String bigMoney;
	private String midMoney;
	private String smallMoney;
	private String counter;
	private String userID;
	private String picture;
	private String[] ice;
	private String[] sugar;
	private String[] size;
	// 冰塊字串宣告
	private String iceString;

	public String iceString() {
		if (ice.length == 1) {
			iceString = ice[0];
		} else if (ice.length == 2) {
			iceString = ice[0] + "/" + ice[1];
		} else if (ice.length == 3) {
			iceString = ice[0] + "/" + ice[1] + "/" + ice[2];
		} else if (ice.length == 4) {
			iceString = ice[0] + "/" + ice[1] + "/" + ice[2] + "/" + ice[3];
		} else if (ice.length == 5) {
			iceString = ice[0] + "/" + ice[1] + "/" + ice[2] + "/" + ice[3] + "/" + ice[4];
		}
		return iceString;
	}

	// 甜度字串宣告
	private String sugarString;

	public String sugarString() {
		if (sugar.length == 1) {
			sugarString = sugar[0];
		} else if (sugar.length == 2) {
			sugarString = sugar[0] + "/" + sugar[1];
		} else if (sugar.length == 3) {
			sugarString = sugar[0] + "/" + sugar[1] + "/" + sugar[2];
		} else if (sugar.length == 4) {
			sugarString = sugar[0] + "/" + sugar[1] + "/" + sugar[2] + "/" + sugar[3];
		} else if (sugar.length == 5) {
			sugarString = sugar[0] + "/" + sugar[1] + "/" + sugar[2] + "/" + sugar[3] + "/" + sugar[4];
		}
		return sugarString;
	}

	// 大小字串宣告
	private String sizeString;

	public String sizeString() {
		if (size.length == 1) {
			sizeString = size[0];
		} else if (size.length == 2) {
			sizeString = size[0] + "/" + size[1];
		} else if (size.length == 3) {
			sizeString = size[0] + "/" + size[1] + "/" + size[2];
		}
		return sizeString;
	}

	// 新增飲品2
	private String itemName2;
	private String bigMoney2;
	private String midMoney2;
	private String smallMoney2;
	private String counter2;
	private String[] ice2;
	private String[] sugar2;
	private String[] size2;
	// 冰塊字串宣告
	private String iceString2;

	public String iceString2() {
		if (ice2 != null) {
			if (ice2.length == 1) {
				iceString2 = ice2[0];
			} else if (ice2.length == 2) {
				iceString2 = ice2[0] + "/" + ice2[1];
			} else if (ice2.length == 3) {
				iceString2 = ice2[0] + "/" + ice2[1] + "/" + ice2[2];
			} else if (ice2.length == 4) {
				iceString2 = ice2[0] + "/" + ice2[1] + "/" + ice2[2] + "/" + ice2[3];
			} else if (ice2.length == 5) {
				iceString2 = ice2[0] + "/" + ice2[1] + "/" + ice2[2] + "/" + ice2[3] + "/" + ice2[4];
			}
		}
		return iceString2;
	}

	// //甜度字串宣告
	private String sugarString2;
	public String sugarSring2(){
	if(sugar2!=null)
	{
		if (sugar2.length == 1) {
			sugarString2 = sugar2[0];
		} else if (sugar2.length == 2) {
			sugarString2 = sugar2[0] + "/" + sugar2[1];
		} else if (sugar2.length == 3) {
			sugarString2 = sugar2[0] + "/" + sugar2[1] + "/" + sugar2[2];
		} else if (sugar2.length == 4) {
			sugarString2 = sugar2[0] + "/" + sugar2[1] + "/" + sugar2[2] + "/" + sugar2[3];
		} else if (sugar2.length == 5) {
			sugarString2 = sugar2[0] + "/" + sugar2[1] + "/" + sugar2[2] + "/" + sugar2[3] + "/" + sugar2[4];
		}
	}
	return sugarString2;
	}
	// 大小字串宣告
	private String sizeString2;
	public String sizeString2(){
	if(size2!=null)
	{
		if (size2.length == 1) {
			sizeString2 = size2[0];
		} else if (size2.length == 2) {
			sizeString2 = size2[0] + "/" + size2[1];
		} else if (size2.length == 3) {
			sizeString2 = size2[0] + "/" + size2[1] + "/" + size2[2];
		}
	}
	return sizeString2;
	}

	// 新增飲品3
	private String itemName3;
	private String bigMoney3;
	private String midMoney3;
	private String smallMoney3;
	private String counter3;
	private String[] ice3;
	private String[] sugar3 ;
	private String[] size3;
	// 冰塊字串宣告
	private String iceString3;
	public String iceString3(){
	if(ice3!=null)
	{
		if (ice3.length == 1) {
			iceString3 = ice3[0];
		} else if (ice3.length == 2) {
			iceString3 = ice3[0] + "/" + ice3[1];
		} else if (ice3.length == 3) {
			iceString3 = ice3[0] + "/" + ice3[1] + "/" + ice3[2];
		} else if (ice3.length == 4) {
			iceString3 = ice3[0] + "/" + ice3[1] + "/" + ice3[2] + "/" + ice3[3];
		} else if (ice3.length == 5) {
			iceString3 = ice3[0] + "/" + ice3[1] + "/" + ice3[2] + "/" + ice3[3] + "/" + ice3[4];
		}
	}
	return iceString3;
	}
	// 甜度字串宣告
	private String sugarString3;
	public String sugarString3(){
	if(sugar3!=null)
	{
		if (sugar3.length == 1) {
			sugarString3 = sugar3[0];
		} else if (sugar3.length == 2) {
			sugarString3 = sugar3[0] + "/" + sugar3[1];
		} else if (sugar3.length == 3) {
			sugarString3 = sugar3[0] + "/" + sugar3[1] + "/" + sugar3[2];
		} else if (sugar3.length == 4) {
			sugarString3 = sugar3[0] + "/" + sugar3[1] + "/" + sugar3[2] + "/" + sugar3[3];
		} else if (sugar3.length == 5) {
			sugarString3 = sugar3[0] + "/" + sugar3[1] + "/" + sugar3[2] + "/" + sugar3[3] + "/" + sugar3[4];
		}
	}
	return sugarString3;
	}
	// 大小字串宣告
	private String sizeString3;
	public String sizeString3(){
	if(size3!=null)
	{
		if (size3.length == 1) {
			sizeString3 = size3[0];
		} else if (size3.length == 2) {
			sizeString3 = size3[0] + "/" + size3[1];
		} else if (size3.length == 3) {
			sizeString3 = size3[0] + "/" + size3[1] + "/" + size3[2];
		}
	}
	return sizeString3; 
	}

	// 新增飲品4
	private String itemName4;
	private String bigMoney4;
	private String midMoney4;
	private String smallMoney4;
	private String counter4;
	private String[] ice4;
	private String[] sugar4;
	private String[] size4;
	// 冰塊字串宣告
	private String iceString4;
	public String iceString4(){
	if(ice4!=null)
	{
		if (ice4.length == 1) {
			iceString4 = ice4[0];
		} else if (ice4.length == 2) {
			iceString4 = ice4[0] + "/" + ice4[1];
		} else if (ice4.length == 3) {
			iceString4 = ice4[0] + "/" + ice4[1] + "/" + ice4[2];
		} else if (ice4.length == 4) {
			iceString4 = ice4[0] + "/" + ice4[1] + "/" + ice4[2] + "/" + ice4[3];
		} else if (ice4.length == 5) {
			iceString4 = ice4[0] + "/" + ice4[1] + "/" + ice4[2] + "/" + ice4[3] + "/" + ice4[4];
		}
	}
	return iceString4;
	}
	// 甜度字串宣告
	private String sugarString4;
	public String sugarString4(){
	if(sugar4!=null)
	{
		if (sugar4.length == 1) {
			sugarString4 = sugar4[0];
		} else if (sugar4.length == 2) {
			sugarString4 = sugar4[0] + "/" + sugar4[1];
		} else if (sugar4.length == 3) {
			sugarString4 = sugar4[0] + "/" + sugar4[1] + "/" + sugar4[2];
		} else if (sugar4.length == 4) {
			sugarString4 = sugar4[0] + "/" + sugar4[1] + "/" + sugar4[2] + "/" + sugar4[3];
		} else if (sugar4.length == 5) {
			sugarString4 = sugar4[0] + "/" + sugar4[1] + "/" + sugar4[2] + "/" + sugar4[3] + "/" + sugar4[4];
		}
	}
	return sugarString4;
	}
	// 大小字串宣告
	private String sizeString4;
	public String sizeString4(){
	if(size4!=null)
	{
		if (size4.length == 1) {
			sizeString4 = size4[0];
		} else if (size4.length == 2) {
			sizeString4 = size4[0] + "/" + size4[1];
		} else if (size4.length == 3) {
			sizeString4 = size4[0] + "/" + size4[1] + "/" + size4[2];
		}
	}
	return sizeString4;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getItemNeedCounter() {
		return itemNeedCounter;
	}
	public void setItemNeedCounter(String itemNeedCounter) {
		this.itemNeedCounter = itemNeedCounter;
	}
	public String getItemInformation() {
		return itemInformation;
	}
	public void setItemInformation(String itemInformation) {
		this.itemInformation = itemInformation;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getBigMoney() {
		return bigMoney;
	}
	public void setBigMoney(String bigMoney) {
		this.bigMoney = bigMoney;
	}
	public String getMidMoney() {
		return midMoney;
	}
	public void setMidMoney(String midMoney) {
		this.midMoney = midMoney;
	}
	public String getSmallMoney() {
		return smallMoney;
	}
	public void setSmallMoney(String smallMoney) {
		this.smallMoney = smallMoney;
	}
	public String getCounter() {
		return counter;
	}
	public void setCounter(String counter) {
		this.counter = counter;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String[] getIce() {
		return ice;
	}
	public void setIce(String[] ice) {
		this.ice = ice;
	}
	public String[] getSugar() {
		return sugar;
	}
	public void setSugar(String[] sugar) {
		this.sugar = sugar;
	}
	public String[] getSize() {
		return size;
	}
	public void setSize(String[] size) {
		this.size = size;
	}
	public String getIceString() {
		return iceString;
	}
	public void setIceString(String iceString) {
		this.iceString = iceString;
	}
	public String getSugarString() {
		return sugarString;
	}
	public void setSugarString(String sugarString) {
		this.sugarString = sugarString;
	}
	public String getSizeString() {
		return sizeString;
	}
	public void setSizeString(String sizeString) {
		this.sizeString = sizeString;
	}
	public String getItemName2() {
		return itemName2;
	}
	public void setItemName2(String itemName2) {
		this.itemName2 = itemName2;
	}
	public String getBigMoney2() {
		return bigMoney2;
	}
	public void setBigMoney2(String bigMoney2) {
		this.bigMoney2 = bigMoney2;
	}
	public String getMidMoney2() {
		return midMoney2;
	}
	public void setMidMoney2(String midMoney2) {
		this.midMoney2 = midMoney2;
	}
	public String getSmallMoney2() {
		return smallMoney2;
	}
	public void setSmallMoney2(String smallMoney2) {
		this.smallMoney2 = smallMoney2;
	}
	public String getCounter2() {
		return counter2;
	}
	public void setCounter2(String counter2) {
		this.counter2 = counter2;
	}
	public String[] getIce2() {
		return ice2;
	}
	public void setIce2(String[] ice2) {
		this.ice2 = ice2;
	}
	public String[] getSugar2() {
		return sugar2;
	}
	public void setSugar2(String[] sugar2) {
		this.sugar2 = sugar2;
	}
	public String[] getSize2() {
		return size2;
	}
	public void setSize2(String[] size2) {
		this.size2 = size2;
	}
	public String getIceString2() {
		return iceString2;
	}
	public void setIceString2(String iceString2) {
		this.iceString2 = iceString2;
	}
	public String getSugarString2() {
		return sugarString2;
	}
	public void setSugarString2(String sugarString2) {
		this.sugarString2 = sugarString2;
	}
	public String getSizeString2() {
		return sizeString2;
	}
	public void setSizeString2(String sizeString2) {
		this.sizeString2 = sizeString2;
	}
	public String getItemName3() {
		return itemName3;
	}
	public void setItemName3(String itemName3) {
		this.itemName3 = itemName3;
	}
	public String getBigMoney3() {
		return bigMoney3;
	}
	public void setBigMoney3(String bigMoney3) {
		this.bigMoney3 = bigMoney3;
	}
	public String getMidMoney3() {
		return midMoney3;
	}
	public void setMidMoney3(String midMoney3) {
		this.midMoney3 = midMoney3;
	}
	public String getSmallMoney3() {
		return smallMoney3;
	}
	public void setSmallMoney3(String smallMoney3) {
		this.smallMoney3 = smallMoney3;
	}
	public String getCounter3() {
		return counter3;
	}
	public void setCounter3(String counter3) {
		this.counter3 = counter3;
	}
	public String[] getIce3() {
		return ice3;
	}
	public void setIce3(String[] ice3) {
		this.ice3 = ice3;
	}
	public String[] getSugar3() {
		return sugar3;
	}
	public void setSugar3(String[] sugar3) {
		this.sugar3 = sugar3;
	}
	public String[] getSize3() {
		return size3;
	}
	public void setSize3(String[] size3) {
		this.size3 = size3;
	}
	public String getIceString3() {
		return iceString3;
	}
	public void setIceString3(String iceString3) {
		this.iceString3 = iceString3;
	}
	public String getSugarString3() {
		return sugarString3;
	}
	public void setSugarString3(String sugarString3) {
		this.sugarString3 = sugarString3;
	}
	public String getSizeString3() {
		return sizeString3;
	}
	public void setSizeString3(String sizeString3) {
		this.sizeString3 = sizeString3;
	}
	public String getItemName4() {
		return itemName4;
	}
	public void setItemName4(String itemName4) {
		this.itemName4 = itemName4;
	}
	public String getBigMoney4() {
		return bigMoney4;
	}
	public void setBigMoney4(String bigMoney4) {
		this.bigMoney4 = bigMoney4;
	}
	public String getMidMoney4() {
		return midMoney4;
	}
	public void setMidMoney4(String midMoney4) {
		this.midMoney4 = midMoney4;
	}
	public String getSmallMoney4() {
		return smallMoney4;
	}
	public void setSmallMoney4(String smallMoney4) {
		this.smallMoney4 = smallMoney4;
	}
	public String getCounter4() {
		return counter4;
	}
	public void setCounter4(String counter4) {
		this.counter4 = counter4;
	}
	public String[] getIce4() {
		return ice4;
	}
	public void setIce4(String[] ice4) {
		this.ice4 = ice4;
	}
	public String[] getSugar4() {
		return sugar4;
	}
	public void setSugar4(String[] sugar4) {
		this.sugar4 = sugar4;
	}
	public String[] getSize4() {
		return size4;
	}
	public void setSize4(String[] size4) {
		this.size4 = size4;
	}
	public String getIceString4() {
		return iceString4;
	}
	public void setIceString4(String iceString4) {
		this.iceString4 = iceString4;
	}
	public String getSugarString4() {
		return sugarString4;
	}
	public void setSugarString4(String sugarString4) {
		this.sugarString4 = sugarString4;
	}
	public String getSizeString4() {
		return sizeString4;
	}
	public void setSizeString4(String sizeString4) {
		this.sizeString4 = sizeString4;
	}
	
	
}
