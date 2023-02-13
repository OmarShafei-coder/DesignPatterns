package structural.facade;

public class NotificationService {
    public void send(Message message, String target){
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("ip");
        AuthToken authToken = server.authenticate("appID", "key");
        server.send(authToken, new Message("Hello"), "target");
        connection.disconnect();

    }
}
