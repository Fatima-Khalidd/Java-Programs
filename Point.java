public class Point
{
private int x;
private int y;

Point(int x , int y)
{
this.x=x;
this.y=y;

}

// Set methods

public void setX(int x)
{
this.x=x;
}

public void setY(int y)
{
this.y=y;
}
// get methods

public int getX()
{
return x;
}

public int getY()
{
return y;
}



public String toString()
{
return String.format("%d %d",x,y);
}

// equals method
public boolean equals( Object ob)
{

Point p=(Point)ob;
return this.x==p.x&& this.y==p.y;
}

}