package optional;

public class CookieOrder {

	private String variety;
	private int numBoxes;

	public CookieOrder(String variety, int numBoxes) {
		this.variety = variety;
		this.numBoxes = numBoxes;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public int getNumBoxes() {
		return numBoxes;
	}

	public void setNumBoxes(int numBoxes) {
		this.numBoxes = numBoxes;
	}

}
