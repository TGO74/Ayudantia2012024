package gui;



import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        initUI();
    }

    private void initUI() {
        setTitle("Sistema de Gestión de Editorial Internacional");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        CrearTextoPanel crearTextoPanel = new CrearTextoPanel();
        AgregarEdicionPanel agregarEdicionPanel = new AgregarEdicionPanel();
        BuscarAutoresPanel buscarAutoresPanel = new BuscarAutoresPanel();
        BuscarEdicionesPanel buscarEdicionesPanel = new BuscarEdicionesPanel();

        AprobarTextoPanel aprobarTextoPanel = new AprobarTextoPanel();

        ReabastecerTiendasPanel reabastecerTiendasPanel = new ReabastecerTiendasPanel();
        AceptarOfertasPanel aceptarOfertasPanel = new AceptarOfertasPanel();
        ImpresionesVentasPanel impresionesVentasPanel = new ImpresionesVentasPanel();

        tabbedPane.addTab("Crear Texto", crearTextoPanel);
        tabbedPane.addTab("Agregar Edición", agregarEdicionPanel);
        tabbedPane.addTab("Buscar Autores", buscarAutoresPanel);
        tabbedPane.addTab("Buscar Ediciones", buscarEdicionesPanel);

        tabbedPane.addTab("Aprobar Texto", aprobarTextoPanel);

        tabbedPane.addTab("Reabastecer Tiendas", reabastecerTiendasPanel);
        tabbedPane.addTab("Aceptar Ofertas", aceptarOfertasPanel);
        tabbedPane.addTab("Impresiones y Ventas", impresionesVentasPanel);

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
