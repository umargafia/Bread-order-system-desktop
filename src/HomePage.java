import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    ImageIcon heartImg = new ImageIcon("images/heart.png");
    ImageIcon basketImg = new ImageIcon("images/basket.png");
    JButton heartButton = new JButton(heartImg);
    JButton basketButton = new JButton(basketImg);


    String categoryOne = "Category one";
    String categoryTwo = "Category two";
    String categoryThree = "Category three";
    JPanel breadPanel = new JPanel();



    ImageIcon i1Image = new ImageIcon("images/i1.jpg");
    ImageIcon i2Image = new ImageIcon("images/i2.png");
    ImageIcon i3Image = new ImageIcon("images/i3.jpg");
    JPanel imagePanel1 = new JPanel();
    JPanel imagePanel2 = new JPanel();
    JPanel imagePanel3= new JPanel();
    JLabel i1 = new JLabel(i1Image);
    JLabel i2 = new JLabel(i2Image);
    JLabel i3 = new JLabel(i3Image);
    JButton panel4Bu = new JButton("View more ");



    int frameWidth =  1150;
    int frameHeight =  850;
    int panel1a2MarginTop = 35;
    int panel3a4MarginTop = 205;
    double price = 0.0;


    JButton aboutButton = new JButton("About");
    JButton contactButton = new JButton("Contact us");
    JButton logoutButton = new JButton("Logout");

    HomePage() {

       // top buttons
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.gray);
        topPanel.setLayout(null);
        topPanel.setBounds(0,0,frameWidth,30);
        add(topPanel);

            //about buttons
            aboutButton.setFocusable(false);
            aboutButton.setBounds(20,3,150,25);
            aboutButton.setBackground(Color.white);
            topPanel.add(aboutButton);
            //contact buttons
            contactButton.setBounds(180,3,150,25);
            contactButton.setFocusable(false);
            contactButton.setBackground(Color.white);
            topPanel.add(contactButton);
            //logout buttons
            logoutButton.setBounds(995,3,130,25);
            logoutButton.setFocusable(false);
            logoutButton.addActionListener(this);
            logoutButton.setBackground(Color.white);
            topPanel.add(logoutButton);


        // Panel 1
        panel1.setBackground(Color.white);
        panel1.setLayout(new GridLayout(2, 2));
        panel1.setBounds(8, panel1a2MarginTop, 250, 150);
        add(panel1);

//        // heartButton
//        heartButton.setBorder(null);
//        heartButton.addActionListener(this);
//        heartButton.setBackground(Color.white);
//        heartButton.setFocusable(false);
//        heartButton.setFont(new Font(null, Font.PLAIN, 60));
//        panel1.add(heartButton);
//
//        // basket photo
//        basketButton.setBorder(null);
//        basketButton.addActionListener(this);
//        basketButton.setBackground(Color.white);
//        basketButton.setFocusable(false);
//        panel1.add(basketButton);
        // my favorite
