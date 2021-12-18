import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {



    ImageIcon image = new ImageIcon("images/wal.jpg");
    JLabel background = new JLabel("",image,JLabel.CENTER);

    JPanel panel = new JPanel();

    public Signup(){
        background.setBounds(0,0,1728,1080);

        //panel
        panel.setPreferredSize(new Dimension(500,500));
        panel.setLocation(50,50);
        panel.setBackground(Color.orange);
        panel.setOpaque(false);
        add(panel);



        add(background);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,700);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }
}
