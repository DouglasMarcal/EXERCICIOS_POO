package lista_27_02_2018;

public class TestaCodigo {
	public static void main(String[] args) {
        Conta minhaConta = new Conta();
        
        minhaConta.saldo = 1000.0;
        minhaConta.saca(50000); // saldo é só 1000!!	
	}

}
