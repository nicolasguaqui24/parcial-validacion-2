
public class prueba {

	public static void main(String[] args) throws Exception {
		try {

			ecuacion e1 = new ecuacion(0);
			ecuacion e2 = new ecuacion(1, -3);
			ecuacion e3 = new ecuacion(2, 9, 1);
			ecuacion e4 = new ecuacion(7, 2, 9);

			System.out.println("ecuacion1:" + e1.ecuacion1(7));
			System.out.println("ecuacion2:" + e2.ecuacion1(-1));
			System.out.println("ecuacion3:" + e3.ecuacion1(6));
			System.out.println("ecuacion4:" + e4.ecuacion1(1));

			ecuacion e5 = new ecuacion(-1);
			ecuacion e6 = new ecuacion(16, -4);
			ecuacion e7 = new ecuacion(9, -3, 0);
			ecuacion e8 = new ecuacion(4, 3, 0, 1);

			System.out.println("ecuacion6:" + e6.ecuacion2(1));
			System.out.println("ecuacion7:" + e7.ecuacion2(5));
			System.out.println("ecuacion8:" + e8.ecuacion2(0));
			System.out.println("ecuacion5:" + e5.ecuacion2(2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}