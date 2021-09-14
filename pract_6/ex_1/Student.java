public class Student implements Comparable<Student> {
	private String name = "";
	private Integer iDNumber = 0;

	Student(String name, Integer iDNumber) {
		this.name = name;
		this.iDNumber = iDNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setIDNumber(Integer iDNumber) {
		this.iDNumber = iDNumber;
	}

	public Integer getIDNumber() {
		return this.iDNumber;
	}

	public String toString() {
		return "Name: " + this.name + " ; iDNumber: " + this.iDNumber.toString();
	}

	public int compareTo(Student student) {
		return this.iDNumber.compareTo(student.getIDNumber());
	}
}