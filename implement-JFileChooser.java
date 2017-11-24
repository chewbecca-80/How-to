//When the button is clicked, a JFileChooser box will pop up. In this case, only folders will be able to be selected. 
//When the user selects a folder, the ablsolute path will be displayed in the textField variable. 

JButton btnNewButton_1 = new JButton("Browse");
		btnNewButton_1.setBounds(355, 107, 89, 23);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnVal = fc.showOpenDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					textField.setText(f.getAbsolutePath());
				}
			}
						
		});
    
    textField = new JTextField();
		textField.setBounds(10, 108, 305, 20);
