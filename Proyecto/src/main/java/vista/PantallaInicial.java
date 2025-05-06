package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class PantallaInicial extends JFrame {

    public PantallaInicial() {
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        Color fondoColor = new Color(200, 220, 255); 
        Color textoColor = Color.BLACK;
        Color enlaceColor = new Color(0, 0, 200); 

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(fondoColor);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel titulo = new JLabel("INICIAR SESIÓN");
        titulo.setFont(new Font("Arial", Font.BOLD, 48));
        titulo.setForeground(textoColor);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titulo, gbc);


        JLabel userLabel = new JLabel("USUARIO:");
        userLabel.setFont(new Font("Arial", Font.BOLD, 26));
        userLabel.setForeground(textoColor);
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(userLabel, gbc);

        JTextField userText = new JTextField(20);
        userText.setFont(new Font("Arial", Font.PLAIN, 24));
        gbc.gridx = 1;
        panel.add(userText, gbc);

       
        JLabel passLabel = new JLabel("CONTRASEÑA:");
        passLabel.setFont(new Font("Arial", Font.BOLD, 26));
        passLabel.setForeground(textoColor);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(passLabel, gbc);

        JPasswordField passText = new JPasswordField(20);
        passText.setFont(new Font("Arial", Font.PLAIN, 24));
        gbc.gridx = 1;
        panel.add(passText, gbc);

  
        JPanel linkPanel = new JPanel();
        linkPanel.setBackground(fondoColor);
        JLabel recordarLabel = new JLabel("RECORDAR CONTRASEÑA");
        recordarLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        recordarLabel.setForeground(enlaceColor);

        JLabel registrarLabel = new JLabel("REGÍSTRATE");
        registrarLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        registrarLabel.setForeground(enlaceColor);
       registrarLabel.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               new Registro().setVisible(true);
           }
       });

        linkPanel.add(recordarLabel);
        linkPanel.add(Box.createHorizontalStrut(20));
        linkPanel.add(registrarLabel);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(linkPanel, gbc);

        JButton entrarButton = new JButton("ENTRAR");
        entrarButton.setFont(new Font("Arial", Font.BOLD, 24));
        entrarButton.setPreferredSize(new Dimension(200, 50));
        gbc.gridy = 4;
        entrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MenuPrincipal().setVisible(true);
            }
        });
        panel.add(entrarButton, gbc);

       
        JButton emailButton = new JButton("EMAIL");
        emailButton.setFont(new Font("Arial", Font.BOLD, 24));
        emailButton.setPreferredSize(new Dimension(200, 50));
        gbc.gridy = 5;
        panel.add(emailButton, gbc);

        JButton exitButton = new JButton("SALIR");
        exitButton.setFont(new Font("Arial", Font.BOLD, 24));
        exitButton.setPreferredSize(new Dimension(200, 50));
        gbc.gridy = 6;
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        panel.add(exitButton, gbc);

       
        add(panel);
        setVisible(true);
    }
}
