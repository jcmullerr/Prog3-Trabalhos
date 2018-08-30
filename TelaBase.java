package br.feevale.telas;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.ArrayList;

public class TelaBase extends JFrame implements ActionListener {
	
	Container container = getContentPane();
	ArrayList<JTextField> listaTF = new ArrayList<JTextField>();
	
	public TelaBase() {
		
		setBounds(120, 100, 800, 450);
		setLayout(null);
		setTitulo("Calculadora");
		
		addLabel("Cateto Oposto:", 50, 85, 100, 15);
		addTextField(150, 82, 100, 20);
		addLabel("Cateto Adjacente:", 35, 112, 100, 15);
		addTextField(150, 110, 100, 20);
		addLabel("Hipotenusa:", 68, 140, 100, 15);
		addTextField(150, 138, 100, 20);
		addButton("Calcular", 100, 200, 100, 30);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		
		new TelaBase();
		
	}
	
	public JLabel addLabel(String texto, int x, int y, int w, int h) {
		
		JLabel l = new JLabel(texto);
		l.setBounds(x, y, w, h);
		container.add(l);
		return l;
		
	}
	
	public JTextField addTextField(int x, int y, int w, int h) {
		
		JTextField tf = new JTextField();
		tf.setBounds(x, y, w, h);
		container.add(tf);
		listaTF.add(tf);
		return tf;
		
	}
	
	public JButton addButton(String titulo, int x, int y, int w, int h) {
		
		JButton bt = new JButton(titulo);
		bt.setBounds(x, y, w, h);
		container.add(bt);
		bt.addActionListener(this);
		return bt;
		
	}
	
	public void setTitulo(String título) {
		
		Color cor = new Color(173, 255, 77);
		
		JLabel l = new JLabel(título);
		getContentPane().add(l);
		l.setBounds(0, 0, 800, 35);
		
		l.setForeground(cor);
		l.setBackground(Color.DARK_GRAY);
		l.setOpaque(true);
		l.setHorizontalAlignment(SwingConstants.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int v1 = 0;
		int v2 = 0;
		int total = 0;
		
		for(int i = 0; i < listaTF.size() - 1; i++) {
			
			v1 = (Integer.parseInt(listaTF.get(i).getText()) * (Integer.parseInt(listaTF.get(i).getText())));
			if(i != 0) {
				v2 = (Integer.parseInt(listaTF.get(i).getText()) * (Integer.parseInt(listaTF.get(i).getText())));
			}
			
		}
		
		total = v1 + v2;
		Math.sqrt(total);
		JOptionPane.showMessageDialog(null, "O resultado é " +total);
		
		for(int i = 0; i <= listaTF.size(); i++) {
			
			if(i == listaTF.size() - 1) {
				listaTF.get(i).setText(Integer.toString(total));
			}
			
		}
		
	}
	
}
