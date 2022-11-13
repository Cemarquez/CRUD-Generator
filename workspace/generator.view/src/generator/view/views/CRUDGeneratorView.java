package generator.view.views;


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
private JFileChooser chooserDestino = new JFileChooser();
private File pathDestino;

private JFileChooser chooserProject = new JFileChooser();
private File pathProject;


public CRUDGeneratorView() {
	setResizable(false);
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	setLocationRelativeTo(null);
	setBounds(10, 10, 345, 600);
	getContentPane().setLayout(null);
	
	
	JLabel lblNewLabel = new JLabel("Target directory");
	lblNewLabel.setBounds(10, 80, 166, 14);
	getContentPane().add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(10, 99, 176, 28);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	JButton btnDestino = new JButton("Directory");
	btnDestino.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			chooserDestino.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int returnVal = chooserDestino.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	pathDestino =  chooserDestino.getSelectedFile();
		    	textField.setEditable(false);
		    	textField.setText(pathDestino.getAbsolutePath());
		    }else {
		    	System.out.println("Seleccione una carpeta");
		    }
		}
	});
	btnDestino.setFont(new Font("Tahoma", Font.PLAIN, 11));
	btnDestino.setBounds(196, 102, 123, 23);
	getContentPane().add(btnDestino);
	
	JLabel lblUbicacinDelModelo = new JLabel("Project directory");
	lblUbicacinDelModelo.setBounds(10, 22, 166, 14);
	getContentPane().add(lblUbicacinDelModelo);
	
	tfModelo = new JTextField();
	tfModelo.setColumns(10);
	tfModelo.setBounds(10, 41, 176, 28);
	getContentPane().add(tfModelo);
	
	JButton btnModelo = new JButton("Directory");
	btnModelo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			chooserProject.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int returnVal = chooserProject.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	pathProject =  chooserProject.getSelectedFile();
		    	tfModelo.setEditable(false);
		    	tfModelo.setText(pathProject.getAbsolutePath());
		    	System.out.println("Project path "+pathProject.getAbsolutePath());
		    }else {
		    	System.out.println("Seleccione una carpeta");
		    }
		}
		
	});
	btnModelo.setFont(new Font("Tahoma", Font.PLAIN, 11));
	btnModelo.setBounds(196, 44, 123, 23);
	getContentPane().add(btnModelo);

	JProgressBar progressBar = new JProgressBar();
	progressBar.setBounds(32, 416, 264, 23);
	getContentPane().add(progressBar);
	
	JButton btnNewButton = new JButton("Generar CRUD");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(pathDestino == null || pathProject==null) {
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
			}
//			progressBar.set
			
			
		}
	}); 
	
	btnNewButton.setBounds(103, 464, 123, 36);
	getContentPane().add(btnNewButton);
	
	
	setVisible(true);
	
}

public void runAcceleo() {
	
}
}