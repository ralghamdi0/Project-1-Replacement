import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUI {
    private JPanel gameGUI;
    private JLabel gameHeading;
    private JLabel team1;
    private JTextField teamoneinput;
    private JLabel team2;
    private JTextField teamtwoinput;
    private JButton simulate;
    private JLabel player;
    private JList teamTwo;
    private JList teamOne;
    private JLabel statistics;
    private JProgressBar progressBar1;
    private JLabel clable;
    private JProgressBar progressBar2;
    private JProgressBar progressBar3;
    private JComboBox comboBox1;
    private JProgressBar progressBar4;
    private JComboBox comboBox2;
    private JButton addButton;
    private JButton addButton1;
    private JTextArea textArea1;

    public GameUI() {
    simulate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String team1Name = (String) teamoneinput.getText();
            String team2Name = (String) teamtwoinput.getText();


        }
    });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
