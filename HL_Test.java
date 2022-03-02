import java.util.Scanner;

public class HL_Test {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the graphics you want to manipulate : ");

		String graphics = scan.next();

		if ("Triangle".equals(graphics)) {
			Triangle_test T_t = new Triangle_test();
			T_t.Triangle_IO();
		} else if ("Circle".equals(graphics)) {
			Circle_test C_t = new Circle_test();
			C_t.Circle_IO();
		} else if ("Polygon".equals(graphics)) {
			Polygon_test P_t = new Polygon_test();
			P_t.Polygon_IO();
		} else {
			System.out.println("entered is malformed!");
			scan.close();
		}

	}
}
