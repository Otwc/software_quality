package Controller.StateMachine;

public class MenuState implements State{

	   public void doAction(Context context) {
		      System.out.println("Game is in menu state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "Menu State";
		   }
}
