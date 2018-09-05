public JComboBox addComboBox(int coluna, int linha, int w, int h, ArrayList<E> lista) {
	
	int x = xDaColuna(coluna);
	int y = yDaLinha(linha);
	
	JComboBox<E> cb = new JComboBox();
	
	cb.setBounds(x, y, w, h);
	
	for(int i = 0; i < lista.size(); i++) {
		
		cb.addItem(lista.get(i));
		
	}
	
	getContentPane().add(cb);
	
	return cb;
}
