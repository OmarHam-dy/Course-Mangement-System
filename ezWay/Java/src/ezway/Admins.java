package ezway;
public class Admins {
private String name;
private String password;

    @Override
    public String toString() {
        return "Admins{" + "name=" + name + ", password=" + password + '}';
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
