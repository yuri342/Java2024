package Gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import JavaBeans.Cliente;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Panel extends JPanel implements ActionListener {
    JButton Botao;
    JLabel texto1;
    JLabel texto2;
    JLabel texto3;
    JTextArea input1;
    JTextArea input2;
    ArrayList<Cliente> Dados;

    public Panel(ArrayList<Cliente> Dados) {
        this.Dados = Dados;
        texto1 = new JLabel();
        texto2 = new JLabel();
        texto3 = new JLabel();
        Botao = new JButton();
        input1 = new JTextArea();
        input2 = new JTextArea();

        this.add(Botao);
        this.add(texto1);
        this.add(texto2);
        this.add(texto3);
        this.add(input1);
        this.add(input2);


        Botao.setBackground(java.awt.Color.gray);
        Botao.addActionListener(this);
        Botao.setText("Salvar");
        Botao.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        Botao.setForeground(java.awt.Color.white);
        texto1.setText("Cadastro Clientes");
        texto1.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        texto1.setForeground(java.awt.Color.white);
        texto2.setText("Nome:");
        texto2.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        texto2.setForeground(java.awt.Color.white);
        texto3.setText("Cpf:");
        texto3.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        texto3.setForeground(java.awt.Color.white);

        input1.setBounds(100, 115, 200, 15);
        input2.setBounds(100, 150, 200, 15);
        texto1.setBounds(98 , 0, 500, 80);
        texto3.setBounds(46 , 150, 45, 15);
        texto2.setBounds(46 , 115, 45, 15);
        Botao.setBounds(130, 200, 100, 40);

        this.setBackground(java.awt.Color.darkGray);
        this.setLayout(null);
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Cliente Cliente = new Cliente();
        Cliente.setNome(input1.getText());
        Cliente.setCpf(Long.parseLong(input2.getText()));
        Dados.add(Cliente); 
        input1.setText("");
        input2.setText("");
        JOptionPane.showMessageDialog(null, "ID Cadastrado: \n"+Dados.size()+" clientes cadastrados");
    }
}
