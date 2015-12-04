package gui;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.text.*;



public class Tchange extends JFrame implements ActionListener{

    /* Déclaration des differents composants */
    private JLabel l1 = new JLabel("FROM:");
    private JLabel l2 = new JLabel("TO:");
    private JTextField t1 = new JTextField(10);
    private JTextField t2 = new JTextField(10);
    private JButton b1 = new JButton("Convertir");
    private JButton b2 = new JButton("Annuler");
    private JRadioButton b3 = new JRadioButton("EURO",false);
    private JRadioButton b4 = new JRadioButton("USD",false);
    private JRadioButton b5 = new JRadioButton("GBP",false);
   // private JButton b6 = new JButton("FCFA");
    private JRadioButton b7 = new JRadioButton("EURO",false);
    private JRadioButton b8 = new JRadioButton("USD",false);
    private JRadioButton b9 = new JRadioButton("GBP",false);
    private JRadioButton b10 = new JRadioButton("FCFA",false);
    /*private JCheckBox box1 = new JCheckBox("EURO", false);
    private JCheckBox box2 = new JCheckBox("USD",false);
    private JCheckBox box3 = new JCheckBox("GBP",false);
    //private JCheckBox box4 = new JCheckBox("FCFA",false);
    private JCheckBox box5 = new JCheckBox("EURO",false);
    private JCheckBox box6 = new JCheckBox("USD",false);
    private JCheckBox box7 = new JCheckBox("GBP",false);
    private JCheckBox box8 = new JCheckBox("FCFA",false);*/
    ButtonGroup bg1 = new ButtonGroup();
    ButtonGroup bg2 = new ButtonGroup();










    public Tchange(){
        this.setTitle(" Convertisseur ");
        this.setSize(500, 400); //taille de la fenetre
        this.setResizable(false);// interdir l'agrandissement
        this.setLocationRelativeTo(null);// centré la fenetre
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pannel = new JPanel();
        JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(192, 192, 192));
        p1.setLayout(null);
        p1.add(l1); // ajout de l1 dans p1;
        l1.setBounds(new Rectangle(50, 15, 60, 25)); // position de notre label (l1)
        t1.setBounds(new Rectangle(50, 50, 100, 25));
        p1.add(t1);
        l2.setBounds(new Rectangle(280, 15, 60, 25));
        p1.add(l2);
        t2.setBounds(new Rectangle(280, 50, 100, 25));
        p1.add(t2);
        b1.setBounds(new Rectangle(165, 250, 100, 28));
        b2.setBounds(new Rectangle(165, 290, 100, 28));
        b3.setBounds(new Rectangle(60, 90, 80, 28));
        b4.setBounds(new Rectangle(60, 130, 80, 28));
        b5.setBounds(new Rectangle(60, 170, 80, 28));
        //b6.setBounds(new Rectangle(60, 210, 80, 28));
        b7.setBounds(new Rectangle(290, 90, 80, 28));
        b8.setBounds(new Rectangle(290, 130, 80, 28));
        b9.setBounds(new Rectangle(290, 170, 80, 28));
        b10.setBounds(new Rectangle(290, 210, 80, 28));
        /*box1.setBounds(new Rectangle(60, 90, 80, 28));
        box2.setBounds(new Rectangle(60, 130, 80, 28));
        box3.setBounds(new Rectangle(60, 170, 80, 28));
        //box4.setBounds(new Rectangle(60, 210, 80, 28));
        box5.setBounds(new Rectangle(290, 90, 80, 28));
        box6.setBounds(new Rectangle(290, 130, 80, 28));
        box7.setBounds(new Rectangle(290, 170, 80, 28));
        box8.setBounds(new Rectangle(290, 210, 80, 28));*/

        bg1.add(b3);
        bg1.add(b4);
        bg1.add(b5);
        bg2.add(b7);
        bg2.add(b8);
        bg2.add(b9);
        bg2.add(b10);

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        //p1.add(box4);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b10);


        /*p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b10);*/


        b1.addActionListener(this);
        b2.addActionListener(this);

        p1.setPreferredSize(new Dimension(500, 400));
        onglets.addTab("TAUX DE CHANGE", p1);

        onglets.setOpaque(true);
        pannel.add(onglets);

