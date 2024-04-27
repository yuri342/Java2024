package Gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import JavaBeans.Cliente;

public class Panel2 extends JPanel implements ActionListener{
    JButton Botao;
    JLabel texto1;
    JLabel texto2;
    JLabel texto3;
    JLabel texto4;
    JTextArea input1;
    JTextArea input2;
    JTextArea input3;
    ArrayList<Cliente> Dados;

    public Panel2(ArrayList<Cliente> Dados) {
        this.Dados = Dados;
        texto1 = new JLabel();
        texto2 = new JLabel();
        texto3 = new JLabel();
        texto4 = new JLabel();
        Botao = new JButton();
        input1 = new JTextArea();
        input2 = new JTextArea();
        input3 = new JTextArea();

        this.add(Botao);
        this.add(texto1);
        this.add(texto2);
        this.add(texto3);
        this.add(texto4);
        this.add(input1);
        this.add(input2);
        this.add(input3);
        
        Botao.setBackground(java.awt.Color.gray);
        Botao.addActionListener(this);
        Botao.setText("Pesquisar");
        Botao.setFont(new java.awt.Font("Arial", Font.BOLD, 13));
        Botao.setForeground(java.awt.Color.white);
        texto1.setText("Pesquisa");
        texto1.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        texto1.setForeground(java.awt.Color.white);
        texto2.setText("Nome:");
        texto2.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        texto2.setForeground(java.awt.Color.white);
        texto3.setText("Cpf:");
        texto3.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        texto3.setForeground(java.awt.Color.white);
        texto4.setText("Pesquisar:");
        texto4.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        texto4.setForeground(java.awt.Color.white);
        input1.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        input2.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        input3.setFont(new java.awt.Font("Arial", Font.BOLD, 15));

        input1.setBounds(100, 195, 200, 15);
        input2.setBounds(100, 230, 200, 15);
        input3.setBounds(120, 80, 200, 15);
        texto1.setBounds(135 , 0, 500, 80);
        texto3.setBounds(46 , 230, 45, 15);
        texto2.setBounds(46 , 195, 45, 15);
        texto4.setBounds(35 , 80, 100, 15);
        Botao.setBounds(130, 125, 100, 40);

        this.setBackground(java.awt.Color.darkGray);
        this.setLayout(null);
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int controle = 0;
        java.util.Iterator<Cliente> it=Dados.iterator();
        while (it.hasNext()) {
            Cliente Cliente = (Cliente) it.next();
            if (Cliente.getNome().equalsIgnoreCase(input3.getText())) {
                input1.setText(Cliente.getNome());
                input2.setText(Long.toString(Cliente.getCpf()));
                controle = 1;
            }   
        }
        if (controle == 0) {
            JOptionPane.showMessageDialog(null, "Dado não encontrado!");
        }
    }
}
