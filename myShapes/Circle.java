public class Circle extends Geometry{
	public double r;
	public Circle(){
		this.r = 1.0;
	}
	public Circle(double r){
		this.r = r;
	}
	public double area(){
		return pi*r*r;
	}
	public double circumference(){
		return 2*pi*r;
	}
	public double getRadius(){
		return r;
	}
}