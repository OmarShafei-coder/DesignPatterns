package creational.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();

        configManager.set("name", "QQQQQQQQQ");
        System.out.println(configManager.get("name"));

        ConfigManager manager = ConfigManager.getInstance();
        System.out.println(manager.get("name"));
    }
}