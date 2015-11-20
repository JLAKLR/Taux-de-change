package TP2MIF.Model;
import gui.SimpleFenetre;
import javax.swing.SwingUtilities;

/**
 * Created by J-L on 20/11/2015.
 */
public class JframeTest {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                //On crée une nouvelle instance de notre JDialog
                SimpleFenetre fenetre = new SimpleFenetre();
                fenetre.setVisible(true);//On la rend visible
            }
        });
    }
}
