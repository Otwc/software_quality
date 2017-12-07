package Controller.StateMachine;

public class GameState implements State{

	   public void doAction(Context context) {
		      System.out.println("Game is in game state");
		      context.setState(this);	
		   }

		   public String toString(){
		      return "Game State";
		   }
}
