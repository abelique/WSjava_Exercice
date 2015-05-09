package test;

import racional.Racional;
import racional.RacionalImpl;

public class TestRacional extends Test {
	
	private static void print(Object o){
		System.out.println(o);
	}
	
	public static void main(String [] args){
		
		Racional r1 = new RacionalImpl(5, 2);
		Racional r2 = new RacionalImpl(3, 4);
		
		Test.mostrar("el racional r1 es: ", r1);
		Test.mostrar("el racional r2 es: ", r2);
		
		print(r1.getValor());
		print(r2.getValor());
		
		System.out.println( r1.toString() );
		System.out.println( r2.toString() );
		
		Integer num = r1.getNumerador() + r2.getNumerador();
		Integer den = r1.getDenominador() + r2.getDenominador();
		
		print(num);
		print(den);

		String expresion = num==den ? "Son iguales": new String("No son iguales");
		print(expresion);
		
		Integer aux = r1.getNumerador();
		r1.setNumerador(r2.getNumerador());
		r2.setNumerador(aux);
		
		Test.mostrar("nuevo valor de r1: ", r1);
		Test.mostrar("nuevo valor de r2: ", r2);
		
		Racional r3 = new RacionalImpl(r1.getNumerador()*r2.getNumerador(), r1.getDenominador()*r2.getDenominador());
		
		Test.mostrar("Resultado de multiplicación: ", r3);
		
		
	}

}
