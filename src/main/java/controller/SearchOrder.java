package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;

import dao.BuildItemDAO;
import model.SearchFoodModel;




@ManagedBean(name = "searchOrder", eager = true)
@ViewScoped
public class SearchOrder{
	private String foodName;
	private List<SearchFoodModel> list;
	private SearchFoodModel item;
	public List<SearchFoodModel> getList() throws Exception{
		 list = new BuildItemDAO().findBySearch(foodName);
		 for 
		 item = ""
		 return list; 
	}
	
	
	
	
	
	
	
	
	
/*	public SearchFoodModel getItem() {
		return item;
	}


	public void setItem(SearchFoodModel item) {
		this.item = item;
	}
*/








	public void setList(List<SearchFoodModel> list) {
		this.list = list;
	}









	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}	
	}