package Guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiPlayers extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextArea jugadoresDatos;
    private JButton editarBtn;
    private JButton guardarBtn;
    private JButton volverBtn;
    private JLabel topLabel;

    public GuiPlayers(){
        this.add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel);
        setVisible(true);
        setSize(300,500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
