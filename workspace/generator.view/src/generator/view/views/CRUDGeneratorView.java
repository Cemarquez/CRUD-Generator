package generator.view.views;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.UIManager;

import generator.model.ModelFactoryModel;

public class CRUDGeneratorView extends JFrame {
	
	
private JTextField textField;
private JTextField tfModelo;
private JFileChooser chooser = new JFileChooser();
private File pathDestino;


public CRUDGeneratorView() {
	setResizable(false);
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	setLocationRelativeTo(null);
	setBounds(10, 10, 345, 294);
	getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Target directory");
	lblNewLabel.setBounds(10, 23, 166, 14);
	getContentPane().add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(10, 42, 176, 28);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	JButton btnDestino = new JButton("Directory");
	btnDestino.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int returnVal = chooser.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	pathDestino =  chooser.getSelectedFile();
		    	textField.setText(pathDestino.getPath());
		    	textField.setEditable(false);
		    }else {
		    	System.out.println("Seleccione una carpeta");
		    }
		}
	});
	btnDestino.setFont(new Font("Tahoma", Font.PLAIN, 11));
	btnDestino.setBounds(196, 45, 123, 23);
	getContentPane().add(btnDestino);
	
	JProgressBar progressBar = new JProgressBar();
	progressBar.setStringPainted(true);
//	progressBar.setForeground(Color.green);
	progressBar.setBounds(27, 121, 264, 23);
	getContentPane().add(progressBar);
	
	JButton btnNewButton = new JButton("Generar CRUD");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(pathDestino == null) {
				JOptionPane.showMessageDialog(null, "Debe seleccionar la carpeta de destino y la ubicación del proyecto.");
			}else {
				ModelFactoryModel mfm = new ModelFactoryModel();
				mfm.limpiarProduccion();
				progressBar.setValue(20);
				mfm.generarModelToModel();
				progressBar.setValue(40);
				mfm.generarModelToModelSQL();
				progressBar.setValue(60);
				mfm.generarModelToTextSQL(pathDestino);
				progressBar.setValue(80);
				mfm.generarModelToTextUI(pathDestino);
				progressBar.setValue(100);
				progressBar.setString("100% Generado");
			}
		}
	});
	btnNewButton.setBounds(98, 169, 123, 36);
	getContentPane().add(btnNewButton);
	
	
	setVisible(true);
	
}

public void runAcceleo() {
	
}
}