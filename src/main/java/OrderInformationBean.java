import javax.faces.bean.ManagedBean;

@ManagedBean
public class OrderInformationBean {
	private int order;
	
	public int getOrder() {
		System.out.println("get");
		return order;
	}

	public void setOrder(int order) {
		System.out.println("set");
		this.order = order;
	}
	
}