package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.BuildItemDAO;
import model.SearchFoodModel;

@ManagedBean(name = "searchOrder", eager = true)
public class SearchOrder{
	private String foodName;
	private List<SearchFoodModel> list;
	
	public List<SearchFoodModel> getList(){
		System.out.println("display");
		try {
			list = new BuildItemDAO().findBySearch(foodName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 return  list;
	}

	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}	
	}