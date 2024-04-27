/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author CLIENTE
 */
public class TelaPrincipal extends JFrame implements ActionListener{
       
        JLabel texto1;
        JButton cadastrar, pesquisar;
        PainelCadastro painel1;
        PainelPesquisa painel2;
 
        
    public TelaPrincipal (){
        ArrayList dados=new ArrayList(); 
 
        
        painel1 = new PainelCadastro (dados);
        
        this.add (painel1);
        
        painel2 = new PainelPesquisa (dados);
        
        this.add (painel2);
        
        texto1 = new JLabel ("====== MENU ======");
        cadastrar = new JButton ("Cadastrar");
        pesquisar = new JButton ("Pesquisar");
       
        texto1.setBounds (25, 30, 150, 20);
        cadastrar.setBounds (15, 70, 150, 50);
        pesquisar.setBounds (15, 140, 150, 50);
        
        this.add (texto1);
        this.add (cadastrar);
        this.add (pesquisar);
        
        cadastrar.addActionListener (this);
        pesquisar.addActionListener (this);
        
        this.setTitle ("Sistema de Cadastros");
        this.setLayout (null);
        this.setSize (630, 370);
        this.setVisible (true);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource ().equals (cadastrar)) {
            painel1.setVisible (true);
            painel2.setVisible (false);
        }
        else
            if (e.getSource ().equals (pesquisar)) {
                painel2.setVisible (true);
                painel1.setVisible (false);
            }
            
    }
    
}
