package programming;
class Arpit1 
{
    int x = 10;

    void test() {
        System.out.println("running test method");
    }
}

class Arpit2 extends Arpit1 
{
    int y = 20;

    void disp() {
        System.out.println("running disp method");
    }
    public static void main(String[] args) 
    {
        Arpit2 d1 = new Arpit2();
        System.out.println("x value is " + d1.x);
        d1.test();
        System.out.println("y value is " + d1.y);
        d1.disp();
        System.out.println("main method ended");
    }
}


