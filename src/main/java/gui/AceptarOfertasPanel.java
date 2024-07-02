package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AceptarOfertasPanel extends JPanel {
    private JTextField agenciaField;
    private JTextField tituloField;

    public AceptarOfertasPanel() {
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(3, 2));

        JLabel agenciaLabel = new JLabel("Nombre de la Agencia:");
        agenciaField = new JTextField();

        JLabel tituloLabel = new JLabel("Título del Texto:");
        tituloField = new JTextField();

        JButton aceptarButton = new JButton("Aceptar Oferta");
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para aceptar ofertas de agencias
                String agencia = agenciaField.getText();
                String titulo = tituloField.getText();
                // Implementar la lógica para aceptar la oferta de la agencia
            }
        });

        add(agenciaLabel);
        add(agenciaField);
        add(tituloLabel);
        add(tituloField);
        add(new JLabel());
        add(aceptarButton);
    }
}
