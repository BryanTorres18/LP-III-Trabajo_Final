import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class Menu extends JFrame{
    private JPanel Principal;
    private JPanel Botones;
    private JPanel ImagenesLogo;
    private JPanel Logo;
    private JPanel Cachimbo;
    private JButton jugarButton;
    private JButton scoreboardButton;
    private JButton salirButton;

    private final File fondo;
    private Clip clip;
    private AudioInputStream audioInputStream;

    Fondo fondo_menu = new Fondo();

    public Menu(){
        setTitle("Agenda");
        setContentPane(fondo_menu);
        add(Principal);
        setSize(800,600);
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
            Image fondo = new ImageIcon(getClass().getResource("Multimedia/Fondos/fondo_2.gif")).getImage();
            g.drawImage(fondo, 0,0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }


}

