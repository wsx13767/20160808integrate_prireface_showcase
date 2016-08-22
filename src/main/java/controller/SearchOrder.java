package controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import dao.BuildItemDAO;
import model.SearchFoodModel;

@ManagedBean(name = "searchOrder", eager = true)
@RequestScoped
public class SearchOrder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6802367492985958181L;
	private String foodName;
	private List<SearchFoodModel> list;
	/*private BuildItemDAO dao;*/
	/* private SearchFoodModel item; */

	public void searchAction() {
		try {
			list = new BuildItemDAO().findBySearch(foodName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list.get(0).getName());
		return;
	}

/*	protected BuildItemDAO getDao() throws Exception {
		this.dao = new BuildItemDAO();
		return dao;
	}*/

	/*
	 * public SearchFoodModel getItem() { return item; }
	 * 
	 * 
	 * public void setItem(SearchFoodModel item) { this.item = item; }
	 */

	public void setList(List<SearchFoodModel> list) {
		this.list = list;
	}

	public List<SearchFoodModel> getList() {
		return list;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
}