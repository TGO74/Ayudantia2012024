package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Texto;
import model.data.Datos;

public class ImpresionesVentasPanel extends JPanel {
    private JTextField tituloField;
    private JTextArea resultadoArea;
    private Datos datos;

    public ImpresionesVentasPanel() {
        datos = new Datos();
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        JPanel panelBusqueda = new JPanel();

        panelBusqueda.setLayout(new GridLayout(1, 2));

        JLabel tituloLabel = new JLabel("Título del Texto:");

        tituloField = new JTextField();

        JButton buscarButton = new JButton("Buscar");

        buscarButton.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               // Lógica para buscar ventas de un texto
                                               String titulo = tituloField.getText();
                                               Texto texto = datos.getTexto(titulo);
                                               resultadoArea.setText("");
                                               if (texto != null) {
                                                   resultadoArea.append("Título: " + texto.getTitulo() + "\n");
                                                   resultadoArea.append("Autor: " + texto.getAutor().getNombre() + "\n");
                                                   resultadoArea.append("Ventas: " + texto.getVentas() + "\n");
                                               } else {
                                                   resultadoArea.append("Texto no encontrado\n");
                                               }
                                           }
                                       }

        );

        panelBusqueda.add(tituloLabel);

        panelBusqueda.add(tituloField);

        resultadoArea = new JTextArea();

        resultadoArea.setEditable(false);

        add(panelBusqueda, BorderLayout.NORTH);

        add(new JScrollPane(resultadoArea), BorderLayout.CENTER);

        add(buscarButton, BorderLayout.SOUTH);

    }

}

