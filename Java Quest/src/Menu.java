import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Menu extends JFrame{
    private JPanel panel1;

    private final File fondo;
    private Clip clip;
    private AudioInputStream audioInputStream;

    Fondo fondo_menu = new Fondo();

    public Menu(){
        setTitle("Agenda");
        setContentPane(fondo_menu);
        add(panel1);
        setSize(600,800);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fondo = new File("src/Multimedia/Musica/fondo_musica_1.wav");
        play();

    }
    public void play(){
        try {
            audioInputStream = AudioSystem.getAudioInputStream(fondo);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
            System.err.println(e1.getMessage());
        }
    }


    public class Fondo extends JPanel{
        @Override
        public  void paint(Graphics g){
            Image fondo = new ImageIcon(getClass().getResource("Multimedia/Fondos/fondo_1.jpg")).getImage();
            g.drawImage(fondo, 0,0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }


}

