package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import model.Autor;
import model.data.Datos;

public class BuscarAutoresPanel extends JPanel {
    private JTextField nombreField;
    private JTextArea resultadoArea;
    private Datos datos;

    public BuscarAutoresPanel() {
        datos = new Datos();
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        JPanel panelBusqueda = new JPanel();
        panelBusqueda.setLayout(new GridLayout(1, 2));

        JLabel nombreLabel = new JLabel("Nombre del Autor:");
        nombreField = new JTextField();

        JButton buscarButton = new JButton("Buscar");
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para buscar autores
                String nombre = nombreField.getText();
                List<Autor> autores = datos.getAutores();
                resultadoArea.setText("");
                for (Autor autor : autores) {
                    if (autor.getNombre().equalsIgnoreCase(nombre)) {
                        resultadoArea.append("Nombre: " + autor.getNombre() + "\n");
                        resultadoArea.append("Fecha de Nacimiento: " + autor.getFechaNacimiento() + "\n");
                        resultadoArea.append("Seudónimos: " + autor.getSeudonimos() + "\n\n");
                    }
                }
            }
        });

        panelBusqueda.add(nombreLabel);
        panelBusqueda.add(nombreField);

        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        add(panelBusqueda, BorderLayout.NORTH);
        add(new JScrollPane(resultadoArea), BorderLayout.CENTER);
        add(buscarButton, BorderLayout.SOUTH);
    }
}
