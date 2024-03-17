public class Main
{


public static void main (String agrs[])
{

Human h1=new Human();

h1.setName("Fatima Khalid");
h1.setAge(19);
h1.setCountry("Pakistan");

String name=h1.getName();
int age= h1.getAge();
String country=h1.getCountry();

h1.display();
h1.test();

}
  
}