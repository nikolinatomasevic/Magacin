package magacin;

import java.util.Date;

public class KucnaHemija {

	Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja.before(new Date())) {
			throw new IllegalArgumentException("Rok trajanja mora biti datum u buducnosti");
		}
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}
	
	
	
}
