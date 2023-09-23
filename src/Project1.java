import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.*;
public class Project1 extends JFrame {
		public Project1() {
			setTitle("Login Details");
			setSize(1000,1000);
			getContentPane().setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			getContentPane().setBackground(Color.red);
			JLabel l1,l2,l3,l4,l5,l6,l7;
			final JTextField f1,f2,f3,f4,f5,f6,f7;
			final JButton b1;
			l1 = new JLabel("FirstName=>");
	        l2 = new JLabel("SecondName=>");
	        l3 = new JLabel("Email=>");
	        l4 = new JLabel("Phone Number=>");
	        l5 = new JLabel("Employee-Id=>");
	        l6 = new JLabel("Salary->");
	        l7 = new JLabel("Place=>");

	        // Set bounds for the labels
	        l1.setBounds(10, 10, 100, 20);
	        l2.setBounds(10, 40, 100, 20);
	        l3.setBounds(500,10,100,20);
	        l4.setBounds(500,40,130,20);
	        l5.setBounds(10,70,100,20);
	        l6.setBounds(500,70,100,20);
	        l7.setBounds(10,100,100,20);
	        
	        f1=new JTextField(40);
	        f2=new JTextField(40);
	        f3=new JTextField(40);
	        f4=new JTextField(40);
	        f5=new JTextField(40);
	        f6=new JTextField(40);
	        f7=new JTextField(40);
	        
	        f1.setBounds(100, 10, 200, 20);
	        f2.setBounds(100, 40, 200, 20);
	        f3.setBounds(600, 10, 200, 20);
	        f4.setBounds(610, 40, 200, 20);
	        f5.setBounds(100, 70, 200, 20);
	        f6.setBounds(600, 70, 200, 20);
	        f7.setBounds(100, 100, 200, 20);
	        
	        b1=new JButton("submit");
	        
	        b1.setBounds(350,130,100,20);
	        JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
	        separator.setBounds(10, 160, 1080, 10); 
	        
	        add(l1);
	        add(l2);
	        add(l3);
	        add(l4);
	        add(l5);
	        add(l6);
	        add(l7);
	        
	        add(f1);
	        add(f2);
	        add(f3);
	        add(f4);
	        add(f5);
	        add(f6);
	        add(f7);
	        add(separator);
	        add(b1);
	
	        b1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e1) {
	        		final String t1=f1.getText();
	        		final String t2=f2.getText();
	        		final String t3=f3.getText();
	        		final String t4=f4.getText();
	        		final String t5=f5.getText();
	        		final String t6=f6.getText();
	        		final String t7=f7.getText();
	        		
	        		try {
	        			Class.forName("oracle.jdbc.driver.OracleDriver");
	        			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","varshith");//change username as your database
	        			Statement stm=con.createStatement();
	        			String s="INSERT INTO PROJECT1 VALUES('"+t1+"','"+t2+"','"+t3+"','"+t4+"','"+t5+"','"+t6+"','"+t7+"')";
	        			stm.executeUpdate(s);
	        			JOptionPane.showMessageDialog(b1,"success");
	        			con.close();
	        			
	        		}
	        		catch(Exception e) {
	        			
	        			JOptionPane.showMessageDialog(b1,"please check");
	        		}
	        	}
	        });
	        setVisible(true);
		}
	
		public static void main(String args[]) {
			Project1 p=new Project1();
			
		}
		
}
