import javax.naming.ldap.Control;

public interface View {
    void print();
    void handleInput();
    void setController(Controller c);
    Controller getController();
}
