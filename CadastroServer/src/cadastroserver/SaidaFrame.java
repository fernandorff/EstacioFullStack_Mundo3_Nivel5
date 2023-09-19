
package cadastroserver;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JTextArea;


public class SaidaFrame extends JDialog {

    private JTextArea texto;

    public SaidaFrame() {
        texto = new JTextArea();
        this.add(texto);
        
        this.setBounds(0, 0, 300, 300);
        this.setVisible(true);
        this.setModal(false);
    }

    /**
     * @return the texto
     */
    public JTextArea getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(JTextArea texto) {
        this.texto = texto;
    }
}
