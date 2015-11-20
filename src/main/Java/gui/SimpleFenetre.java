package gui;
import javax.swing.JFrame;

/**
 * Created by J-L on 20/11/2015.
 */
public class SimpleFenetre extends JFrame{

    public SimpleFenetre(){
        super();

        build();//On initialise notre fen�tre
    }

    private void build(){
        setTitle("Taux de change"); //On donne un titre � l'application
        setSize(320,240); //On donne une taille � notre fen�tre
        setLocationRelativeTo(null); //On centre la fen�tre sur l'�cran
        setResizable(false); //On interdit la redimensionnement de la fen�tre
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit � l'application de se fermer lors du clic sur la croix
    }
}

