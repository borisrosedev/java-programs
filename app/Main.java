package app;


public class Main  {

    public static void main(String[] args) {

        MessageService instance = new MessageService("Message Service", "Hello", "info");

        instance.displayServicesCount();
    
    }
}
