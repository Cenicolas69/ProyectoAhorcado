package principal;
import javax.swing.*;

import vista.PantallaInicial;

public class Proyecto  extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PantallaInicial().setVisible(true);
            }
        });
    }
}
