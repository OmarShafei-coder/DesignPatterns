package structural.facade;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send(new Message("Hello Omar"), "Target");
    }
}