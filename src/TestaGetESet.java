import java.io.ObjectInputStream.GetField;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta.numero = 1337;
		// a instrução anterior não compila porque o atributo é privado
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		// conta.titular = paulo;      
		// atributo titular é privado, não compila
		// essa linha representa a composição de objeto
		
		paulo.setNome("paulo silveira");
		// a composição tem que ser escrita assim:
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissão("programador");
		// conta, pega o titular e seta a profissão
		// agora em duas linhas:
		// a diferença é que se cria uma variável temporária no meio do caminho
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissão("programador");
		
		// o conta.getTitular(); recebeu a referência paulo na linha 17
		// então a variável titularDaConta recebe essa referência
		// isso pode ser comprovado imprimindo os seguintes códigos:
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		
		
	}

}
