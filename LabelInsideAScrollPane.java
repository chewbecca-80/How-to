JLabel lblInstructions = new JLabel("");
		lblInstructions.setBounds(10, 52, 414, 226);
		//set lblInstructions text
		lblInstructions.setText("<html><body></body></html>");
		
		JScrollPane scInstructions = new JScrollPane(lblInstructions, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//panelInstructions.add(lblInstructions);
		panelInstructions.add(scInstructions);
