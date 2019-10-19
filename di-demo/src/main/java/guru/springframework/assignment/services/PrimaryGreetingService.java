package guru.springframework.assignment.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
@Profile({ "en", "default" })
public class PrimaryGreetingService implements GreetingService {

	// @Autowired - REPLACED BY THE CONSTRUCTOR BELOW
	private GreetingRepository greetingRepository;

	// ESTA ES UNA DE LAS SOLUCIONES DE LA TAREA
	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getEnglishGreeting();
	}
}
