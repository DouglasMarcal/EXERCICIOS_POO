package lista_27_02_2018;

public class Conta {
	    String titular;
	    //..Se declara o atributo como privado ele não
	    //..sera acessado no metodo main
	    public int numero;
	    public double saldo;

	    // ..
	    public Conta() {
            // construtor sem argumentos
        }
	    public Conta(String titular) {
            this.titular = "Douglas"; //..
        }

	    public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		void saca(double valor) {
	        this.saldo = this.saldo - valor; 
	    }
	    
	}
	
