public class Ellipse extends Geometry {
protected double a,b;
public Ellipse() {
	a = 0.0;
	b = 0.0;
}

public Ellipse(double a, double b) {
this.a = a;
this.b = b;
}

public double area() {
return pi * a*b;
}

public double circumference() {
return pi* (a+b);
}

public double getMinorAxis() {
return a;
}

public double getMajorAxis() {
return b;
}
