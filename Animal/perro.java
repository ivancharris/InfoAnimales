import java.io.PrintStream;
import java.util.Scanner;

public class perro extends animalPadres {

	private static PrintStream out = new PrintStream (System.out);
	private static Scanner in = new Scanner (System.in);
	
	public void nombre() {
		out.println("Ingrese nombre de tu perro");
		String nomPerro = in.next();
		out.println("Este es tu perro " + nomPerro);
	}
	
	public void age() {
		out.print("Ten en cuenta los cuidados de tu perro, su edad promedio es de 13 años");
	}
}
