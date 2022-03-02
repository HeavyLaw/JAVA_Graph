import java.util.Scanner;

public class Polygon_test {

	public void Polygon_IO() {
		Point[] vertex = new Point[100];
		int pointNum;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			vertex[i] = new Point();
		}
		System.out.println("input the point number of the polygon:(Anticlockwise) ");
		pointNum = in.nextInt();
		for (int i = 0; i < pointNum; i++) {
			System.out.println("please put the " + (i + 1) + "th coordinate : (Anticlockwise)");
			vertex[i].x = in.nextDouble();
			vertex[i].y = in.nextDouble();
		}
		Graph2D p = new Polygon(vertex, pointNum);
		System.out.println("the Polygon area is : " + p.area());
		System.out.println("the Polygon coordinate is : " + p.coordinate());
		in.close();
	}
}
