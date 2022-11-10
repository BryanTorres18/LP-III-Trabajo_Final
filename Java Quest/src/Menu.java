import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

        try {
            audioInputStream = AudioSystem.getAudioInputStream(fondo);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(clip.LOOP_CONTINUOUSLY);

        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
            System.err.println(e1.getMessage());
        }

        jugarButton.addMouseListener(new MouseAdapter() {   // Boton del Inicio (Jugar)
            @Override
            public void mouseClicked(MouseEvent e) {
                Selector_nivel nuevo_1 = new Selector_nivel();
                nuevo_1.setVisible(true);
                clip.stop();
                dispose();
            }
        });
        scoreboardButton.addMouseListener(new MouseAdapter() { // Boton del Inicio (ScoreBoard)
            @Override
            public void mouseClicked(MouseEvent e) {
                ScoreBoard nuevo_2 = new ScoreBoard();
                nuevo_2.setVisible(true);
                clip.stop();
                dispose();
            }
        });
        salirButton.addMouseListener(new MouseAdapter() { // Boton del Inicio (Salir)
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();

            }
        });
    }

    /*
    public void music(boolean opc){    //Probando si funciona mejor sin metodo
        try {
            audioInputStream = AudioSystem.getAudioInputStream(fondo);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(clip.LOOP_CONTINUOUSLY);

        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
            System.err.println(e1.getMessage());
        }
    }
    */

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

