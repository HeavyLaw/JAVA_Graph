
class Triangle extends Graph2D {

	double Area;
	double Perimeter;
	Point vertex[];

	Triangle(Point vertex[]) {
		double Area = 0;
		double Perimeter = 0;
		double a, b, c, S = 0;
		a = Math.sqrt((vertex[1].x - vertex[0].x) * (vertex[1].x - vertex[0].x)
				+ (vertex[1].y - vertex[0].y) * (vertex[1].y - vertex[0].y));
		b = Math.sqrt((vertex[2].x - vertex[1].x) * (vertex[2].x - vertex[1].x)
				+ (vertex[2].y - vertex[1].y) * (vertex[2].y - vertex[1].y));
		c = Math.sqrt((vertex[0].x - vertex[2].x) * (vertex[0].x - vertex[2].x)
				+ (vertex[0].y - vertex[2].y) * (vertex[0].y - vertex[2].y));

		Perimeter = a + b + c;
		S = Perimeter / 2;
		Area = Math.sqrt(S * (S - a) * (S - b) * (S - c));

		this.Area = Area;
		this.Perimeter = Perimeter;
		this.vertex = vertex;
	}

	public double area() {
		return (this.Area);
	}

	public String coordinate() {
		int i = 0;
		String coordinates = new String("");
		for (; i < 3; i++) {
			coordinates += "(" + vertex[i].x + "," + vertex[i].y + ")   ";
		}
		return coordinates;
	}

	public double perimeter() {
		return (this.Perimeter);
	}
}