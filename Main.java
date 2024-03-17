public class Main
{

public static void main(String args[])

{

Point p1=new Point(2,4);
Rectangle r1=new Rectangle(p1,2,4);
Rectangle r2=new Rectangle(p1,3,4);

System.out.println(r1);
System.out.println(p1);

int result=r1.isSmall(r2);
}

}