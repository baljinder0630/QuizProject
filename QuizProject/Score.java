package QuizProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score, int[] correct) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(new Color(245, 245, 245));
        setLayout(null);

        ImageIcon i1 = new ImageIcon("./score.png");
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 150, 300, 250);
        add(image);

        JLabel heading = new JLabel("Simple Minds Quiz");
        heading.setBounds(300, 20, 400, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(400, 150, 100, 30);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(lblName);

        JLabel lblNameVal = new JLabel(name);
        lblNameVal.setBounds(500, 150, 200, 30);
        lblNameVal.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(lblNameVal);

        JLabel lblScore = new JLabel("Score:");
        lblScore.setBounds(400, 200, 100, 30);
        lblScore.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(lblScore);

        JLabel lblScoreVal = new JLabel(score + " / 100");
        lblScoreVal.setBounds(500, 200, 200, 30);
        lblScoreVal.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(lblScoreVal);

        JButton playAgain = new JButton("Play Again");
        playAgain.setBounds(550, 300, 150, 50);
        playAgain.setBackground(new Color(255, 0, 0));
        playAgain.setForeground(Color.WHITE);
        playAgain.setFont(new Font("Tahoma", Font.BOLD, 20));
        playAgain.addActionListener(this);
        add(playAgain);

        JButton exit = new JButton("Exit");
        exit.setBounds(380, 300, 150, 50);
        exit.setBackground(new Color(30, 144, 255));
        playAgain.setFont(new Font("Tahoma", Font.BOLD, 20));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i + 1));
            button.setBounds(380 + (i % 5) * 55, i >= 5 ? 455 : 400, 50, 50);
            button.setBackground(correct[i] == 1 ? Color.GREEN.darker()
                    : correct[i] == -1 ? Color.GRAY.darker() : Color.RED.darker());
            button.setForeground(Color.WHITE);
            button.setOpaque(true);
            button.setBorderPainted(false);
            button.setFocusPainted(false);
            // button.setPreferredSize(new Dimension(80, 80));
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setMargin(new Insets(0, 0, 0, 0));
            // button.setUI(new CircularButtonUI()); // Set custom UI to make it circular
            add(button);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

}
