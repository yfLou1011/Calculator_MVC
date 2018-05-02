package Calculator;
import java.awt.event.ActionListener;

import javax.swing.*;

public class cView {
		JFrame frame = new JFrame("MVC Calculator");
		JPanel panel = new JPanel();
		
		//add
		JTextField addFirstNumber  = new JTextField(10);
		JLabel addLabel = new JLabel("+");
		JTextField addSecondNumber = new JTextField(10);
		JButton addButton = new JButton("=");
		JTextField addSolution = new JTextField(10);
		
		//sub
		JTextField subFirstNumber  = new JTextField(10);
		JLabel subLabel = new JLabel("-");
		JTextField subSecondNumber = new JTextField(10);
		JButton subButton = new JButton("=");
		JTextField subSolution = new JTextField(10);
		
		//multiply
		JTextField mulFirstNumber  = new JTextField(10);
		JLabel mulLabel = new JLabel("*");
		JTextField mulSecondNumber = new JTextField(10);
		JButton mulButton = new JButton("=");
		JTextField mulSolution = new JTextField(10);
		
		//div
		JTextField divFirstNumber  = new JTextField(10);
		JLabel divLabel = new JLabel("/");
		JTextField divSecondNumber = new JTextField(10);
		JButton divButton = new JButton("=");
		JTextField divSolution = new JTextField(10);
		
		
		
		JLabel label = new JLabel("Standard Calculator - © Yifan Lou ©");
		cView(){
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500, 200);
			frame.add(panel);
			//add panel
			panel.add(addFirstNumber);
			panel.add(addLabel);
			panel.add(addSecondNumber);
			panel.add(addButton);
			panel.add(addSolution);
			//sub panel
			panel.add(subFirstNumber);
			panel.add(subLabel);
			panel.add(subSecondNumber);
			panel.add(subButton);
			panel.add(subSolution);
			//mul panel
			panel.add(mulFirstNumber);
			panel.add(mulLabel);
			panel.add(mulSecondNumber);
			panel.add(mulButton);
			panel.add(mulSolution);
			//div panel
			panel.add(divFirstNumber);
			panel.add(divLabel);
			panel.add(divSecondNumber);
			panel.add(divButton);
			panel.add(divSolution);
			
			panel.add(label);
		}
		
		//add
		public int getAddFirstNumber(){
			return Integer.parseInt(addFirstNumber.getText());
		}
		public int getAddSecondNumber(){
			return Integer.parseInt(addSecondNumber.getText());
		}
		public void setAddSolution(int sol){
			addSolution.setText(Integer.toString(sol));
		}
		void addButtonListener(ActionListener addBtn){
			addButton.addActionListener(addBtn);
		}
		//sub
		public int getSubFirstNumber(){
			return Integer.parseInt(subFirstNumber.getText());
		}
		public int getSubSecondNumber(){
			return Integer.parseInt(subSecondNumber.getText());
		}
		public void setSubSolution(int sol){
			subSolution.setText(Integer.toString(sol));
		}
		void subButtonListener(ActionListener subBtn){
			subButton.addActionListener(subBtn);
		}
		
		//multi
		public int getMulFirstNumber(){
			return Integer.parseInt(mulFirstNumber.getText());
		}
		public int getMulSecondNumber(){
			return Integer.parseInt(mulSecondNumber.getText());
		}
		public void setMulSolution(int sol){
			mulSolution.setText(Integer.toString(sol));
		}
		void mulButtonListener(ActionListener mulBtn){
			mulButton.addActionListener(mulBtn);
		}
		
		
		//div
		public int getDivFirstNumber(){
			return Integer.parseInt(divFirstNumber.getText());
		}
		public int getDivSecondNumber(){
			return Integer.parseInt(divSecondNumber.getText());
		}
		public void setDivSolution(int sol){
			divSolution.setText(Integer.toString(sol));
		}
		void divButtonListener(ActionListener divBtn){
			divButton.addActionListener(divBtn);
		}
		
		// Exception
		void displayErrorMessage(String errorMessage){
			JOptionPane.showMessageDialog(frame, errorMessage);
		}

}
