package aula07;
// REFERENTE ÀS AULAS 07 E 08 DO CURSO DE POO
public class Lutador {

	private String nome, nacionalidade;
	private int idade;
	private float altura, peso;
	private String categoria;
	private int vitorias, derrotas, empates;

	
	//MÉTODOS ESPECIAIS
	
		// CONSTRUTOR
	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
		
	}
	
		// GET E SET
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String no) {
		this.nome = no;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int id) {
		this.idade = id;
	}
	
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float al) {
		this.altura = al;
	}

	
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria();
		
		// SETPESO É DIFERENTE PORQUE SEMPRE QUE CONFIGURAR O PESO, TAMBÉM SERÁ CONFIGURADO A CATEGORIA.
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria() {
		if (this.peso < 52.2) {
			
			this.categoria = "Inválido!";
			
		} else if (this.peso <= 70.3) {
			
			this.categoria = "Leve";
					
		} else if (this.peso <= 83.9) {
			
			this.categoria = "Médio";
			
		} else if (this.peso <= 120.2) {
			
			this.categoria = "Pesado";
			
		} else {
			this.categoria = "Inválido!";
		}
			
		
	}
	
		
	public int getVitorias() {
		return vitorias;
	}
	
	public void setVitorias(int vi) {
		this.vitorias = vi;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public void setDerrotas(int de) {
		this.derrotas = de;
	}


	public int getEmpates() {
		return empates;
	}
	
	public void setEmpates(int em) {
		this.empates = em;
	}
	
	
	
	
	// MÉTODOS PÚBLICOS
	public void apresentar() {
	System.out.println("----APRESENTAÇÃO----");
	System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
	
	System.out.println("Diretamente da(o) " + this.getNacionalidade() + ",");	
	System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " m.");	
		
	System.out.println("Pesando " + this.getPeso() + " kg.");	
	System.out.println(this.getVitorias() + " vitórias " + this.getDerrotas() + " derrotas e " +
	this.getEmpates() + " empates.");	
	System.out.println(); // QUEBRA DE LINHA

	}
	
	public void status() {
		System.out.println("-------STATUS-------");
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());

		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
		System.out.println(); // QUEBRA DE LINHA
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	
}
