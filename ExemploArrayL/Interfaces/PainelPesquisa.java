/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import JavaBeans.Cliente;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
/**
 *
 * @author CLIENTE
 */
public class PainelPesquisa extends JPanel implements ActionListener{
    
        JLabel texto1, texto2, texto3;
        JButton pesquisar;
        JTextField caixa1, caixa2, caixa3;
        
        ArrayList dados;
        
    public PainelPesquisa (ArrayList dados) {
        
        this.dados=dados;
        
        this.setSize (400, 300);
        this.setBounds (200, 15, 400, 300);
        this.setBackground (Color.GRAY);
        this.setLayout (null);
        this.setVisible (false);
        
        texto1 = new JLabel ("Pesquisar por: ");
        texto2 = new JLabel ("Nome: ");
        texto3 = new JLabel ("CPF: ");
        pesquisar = new JButton ("Pesquisar");
        caixa1 = new JTextField ();
        caixa2 = new JTextField ();
        caixa3 = new JTextField ();
        
        texto1.setBounds(30, 20, 100, 20);
        texto2.setBounds(30, 120, 50, 20);
        texto3.setBounds(30, 160, 50, 20);
        pesquisar.setBounds(150, 80, 100, 20);
        caixa1.setBounds(140, 20, 200, 20);
        caixa2.setBounds(80, 120, 280, 20);
        caixa3.setBounds(80, 160, 280, 20);
        
        this.add (texto1);
        this.add (texto2);
        this.add (texto3);
        this.add (pesquisar);
        this.add (caixa1);
        this.add (caixa2);
        this.add (caixa3);
   
        pesquisar.addActionListener (this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int controle=0;
        Iterator it=dados.iterator();
        while (it.hasNext()){
            Cliente cliente=(Cliente) it.next();
           if(cliente.getNome().equalsIgnoreCase(caixa1.getText())){
                caixa2.setText(cliente.getNome());
                caixa3.setText(Long.toString(cliente.getCpf()));
                controle=1;
            }
               
        }
        if(controle==0)
            JOptionPane.showMessageDialog(null, "Dado não encontrado!");
    }
}
