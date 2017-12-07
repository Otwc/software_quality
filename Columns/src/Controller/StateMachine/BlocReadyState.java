package Controller.StateMachine;

public class BlocReadyState implements State{

	   public void doAction(Context context) {
		      System.out.println("Game is in Bloc Ready state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "Bloc Ready";
		   }
}
