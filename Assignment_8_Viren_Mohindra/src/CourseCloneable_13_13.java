/* Viren Mohindra
 * (Enable the Course class cloneable)
 * Rewrite the Course class in Listing 10.6 to add a clone method to perform a deep copy on the students field.
 */
	public class CourseCloneable_13_13 {
		public static void main(String[] args) 
				throws CloneNotSupportedException {

			Course course1 = new Course("Geography");

			course1.addStudent("Viren Mohindra");
			course1.addStudent("Vishrut Rai Khatri");
			course1.addStudent("Yuvraj Chugh");

			Course course2 = course1.clone();

			course2.addStudent("Ayaan Sawhney");
			course2.addStudent("Vedika Kumar");

			System.out.println("Number of students in " + course1.getCourseName() + ": " + course1.getNumberOfStudents());
			
			String[] students = course1.getStudents();
			
			for (int i = 0; i < course1.getNumberOfStudents(); i++)
				System.out.print(students[i] + " | ");
			
			System.out.println();

			System.out.println("\nNumber of students in " + course1.getCourseName() + ": " + course2.getNumberOfStudents());
			String[] students2 = course2.getStudents();
			
			for (int i = 0; i < course2.getNumberOfStudents(); i++)
				System.out.print(students2[i] + " | ");
			
			System.out.println();
		}
	}