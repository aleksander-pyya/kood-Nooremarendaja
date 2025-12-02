package sprint;

public class GreetingCard {

    public String createGreeting (String recipientName , String occasion) {
        String greeting = "Happy " + occasion + "!\nTo: " + recipientName + "\nBest wishes!" ;
        return greeting;
    }
}
