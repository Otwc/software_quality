package View;

import Controller.ColumnsController;
import Controller.StateMachine.*;
import Model.ColumnsGame;
import Model.IColumns;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ColumnsFrame extends JFrame implements IColumnsView {

	private static ColumnsFrame INSTANCE = null;
	
	public static ColumnsFrame getInstance()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new ColumnsFrame();
		}
		return INSTANCE;
	}
	
    private ColumnPanel canvas;
    private ColumnsController controller;

    JLabel lblScoreInfo = new JLabel("Score: ");
    JLabel lblScore = new JLabel("0");

    		private ColumnsFrame() {
        super("Columns");

        canvas = new ColumnPanel();
        canvas.setBackground(IColumns.COLORS[IColumns.BACKGROUND_COLOR]);
        controller = new ColumnsController(this, canvas);

        addControls();
        pack();
        setLocationRelativeTo(null);

        setResizable(false);

        canvas.addKeyListener(controller);
        canvas.requestFocus();
    }

    private void addControls() {
        Container c = getContentPane();

        JPanel centerPanel = new JPanel();
        centerPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
        centerPanel.add(canvas);
        c.add(centerPanel, BorderLayout.CENTER);


        Box rightPanel = new Box(BoxLayout.Y_AXIS);
        rightPanel.setPreferredSize(new Dimension(90, this.getHeight()));

        lblScoreInfo.setFont(new Font("San-Serif", Font.BOLD, 14));
        lblScoreInfo.setForeground(Color.BLUE);

        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        lblScoreInfo.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        lblScore.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        lblScore.setFont(new Font("San-Serif", Font.BOLD, 14));

        rightPanel.add(lblScoreInfo);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        rightPanel.add(lblScore);

        c.add(rightPanel, BorderLayout.EAST);
    }

    @Override
    public void updateScore(int score) {
        lblScore.setText(score + "");
    }

    @Override
    public void redrawBoard() {
        canvas.repaint();
    }
    
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ColumnsFrame.getInstance().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ColumnsFrame.getInstance().setVisible(true);
				Context context = new Context();
				MenuState menuState = new MenuState();

				menuState.doAction(context);
			    System.out.println(context.getState().toString());
			    StopState stopState = new StopState();
			    stopState.doAction(context);
			    System.out.println(context.getState().toString());

				/*
				 * 
				 *  

      StartState startState = new StartState();
      startState.doAction(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
      
      */
			}
		});
	}

}
