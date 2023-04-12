import java.util.*;
interface Area{
	public void Square();
	public void Circle();
	public void Rectangle();
	public void Triangle();
}

interface cicumference{
	public void Square();
}
public class shapeArea implements Area,Circumference{
	public void Circle()
{ 
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter the radius of the circle");
	double r = kb.nextInt();
	double areaOfCircle= 3.142 *r*r;
	System.out.println("Area of the circle is" + areaOfCircle);
}



public void Square()
{ 
	Scanner kb2 = new Scanner(System.in);
	System.out.println("Enter length of the side square");
	double s = kb2.nextInt();
	double areaOfSquare= s*s;
	System.out.println("Area of the Square is" + areaOfSquare);
}


public void Square()
{
	double a= 20.30,f;
	f= 4*a;
	System.out.println("Circumference Square"  + f);
}

public void Rectangle()
{ 
	Scanner kb3 = new Scanner(System.in);
	System.out.println("Enter the length of the rectangle");
	double l = kb3.nextInt();
	System.out.println("Enter the breadth of the rectangle");
	double b = kb3.nextInt();
	double areaOfRectangle= l*b;
	System.out.println("Area of the Rectangle is" + areaOfRectangle);
}

public void Triangle()
{ 
	Scanner kb4 = new Scanner(System.in);
	System.out.println("Enter the base of the triangle");
	double base = kb4.nextInt();
	System.out.println("Enter the height of the triangle");
	double h = kb4.nextInt();
	double areaOfTriangle = 0.5*base*h;
	System.out.println("Area of the circle is" + areaOfCircle);
}

public static void main(String[] args){
	shapeArea geometry = new shapeArea();
	geometry.Circle();
	geometry.Square();
	geometry.Rectangle();
	geometry.Triangle();
}
}

