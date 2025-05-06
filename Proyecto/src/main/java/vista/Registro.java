package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

    

public class Registro  extends JFrame {

    public Registro() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(230, 240, 255)); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font labelFont = new Font("Arial", Font.BOLD, 20);
        Font inputFont = new Font("Arial", Font.PLAIN, 18);

        int y = 0;

   
        gbc.gridx = 0;
        gbc.gridy = y++;
        gbc.gridwidth = 2;
        JLabel titulo = new JLabel("FORMULARIO REGISTRO");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo, gbc);
        gbc.gridwidth = 1;

      
        String[] labels = {"NOMBRE:", "APELLIDOS:", "USERNAME:", "CONTRASEÑA:", "EMAIL:", "NÚMERO CTA:"};
        for (String labelText : labels) {
            gbc.gridx = 0;
            gbc.gridy = y;
            JLabel label = new JLabel(labelText);
            label.setFont(labelFont);
            panel.add(label, gbc);

            gbc.gridx = 1;
            JTextField field = labelText.equals("PASSWORD:") ? new JPasswordField() : new JTextField();
            field.setFont(inputFont);
            panel.add(field, gbc);

            y++;
        }

       
        gbc.gridx = 0;
        gbc.gridy = y;
        JLabel tipoLabel = new JLabel("TIPO CUENTA:");
        tipoLabel.setFont(labelFont);
        panel.add(tipoLabel, gbc);

        gbc.gridx = 1;
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        radioPanel.setBackground(panel.getBackground());
        JRadioButton normal = new JRadioButton("NORMAL");
        JRadioButton premium = new JRadioButton("PREMIUM");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(normal);
        grupo.add(premium);
        radioPanel.add(normal);
        radioPanel.add(premium);
        panel.add(radioPanel, gbc);

        y++;

   
        gbc.gridx = 0;
        gbc.gridy = y;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton boton = new JButton("REGISTRARSE");
        boton.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(boton, gbc);

        gbc.gridx = 0;
        gbc.gridy = y + 1;
        gbc.gridwidth = 2;
        JButton mensaje = new JButton("CANCELAR");
        mensaje.setFont(new Font("Arial", Font.BOLD, 20));
       mensaje.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               dispose();
           }
       });
        panel.add(mensaje, gbc);

        add(panel);
        setVisible(true);
    }
}
    

