import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class AddUser extends JFrame {
    Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);

    JTextField username = new JTextField();
    JTextField password = new JTextField();
    JTextField confirm = new JTextField();
    Color color = new Color(0x032C61);

    JButton addButton = new JButton("add");




    String url = "jdbc:mysql://localhost:3306/groupAssigement";

    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(url, "root", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    AddUser(){




        //panel
        JPanel panel = new JPanel();
        panel.setBounds(50,30,500,500);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        add(panel);

        JLabel details = new JLabel("ADD USER");
        details.setForeground(Color.black);
        details.setFont(new Font("Purisa", Font.BOLD, 40));
        details.setBounds(120,50,450,50);
        panel.add(details);

        //username

        Border  cardNumberBorder = BorderFactory.createTitledBorder("USERNAME");
        username.setBorder(BorderFactory.createCompoundBorder(outerBorder,cardNumberBorder));
        username.setBackground(Color.white);
        username.setBounds(20,170,400,50);
        username.setForeground(color);
        username.setFont(new Font("Tahoma",Font.BOLD,25));
        panel.add(username);


        //password
        Border expDateBorder = BorderFactory.createTitledBorder("PASSWORD");
        password.setBorder(BorderFactory.createCompoundBorder(outerBorder,expDateBorder));
        password.setBackground(Color.white);
        password.setBounds(20,250,400,50);
        password.setForeground(color);
        password.setFont(new Font("Tahoma",Font.BOLD,25));
        panel.add(password);



        addButton.setBackground(color);
        addButton.setBounds(20,340,450,40);
        addButton.setFocusable(false);
        addButton.setForeground(Color.white);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            String uname= username.getText();
            String pss = password.getText();
            String query = "insert into login (username, password) values (?,?)";

                PreparedStatement preparedStatement = null;

                try {
                    preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1,uname);
                    preparedStatement.setString(2,pss);
                    preparedStatement.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                        username.setText("");
                         password.setText("");
                         JOptionPane.showMessageDialog(null,"Added successfully");
            }
        });
        addButton.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(addButton);


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setBounds(100,50,600,600);
        setVisible(true);
    }
}
