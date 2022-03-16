package magacin;

import java.util.ArrayList;
import java.util.List;

import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {

	List<Artikal> artikli;
	
	public Magacin() {
		artikli = new ArrayList<Artikal>();
	}
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		if(artikli.contains(artikal)) {
			for(Artikal a: artikli) {
				if(a.equals(artikal)) {
					a.setKolicina(a.getKolicina() + artikal.getKolicina());
				}
			}
		}else {
			artikli.add(artikal);
		}

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if(!artikli.contains(artikal)) {
			throw new RuntimeException("Artikal ne postoji");
		}
		Artikal a = pronadjiArtikal(artikal.getSifra());
		a.setKolicina(a.getKolicina() - artikal.getKolicina());

	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for(Artikal a: artikli) {
			if(a.getSifra() == sifra) {
				return a;
			}
		}
		throw new RuntimeException("Ne postoji artikal sa zadatom sifrom");
	}

}
