import java.util.*;

public class Test
{
	public static void insertionSort(Student[] students) {
		for (int i = 1; i < students.length; i++) {
			
			Student cur_st = students[i];
			int j = i;

			while ( (j > 0) && (students[j - 1].compareTo(cur_st) > 0) ) {
				
				students[j] = students[j - 1];
				j--;

			}

			students[j] = cur_st; 
		}
	}

	public static void main(String[] args) {

		Student[] students = new Student[] {
			new Student("Vasya", 41),
			new Student("Petya", -1),
			new Student("Kolya", -123),
			new Student("Igor", 0),
			new Student("Sanya", 999)
		};

		for (int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}

		insertionSort(students);

		System.out.println();

		for (int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}	

	}
}