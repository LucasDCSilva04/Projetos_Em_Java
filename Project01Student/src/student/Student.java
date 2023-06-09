package student; //pacote a qual a classe pertece

//classe estudante
public class Student {

	//Atributos da classe estudante
	private int studentId;
	private String name;
	private String ssn;
	private double gpa;
	
	//construtor: é o primeiro a ser executado quando criamos um objeto estudante
	public Student(int studentId, String name, String ssn) {
		this.studentId = studentId;
		this.name = name;
		this.ssn = ssn;
	}

	//Métodos Getters and Setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}