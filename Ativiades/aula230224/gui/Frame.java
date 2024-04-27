package aula230224.gui;

import java.awt.Font;

import javax.swing.JFrame;

public class Frame extends JFrame{
    Painel painel;
    TextArea textarea;
    Text text1;
    Text text2;
    Butao botao;
    public Frame(){
        //botao
        botao = new Butao();
        botao.setBounds(500,74,70,20);
        botao.setText("Entrar");
        botao.setForeground(java.awt.Color.WHITE);
        botao.setBackground(java.awt.Color.GRAY);
        this.add(botao);

        //Text2
        text2 = new Text();
        text2.setBounds(25,60,200,50);
        text2.setForeground(java.awt.Color.WHITE);
        text2.setText("Digite seu nome para entrar :"); 
        text2.setLabelFor(textarea);
        text2.setFont(new java.awt.Font("Arial", Font.BOLD, 13));
        this.add(text2);

        //Text1
        text1 = new Text();
        text1.setBounds(220,11,200,50);
        text1.setForeground(java.awt.Color.WHITE);
        text1.setText("Bem Vindo!!"); 
        text1.setFont(new java.awt.Font("Arial", Font.PLAIN, 30));
        this.add(text1);

        //TextArea
        textarea = new TextArea();
        textarea.setBounds(220, 75, 270,19);
        textarea.setFont(new java.awt.Font("Arial", Font.BOLD, 13));
        this.add(textarea);
        //painel
        painel = new Painel();
        painel.setVisible(true);
        painel.setBounds(0,0, 600, 300);
        painel.setBackground(java.awt.Color.DARK_GRAY);
        this.add(painel); 
        
        this.setSize(600,200);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Aula-23/02");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        
    }
}
