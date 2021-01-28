package Animal;

import java.io.PrintStream;
import java.util.Scanner;

public class gato extends animalPadres {
	
	private static PrintStream out = new PrintStream(System.out);
	private static Scanner in = new Scanner(System.in);
	
	public void nombre() {
		out.println("Ingrese nombre de tu gato");
		String nomGato = in.next();
		out.println("Este es tu gato " + nomGato);
	}
	
	public void age() {
		out.println("Ten en cuenta los cuidados de tu gato, su edad promedio es de 16 años");
	}

}
