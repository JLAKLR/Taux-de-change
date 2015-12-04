package gui;
import java.awt.event.*;

public class NumericField extends javax.swing.JTextField {

    private javax.swing.JTextField tf;

    public NumericField() {

        super();
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                onlyNumeric(NumericField.this);
            }
            public void keyTyped(KeyEvent e) {
                onlyNumeric(NumericField.this);
            }

            private void onlyNumeric(NumericField np) {
                String s = np.getText();
                if (!(s.length()==0)) {
                    char c = s.charAt(s.length()-1);
                    // on elimine tous les caractères non numérique, et également le point s'il y en
                    //a deja un.
                    if ((c<'0' || c>'9') && (c!='.') ||
                    ((c=='.') && (s.substring(0,s.length()-1).indexOf('.')!= -1)  )) {
                        np.setText(s.substring(0,s.length()-1));
                    }
                }
            }
        });
    }
}