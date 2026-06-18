import javax.swing.*;

public class LoginForm extends JFrame {

    LoginForm() {

        setTitle("Pharmacy Management System");
        setSize(400,300);
        setLayout(null);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(50,50,100,30);

        JTextField t1 = new JTextField();
        t1.setBounds(150,50,150,30);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(50,100,100,30);

        JPasswordField p1 = new JPasswordField();
        p1.setBounds(150,100,150,30);

        JButton login = new JButton("Login");
        login.setBounds(150,160,100,30);

        add(l1);
        add(t1);
        add(l2);
        add(p1);
        add(login);

        setVisible(true);
    }

    public static void main(String args[]) {
        new LoginForm();
    }
}
