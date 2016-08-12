
import javax.faces.bean.ManagedBean;





/**
 * Servlet implementation class buildOrderServlet
 */
/**
 * @author wsx13
 *
 */
@ManagedBean
public class buildOrderServletBean {
	//抓取食品訂單內容宣告
	private String food;
	public String getFood() {
		System.out.println("success");
		return food;
	}
	public void setFood(String food) {
		System.out.println("display");
		this.food = food;
	}
	
}
		
		
		
		
		
	
		

	
