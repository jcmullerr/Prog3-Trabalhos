package br.feevale.telas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Container;

public class TelaExemplo extends JFrame {
	
	public TelaExemplo() {
		
		JLabel lbl = new JLabel("Bem-Vindo!");
		JTextField tf = new JTextField();
		JButton bt = new JButton("Aperte aqui!");
		JCheckBox cb = new JCheckBox();
		JRadioButton rb = new JRadioButton();
		JComboBox cbx = new JComboBox();
		Container container = new Container();
		
		setBounds(341, 192, 800, 600);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		getContentPane().add(lbl);
		getContentPane().add(tf);
		getContentPane().add(bt);
		getContentPane().add(cb);
		getContentPane().add(rb);
		getContentPane().add(cbx);
		
		lbl.setBounds(10, 10, 300, 27);
		tf.setBounds(80, 10, 300, 27);
		bt.setBounds(10, 50, 150, 27);
		cb.setBounds(10, 100, 17, 15);
		rb.setBounds(10, 150, 17, 17);
		cbx.setBounds(10, 200, 300, 25);
		
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		
		new TelaExemplo();
		
	}
	
}
