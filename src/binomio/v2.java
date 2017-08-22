/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class v2 extends JFrame implements ActionListener {

    private JLabel texto;
    private JLabel instruccion1;
    private JLabel instruccion2;
    private JLabel instruccion3;
    private JLabel instruccion4;
    private JTextField a;
    private JTextField b;
    private JTextField x;
    private JTextField y;
    private JButton resultado;
    private menu men;
    private JButton btnRegresar;

    public v2(menu men) {
        this.men = men;
        configurarVentana();
        iniciarComponentes();
    }

    public void configurarVentana() {
        setTitle("Binomio ");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(220, 216, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iniciarComponentes() {

        btnRegresar = new JButton("Menu");
        btnRegresar.setBounds(350, 40, 100, 30);
        btnRegresar.setFont(new Font("TimesRoman", Font.BOLD, 15));
        btnRegresar.addActionListener(this);
        btnRegresar.setVisible(true);
        add(btnRegresar);

        texto = new JLabel("(ax+bx)^2 = [(a^2)(x^2)] + 2(a)(x)(b)(y) + [(b^2)(y^2)]");
        texto.setBounds(10, 10, 400, 30);
        texto.setFont(new Font("TimesRoman", Font.BOLD, 15));
        add(texto);

        instruccion1 = new JLabel("Introduce 'a'");
        instruccion1.setBounds(10, 40, 150, 30);
        instruccion1.setFont(new Font("TimesRoman", Font.BOLD, 15));
        add(instruccion1);

        a = new JTextField();
        a.setBounds(10, 70, 150, 30);
        a.setFont(new Font("TimesRoman", Font.BOLD, 15));
        add(a);

        instruccion2 = new JLabel("Introduce 'b'");
        instruccion2.setBounds(10, 100, 170, 30);
        instruccion2.setFont(new Font("TimesRoman", Font.BOLD, 15));
        add(instruccion2);

        b = new JTextField();
        b.setBounds(10, 130, 150, 30);
        b.setFont(new Font("TimesRoman", Font.BOLD, 15));
        add(b);
        
        instruccion3 = new JLabel("Introduce 'x'");
        instruccion3.setBounds(10, 160, 170, 30);
        instruccion3.setFont(new Font("TimesRoman", Font.BOLD, 15));
        add(instruccion3);

        x = new JTextField();
        x.setBounds(10, 190, 150, 30);
        x.setFont(new Font("TimesRoman", Font.BOLD, 15));
        add(x);
        
        instruccion4 = new JLabel("Introduce 'y'");
        instruccion4.setBounds(10, 210, 170, 30);
        instruccion4.setFont(new Font("TimesRoman", Font.BOLD, 15));
        add(instruccion4);

        y = new JTextField();
        y.setBounds(10, 240, 150, 30);
        y.setFont(new Font("TimesRoman", Font.BOLD, 15));
        add(y);

        resultado = new JButton("Resultado");
        resultado.setBounds(10, 270, 150, 30);
        resultado.setFont(new Font("TimesRoman", Font.BOLD, 15));
        resultado.addActionListener(this);
        resultado.setVisible(true);
        add(resultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resultado) {
            int valora = Integer.parseInt(a.getText());
            int valorb = Integer.parseInt(b.getText());
            int valorx = Integer.parseInt(x.getText());
            int valory = Integer.parseInt(y.getText());
            JOptionPane.showMessageDialog(this, "El resultado del binomio es "+"(" + valora +"^2)"+"("+ valorx+"^2) + " + "2*" + valora + "*" + valorx +"*" + valorb+"*" + valory+ " + (" + valorb +"^2)"+"("+ valory+"^2)" + " = " + ((valora*valora) * (valorx*valorx) + (2 * valora * valorx * valorb *valory) + ((valorb*valorb) * (valory * valory))));
        }
        if (e.getSource() == btnRegresar) {
            this.setVisible(false);
            men.setVisible(true);
        }
    }
}
