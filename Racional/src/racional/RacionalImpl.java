package racional;

public class RacionalImpl implements Racional{

	private Integer numerador;
	private Integer denominador;
	
	public RacionalImpl(Integer n, Integer d) {
		this.numerador = n;
		this.denominador = d;
	}
	
	@Override
	public Integer getNumerador() {
		return numerador;
	}

	@Override
	public Integer getDenominador() {
		return denominador;
	}

	@Override
	public void setNumerador(Integer numerador) {
		if(numerador == null){
			System.out.println("El numerador no puede ser nulo.");
		}
		this.numerador = numerador;
		
	}

	@Override
	public void setDenominador(Integer denominador) {
		if(denominador == 0 || denominador == null){
			System.out.println("El denominador no pude ser ni 0 ni nulo.");
		}
		this.denominador = denominador;
		
	}

	@Override
	public Double getValor() {
		
		return (double) (getNumerador() )/ getDenominador();
	}
	
	@Override
	public String toString(){
		return getNumerador() + "/" + getDenominador();
	}

}
