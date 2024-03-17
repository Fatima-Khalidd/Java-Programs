public class Human
{

private String name;
private int age;
private String country;

{
System.out.println("This is 1st non-static method");

}


static
{
System.out.println("This is static method");
}

{

System.out.println("This is non-static method");

}
// set methods

public void setName(String name)
{

this.name=name;

}

public void setAge(int age)
{
this.age=age;
}

public void setCountry(String country)
{
this.country=country;
}

// get methods

public String getName()
{
return name;
}

public int getAge()
{
return age;
}

public String getCountry()
{
return country;
}

public void display()
{

System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Country:"+country);

}


public static void test()
{
System.out.println("This is private method");
}






}