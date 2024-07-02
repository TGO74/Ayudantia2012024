package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReabastecerTiendasPanel extends JPanel {
    private JTextField tituloField;
    private JTextField cantidadField;

    public ReabastecerTiendasPanel() {
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(3, 2));

        JLabel tituloLabel = new JLabel("Título del Texto:");
        tituloField = new JTextField();

        JLabel cantidadLabel = new JLabel("Cantidad de Copias:");
        cantidadField = new JTextField();

        JButton reabastecerButton = new JButton("Reabastecer");
        reabastecerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para reabastecer tiendas
                String titulo = tituloField.getText();
                int cantidad = Integer.parseInt(cantidadField.getText());
                // Implementar la lógica para reabastecer las tiendas
            }
        });

        add(tituloLabel);
        add(tituloField);
        add(cantidadLabel);
        add(cantidadField);
        add(new JLabel());
        add(reabastecerButton);
    }
}
