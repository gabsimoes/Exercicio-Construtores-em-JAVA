package construtores;

public class Aviao {
	
	public String fabricante;
	public String modelo;
	String cor;
	//private int capacidadeCombustivel;
	public int capacidadeCombustivel;
	
	/*Aviao () { //construtor
		System.out.println("A classe Avi�o foi instanciada.");
		capacidadeCombustivel = 800;
	}*/
	
	Aviao (String recebeModelo, String recebeCor) { //construtor
		System.out.println("A classe Avi�o foi instanciada.");
		capacidadeCombustivel = 800;
		this.modelo = recebeModelo;
		this.cor = recebeCor;
	}
	
	Aviao () { //� poss�vel criar dois construtores com mesmo nome, por�m cada um com sua assinatura
		System.out.println("Oi");
	}

	
	void imprimirOi() {
		System.out.println("Oi");
	}

}
