public class Rectangle
{

private int length;
private int width;
private Point top_left;

Rectangle(Point top_left , int length , int width)
{
this.top_left=top_left;
this.length=length;
this.width=width;


}

// copy constructor

Rectangle(Rectangle r)
{
this.top_left=r.top_left;
this.length=r.length;
this.width=r.width;

}

// set methods 

public void setLength(int length)
{
this.length=length;
}

public void setWidth(int width)
{
this.width=width;
}

public void setPoint(Point top_left)
{
this.top_left=top_left;
}

// get methods 

public int getLength()
{
return length;
}

public int getWidth()
{
return width;
}

public Point getPoint()
{
return top_left;
}

// equals method

public boolean equals( Object obj)
{

Rectangle r=(Rectangle)obj;
return this.length==r.length&& this.width==r.length;
}

// to string method

public String toString()
{
 
return String.format("%d %d",length,width);

}

// is_small function

public int isSmall(Rectangle r2)
{

if(this.length>r2.length){
 System.out.println("Rectangle 1 has greater length");
}
else 
 System.out.println("Rectangle 2 has greater length");


return 1;
}



}