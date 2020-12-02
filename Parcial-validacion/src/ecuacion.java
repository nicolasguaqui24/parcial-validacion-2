
public class ecuacion {
	private double a;
	private double b;
	private double c;
	private double d;

	public ecuacion(double a) {
		this.a = a;
	}

	public ecuacion(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public ecuacion(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public ecuacion(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;

	}

	public double ecuacion1(double x) throws Exception {

		double p1 = this.a * Math.pow(x, 3);
		double p2 = this.b * x;
		double p3 = this.c;
		double p4 = d / x;

		return p1 + p2 + p3 + p4;

	}

	public double ecuacion2(double x) throws Exception {
		try {
			if (a >= 0) {

				double p1 = x * Math.sqrt(this.a);
				double p2 = this.b * x;
				double p3 = this.c;
				double p4 = d / x;

				return p1 + p2 + p3 + p4;
			} else {
				throw new Exception("El valor ingresado no es correcto");
			}
		} catch (Exception e) {
			throw e;
		}

	}
}