package lista_27_02_2018;

public class Conta {
	    String titular;
	    //..Se declara o atributo como privado ele não
	    //..sera acessado no metodo main
	    public int numero = 10;
	    public double saldo;

	    // ..

	    void saca(double valor) {
	        this.saldo = this.saldo - valor; 
	    }
	}
	
