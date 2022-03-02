import java.util.Scanner;

public class Triangle_test {

	// Triangle_test(){}

	public void Triangle_IO() {

		Scanner scan = new Scanner(System.in);

		System.out.println("please put the first coordinate : ");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		Point point1 = new Point(x1, y1);
		System.out.println("please put the second coordinate : ");
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		Point point2 = new Point(x2, y2);
		System.out.println("please put the third coordinate : ");
		double x3 = scan.nextDouble();
		double y3 = scan.nextDouble();
		Point point3 = new Point(x3, y3);
		Point[] vex = new Point[3];
		vex[0] = point1;
		vex[1] = point2;
		vex[2] = point3;
		Graph2D t = new Triangle(vex);
		System.out.println("the Triangle area is : " + t.area());
		System.out.println("the Triangle coordinate is : " + t.coordinate());
		System.out.println("the Triangle perimetre is : " + t.perimeter());
		scan.close();
	}

}
