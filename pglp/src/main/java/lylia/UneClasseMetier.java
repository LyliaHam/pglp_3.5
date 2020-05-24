import java.time.LocalDateTime;

public class UneClasseMetier {
	public void uneMethodeMetier(LogInt log) {
		log.write(LocalDateTime.now() + "Debut methode MMétier");
		log.write(LocalDateTime.now() + "Fin methode MMétier");
	}
}
