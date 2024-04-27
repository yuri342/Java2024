package Gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import JavaBeans.Contato;

public class Pesquisa extends JPanel implements ActionListener {
    JTextArea inputNome;
    JTextArea inputTelefone;
    JTextArea Celular;
    JTextArea Telefone;
    JTextArea Email;
    JRadioButton NomePrincipal;
    JRadioButton CelPrincipal;
    JTextArea Combo;
    JLabel NomeLabel;
    JLabel TelefoneLabel;
    JLabel CelularLabel;
    JLabel EmailLabel;
    JLabel GrupoLabel;
    JButton Fechar;
    JButton Cancelar;
    JButton Excluir;
    JLabel titulo;
    JTextArea Pesquisa;
    JLabel PesquisaLabel;
    JLabel NomePp;
    JLabel CelularPp;
    JButton PesqB;
    JLabel PpLabel;
    ArrayList dados;
    ButtonGroup BG;
    
    public Pesquisa(ArrayList dados){
        this.dados = dados;
        BG = new ButtonGroup();
        NomePp = new JLabel();
        CelularPp = new JLabel();
        PesqB = new JButton();
        PpLabel = new JLabel();
        PesquisaLabel = new JLabel();
        Pesquisa = new JTextArea();
        Fechar = new JButton();
        Cancelar = new JButton();
        Excluir = new JButton();
        inputNome = new JTextArea();
        inputTelefone= new JTextArea();
        Celular = new JTextArea();
        CelPrincipal = new JRadioButton();
        NomePrincipal = new JRadioButton();
        Combo = new JTextArea();
        Email = new JTextArea();
        Telefone = new JTextArea();
        Email = new JTextArea();
        EmailLabel = new JLabel();
        GrupoLabel = new JLabel();
        CelularLabel = new JLabel();
        TelefoneLabel = new JLabel();
        NomeLabel = new JLabel();
        titulo = new JLabel();

        
        this.add(PpLabel);
        this.add(NomePp);
        this.add(CelularPp);
        this.add(PesqB);
        this.add(PesquisaLabel);
        this.add(Pesquisa);
        this.add(Fechar);
        this.add(Excluir);
        this.add(Cancelar);
        this.add(inputNome);
        this.add(inputTelefone);
        this.add(Celular);
        this.add(CelPrincipal);
        this.add(NomePrincipal);
        this.add(Combo);
        this.add(Email);
        this.add(Telefone);
        this.add(GrupoLabel);
        this.add(EmailLabel);
        this.add(CelularLabel);
        this.add(TelefoneLabel);
        this.add(NomeLabel);
        this.add(titulo);
        this.add(CelularPp);
        this.add(PesqB);
        this.add(PpLabel);

        NomePp.setText("Nome");
        PpLabel.setText("Pesquisar Por:");
        CelularPp.setText("Celular");
        NomeLabel.setText("Nome:");
        TelefoneLabel.setText("Telefone:");
        CelularLabel.setText("Celular:");
        EmailLabel.setText("E-mail:");
        GrupoLabel.setText("Grupo:");
        PesquisaLabel.setText("Pesquisar Por:");
        PpLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        NomePp.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        CelularPp.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        PesquisaLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        NomeLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        TelefoneLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        CelularLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        EmailLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        GrupoLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        PesqB.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        titulo.setText("Pesquisar");
        titulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        titulo.setForeground(Color.white);
        NomePp.setForeground(Color.white);
        PpLabel.setForeground(Color.white);
        CelularPp.setForeground(Color.white);
        NomeLabel.setForeground(Color.white);   
        TelefoneLabel.setForeground(Color.white);
        CelularLabel.setForeground(Color.white);
        EmailLabel.setForeground(Color.white);
        GrupoLabel.setForeground(Color.white);
        Fechar.setText("Editar");
        Excluir.setText("Excluir");
        Cancelar.setText("Cancelar");
        PesqB.setText("Pesquisar");
        PesqB.setForeground(Color.BLACK);
        Fechar.setForeground(Color.black);
        Excluir.setForeground(Color.black);
        Cancelar.setForeground(Color.black);
        Fechar.setBackground(Color.lightGray);
        Excluir.setBackground(Color.lightGray);
        Cancelar.setBackground(Color.lightGray);
        PesqB.setBackground(Color.lightGray);
        Fechar.addActionListener(this);
        Excluir.addActionListener(this);
        Cancelar.addActionListener(this);
        PesqB.addActionListener(this);
        CelPrincipal.setBackground(Color.darkGray);
        NomePrincipal.setBackground(Color.darkGray);
        BG.add(NomePrincipal);
        BG.add(CelPrincipal);

        titulo.setBounds(25,0,150,28);
        inputNome.setBounds(100, 100, 250, 15);
        inputTelefone.setBounds(100, 150, 210, 15);
        Celular.setBounds(100, 200, 210, 15);
        Email.setBounds(100, 250, 250, 15);
        Combo.setBounds(100, 300, 250, 15);
        CelPrincipal.setBounds(160, 35, 20, 20);
        NomePrincipal.setBounds(260, 35, 20, 20);
        NomeLabel.setBounds(55,100,50,10);
        TelefoneLabel.setBounds(40,150,60,10);
        CelularLabel.setBounds(45,200,50,10);
        EmailLabel.setBounds(45,250,50,10);
        GrupoLabel.setBounds(45,305,50,10);
        Fechar.setBounds(50,350,100,50);
        Excluir.setBounds(160,350,100,50);
        Cancelar.setBounds(270,350,100,50);
        Pesquisa.setBounds(100,60,200,18);
        NomePp.setBounds(290,36,100,20);
        CelularPp.setBounds(190,36,100,20);
        PpLabel.setBounds(60,45,100,10);
        PesqB.setBounds(315,60,100,20);




        this.setBackground(java.awt.Color.darkGray);
        this.setLayout(null);
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(PesqB)) {
            System.out.println("OK");
            int Controle = 0;
            java.util.Iterator<Contato> it=dados.iterator();
            if (CelPrincipal.isSelected()) {
                System.out.println("CellOk");
                while (it.hasNext()) {
                    Contato contato = (Contato) it.next();
                    if (contato.getCelular() == Long.parseLong(Pesquisa.getText())) {
                        System.out.println("ContatoACHADOCell");
                        inputNome.setText(contato.getNome());
                        inputTelefone.setText(Long.toString(contato.getTelefone()));
                        Email.setText(contato.getEmail());
                        Combo.setText(contato.getGrupo());
                        Celular.setText(Long.toString(contato.getCelular()));
                        Telefone.setText(Long.toString(contato.getTelefone()));
                        Controle = 1;
                    }
                }
                if (Controle == 0) {
                    System.out.println("ContatoNãoEncontrado");
                    JOptionPane.showMessageDialog(null, "NãoEncontrado", "ERRO", 1);
                }                
            }
            if (NomePrincipal.isSelected()) {
                System.out.println("NomeOk");
                while (it.hasNext()) {
                    Contato contato = (Contato) it.next();
                    if (contato.getNome().equalsIgnoreCase(Pesquisa.getText())) {
                        System.out.println("ContatoACHADONome");
                        inputNome.setText(contato.getNome());
                        inputTelefone.setText(Long.toString(contato.getTelefone()));
                        Email.setText(contato.getEmail());
                        Combo.setText(contato.getGrupo());
                        Celular.setText(Long.toString(contato.getCelular()));
                        Telefone.setText(Long.toString(contato.getTelefone()));
                        Controle = 1;
                    }
                }
                if (Controle == 0) {
                    System.out.println("ContatoNãoEncontrado");
                    JOptionPane.showMessageDialog(null, "NãoEncontrado", "ERRO", 1);
                }
            }
        }

