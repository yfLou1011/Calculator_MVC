package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class cController {

	private cView view;
	private cModel model;
	
	String myProblem = "User must enter 2 integers.";
	
	public cController(cView view, cModel model){
		this.view = view;
		this.model = model;

		this.view.addButtonListener(new CalculatorListener1());
		this.view.subButtonListener(new CalculatorListener2());
		this.view.mulButtonListener(new CalculatorListener3());
		this.view.divButtonListener(new CalculatorListener4());
	
	}
	
	class CalculatorListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			int firstNumber, secondNumber = 0;
			try{
				firstNumber = view.getAddFirstNumber();
				secondNumber = view.getAddSecondNumber();
				view.setAddSolution(model.addTwoNumbers(firstNumber, secondNumber));
			}catch(NumberFormatException ex){
				view.displayErrorMessage(myProblem);
			}
			
		}	
	}
	
	class CalculatorListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int firstNumber, secondNumber = 0;
			try{
				firstNumber = view.getSubFirstNumber();
				secondNumber = view.getSubSecondNumber();
				view.setSubSolution(model.subTwoNumbers(firstNumber, secondNumber));
			}catch(NumberFormatException ex){
				view.displayErrorMessage(myProblem);
			}
		}
	}
	
	
	class CalculatorListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int firstNumber, secondNumber = 0;
			try{
				firstNumber = view.getMulFirstNumber();
				secondNumber = view.getMulSecondNumber();
				view.setMulSolution(model.mulTwoNumbers(firstNumber, secondNumber));
			}catch(NumberFormatException ex){
				view.displayErrorMessage(myProblem);
			}
		}
	}
	
	
	class CalculatorListener4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int firstNumber, secondNumber = 0;
			try{
				firstNumber = view.getDivFirstNumber();
				secondNumber = view.getDivSecondNumber();
				view.setDivSolution(model.divTwoNumbers(firstNumber, secondNumber));
			}catch(NumberFormatException ex){
				view.displayErrorMessage(myProblem);
			}
		}
	}
	
	
}
