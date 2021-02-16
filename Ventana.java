import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Ventana extends JFrame implements ActionListener{
	public JPanel panel;
	public JTextField num1, num2;
	public String con1, con2;
	public JButton suma, resta, multi, division;
	public float numero1 = 0, numero2 = 0, resultado = 0;
	public JLabel result;

	public Ventana(){
		this.setSize(300, 400);
		setLocationRelativeTo(null);
		setTitle("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pantalla();
	}//Ventana
	public void pantalla(){
		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

		num1 = new JTextField();
		num1.setBounds(50, 20, 200, 30);
		num1.setText("0");
		panel.add(num1);

		num2 = new JTextField();
		num2.setBounds(50, 70, 200, 30);
		num2.setText("0");
		panel.add(num2);

		result = new JLabel();
		result.setOpaque(true);
		result.setText("El resultado es " + resultado);
		result.setBounds(50, 120, 200, 30);
		result.setForeground(Color.WHITE);
		panel.add(result);
		result.setBackground(Color.BLACK);

		suma = new JButton("suma");
		suma.setBounds(50, 170, 200, 30);
		panel.add(suma);
		suma.addActionListener(this);

		resta = new JButton("resta");
		resta.setBounds(50, 220, 200, 30);
		panel.add(resta);
		resta.addActionListener(this);

		multi = new JButton("multuplicacion");
		multi.setBounds(50, 270, 200, 30);
		panel.add(multi);
		multi.addActionListener(this);

		division = new JButton("division");
		division.setBounds(50, 320, 200, 30);
		panel.add(division);
		division.addActionListener(this);
	}//Elementos en pantalla
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource() == suma){
			setNums();
			resultado = numero1 + numero2;
			mostrarResultado();
		}
		if(evento.getSource() == resta){
			setNums();
			resultado = numero1 - numero2;
			mostrarResultado();
		}
		if(evento.getSource() == multi){
			setNums();
			resultado = numero1 * numero2;
			mostrarResultado();
		}
		if(evento.getSource() == division){
			setNums();
			resultado = numero1 / numero2;
			mostrarResultado();
		}
	}//Eventos
	public void setNums(){
		con1 = num1.getText();
		numero1 = Float.parseFloat(con1);

		con2 = num2.getText();
		numero2 = Float.parseFloat(con2);
	}//Setea los numero al valor actual que hay en las cajas de texto
	public void mostrarResultado(){
		result.setText("El resultado es " + resultado);
		System.out.println("el resultado es " + resultado);
		System.out.println("los numeros son " + numero1 + " y " + numero2);
	}//Muestra los resultados de la operacion de 2 numeros
}//Clase