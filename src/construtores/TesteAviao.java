package construtores;

public class TesteAviao {

	public static void main(String[] args) {
		 
		Aviao A320;
		//A320 = new Aviao();
		
		A320 = new Aviao("AIRBUS A320", "preto e branco");
		
		A320.fabricante = "EADS Airbus";
		A320.modelo = "AIRBUS A320";
		
		A320.imprimirOi();
		
		System.out.println("\n Fabricante: " + A320.fabricante 
				+ "\n Modelo: " 
				+ A320.modelo
				+ "\n Capacidade de Combustível: " + A320.capacidadeCombustivel 
				+ "\n Cor do avião: " + A320.cor);

	}

}
