package Guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiSelecciones extends JFrame implements ActionListener {
    private JPanel panel;
    private JComboBox comboBox1;
    private JLabel Imagen;
    private JButton playersBtn;
    private JButton exitBtn;
    private JTextField rankingFIFATextField;
    private JPanel rankingLabel;

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
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}