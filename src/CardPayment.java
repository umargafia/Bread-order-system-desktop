import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardPayment extends JFrame implements ActionListener {

    int frameHeight = 700;
    int frameWidth = 900;
    ImageIcon image = new ImageIcon("images/backg.jpg");
    JLabel background = new JLabel("",image,JLabel.CENTER);

    Color color = new Color(0x032C61);



    JTextField name = new JTextField();
    JTextField cardNumber = new JTextField();
    JTextField expDate = new JTextField();
    JTextField cvv = new JTextField();

    JButton cancel= new JButton("Cancel");
    JButton pay= new JButton("Pay");
    CardPayment(){
        background.setBounds(0,0,frameWidth,frameHeight);

        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        //panel
         JPanel panel = new JPanel();
         panel.setBounds(100,100,700,500);
         panel.setBackground(Color.gray);
        panel.setLayout(null);
          add(panel);

        //header payment label
        JLabel details = new JLabel("Your payment details");
        details.setForeground(Color.white);
        details.setFont(new Font("Purisa", Font.BOLD, 25));
        details.setBounds(120,20,450,50);
        panel.add(details);

        //name

        Border  nameBorder = BorderFactory.createTitledBorder("Card Holder Name");
        name.setBorder(BorderFactory.createCompoundBorder(outerBorder,nameBorder));
        name.setBackground(Color.white);
        name.setBounds(20,80,600,50);
        name.setForeground(color);
        name.setFont(new Font("Tahoma",Font.BOLD,25));
        panel.add(name);


        //card number
        Border  cardNumberBorder = BorderFactory.createTitledBorder("Card Number");
        cardNumber.setBorder(BorderFactory.createCompoundBorder(outerBorder,cardNumberBorder));
        cardNumber.setBackground(Color.white);
        cardNumber.setBounds(20,170,600,50);
        cardNumber.setForeground(color);
        cardNumber.setFont(new Font("Tahoma",Font.BOLD,25));
        panel.add(cardNumber);


        //expDate
        Border expDateBorder = BorderFactory.createTitledBorder("Expiration Date");
        expDate.setBorder(BorderFactory.createCompoundBorder(outerBorder,expDateBorder));
        expDate.setBackground(Color.white);
        expDate.setBounds(20,250,280,50);
        expDate.setForeground(color);
        expDate.setFont(new Font("Tahoma",Font.BOLD,25));
        panel.add(expDate);


        //CVV
        Border cvvBorder = BorderFactory.createTitledBorder("CVV");
        cvv.setBorder(BorderFactory.createCompoundBorder(outerBorder,cvvBorder));
        cvv.setBackground(Color.white);
        cvv.setBounds(340,250,280,50);
        cvv.setForeground(color);
        cvv.setFont(new Font("Tahoma",Font.BOLD,25));
        panel.add(cvv);




        //cancel
        cancel.setBackground(color);
        cancel.setBounds(40,340,250,40);
        cancel.setFocusable(false);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        cancel.addActionListener(this);
        panel.add(cancel);


        //Pay
        pay.setBackground(color);
        pay.setBounds(360,340,250,40);
        pay.setFocusable(false);
        pay.setForeground(Color.white);
        pay.addActionListener(this);
        pay.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(pay);


        //frame
        add(background);
        setBounds(200,10,frameWidth,frameHeight);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cancel){
            dispose();
        }if(e.getSource()==pay){
          if(name.getText().isEmpty() | cardNumber.getText().isEmpty() | expDate.getText().isEmpty() |cvv.getText().isEmpty()){
              JOptionPane.showMessageDialog(null,"A box cannot be empty","Empty box",JOptionPane.ERROR_MESSAGE);
          }else {
              JOptionPane.showMessageDialog(null,"Payment successfully", "Payment",JOptionPane.INFORMATION_MESSAGE);
              dispose();
          }
        }
    }
}
