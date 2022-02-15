package tema1;

import java.awt.BorderLayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora {
	JLabel label = new JLabel("");
	JPanel panelNorte = new JPanel();
	JPanel panel = new JPanel();
	JPanel panelCentral = new JPanel();
	
	JFrame frame = new JFrame("Border Layout Itaca");
	

	public void actualizaTextoLabel(String escrito) {
		String anterior = label.getText().toString();
		label.setText(anterior+escrito);
		
		if(escrito.equalsIgnoreCase("borrar")) {
			anterior = anterior.substring(0, anterior.length()-1);
			label.setText(anterior);
		}
		
		else if(escrito.equalsIgnoreCase("C")) {
			label.setText("");
		}
		
		else {
			label.setText(anterior+escrito);
		}


	}
	
	public Calculadora() {
		JFrame.setDefaultLookAndFeelDecorated(true);

		frame.addWindowListener(new EscuchadorVentana());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setLayout(new BorderLayout());

		
		

		panelCentral.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		JButton jb1 = new JButton("7");
		JButton jb2 = new JButton("8");
		JButton jb3 = new JButton("9");
		JButton jb4 = new JButton("+/-");
		JButton jb5 = new JButton("--->");

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;

		panelCentral.add(jb1);
		panelCentral.add(jb2);
		panelCentral.add(jb3);
		panelCentral.add(jb4);
		panelCentral.add(jb5);

		JButton jb6 = new JButton("4");
		JButton jb7 = new JButton("5");
		JButton jb8 = new JButton("6");
		JButton jb9 = new JButton("X");
		JButton jb10 = new JButton("/");

		c.gridx = 0;
		c.gridy = 1;
		panelCentral.add(jb6, c);
		c.gridx = 1;
		c.gridy = 1;
		panelCentral.add(jb7, c);
		c.gridx = 2;
		c.gridy = 1;
		panelCentral.add(jb8, c);
		c.gridx = 3;
		c.gridy = 1;
		panelCentral.add(jb9, c);
		c.gridx = 4;
		c.gridy = 1;
		panelCentral.add(jb10, c);

		JButton jb11 = new JButton("1");
		JButton jb12 = new JButton("2");
		JButton jb13 = new JButton("3");
		JButton jb14 = new JButton("-");
		JButton jb15 = new JButton("=");

		c.gridx = 0;
		c.gridy = 2;
		panelCentral.add(jb11, c);
		c.gridx = 1;
		c.gridy = 2;
		panelCentral.add(jb12, c);
		c.gridx = 2;
		c.gridy = 2;
		panelCentral.add(jb13, c);
		c.gridx = 3;
		c.gridy = 2;
		panelCentral.add(jb14, c);
		c.gridx = 4;
		c.gridy = 2;
		c.gridheight = 2;
		c.ipady = 26;
		panelCentral.add(jb15, c);

		JButton jb16 = new JButton("C");
		JButton jb17 = new JButton("0");
		JButton jb18 = new JButton(".");
		JButton jb19 = new JButton("+");

		c.gridx = 0;
		c.gridy = 3;
		c.gridheight = 1;
		c.ipady = 0;
		panelCentral.add(jb16, c);
		c.gridx = 1;
		c.gridy = 3;
		panelCentral.add(jb17, c);
		c.gridx = 2;
		c.gridy = 3;
		panelCentral.add(jb18, c);
		c.gridx = 3;
		c.gridy = 3;
		panelCentral.add(jb19, c);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "7";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "8";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "9";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "+/-";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "borrar";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "4";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "5";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "6";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "x";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "/";
				actualizaTextoLabel(escrito);

			}

		});
		
		
		jb11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "1";
				actualizaTextoLabel(escrito);

			}

		});

		jb12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "2";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "3";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito ="-";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "=";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "C";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "0";
				actualizaTextoLabel(escrito);

			}

		});

		
		jb18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = ".";
				actualizaTextoLabel(escrito);

			}

		});
		
		jb19.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String escrito = "+";
				actualizaTextoLabel(escrito);

			}

		});
		
		
		panelNorte.add(label);
		panel.add(panelNorte, BorderLayout.NORTH);
		panel.add(panelCentral, BorderLayout.CENTER);

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		

		
	}

	public void iniciarVista() {
	frame.pack();
	frame.setVisible(true);
}

	

	public static void main(String[] args) {
		Calculadora ld = new Calculadora();
		ld.iniciarVista();

		
	}

}