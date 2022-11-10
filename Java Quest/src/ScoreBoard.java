import javax.swing.*;

public class ScoreBoard extends JFrame {
    private JButton button1;
    private JPanel panel1;

    public ScoreBoard() {
        setTitle("Agenda");
        setContentPane(panel1);
        setSize(800, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
