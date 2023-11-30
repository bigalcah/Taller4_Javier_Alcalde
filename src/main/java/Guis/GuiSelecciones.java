package Guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiSelecciones extends JFrame implements ActionListener {
    private JPanel panel;
    private JComboBox seleccionesCombo;
    private JLabel Imagen;
    private JButton playersBtn;
    private JButton exitBtn;
    private JPanel rankingLabel;
    private JLabel rankinBtn;

    public GuiSelecciones(){
        this.add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel);
        setVisible(true);
        setSize(300,500);
    }

    private void asignarEventos(){
        playersBtn.addActionListener(this);
        exitBtn.addActionListener(this);
        seleccionesCombo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == exitBtn) {
            dispose();
            System.exit(0);
        } else if (event.getSource() == playersBtn) {
            GuiPlayers guiPlayers = new GuiPlayers();
            guiPlayers.setVisible(true);
            this.setVisible(false);
        } else if (event.getSource() == seleccionesCombo)
            switch (seleccionesCombo.getSelectedIndex()){
                case 0:
                    Imagen.setIcon(new ImageIcon("src/Datos/datos/chi.png"));
            }
    }
}