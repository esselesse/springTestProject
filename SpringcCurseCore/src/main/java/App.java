public class App {
  Client client;
  ConsoleEventLogger eventLogger;

  public void logEvent(String msg) {
    String message = msg.replaceAll(client.getId(), client.getFullName());
    eventLogger.logEvent(msg);
  }

  public static void main(String[] args) {

    App app = new App();

    app.client = new Client("1", "John Amberton");
    app.eventLogger = new ConsoleEventLogger();

    app.logEvent("Some event for usr 1");
  }

}
