public class Parabel{
	
	private double a;
	private double b;
	private double c;
	
	public Parabel(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getC(){
		return c;
	}
	
	public double berechneExtremStelleX() {
		return -b / (2*a);
	}
	
	public double berechneExtremWertY() {
		double x = berechneExtremStelleX();
		return a*x*x + b*x +c;
	}
	
	public double[] berechneNullstellen() {
		double diskriminante = ( (b*b) / (4*a*a) ) - (c/a);
		
		if(diskriminante > 0) {
			double x1 = (-b/(2*a) + Math.sqrt(diskriminante));
			double x2 = (-b/(2*a) - Math.sqrt(diskriminante));
			return new double[] {x1,x2};
		}
		else if(diskriminante == 0) {
			double x = -b/(2*a);
			return new double[] {x};
		}
		else {
			return new double[]{};
		}
	}
	
	@Override
	public String toString(){
		return "Parabel: y = " +a+ "x^2 + " +b+ "x + " +c;
	}
}