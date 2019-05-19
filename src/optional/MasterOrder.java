package optional;

import java.util.ArrayList;

public class MasterOrder {

	private ArrayList<CookieOrder> orders;

	public ArrayList<CookieOrder> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<CookieOrder> cookie) {
		this.orders = cookie;
	}

	public MasterOrder() {
		this.orders = new ArrayList<CookieOrder>();
	}

	public void addOrder(CookieOrder cookie) {
		this.orders.add(cookie);
	}

	public int getTotalBoxes() {
		int count = 0;
		for (CookieOrder cookie : orders)
			count += cookie.getNumBoxes();
		return count;
	}

	public int removeVariety(String cookieVar) {
		int count = 0;
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getVariety().equals(cookieVar)) {
				count += orders.get(i).getNumBoxes();
				orders.remove(i);
				i--;
			}
		}
		return count;
	}
}
