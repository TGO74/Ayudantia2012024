package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearTextoPanel extends JPanel {
    private JTextField tituloField;
    private JComboBox<String> autorComboBox;
    private JTextField paisField;
    private JTextField ciudadOrigenField;
    private JTextField copiasImpresasField;
    private JTextField tipoField;
    private JTextField detallesField;

    public CrearTextoPanel() {
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(8, 2));

        JLabel tituloLabel = new JLabel("Título:");
        tituloField = new JTextField();

        JLabel autorLabel = new JLabel("Autor:");
        autorComboBox = new JComboBox<>(new String[]{"AutorLibro", "AutorPoema", "AutorComic"});

        JLabel paisLabel = new JLabel("País:");
        paisField = new JTextField();

        JLabel ciudadOrigenLabel = new JLabel("Ciudad de Origen (opcional):");
        ciudadOrigenField = new JTextField();

        JLabel copiasImpresasLabel = new JLabel("Copias Impresas:");
        copiasImpresasField = new JTextField();

        JLabel tipoLabel = new JLabel("Tipo de Texto (Libro/Poema/Comic):");
        tipoField = new JTextField();

        JLabel detallesLabel = new JLabel("Detalles (Páginas/Versos/Viñetas):");
        detallesField = new JTextField();

        JButton crearButton = new JButton("Crear Texto");
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para crear un nuevo texto
                String titulo = tituloField.getText();
                String autor = (String) autorComboBox.getSelectedItem();
                String pais = paisField.getText();
                String ciudadOrigen = ciudadOrigenField.getText();
                int copiasImpresas = Integer.parseInt(copiasImpresasField.getText());
                String tipo = tipoField.getText();
                String detalles = detallesField.getText();

                // Implementar la lógica para crear el texto y añadirlo a la lista de textos
            }
        });

        add(tituloLabel);
        add(tituloField);
        add(autorLabel);
        add(autorComboBox);
        add(paisLabel);
        add(paisField);
        add(ciudadOrigenLabel);
        add(ciudadOrigenField);
        add(copiasImpresasLabel);
        add(copiasImpresasField);
        add(tipoLabel);
        add(tipoField);
        add(detallesLabel);
        add(detallesField);
        add(new JLabel());
        add(crearButton);
    }
}
