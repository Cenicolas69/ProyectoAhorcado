package vista;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        setTitle("Juego del Ahorcado - Menú Principal");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(200, 220, 255));

        // Menú Jugador
        JMenu menuJugador = new JMenu("Jugador");
        menuJugador.setFont(new Font("Arial", Font.BOLD, 14));
        
        JMenuItem itemNuevoJuego = new JMenuItem("Nuevo Juego");
        itemNuevoJuego.addActionListener(e -> {
            dispose();
            new JuegoNuevo().setVisible(true);
           });
        JMenuItem itemAbrirJuego = new JMenuItem("Abrir Juego");
        JMenuItem itemVerInforme = new JMenuItem("Ver Informe");
        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(e -> {
         dispose(); 
        });
        
        menuJugador.add(itemNuevoJuego);
        menuJugador.add(itemAbrirJuego);
        menuJugador.add(itemVerInforme);
        menuJugador.addSeparator();
        menuJugador.add(itemSalir);

        // Menú Administrador
        JMenu menuAdmin = new JMenu("Administrador");
        menuAdmin.setFont(new Font("Arial", Font.BOLD, 14));
        
        JMenuItem itemImportar = new JMenuItem("Importar Diccionario");
        JMenuItem itemConsultar = new JMenuItem("Consultar informe");
        JMenuItem itemIdioma = new JMenuItem("Añadir/Eliminar idioma");
        JMenuItem itemCopia = new JMenuItem("Copia de seguridad");
        JMenuItem itemRestauracion = new JMenuItem("Restauración");
        JMenuItem itemGestionPalabra = new JMenuItem("Gestión palabra/Frase");
        JMenuItem itemGestionUsuarios = new JMenuItem("Gestión usuarios");
        
        menuAdmin.add(itemImportar);
        menuAdmin.add(itemConsultar);
        menuAdmin.add(itemIdioma);
        menuAdmin.addSeparator();
        menuAdmin.add(itemCopia);
        menuAdmin.add(itemRestauracion);
        menuAdmin.addSeparator();
        menuAdmin.add(itemGestionPalabra);
        menuAdmin.add(itemGestionUsuarios);

     
        menuBar.add(menuJugador);
        menuBar.add(menuAdmin);

        setJMenuBar(menuBar);

       
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(230, 240, 255));
        panel.setBorder(BorderFactory.createEmptyBorder(50, 20, 20, 20));
        
        JLabel lblBienvenida = new JLabel("¡Bienvenido al Juego del Ahorcado!", SwingConstants.CENTER);
        lblBienvenida.setFont(new Font("Arial", Font.BOLD, 28));
        lblBienvenida.setForeground(new Color(0, 0, 100));
        
        panel.add(lblBienvenida, BorderLayout.CENTER);
        add(panel);
        setVisible(true);
    }
}