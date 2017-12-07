package Controller.StateMachine;

public class StopState implements State{

	   public void doAction(Context context) {
		      System.out.println("Game is in stop state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "Stop State";
		   }
}
