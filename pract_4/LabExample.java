import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class LabExample extends JFrame {

	JTextField jta1 = new JTextField(10);
	JTextField jta2 = new JTextField(10);
	
	JButton MButton = new JButton("AC Milan");
	JButton RButton = new JButton("Real Madrid");

	JLabel LBLResult = new JLabel("Result: 0 X 0"); 
	JLabel LSResult = new JLabel("Last Scorer: N/A"); 

	private static Integer MScore = 0;
	private static Integer RScore = 0;

	Label WinnerLBL = new Label("Winner: DRAW");

	Font fnt = new Font("Times new roman",Font.BOLD,20);

	private String winner() {
		if (MScore > RScore) {
			return "Winner: AC Milan";
		}
		else if (RScore > MScore) {
			return "Winner: Real Madrid";
		}

		return "Winner: DRAW";
	}

	private void setValues(String team) {
		LBLResult.setText("Result: " + MScore.toString() + " X " + RScore.toString());
		LSResult.setText("Last Scorer: " + team);

		WinnerLBL.setText(winner());		
	}

	public class MButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MScore += 1;

			setValues("AC Milan");	
		}
	}
	public class RButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			RScore += 1;

			setValues("Real Madrid");
		}
	}

	LabExample() {
		super("Example");
		setLayout(new FlowLayout());
		setSize(200, 200);
		add(MButton);
		add(RButton);
		add(LBLResult);
		add(LSResult);
		add(WinnerLBL);

		MButton.addActionListener(new MButtonActionListener());
		RButton.addActionListener(new RButtonActionListener());

		setVisible(true);
	}

	public static void main(String[]args) {
		new LabExample();
	}

}