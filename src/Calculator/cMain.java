package Calculator;

public class cMain {
	public static void main(String[] args){
		cView view = new cView();
		cModel model = new cModel();
		cController control = new cController(view, model);
	}
}
