import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Clac extends JFrame{
	
	Clac(){
		JTextField Text = new JTextField(10);
		add(Text);
		JButton b1 = new JButton("1");
		add(b1);
		JButton b2 = new JButton("2");
		add(b2);
		JButton b3 = new JButton("3");
		add(b3);
		JButton b4 = new JButton("4");
		add(b4);
		JButton b5 = new JButton("5");
		add(b5);
		JButton b6 = new JButton("6");
		add(b6);
		JButton b7 = new JButton("7");
		add(b7);
		JButton b8 = new JButton("8");
		add(b8);
		JButton b9 = new JButton("9");
		add(b9);
		JButton b0 = new JButton("0");
		add(b0);
		
		JButton a = new JButton("+");
		add(a);
		JButton b = new JButton("-");
		add(b);
		JButton c = new JButton("*");
		add(c);
		JButton d = new JButton("/");
		add(d);
		JButton e = new JButton("=");
		add(e);
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Clac();
	}
}
