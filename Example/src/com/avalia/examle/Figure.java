package com.avalia.examle;

abstract class Figure {
double dim1;
double dim2;
Figure(double a,double b){
	dim1=a;
	dim2=b;
}
abstract double area();}
class Rectangle extends Figure{
	public Rectangle(double a,double b) {
		super(a,b);
	}
	double area(){
	//System.out.println("area of rectangle");
	return dim1*dim2;
	}
}

class triangle extends Figure {
	triangle(double a,double b){
		super(a,b);
	}
	double area(){
		return dim1*dim2/2;
	}
}
class AbstractAreas{
	public static void main(String[] args){
		Rectangle r=new Rectangle(9,5);
		triangle t=new triangle(9,5);
		Figure f;
		f=r;
		System.out.println(f.area());
		f=t;
		System.out.println(f.area());
	}
}




