import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
// © Siddhartha inc. ©2021 
public class Board implements ActionListener
{
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton restart;

	JFrame myFrame = new JFrame();
	String turn="X";
	boolean oneCheck;
	boolean twoCheck;
	boolean threeCheck;
	boolean fourCheck;
	boolean fiveCheck;
	boolean sixCheck;
	boolean sevenCheck;
	boolean eightCheck;
	boolean nineCheck;
	JLabel label;
	
	
	public static void main(String[] args)
	{
		Board PlayingBoard= new Board();
		

	}
	Board()
	{
		

	      myFrame.setTitle("TicTacToe");
	      myFrame.setSize(200, 250);

	      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      JPanel contentPane = (JPanel)myFrame.getContentPane();
	      contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

	      
	      JPanel toplabel= new JPanel();
	      FlowLayout layout = new FlowLayout();
	      toplabel.setLayout(layout);
	      label = new JLabel("It is " + turn + " turn" );
	      toplabel.add(label);
	      
	      JPanel numbers = new JPanel();
	      GridLayout gridLayout = new GridLayout(4,3,5,5);
	      numbers.setLayout(gridLayout);
	      
	      one = new JButton("");
	      two = new JButton("");
	      three = new JButton("");
	      four = new JButton("");
	      five = new JButton("");
	      six = new JButton("");
	      seven = new JButton("");
	      eight = new JButton("");
	      nine = new JButton("");
	      restart= new JButton("Restart");
	      numbers.add(one);
	      numbers.add(two);
	      numbers.add(three);
	      numbers.add(four);
	      numbers.add(five);
	      numbers.add(six);
	      numbers.add(seven);
	      numbers.add(eight);
	      numbers.add(nine);
	      numbers.add(restart);
	      contentPane.add(toplabel);
	      myFrame.add(toplabel);
	      contentPane.add(numbers);
	      
	      myFrame.setVisible(true);

	      one.addActionListener(this);
	      two.addActionListener(this);
	      three.addActionListener(this);
	      four.addActionListener(this);
	      five.addActionListener(this);
	      six.addActionListener(this);
	      seven.addActionListener(this);
	      eight.addActionListener(this);
	      nine.addActionListener(this);
	      restart.addActionListener(this);
	      
	      
	      
	    		  
	    		  
	    		  
	      
	      
	      
	      
	}
	public void actionPerformed(ActionEvent event) 
	{

		
		if(turn.equals("X"))
		{
			
			
			if(event.getSource()==one && oneCheck==false)
			{
				one.setText("x");
				turn="O";
				oneCheck=true;
			}
			else if(event.getSource()==two && twoCheck==false)
			{
				two.setText("x");
				turn="O";
				twoCheck=true;
			}
			else if(event.getSource()==three && threeCheck==false)
			{
				three.setText("x");
				turn="O";
				threeCheck=true;
			}
			else if(event.getSource()==four && fourCheck==false)
			{
				four.setText("x");
				turn="O";
				fourCheck=true;
			}
			else if(event.getSource()==five && fiveCheck==false)
			{
				five.setText("x");
				turn="O";
				fiveCheck=true;
			}
			else if(event.getSource()==six && sixCheck==false)
			{
				six.setText("x");
				turn="O";
				sixCheck=true;
			}
			else if(event.getSource()==seven && sevenCheck==false)
			{
				seven.setText("x");
				turn="O";
				sevenCheck=true;
			}
			else if(event.getSource()==eight && eightCheck==false)
			{
				eight.setText("x");
				turn="O";
				eightCheck=true;
			}
			else if(event.getSource()==nine && nineCheck==false)
			{
				nine.setText("x");
				turn="O";
				nineCheck=true;
			}
			else if(event.getSource()==restart)
			{
				one.setText("");
				oneCheck=false;
				two.setText("");
				twoCheck=false;
				three.setText("");
				threeCheck=false;
				four.setText("");
				fourCheck=false;
				five.setText("");
				fiveCheck=false;
				six.setText("");
				sixCheck=false;
				seven.setText("");
				sevenCheck=false;
				eight.setText("");
				eightCheck=false;
				nine.setText("");
				nineCheck=false;
				
				
				
			}
			label.setText("It is " + turn + " turn" );
			checkWinner();
		}
		else if(turn.equals("O"))
		{
			if(event.getSource()==one && oneCheck==false)
			{
				one.setText("o");
				turn="X";
				oneCheck=true;
			}
			else if(event.getSource()==two && twoCheck==false)
			{
				two.setText("o");
				turn="X";
				twoCheck=true;
			}
			else if(event.getSource()==three && threeCheck==false)
			{
				three.setText("o");
				turn="X";
				threeCheck=true;
			}
			else if(event.getSource()==four && fourCheck==false)
			{
				four.setText("o");
				turn="X";
				fourCheck=true;
			}
			else if(event.getSource()==five && fiveCheck==false)
			{
				five.setText("o");
				turn="X";
				fiveCheck=true;
			}
			else if(event.getSource()==six && sixCheck==false)
			{
				six.setText("o");
				turn="X";
				sixCheck=true;
			}
			else if(event.getSource()==seven && sevenCheck==false)
			{
				seven.setText("o");
				turn="X";
				sevenCheck=true;
			}
			else if(event.getSource()==eight && eightCheck==false)
			{
				eight.setText("o");
				turn="X";
				eightCheck=true;
			}
			else if(event.getSource()==nine && nineCheck==false)
			{
				nine.setText("o");
				turn="X";
				nineCheck=true;
			}
			else if(event.getSource()==restart)
			{
				one.setText("");
				oneCheck=false;
				two.setText("");
				twoCheck=false;
				three.setText("");
				threeCheck=false;
				four.setText("");
				fourCheck=false;
				five.setText("");
				fiveCheck=false;
				six.setText("");
				sixCheck=false;
				seven.setText("");
				sevenCheck=false;
				eight.setText("");
				eightCheck=false;
				nine.setText("");
				nineCheck=false;
				
			}
			label.setText("It is " + turn + " turn" );
			checkWinner();
		}
	}
	//This is a function to check the winner
	private void checkWinner()
	{
		if(one.getText()!="" && one.getText().equals(two.getText()) && one.getText().equals(three.getText()))
				{
			label.setText("The winner is " + one.getText());
			oneCheck=true;
			twoCheck=true;
			threeCheck=true;
			fourCheck=true;
			fiveCheck=true;
			sixCheck=true;
			sevenCheck=true;
			eightCheck=true;
			nineCheck=true;
				}
		else if(one.getText()!="" && one.getText().equals(four.getText()) && one.getText().equals(seven.getText()))
			{
		label.setText("The winner is " + one.getText());
		oneCheck=true;
		twoCheck=true;
		threeCheck=true;
		fourCheck=true;
		fiveCheck=true;
		sixCheck=true;
		sevenCheck=true;
		eightCheck=true;
		nineCheck=true;
			}
		else if( one.getText()!="" && one.getText().equals(five.getText()) && one.getText().equals(nine.getText()))
			{
		label.setText("The winner is " + one.getText());
		oneCheck=true;
		twoCheck=true;
		threeCheck=true;
		fourCheck=true;
		fiveCheck=true;
		sixCheck=true;
		sevenCheck=true;
		eightCheck=true;
		nineCheck=true;
			}
		else if(two.getText()!="" && two.getText().equals(five.getText()) && two.getText().equals(eight.getText()))
		{
			label.setText("The winner is " + two.getText());
			oneCheck=true;
			twoCheck=true;
			threeCheck=true;
			fourCheck=true;
			fiveCheck=true;
			sixCheck=true;
			sevenCheck=true;
			eightCheck=true;
			nineCheck=true;
		}
		else if(three.getText()!="" && three.getText().equals(six.getText()) && one.getText().equals(nine.getText()))
		{
			label.setText("The winner is " + three.getText());
			oneCheck=true;
			twoCheck=true;
			threeCheck=true;
			fourCheck=true;
			fiveCheck=true;
			sixCheck=true;
			sevenCheck=true;
			eightCheck=true;
			nineCheck=true;
		}
		else if(four.getText()!="" && four.getText().equals(five.getText()) && four.getText().equals(six.getText()))
		{
			label.setText("The winner is " + four.getText());
			oneCheck=true;
			twoCheck=true;
			threeCheck=true;
			fourCheck=true;
			fiveCheck=true;
			sixCheck=true;
			sevenCheck=true;
			eightCheck=true;
			nineCheck=true;
		}
		else if(seven.getText()!="" && seven.getText().equals(eight.getText()) && seven.getText().equals(nine.getText()))
		{
			label.setText("The winner is " + seven.getText());
			oneCheck=true;
			twoCheck=true;
			threeCheck=true;
			fourCheck=true;
			fiveCheck=true;
			sixCheck=true;
			sevenCheck=true;
			eightCheck=true;
			nineCheck=true;
		}
		else if(three.getText()!="" && three.getText().equals(five.getText()) && three.getText().equals(seven.getText()))
		{
			label.setText("The winner is " + three.getText());
			oneCheck=true;
			twoCheck=true;
			threeCheck=true;
			fourCheck=true;
			fiveCheck=true;
			sixCheck=true;
			sevenCheck=true;
			eightCheck=true;
			nineCheck=true;
		}
		else if(
				one.getText()!="" 
				&& one.getText()!="" 
				&& two.getText()!="" 
				&& three.getText()!=""
				&& four.getText()!=""
				&& five.getText()!=""
				&& six.getText()!=""
				&& seven.getText()!=""
				&& eight.getText()!=""
				&& nine.getText()!=""
				
				)
			
		{
			label.setText("It is a draw");
		}
		
		
		
	
	}
	
	

}
