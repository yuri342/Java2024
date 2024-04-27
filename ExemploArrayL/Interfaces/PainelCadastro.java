/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import JavaBeans.Cliente;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CLIENTE
 */
public class PainelCadastro extends JPanel implements ActionListener{
        
        JLabel texto1, texto2, texto3;
        JButton salvar;
        JTextField caixa1, caixa2;
        ArrayList dados;
        
    public PainelCadastro(ArrayList dados) {
         this.dados=dados;
      
        
        texto1 = new JLabel ("========== Cadastro Clientes ==========");
        texto2 = new JLabel ("Nome: ");
        texto3 = new JLabel ("CPF: ");
        salvar = new JButton ("Salvar");
        caixa1 = new JTextField ();
        caixa2 = new JTextField ();
        
        texto1.setBounds (80, 15, 300, 20);
        texto2.setBounds (25, 70, 50, 20);
        texto3.setBounds (25, 120, 50, 20);
        salvar.setBounds (150, 200, 100, 20);
        caixa1.setBounds (80, 70, 280, 20);
        caixa2.setBounds (80, 120, 280, 20);
        
        this.add (texto1);
        this.add (texto2);
        this.add (texto3);
        this.add (salvar);
        this.add (caixa1);
        this.add (caixa2);
        
        this.setSize (400, 300);
        this.setBounds (200, 15, 400, 300);
        this.setBackground (Color.LIGHT_GRAY);
        this.setLayout (null);
        this.setVisible (false);

        salvar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Cliente cliente = new Cliente();
        cliente.setNome(caixa1.getText());
        cliente.setCpf(Long.parseLong(caixa2.getText()));
        
        dados.add(cliente);
        
        caixa1.setText ("");
        caixa2.setText ("");
        JOptionPane.showMessageDialog(null, "ID Cadastrado: \n"+dados.size()+" clientes cadastrados");
        

    }
 
}
