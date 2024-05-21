package filehandling;
import java.io.Serializable;
public class entity implements Serializable {
	private String ename;
	private int id;
	private int sal;
	public entity(String ename, int id, int sal) {
		super();
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "entity [ename=" + ename + ", id=" + id + ", sal=" + sal + "]";
	}
}
