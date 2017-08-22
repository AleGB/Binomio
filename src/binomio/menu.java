/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class menu extends JFrame implements ActionListener{
    
    private JButton boton1, boton2, boton3;

    public menu(){
        configurarVentana();
        iniciarComponentes();
    }
    public void configurarVentana(){
        setTitle("Menu");
        setSize(800,700);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(220,216,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void iniciarComponentes(){
        boton1= new JButton("(a+b)^2");
        boton1.setBounds(100, 200, 200, 200);
        boton1.setFont(new Font("TimesRoman",Font.BOLD,25));
        boton1.addActionListener(this);
        boton1.setVisible(true);
        add(boton1);
        
        boton2 = new JButton("(ax+by)^2");
        boton2.setBounds(300, 200, 200, 200);
        boton2.setFont(new Font("TimesRoman",Font.BOLD,25));
        boton2.addActionListener(this);
        boton2.setVisible(true);
        add(boton2);
        
        boton3 = new JButton("(ax+by)^2");
        boton3.setBounds(500, 200, 200, 200);
        boton3.setFont(new Font("TimesRoman",Font.BOLD,25));
        boton3.addActionListener(this);
        boton3.setVisible(true);
        add(boton3);
    }

    @Override
    public void actionPerformed(ActionEvent e1) {
        if(e1.getSource()==boton1){
            v1 ven1 = new v1(this);
            this.setVisible(false);
            ven1.setVisible(true);
        }
        if(e1.getSource()==boton2){
            v2 ven2 = new v2(this);
            this.setVisible(false);
            ven2.setVisible(true);
        }
        if(e1.getSource()==boton3){
            v3 ven3 = new v3(this);
            this.setVisible(false);
            ven3.setVisible(true);
        }
    }
    
    
}
