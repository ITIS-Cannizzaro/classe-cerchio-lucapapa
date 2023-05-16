package altronome;
public class quattro {
	double r ;

	public quattro(double r) {
		this.r = r;
	}
	public  double diametro() {
		double diametro = r *2;
		return diametro ;
	}
	public double perimetro () {
		double peri = (r*2)*3.14;
		return peri;
	}
	public double area () {
		double quadr=r*r;
		double area =quadr*3.14;
		return area;
	}
	public quattro (quattro t) {
		this.r = t.getRaggio()*2;
	}
	public double getRaggio() {
		return r;
	}
	@Override
	public String toString() {
		return "quattro [r=" + r + "]";
	}
	
	
}


package altronome;
import java.util.Scanner;
public class quattrodue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserire il primo raggio");
		int ru= scan.nextInt();
		System.out.println("inserire il secondo raggio");
		int rd= scan.nextInt();
		quattro c1 = new quattro (ru);
		quattro c2 = new quattro (rd);
		System.out.println("dimetro primo cerchio :"+c1.diametro());
		System.out.println("perimetro primo cerchio : "+c1.perimetro());
		System.out.println("area primo cerchio : "+c1.area());
		System.out.println("dimetro secondo cerchio :"+c2.diametro());
		System.out.println("perimetro secondo cerchio : "+c2.perimetro());
		System.out.println("area primo secondo : "+c2.area());
	}

}