//        JButton hText = new JButton("My favorites");
//        hText.setForeground(Color.red);
//        hText.setFont(new Font("Fira Sans Compressed ExtraBold", Font.ITALIC, 15));
//        hText.setFocusable(false);
//        hText.setBorder(null);
//        hText.setBackground(Color.white);
//        panel1.add(hText);
//        // my basket text
//        JButton mText = new JButton("My basket");
//        mText.setFocusable(false);
//        mText.setBorder(null);
//        mText.setBackground(Color.white);
//        mText.setForeground(Color.red);
//        mText.setFont(new Font("Fira Sans Compressed ExtraBold", Font.ITALIC, 15));
//        panel1.add(mText);

        // panel 2
        panel2.setBounds(280, panel1a2MarginTop, 850, 150);
        panel2.setBackground(Color.white);
        panel2.setLayout(new GridLayout(2, 1));
        add(panel2);

        // panel 2 image
        ImageIcon longBreadImage = new ImageIcon("images/bread.png");
        // panel 2 Panel
        JPanel panel2Panel = new JPanel();
        panel2Panel.setBackground(new Color(0xFFFFFF));
        // panel 2 text
        JLabel p2pText = new JLabel("Welcome to Zamani bread");
        p2pText.setFont(new Font("Mv boli", Font.BOLD, 55));
        p2pText.setForeground(Color.red);
        panel2Panel.add(p2pText);

        panel2.add(panel2Panel);
        JLabel panel2Label = new JLabel(longBreadImage);
        panel2.add(panel2Label);

        // panel 3
        panel3.setBounds(8, panel3a4MarginTop, 250, 400);
        panel3.setLayout(null);
        panel3.setBackground(Color.white);
        add(panel3);

        JLabel catagoryText = new JLabel("Filter ");
        catagoryText.setFont(new Font("Mv boli", Font.BOLD, 25));
        catagoryText.setBounds(80, 0, 250, 50);
        panel3.add(catagoryText);

        JButton c1 = new JButton(categoryOne);
        c1.setFocusable(false);
        c1.setBorder(null);
        c1.setBackground(Color.white);
        c1.setBounds(10,80,230,50);
        c1.setFont(new Font("Tahoma",Font.ITALIC,20));
        c1.setForeground(Color.blue);
        panel3.add(c1);

        JButton c2 = new JButton(categoryTwo);
        c2.setFocusable(false);
        c2.setBorder(null);
        c2.setBackground(Color.white);
        c2.setBounds(10,134,230,50);
        c2.setFont(new Font("Tahoma",Font.ITALIC,20));
        c2.setForeground(Color.blue);
        panel3.add(c2);

        JButton c3 = new JButton(categoryThree);
        c3.setFocusable(false);
        c3.setBorder(null);
        c3.setBackground(Color.white);
        c3.setBounds(10,182,230,50);
        c3.setFont(new Font("Tahoma",Font.ITALIC,20));
        c3.setForeground(Color.blue);
        panel3.add(c3);



        // panel 4
        panel4.setBackground(Color.white);
        panel4.setLayout(null);
        JScrollPane pane = new JScrollPane(panel4);
        pane.setBounds(280, panel3a4MarginTop, 850, 800);
        add(pane);

        JPanel panel4Panel = new JPanel();
        panel4Panel.setBounds(10, 10, 830, 400);
        panel4Panel.setBackground(new Color(0xCDD0D7));
        panel4Panel.setLayout(null);
        panel4.add(panel4Panel);
        // panel text
        JPanel pa4Label = new JPanel();
        pa4Label.setBackground(Color.orange);
        pa4Label.setBounds(0, 0, 830, 60);
        pa4Label.setLayout(null);
        panel4Panel.add(pa4Label);

        JLabel category1T = new JLabel(categoryOne);
        category1T.setBounds(250, 2, 350, 50);
        category1T.setForeground(Color.white);
        category1T.setFont(new Font("mv boli", Font.BOLD, 45));
        pa4Label.add(category1T);

        //bread layout
        breadPanel.setBounds(0, 60, 830, 300);
        breadPanel.setLayout(new GridLayout());
        breadPanel.setBackground(Color.yellow);category1T.setFont(new Font("mv boli", Font.BOLD, 45));
        breadPanel.setLayout(null);
        panel4Panel.add(breadPanel);

                //bread images 1

                imagePanel1.setLayout(null);
                imagePanel1.setBounds(10,5,250,290);
                breadPanel.add(imagePanel1);
                    i1.setBounds(0,0,280,220);
                    imagePanel1.add(i1);


                ///bread images 2
//                imagePanel2.setLayout(null);
                imagePanel2.setBounds(290,5,250,290);
                breadPanel.add(imagePanel2);
                i2.setBounds(0,30,250,190);
                    imagePanel2.add(i2);

                //bread images 3
                imagePanel3.setBounds(570,5,250,290);
                breadPanel.add(imagePanel3);
                imagePanel3.setLayout(null);
                    i3.setBounds(0,0,280,220);
                    imagePanel3.add(i3);

                JButton price1 = new JButton(String.valueOf(price));
                price1.setBounds(10,220,150,20);
                price1.setFont(new Font("Tahoma", Font.BOLD, 15));
                imagePanel1.add(price1);


                JLabel price2 = new JLabel(String.valueOf(price));
                price1.setFont(new Font("Tahoma", Font.BOLD, 15));
                imagePanel2.add(price2);

                JLabel price3 = new JLabel(String.valueOf(price));
                price1.setBounds(10,222,150,20);
                price1.setFont(new Font("Tahoma", Font.BOLD, 15));
                imagePanel3.add(price3);


        //panel4 button
        panel4Bu.setBounds(0,362,830,37);
        panel4Bu.addActionListener(this);
        panel4Bu.setFocusable(false);
        panel4Bu.addActionListener(this);
        panel4Panel.add(panel4Bu);



        JPanel p4Panel2 = new JPanel();
        p4Panel2.setBounds(10, 450, 830, 400);
        p4Panel2.setBackground(new Color(0xCDD0D7));
        p4Panel2.setLayout(null);
        panel4.add(p4Panel2);




        // my frame
        setBackground(Color.gray);
               setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(350, 500, frameWidth, frameHeight);
        setLayout(null);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== logoutButton){
            dispose();
            new Login( new IDAndPassword().getInfo());
                    }
        if (e.getSource()==panel4Bu){
                new ViewMore();
        }
//
    }
}
