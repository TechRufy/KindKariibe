package beans;

public class GustoBean{
	
	private String nome,descrizione,colore;
	private Double quantitaInMagazzino;
	
	public GustoBean() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public String getColore() {
		return colore;
	}
	
	public Double getquantitaInMagazzino() {
		return this.quantitaInMagazzino;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public void setquantitaInMagazzino(double quantita) {
		this.quantitaInMagazzino = quantita;
	}
	

	@Override
	public String toString() {
		return "GustoBean [nome=" + nome + ", descrizione=" + descrizione + ", colore=" + colore + ", quantit� in magazzino ="
	+quantitaInMagazzino+"]";
	}
	
}