import java.util.Scanner;

public class Circle_test {
	public void Circle_IO() {

		Scanner scan = new Scanner(System.in);

		System.out.println("please put the Circle center coordinate : ");
		double Ox = scan.nextDouble();
		double Oy = scan.nextDouble();
		System.out.println("please put the Circle radius : ");
		double r = scan.nextDouble();
		Graph2D c = new Circle(Ox, Oy, r);
		System.out.println("the Circle area is : " + c.area());
		c.coordinate();
		System.out.println("the Circle perimetre is : " + c.perimeter());
		scan.close();
	}
}
