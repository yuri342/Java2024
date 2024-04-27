package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import JavaBeans.Cliente;


public class FramePrincipal extends JFrame implements ActionListener {

    JLabel texto1;
    JButton B1;
    JButton B2;
    Panel panel;
    Panel2 panelC;
    ArrayList<Cliente> Dados;

    public FramePrincipal() {
        // Instancias
        ArrayList<Cliente> Dados = new ArrayList<>();
        texto1 = new JLabel();
        texto1 = new JLabel();
        B1 = new JButton();
        B2 = new JButton();
        panel = new Panel(Dados);
        panelC = new Panel2(Dados);

        // adds
        this.add(texto1);
        this.add(B1);
        this.add(B2);
        this.add(panel);
        this.add(panelC);

        // texto1
        texto1.setText("--MENU--");
        texto1.setFont(new java.awt.Font("Arial", Font.BOLD, 20));

        // B1
        B1.setBackground(Color.gray);
        B1.setText("Cadastrar");
        B1.addActionListener(this);
        B1.setForeground(java.awt.Color.white);

        // B1
        B2.setBackground(Color.gray);
        B2.setText("Pesquisar");
        B2.setForeground(java.awt.Color.white);
        B2.addActionListener(this);

        // bounds
        texto1.setBounds(30, 0, 100, 50);
        B1.setBounds(30, 55, 100, 45);
        B2.setBounds(30, 110, 100, 45);
        panel.setBounds(200, 45, 350, 300);
        panelC.setBounds(200, 45, 350, 300);

        this.setSize(600, 400);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Aula-ArrayList-Cadastro");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(B1)) {
            panel.setVisible(true);
            panelC.setVisible(false);
        } else {
            if (e.getSource().equals(B2)) {
                panelC.setVisible(true);
                panel.setVisible(false);
            }
        }
    }

}
