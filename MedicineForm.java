import javax.swing.*;

public class MedicineForm extends JFrame {

    MedicineForm() {

        setTitle("Medicine Management");
        setSize(500,400);
        setLayout(null);

        JLabel l1 = new JLabel("Medicine Name");
        JTextField t1 = new JTextField();

        JButton add = new JButton("Add");
        JButton update = new JButton("Update");
        JButton delete = new JButton("Delete");

        l1.setBounds(50,50,120,30);
        t1.setBounds(180,50,200,30);

        add.setBounds(50,120,100,30);
        update.setBounds(170,120,100,30);
        delete.setBounds(290,120,100,30);

        add(l1);
        add(t1);
        add(add);
        add(update);
        add(delete);

        setVisible(true);
    }
}
