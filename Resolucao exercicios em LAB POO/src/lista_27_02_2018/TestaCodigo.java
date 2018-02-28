package lista_27_02_2018;

public class TestaCodigo {
	public static void main(String[] args) {
        Conta minhaConta = new Conta("");//.. Passo uma string vazia para o construtor
        //..se tentar ler o saldo como private apresentará
        //.. mensagem de erro
        minhaConta.saldo = 1000.0;
        minhaConta.numero = 159;
        minhaConta.setSaldo(2000);
        //...............................................
        

        //..imprime na tela
        System.out.println("Nome: " + minhaConta.getTitular() +
      		  			 "\nNumero: " + minhaConta.getNumero() + 
      		  			 "\nSaldo: " + minhaConta.getSaldo()) ;
        
	}

}
