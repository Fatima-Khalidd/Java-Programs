public class Person
{
static int id=1;
String name;
int age;
int ID;

Person(String name, int age)
{
ID++;
this.name=name;
this.age=age;
}

public void Display()
{

System.out.println("ID:"+id+",Name:"+name+", Age:"+age);

}

}