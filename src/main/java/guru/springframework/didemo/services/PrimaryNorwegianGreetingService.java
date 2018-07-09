package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"no", "default"})
public class PrimaryNorwegianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primær velkomst service";
    }
}
