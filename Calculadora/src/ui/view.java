package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view {

	private JFrame frame;
	private JTextField tela;
	Operacoes calcula = new Operacoes();
	String op = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 271, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tela = new JTextField();
		tela.setBounds(10, 11, 232, 48);
		frame.getContentPane().add(tela);
		tela.setColumns(10);
		
		JButton apaga = new JButton("Del");
		apaga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder str;
				str = new StringBuilder(tela.getText());
				str.deleteCharAt(str.length()-1);
				tela.setText(str.toString());
			}
		});
		apaga.setBounds(10, 75, 51, 35);
		frame.getContentPane().add(apaga);
		
		JButton divisao = new JButton("/");
		divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcula.setOpUm(Double.parseDouble(tela.getText()));
				op = "/";
				tela.setText("");
			}
		});
		divisao.setBounds(71, 75, 51, 35);
		frame.getContentPane().add(divisao);
		
		JButton multiplicacao = new JButton("*");
		multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcula.setOpUm(Double.parseDouble(tela.getText()));
				op = "*";
				tela.setText("");
			}
		});
		multiplicacao.setBounds(132, 75, 51, 35);
		frame.getContentPane().add(multiplicacao);
		
		JButton sete = new JButton("7");
		sete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("7"));
			}
		});
		sete.setBounds(10, 121, 51, 35);
		frame.getContentPane().add(sete);
		
		JButton oito = new JButton("8");
		oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("8"));
			}
		});
		oito.setBounds(71, 121, 51, 35);
		frame.getContentPane().add(oito);
		
		JButton nove = new JButton("9");
		nove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("9"));
			}
		});
		nove.setBounds(132, 121, 51, 35);
		frame.getContentPane().add(nove);
		
		JButton quatro = new JButton("4");
		quatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("4"));
			}
		});
		quatro.setBounds(10, 167, 51, 35);
		frame.getContentPane().add(quatro);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("5"));
			}
		});
		cinco.setBounds(71, 167, 51, 35);
		frame.getContentPane().add(cinco);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("6"));
			}
		});
		seis.setBounds(132, 167, 51, 35);
		frame.getContentPane().add(seis);
		
		JButton um = new JButton("1");
		um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("1"));
			}
		});
		um.setBounds(10, 213, 51, 35);
		frame.getContentPane().add(um);
		
		JButton dois = new JButton("2");
		dois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("2"));
			}
		});
		dois.setBounds(71, 213, 51, 35);
		frame.getContentPane().add(dois);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("3"));
			}
		});
		tres.setBounds(132, 213, 51, 35);
		frame.getContentPane().add(tres);
		
		JButton enter = new JButton("=");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcula.setOpDois(Double.parseDouble(tela.getText()));
				tela.setText("");
				switch(op) {
				case "/":
					tela.setText(String.valueOf(calcula.divisao()));
					break;
				case "*":
					tela.setText(String.valueOf(calcula.multiplicacao()));
					break;
				case "+":
					tela.setText(String.valueOf(calcula.soma()));
					break;
				case "-":
					tela.setText(String.valueOf(calcula.subtracao()));
					break;
				default:
					break;
				}
			}
		});
		enter.setBounds(193, 167, 51, 127);
		frame.getContentPane().add(enter);
		
		JButton mais = new JButton("+");
		mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcula.setOpUm(Double.parseDouble(tela.getText()));
				op = "+";
				tela.setText("");
			}
		});
		mais.setBounds(193, 121, 51, 35);
		frame.getContentPane().add(mais);
		
		JButton menos = new JButton("-");
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcula.setOpUm(Double.parseDouble(tela.getText()));
				op = "-";
				tela.setText("");
			}
		});
		menos.setBounds(193, 75, 51, 35);
		frame.getContentPane().add(menos);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("0"));
			}
		});
		zero.setBounds(10, 259, 112, 35);
		frame.getContentPane().add(zero);
		
		JButton virgula = new JButton(",");
		virgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(tela.getText().concat("."));
			}
		});
		virgula.setBounds(132, 259, 51, 35);
		frame.getContentPane().add(virgula);
	}
}
