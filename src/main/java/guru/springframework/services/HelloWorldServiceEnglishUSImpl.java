package guru.springframework.services;

public class HelloWorldServiceEnglishUSImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hello World!!! American English";
    }
}
