class Polygon extends Graph2D {
	double Area;
	double Perimeter;

	Polygon(Point vertex[], int pointNum) {
		int i = 0;
		double Area = 0;
		double Perimeter = 0;
		for (; i < pointNum - 1; i++) {
			Area = (vertex[i].x - vertex[i + 1].x) * (vertex[i].y - vertex[i + 1].y);
			Perimeter = Math.sqrt((vertex[i + 1].x - vertex[i].x) * (vertex[i + 1].x - vertex[i].x)
					+ (vertex[i + 1].y - vertex[i].y) * (vertex[i + 1].y - vertex[i].y));
		}
		Area += (vertex[i].x - vertex[0].x) * (vertex[i].y - vertex[0].y);
		Perimeter = Math.sqrt((vertex[i].x - vertex[0].x) * (vertex[i].x - vertex[0].x)
				+ (vertex[i].y - vertex[0].y) * (vertex[i].y - vertex[0].y));
		if (Area > 0) {
			this.Area = Area;
		} else {
			this.Area = -Area;
		}
		this.Perimeter = Perimeter;
	}

	public double area() {
		return (Area / 2);
	}

	public double perimeter() {
		return Perimeter;

	}

	public String coordinate() {
		return null;
	}
}