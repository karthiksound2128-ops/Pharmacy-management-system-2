import javax.swing.*;

public class Dashboard extends JFrame {

    Dashboard() {

        setTitle("Dashboard");
        setSize(600,400);
        setLayout(null);

        JButton medicine = new JButton("Medicine");
        JButton supplier = new JButton("Supplier");
        JButton customer = new JButton("Customer");
        JButton billing = new JButton("Billing");
        JButton report = new JButton("Report");

        medicine.setBounds(50,50,150,40);
        supplier.setBounds(250,50,150,40);
        customer.setBounds(50,150,150,40);
        billing.setBounds(250,150,150,40);
        report.setBounds(150,250,150,40);

        add(medicine);
        add(supplier);
        add(customer);
        add(billing);
        add(report);

        setVisible(true);
    }
}