        if (e.getSource().equals(Excluir)) {
            String termoPesquisa = Pesquisa.getText();
            java.util.Iterator<Contato> it = dados.iterator();
            while (it.hasNext()) {
                Contato contato = it.next();
                if (contato.getNome().equalsIgnoreCase(termoPesquisa) || Long.toString(contato.getCelular()).equals(termoPesquisa)) {
                    it.remove();
                    System.out.println("Contato removido: " + contato);
                    inputNome.setText("");
                    inputTelefone.setText("");
                    Email.setText("");
                    Combo.setText("Nenhum");
                    Celular.setText("");
                }
            }
            
        }

        if (e.getSource().equals(Cancelar)) {
            inputNome.setText("");
            inputTelefone.setText("");
            Email.setText("");
            Combo.setText("Nenhum");
            Celular.setText("");
            this.setVisible(false);
        }

        if (e.getSource().equals(Fechar)) {
            String termoPesquisa = Pesquisa.getText();
            java.util.Iterator<Contato> it = dados.iterator();
            while (it.hasNext()) {
                Contato contato = it.next();
                if (contato.getNome().equalsIgnoreCase(termoPesquisa) || Long.toString(contato.getCelular()).equals(termoPesquisa)) {
                    contato.setNome(inputNome.getText());
                    contato.setCelular(Long.parseLong(Celular.getText()));
                    contato.setTelefone(Long.parseLong(inputTelefone.getText()));
                    contato.setEmail(Email.getText());
                    contato.setGrupo(Combo.getText());
                }
            }
        }
    }
}