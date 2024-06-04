package AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener{
		
		Button b1,b2,b3,b4;
		TextField num1,num2,result;
		
		Calculator(){
			
//			Frame
			setSize(800,800);
			setTitle("My Calculator");
			setBackground(Color.CYAN);
			
			b1=new Button("+");
			b1.setBounds(600,300,100,40);
			b1.setBackground(Color.PINK);
			add(b1);
			
			b2=new Button("-");
			b2.setBounds(600, 375, 100, 40);
			b2.setBackground(Color.GREEN);
			add(b2);
			
			b3=new Button("*");
			b3.setBounds(600, 450, 100, 40);
			b3.setBackground(Color.BLUE);
			add(b3);
			
		    b4=new Button("/");
			b4.setBounds(600, 525, 100, 40);// ( coadinate,size)
			b4.setBackground(Color.magenta );
			add(b4);
			
			num1=new TextField();
			num1.setBounds(300,300,200,40);
			add(num1);
			
			num2=new TextField();
			num2.setBounds(300,400,200,40);
			add(num2);
			
			result=new TextField();
			result.setBounds(300,500,200,40);
			add(result);
			
			Label n1=new Label("Enter First Number:");
			n1.setBounds(150, 280, 200, 100);
			add(n1);
			
			
			
			TextField psw=new TextField("Password");
			psw.setBounds(300,400,200,40);
			add(psw);
			
			Label n2=new Label("Enter Second Number:");
			n2.setBounds(150, 380, 200, 100);
			add(n2);
			
			Label n3=new Label("Result  :");
			n3.setBounds(150, 480, 200, 100);
			add(n3);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);

//			mandatory line below two
			setLayout(null);
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			
			String n1 = num1.getText();
			String n2 = num2.getText();
			int a = Integer.parseInt(n1);//convert string to integer
			int b = Integer.parseInt(n2);
			int c = 0;
			if(e.getSource()==b1){
				c=a+b;
			}
			if(e.getSource()==b2){
				c=a-b;
			}
			if(e.getSource()==b3) {
				c=a*b;
			}
			if(e.getSource()==b4) {
				c=a/b;
			}
			
			String s3 =String.valueOf(c);
			result.setText(s3);
			
		}

		public static void main(String[] args) {
			
		Calculator ob = new Calculator();
		}
	}

