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
import java.awt.event.MouseListener;

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
		tf.setopque(true);
		tf.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				tf.setBackground(Color.gray);
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				tf.setBackground(Color.WHITE);
				
			}
			
		});
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
		
		if(listaTF.get(0).getText().equals("") || listaTF.get(1).getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Dados insuficientes para cálculo do Triângulo Retângulo");
		}
		else {
			v1 = (Integer.parseInt(listaTF.get(0).getText()) * (Integer.parseInt(listaTF.get(0).getText())));
			v2 = (Integer.parseInt(listaTF.get(1).getText()) * (Integer.parseInt(listaTF.get(1).getText())));
			
			total = v1 + v2;
			for(int i = 0; i <= listaTF.size(); i++) {
				
				if(i == listaTF.size() - 1) {
					listaTF.get(i).setForeground(Color.RED);
					listaTF.get(i).setText(Double.toString(Math.sqrt(total)));
				}
				
			}
		}
		
	}
	
}
