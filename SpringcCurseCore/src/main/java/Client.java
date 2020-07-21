public class Client {
  String id;
  String fullName;

  public Client(String id, String fullName) {
    this.fullName = fullName;
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getId() {
    return id;
  }
}
