
class Circle extends Graph2D {
	double r;
	double Ox, Oy;
	double pi = 3.1415926535;

	Circle(double Ox, double Oy, double r) {
		this.r = r;
		this.Ox = Ox;
		this.Oy = Oy;
	}

	public double area() {
		return (pi * r * r);
	}

	public String coordinate() {
		System.out.println("the Circle coordinate is : " + "(" + Ox + "," + Oy + ")");
		return null;
	}

	public double perimeter() {
		return (2 * pi * r);
	}

}
