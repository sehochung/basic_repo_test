package app;

import java.util.Scanner;

public class Student {

	protected String studentID;
	protected String name;
	protected int score;


	public Student(String studentID, String name, int score ) throws IllegalRangeException {

		if (score < 0 || score > 100) {
			throw new IllegalRangeException();
		}

		this.studentID = studentID;
		this.name = name;
		this.score = score;
	}


	private String getStudentID() {
		return studentID;
	}


	private void setStudentID(String studentID) {
		this.studentID = studentID;
	}


	private String getName() {
		return name;
	}


	private void setName(String name) {
		this.name = name;
	}


	private int getScore() {
		return score;
	}


	private void setScore(int score) {
		this.score = score;
	}


	public static void main( String[] args )
	{

		Scanner s = new Scanner(System.in);

		Boolean isRunning = true;
		

			try {
				while (isRunning) {

				System.out.println("Enter student id: ");
				String id = s.nextLine();
				System.out.println("Enter student name: ");
				String name = s.nextLine();
				System.out.println("Enter student score: ");
				int score = Integer.valueOf(s.nextLine());

				Student student1;


				student1 = new Student(id, name, score);
				System.out.println("Created Student obj with id = " + student1.getStudentID()
				+ ", name = " + student1.getName() 
				+ ", and score = " + student1.getScore()
						);


				System.out.println("Add another student? (y/n)");

				if (s.nextLine() == "n") 
					isRunning = false;
				}
			}



			catch (IllegalRangeException e) {

				e.printStackTrace();
			}




	}

}
