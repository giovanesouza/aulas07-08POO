package aula07;
// REFERENTE ÀS AULAS 07 E 08 DO CURSO DE POO
import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	// MÉTODOS
	
	public void marcarLuta(Lutador l1, Lutador l2) {
	if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;

	 } else {
		
		 this.aprovada = false;
		 this.desafiado = null;
		 this.desafiante = null;
		 
	 }	
	}


	public void lutar() {
		// GERA VALOR ALEATÓRIO PARA DECIDIR A LUTA
			
		if (this.aprovada) {
			System.out.println("=== DESAFIADO ===");
			this.desafiado.apresentar();
			System.out.println("=== DESAFIANTE ===");
			this.desafiante.apresentar();
		

		// VALOR RANDÔMICO => 0: EMPATE | 1: GANHA O LUTADOR 1 | 2: GANHA O LUTADOR 2.
		Random aleatorio = new Random(); // Importar a classe Java.util Random
		int vencedor = aleatorio.nextInt(3); // Vai gerar 3 resultados => 0, 1 ou 2.
		
		System.out.println("====== RESULTADO DA LUTA ======");
				
		switch (vencedor) {
		case 0:
			System.out.println("Empatou!");
			this.desafiado.empatarLuta();
			this.desafiante.empatarLuta();
			
			break;
			
		case 1:
			System.out.println("Vitória do " + this.desafiado.getNome());
			this.desafiado.ganharLuta();
			this.desafiante.perderLuta();
			
			break;

		case 2:
			System.out.println("Vitória do " + this.desafiante.getNome());
			this.desafiante.ganharLuta();
			this.desafiado.perderLuta();
			
		
			break;
		}
		
		System.out.println("===============================");
		System.out.println(); // QUEBRA DE LINHA
		
		} else {
			System.out.println("A luta não pode acontecer.");
		}
		
	}
	
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
		
	}

	

	public Lutador getDesafiante() {
		return desafiante;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
		
	}


	
	public int getRounds() {
		return rounds;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
