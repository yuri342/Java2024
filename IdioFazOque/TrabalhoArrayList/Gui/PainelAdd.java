package TrabalhoArrayList.Gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class PainelAdd extends JPanel implements ActionListener {
    JTextArea inputNome;
    JTextArea inputTelefone;
    JTextArea Celular;
    JTextArea Telefone;
    JTextArea Email;
    JRadioButton TelPrincipal;
    JRadioButton CelPrincipal;
    JComboBox<String> Combo;
    JLabel NomeLabel;
    JLabel TelefoneLabel;
    JLabel CelularLabel;
    JLabel EmailLabel;
    JLabel GrupoLabel;
    JButton Salvar;
    JButton Cancelar;
    JButton Apagar;
    JLabel titulo;
    
    public PainelAdd(){

        Salvar = new JButton();
        Cancelar = new JButton();
        Apagar = new JButton();
        inputNome = new JTextArea();
        inputTelefone= new JTextArea();
        Celular = new JTextArea();
        CelPrincipal = new JRadioButton();
        TelPrincipal = new JRadioButton();
        Combo = new JComboBox<String>();
        Email = new JTextArea();
        Telefone = new JTextArea();
        Email = new JTextArea();
        EmailLabel = new JLabel();
        GrupoLabel = new JLabel();
        CelularLabel = new JLabel();
        TelefoneLabel = new JLabel();
        NomeLabel = new JLabel();
        titulo = new JLabel();

        this.add(Salvar);
        this.add(Apagar);
        this.add(Cancelar);
        this.add(inputNome);
        this.add(inputTelefone);
        this.add(Celular);
        this.add(CelPrincipal);
        this.add(TelPrincipal);
        this.add(Combo);
        this.add(Email);
        this.add(Telefone);
        this.add(GrupoLabel);
        this.add(EmailLabel);
        this.add(CelularLabel);
        this.add(TelefoneLabel);
        this.add(NomeLabel);
        this.add(titulo);

        Combo.addItem("Nenhum");
        Combo.addItem("Amigos");
        Combo.addItem("Familia");
        Combo.addItem("AmigosIntimos");
        Combo.addItem("Trabalho");
        Combo.addItem("Faculdade");
        NomeLabel.setText("Nome:");
        TelefoneLabel.setText("Telefone:");
        CelularLabel.setText("Celular:");
        EmailLabel.setText("E-mail:");
        GrupoLabel.setText("Grupo:");
        NomeLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        TelefoneLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        CelularLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        EmailLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        GrupoLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        titulo.setText("Novo Contato");
        titulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        titulo.setForeground(Color.white);
        NomeLabel.setForeground(Color.white);   
        TelefoneLabel.setForeground(Color.white);
        CelularLabel.setForeground(Color.white);
        EmailLabel.setForeground(Color.white);
        GrupoLabel.setForeground(Color.white);
        Salvar.setText("Salvar");
        Apagar.setText("Apagar");
        Cancelar.setText("Cancelar");
        Salvar.setForeground(Color.black);
        Apagar.setForeground(Color.black);
        Cancelar.setForeground(Color.black);
        Salvar.setBackground(Color.lightGray);
        Apagar.setBackground(Color.lightGray);
        Cancelar.setBackground(Color.lightGray);
        Salvar.addActionListener(this);
        Apagar.addActionListener(this);
        Cancelar.addActionListener(this);
        CelPrincipal.setBackground(Color.darkGray);
        TelPrincipal.setBackground(Color.darkGray);

        titulo.setBounds(25,0,150,50);
        inputNome.setBounds(100, 100, 250, 15);
        inputTelefone.setBounds(100, 150, 210, 15);
        Celular.setBounds(100, 200, 210, 15);
        Email.setBounds(100, 250, 250, 15);
        Combo.setBounds(100, 300, 250, 20);
        CelPrincipal.setBounds(315, 198, 20, 20);
        TelPrincipal.setBounds(315, 148, 20, 20);
        NomeLabel.setBounds(55,100,50,10);
        TelefoneLabel.setBounds(40,150,60,10);
        CelularLabel.setBounds(45,200,50,10);
        EmailLabel.setBounds(45,250,50,10);
        GrupoLabel.setBounds(45,305,50,10);
        Salvar.setBounds(50,350,100,50);
        Apagar.setBounds(160,350,100,50);
        Cancelar.setBounds(270,350,100,50);




        this.setBackground(java.awt.Color.darkGray);
        this.setLayout(null);
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}