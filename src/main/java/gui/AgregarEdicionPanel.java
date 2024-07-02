package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarEdicionPanel extends JPanel {
    private JTextField tituloField;
    private JTextField numeroEdicionField;

    public AgregarEdicionPanel() {
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(3, 2));

        JLabel tituloLabel = new JLabel("Título del Texto:");
        tituloField = new JTextField();

        JLabel numeroEdicionLabel = new JLabel("Número de Edición:");
        numeroEdicionField = new JTextField();

        JButton agregarButton = new JButton("Agregar Edición");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar una nueva edición a un texto
                String titulo = tituloField.getText();
                int numeroEdicion = Integer.parseInt(numeroEdicionField.getText());

                // Implementar la lógica para agregar la edición al texto correspondiente
            }
        });

        add(tituloLabel);
        add(tituloField);
        add(numeroEdicionLabel);
        add(numeroEdicionField);
        add(new JLabel());
        add(agregarButton);
    }
}
