import java.util.*;

public class Test
{
	public static Student[] mergeSort(Student[] array) {
        Student[] tmp;
        Student[] currentSrc = array;
        Student[] currentDest = new Student[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;
        }
        return currentSrc;
    }

    private static void merge(Student[] src1, int src1Start, Student[] src2, int src2Start, Student[] dest,
                              int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        if (src1Start + size > src1.length) {
            for (int i = src1Start; i < src1End; i++) {
                dest[i] = src1[i];
            }
            return;
        }

        int iterationCount = src1End - src1Start + src2End - src2Start;

        SortingStudentsByGPA STBG = new SortingStudentsByGPA();

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || STBG.compare(src1[index1], src2[index2]) < 0)) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }

	public static void main(String[] args) {

		Student[] studentsM = new Student[] {
			new Student("Vasya", 41),
			new Student("Petya", -1),
			new Student("Kolya", -123),
			new Student("Igor", 0),
			new Student("Sanya", 999)
		};

		Student[] studentsF = new Student[] {
			new Student("Nastya", 69),
			new Student("Masha", 666),
			new Student("Olya", -666),
			new Student("Katya", 0),
			new Student("Olesya", -1024)
		};

		for (int i = 0; i < studentsM.length; i++) { System.out.println(studentsM[i]); }
		for (int i = 0; i < studentsF.length; i++) { System.out.println(studentsF[i]); }

		studentsM = mergeSort(studentsM);
		studentsF = mergeSort(studentsF);

		Student[] students = new Student[studentsF.length + studentsM.length];

		int cnt = 0;
		for (Student tmp : studentsM) {
			students[cnt] = tmp;
			cnt++;
		}
		for (Student tmp : studentsF) {
			students[cnt] = tmp;
			cnt++;
		}

		students = mergeSort(students);

		System.out.println("\n");

		for (int i = 0; i < students.length; i++) { System.out.println(students[i]); }
		
	}
}