package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AprobarTextoPanel extends JPanel {
    private JTextField tituloField;

    public AprobarTextoPanel() {
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(2, 2));

        JLabel tituloLabel = new JLabel("Título del Texto en Lista de Espera:");
        tituloField = new JTextField();

        JButton aprobarButton = new JButton("Aprobar Texto");
        aprobarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para aprobar un texto en lista de espera
                String titulo = tituloField.getText();
                // Implementar la lógica para aprobar el texto
            }
        });

        add(tituloLabel);
        add(tituloField);
        add(new JLabel());
        add(aprobarButton);
    }
}