        Font f1 = new Font("TimesRoman",Font.BOLD,14);
        Font f2 = new Font("TimesRoman",Font.BOLD,16);
        Font f3 = new Font("TimesRoman",Font.BOLD,15);
        t1.setFont(f1);
        t2.setFont(f1);
        t1.setDocument
                (new JTextFieldLimit(10));
        //onlyNumeric(NumericField(t1));

        l1.setFont(f2);
        l2.setFont(f2);

        b1.setFont(f3);
        b2.setFont(f3);

        this.getContentPane().add(pannel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        DecimalFormat df = new DecimalFormat ("#####.00000") ; //5 chiffres après la virgukle
        df.setDecimalSeparatorAlwaysShown ( true ) ;

        if (e.getSource()==b1){
            String v1 = t1.getText();
            //String v2;
            if (!(v1.length()==0)) {
                char c = v1.charAt(v1.length()-1);
            if (v1.length()==0 || (c<'0' || c>'9') && (c!='.') ||
                        ((c=='.') && (v1.substring(0,v1.length()-1).indexOf('.')!= -1)  )) {
                    t1.setText(v1.substring(0,v1.length()-1)); //ici j'ai voulu obliger l'utilisateur à
                    // rentrer des chiffres et non des lettres dans la textbox

                JOptionPane.showMessageDialog(this, " Veuillez entrer un nombre valide a convertir !");
            }
            else {
                if (b3.isSelected()==true && b7.isSelected()==true){
                    t2.setText(v1);
                }
                if (b3.isSelected()==true && b8.isSelected()==true){
                    double result2 = Double.parseDouble(v1);
                    double r2 = result2 * 1.05827 ;
                    String v3 = df.format(r2);
                    System.out.println((v3)); //écrit le résultat dans la console
                    t2.setText(v3);
                }
                if(b3.isSelected()==true && b9.isSelected()==true) {
                    double result3 = Double.parseDouble(v1);
                    double r2 = result3 * 0.70564;
                    String v3 = df.format(r2);
                    System.out.println((v3));
                    t2.setText(v3);
                }
                if(b3.isSelected()==true && b10.isSelected()==true) {
                    double result2 = Double.parseDouble(v1);
                    double r2 = result2 * 655.96;
                    String v3 = df.format(r2);
                    System.out.println((v3));
                    t2.setText(v3);
                }
                if(b4.isSelected()==true && b7.isSelected()==true) {
                    double result2 = Double.parseDouble(v1);
                    double r2 = result2 * 0.94493;
                    String v3 = df.format(r2);
                    System.out.println((v3));
                    t2.setText(v3);




                }
                if(b4.isSelected()==true && b8.isSelected()==true) {
                    t2.setText(v1);
                }
                if(b4.isSelected()==true && b9.isSelected()==true) {
                    double result2 = Double.parseDouble(v1);
                    double r2 = result2 * 0.66679;
                    String v3 = df.format(r2);
                    System.out.println((v3));
                    t2.setText(v3);
                }
                if(b4.isSelected()==true && b10.isSelected()==true) {
                    double result2 = Double.parseDouble(v1);
                    double r2 = result2 * 621.45;
                    String v3 = df.format(r2);
                    System.out.println((v3));
                    t2.setText(v3);
                }
                if(b5.isSelected()==true && b7.isSelected()==true) {
                    double result2 = Double.parseDouble(v1);
                    double r2 = result2 * 1.41713;
                    String v3 = df.format(r2);
                    System.out.println((v3));
                    t2.setText(v3);
                }
                if(b5.isSelected()==true && b8.isSelected()==true) {
                    t2.setText(v1);

                }
                if(b5.isSelected()==true && b9.isSelected()==true) {
                    double result2 = Double.parseDouble(v1);
                    double r2 = result2 * 1.49971;
                    String v3 = Double.toString(r2);
                    t2.setText(v3);
                }
                if(b5.isSelected()==true && b9.isSelected()==true) {
                    double result2 = Double.parseDouble(v1);
                    double r2 = result2 * 928.46;
                    String v3 = df.format(r2);
                    System.out.println((v3));
                    t2.setText(v3);
                }

            }
        }
        if (e.getSource()==b2){
            t1.setText(null);
            t2.setText(null);
        }
    }
    /*public static void main(String[] args) {
        Tchange c = new Tchange();*/
    }
}