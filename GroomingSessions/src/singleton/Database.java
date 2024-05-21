package singleton;

public class Database {
private static Database obj;
private Database() {
	
}
public static Database getInstance()
{
	if(obj==null) {
		obj=new Database();
	}
	return obj;
}
public static void getConnection()
{
	System.out.println("Connected to Database");
}
}
