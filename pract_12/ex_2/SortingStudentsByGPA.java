import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>
{
    @Override
    public int compare(Student st1, Student st2) {
        return st1.compareTo(st2);
    }
}