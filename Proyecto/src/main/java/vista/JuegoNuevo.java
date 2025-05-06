package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoNuevo extends JFrame {

    public JuegoNuevo() {
        setTitle("Juego Nuevo");
        setSize(650, 450); // Aumenté un poco el tamaño para el nuevo componente
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Color de fondo
        Color fondoColor = new Color(200, 220, 255);
        
        // Panel principal con GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(fondoColor);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Selector de idioma en la parte superior derecha
        JPanel idiomaPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        idiomaPanel.setBackground(fondoColor);
        JLabel idiomaLabel = new JLabel("Idioma:");
        idiomaLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        
        
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(idiomaPanel, gbc);

        // Título "JUEGO NUEVO"
        JLabel titulo = new JLabel("JUEGO NUEVO");
        titulo.setFont(new Font("Arial", Font.BOLD, 36));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(titulo, gbc);

        // Etiquetas y campos para Tipo, Palabras, Frases
        String[] opciones = {"Seleccionar", "Palabras", "Frases"};
        
        // Fila Tipo
        JLabel tipoLabel = new JLabel("Tipo:");
        tipoLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(tipoLabel, gbc);

        JComboBox<String> tipoCombo = new JComboBox<>(opciones);
        tipoCombo.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(tipoCombo, gbc);


      
        gbc.gridx = 0;
        gbc.gridy = 1;
        String[] idiomas = {"Español", "Ingles", "Frances", "Valenciano"};
        JComboBox<String> idiomaCombo = new JComboBox<>(idiomas);
        idiomaCombo.setFont(new Font("Arial", Font.PLAIN, 14));
        idiomaCombo.setPreferredSize(new Dimension(120, 25));
        
        idiomaPanel.add(idiomaLabel);
        idiomaPanel.add(idiomaCombo);
       

     
        JLabel numJugadoresLabel = new JLabel("Número jugadores:");
        numJugadoresLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(numJugadoresLabel, gbc);

        JTextField numJugadoresField = new JTextField(15);
        numJugadoresField.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        panel.add(numJugadoresField, gbc);

      
        JLabel dificultadLabel = new JLabel("Nivel Dificultad:");
        dificultadLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(dificultadLabel, gbc);

        JComboBox<String> dificultadCombo = new JComboBox<>(new String[]{"Fácil", "Medio", "Difícil"});
        dificultadCombo.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        panel.add(dificultadCombo, gbc);

    
        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        botonesPanel.setBackground(fondoColor);
        
        JButton okButton = new JButton("OK");
        okButton.setFont(new Font("Arial", Font.BOLD, 18));
        okButton.setPreferredSize(new Dimension(100, 40));
        
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Arial", Font.BOLD, 18));
        cancelButton.setPreferredSize(new Dimension(100, 40));
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        botonesPanel.add(okButton);
        botonesPanel.add(cancelButton);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        panel.add(botonesPanel, gbc);

        add(panel);
        setVisible(true);
    }}