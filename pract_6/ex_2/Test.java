import java.util.*;

public class Test
{
	private static void qSort(Student[] students, int from, int to) {
		if (from < to) {
			int divideIndex = partition(students, from, to);

			qSort(students, from, divideIndex - 1);

			qSort(students, divideIndex, to);
		}
	}

    private static int partition(Student[] students, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;
        int middleElement = from + (to - from) / 2;

        SortingStudentsByGPA STBG = new SortingStudentsByGPA();

        while (leftIndex <= rightIndex) {

            while (STBG.compare(students[leftIndex], students[middleElement]) < 0) {
                leftIndex++;
            }

            while (STBG.compare(students[rightIndex], students[middleElement]) > 0) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(students, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }

    private static void swap(Student[] students, int index1, int index2) {
        Student tmp  = students[index1];
        students[index1] = students[index2];
        students[index2] = tmp;
    }

	public static void main(String[] args) {

		Student[] students = new Student[] {
			new Student("Vasya", 41),
			new Student("Petya", -1),
			new Student("Kolya", -123),
			new Student("Igor", 0),
			new Student("Sanya", 999),
			new Student("Nastya", 69),
			new Student("Masha", 666),
			new Student("Olya", -666)
		};

		for (int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}

		qSort(students, 0, students.length - 1);

		System.out.println("\n");

		for (int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}		
		
	}
}