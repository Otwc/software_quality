package Controller.StateMachine;

public class BlocMovingState implements State{

	   public void doAction(Context context) {
		      System.out.println("Game is in Bloc Moving state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "Bloc Moving";
		   }
}
