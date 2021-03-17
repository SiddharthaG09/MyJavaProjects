import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
// © Siddhartha inc. ©2021 
public class PhoneDialer implements ActionListener
{
	JButton zero;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton dash;
	JButton dialNumber;
	String usersNumber="";
	JFrame myFrame = new JFrame();
	
	
	public static void main(String[] args)
	{
		PhoneDialer Phone= new PhoneDialer();
		

	}
	PhoneDialer()
	{
		

	      myFrame.setTitle("Dialer");
	      myFrame.setSize(200, 250);
	      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      JPanel contentPane = (JPanel)myFrame.getContentPane();
	      contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

	      
	      JPanel toplabel= new JPanel();
	      FlowLayout layout = new FlowLayout();
	      toplabel.setLayout(layout);
	      JLabel label = new JLabel("Enter the number to dial:");
	      toplabel.add(label);
	      
	      JPanel numbers = new JPanel();
	      GridLayout gridLayout = new GridLayout(4,3,5,5);
	      numbers.setLayout(gridLayout);

	      zero = new JButton("0");
	      one = new JButton("1");
	      two = new JButton("2");
	      three = new JButton("3");
	      four = new JButton("4");
	      five = new JButton("5");
	      six = new JButton("6");
	      seven = new JButton("7");
	      eight = new JButton("8");
	      nine = new JButton("9");
	      dash = new JButton("-");
	      numbers.add(one);
	      numbers.add(two);
	      numbers.add(three);
	      numbers.add(four);
	      numbers.add(five);
	      numbers.add(six);
	      numbers.add(seven);
	      numbers.add(eight);
	      numbers.add(nine);
	      numbers.add(dash);
	      numbers.add(zero);
	      contentPane.add(toplabel);
	      myFrame.add(toplabel);
	      contentPane.add(numbers);

	      dialNumber=new JButton("Dial Number");
	      dialNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
	      contentPane.add(dialNumber);
	      myFrame.setVisible(true);
	      zero.addActionListener(this);
	      one.addActionListener(this);
	      two.addActionListener(this);
	      three.addActionListener(this);
	      four.addActionListener(this);
	      five.addActionListener(this);
	      six.addActionListener(this);
	      seven.addActionListener(this);
	      eight.addActionListener(this);
	      nine.addActionListener(this);
	      dash.addActionListener(this);
	      dialNumber.addActionListener(this);
	      
	      
	      
	    		  
	    		  
	    		  
	      
	      
	      
	      
	}
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource()==dialNumber)
		{
			JOptionPane.showMessageDialog(myFrame, "Dialing " + usersNumber);
			usersNumber="";
		}
		else if(event.getSource()==zero)
		{
			usersNumber+="0";
		}
		else if(event.getSource()==one)
		{
			usersNumber+="1";
		}
		else if(event.getSource()==two)
		{
			usersNumber+="2";
		}
		else if(event.getSource()==three)
		{
			usersNumber+="3";
		}
		else if(event.getSource()==four)
		{
			usersNumber+="4";
		}
		else if(event.getSource()==five)
		{
			usersNumber+="5";
		}
		else if(event.getSource()==six)
		{
			usersNumber+="6";
		}
		else if(event.getSource()==seven)
		{
			usersNumber+="7";
		}
		else if(event.getSource()==eight)
		{
			usersNumber+="8";
		}
		else if(event.getSource()==nine)
		{
			usersNumber+="9";
		}
		else if(event.getSource()==dash)
		{
			usersNumber+="-";
		}
	}
	

}
