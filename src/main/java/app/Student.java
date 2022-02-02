package app;

import java.util.Scanner;

public class Student {

	String studentID;
	String name;
	int score;


	public Student(String studentID, String name, int score ) throws IllegalRangeException {

		if (score < 0 || score > 100) {
			throw new IllegalRangeException();
		}

		this.studentID = studentID;
		this.name = name;
		this.score = score;
	}


	public String getStudentID() {
		return studentID;
	}


	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
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
