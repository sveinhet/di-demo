package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public final static String HELLO_GURUS = "Hello Gurus!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
