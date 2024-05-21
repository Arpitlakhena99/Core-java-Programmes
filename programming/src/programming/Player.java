package programming;
public class Player
{
  
   String name;
   String team;
   int number;
  Player(String n, String t ,int num)
  {
   this.name=n;
   this.team=t;
   this.number=num;
  }
  public static void main (String []args)
  {
Player p1= new Player("Virat","RCB",18);
System.out.println(p1.name);
System.out.println(p1.team);
System.out.println(p1.number);
System.out.println();  
Player p2= new Player("MSD","CSK",7);
System.out.println(p2.name);
System.out.println(p2.team);
System.out.println(p2.number);
  }
}


