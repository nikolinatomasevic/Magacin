package magacin;

public class Artikal {

	String naziv;
	int sifra;
	String opis;
	int kolicina;
	
	public String getNaziv() {
		return naziv;
	}
	
	public int getSifra() {
		return sifra;
	}
	
	public String getOpis() {
		return opis;
	}
	
	public int getKolicina() {
		return kolicina;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}	
	
}
