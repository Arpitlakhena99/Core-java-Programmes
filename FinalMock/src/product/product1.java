package product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
public class product1 {

	private boolean pid;
	private String pname;
	private double  price;
	private String color;
	private Date mfgDate;
	public product1(boolean pid, String pname, double price, String color, Date mfgDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.color = color;
		this.mfgDate = mfgDate;
	}
	public boolean isPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public double getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public Date getMfgDate() {
		return mfgDate;
	}
	@Override
	public String toString() {
		return "product1 [pid=" + pid + ", pname=" + pname + ", price=" + price + ", color=" + color + ", mfgDate="
				+ mfgDate + "]";
	}

	
}
