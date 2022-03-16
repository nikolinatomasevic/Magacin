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
		if(naziv == null) {
			throw new NullPointerException("Naziv ne sme biti null");
		}
		if(naziv.isEmpty()) {
			throw new IllegalArgumentException("Naziv ne sme biti prazan String");
		}
		this.naziv = naziv;
	}
	
	public void setSifra(int sifra) {
		if(sifra<=0) {
			throw new IllegalArgumentException("Sifra ne sme biti <=0");
		}
		this.sifra = sifra;
	}
	
	public void setOpis(String opis) {
		if(opis == null) {
			throw new NullPointerException("Opis ne sme biti null");
		}
		if(opis.isEmpty()) {
			throw new IllegalArgumentException("Opis ne sme biti prazan String");
		}
		this.opis = opis;
	}
	
	public void setKolicina(int kolicina) {
		if(kolicina<0) {
			throw new IllegalArgumentException("Kolicina ne sme biti <0");
		}
		this.kolicina = kolicina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifra;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		if (sifra != other.sifra)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}
	
	
	
}
