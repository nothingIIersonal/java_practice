import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class SearchStudent extends Throwable {
	public SearchStudent(String s) {

	}

	public String Search(Student[] students, String search) throws SearchStudent {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName().equals(search)) {
				return "FOUND!";
			}
		}	

		throw new SearchStudent("NOT FOUND!");		
	}
}

class LabExample extends JFrame {

	JTextField SearchField = new JTextField(10);
	
	JButton SortButton = new JButton("Sort");
	JButton SearchButton = new JButton("Search");

	Label StatusLabel = new Label("It's a status label");

	static JTextArea StudentsTextArea = new JTextArea("");

	Font fnt = new Font("Times new roman",Font.BOLD,20);

	static Student[] students = new Student[] {
		new Student("Vasya", 41),
		new Student("Petya", -1),
		new Student("Kolya", -123),
		new Student("Igor", 0),
		new Student("Sanya", 999),
		new Student("Vasya2", 741),
		new Student("Petya2", -627),
		new Student("Kolya2", -223),
		new Student("Igor2", 68),
		new Student("Sanya2", 41),
		new Student("Nastya", 69),
		new Student("Masha", 666),
		new Student("Olya", -666),
		new Student("Katya", 0),
		new Student("Olesya", 1),
		new Student("Nastya2", 0),
		new Student("Masha2", -1),
		new Student("Olya2", -10),
		new Student("Katya2", -223),
		new Student("Olesya2", -24)					
	};

	public class SortButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MergeSort MS = new MergeSort();
			students = MS.mergeSort(students);

			print();	
		}
	}
	public class SearchButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			SearchStudent SS = new SearchStudent("");

			try {
				StatusLabel.setText(SS.Search(students, SearchField.getText()));
			}
			catch (SearchStudent ss) {
				StatusLabel.setText("NOT FOUND!");
			}

			StatusLabel.repaint();
		}
	}

	LabExample() {
		super("Pract_12");
		setLayout(new FlowLayout());
		setSize(400, 400);
		add(SortButton);
		add(SearchButton);
		add(SearchField);
		add(StatusLabel);		
		add(StudentsTextArea);

		StudentsTextArea.setEditable(false);

		SortButton.addActionListener(new SortButtonActionListener());
		SearchButton.addActionListener(new SearchButtonActionListener());

		setVisible(true);
	}

	public static void print() {
		StudentsTextArea.setText("");
		for (int i = 0; i < students.length; i++) {
			StudentsTextArea.setText(StudentsTextArea.getText() + students[i] + "\n"); 
		}		
	}

	public static void main(String[]args) {
		print();

		new LabExample();
	}

}