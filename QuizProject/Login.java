package QuizProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(
                "./login.jpeg");
        i1.getImage();
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(255, 0, 0));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(255, 0, 0));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(915, 270, 120, 25);
        rules.setBackground(new Color(255, 0, 0));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        rules.setToolTipText("Click to read the rules of the Quiz.");
        add(rules);

        back = new JButton("Exit");
        back.setBounds(735, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setToolTipText("Click to exit the Quiz.");
        add(back);

        JLabel help = new JLabel("Need help?");
        help.setBounds(735, 400, 100, 20);
        help.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
        help.setForeground(new Color(0, 0, 255));
        add(help);

        JTextArea helptext = new JTextArea();
        helptext.setText(
                "Enter your name and click on 'Rules' to start the game. \n\nRead the rules and then start answering the questions. \n\nYou can exit the game anytime by clicking on the 'Exit' button. \n\nGood luck and have fun!");
        helptext.setBounds(735, 430, 400, 70);
        helptext.setFont(new Font("Mongolian Baiti", Font.PLAIN, 14));
        helptext.setForeground(new Color(139, 69, 19));
        helptext.setBackground(new Color(255, 255, 153));
        helptext.setEditable(false);
        helptext.setLineWrap(true);
        helptext.setWrapStyleWord(true);
        add(helptext);

        setSize(1200, 600);
        setLocation(200, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText().trim();
            if (name.isEmpty() || !name.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid name (alphabets only)");
            } else {
                setVisible(false);
                new Rules(name);

            }
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
