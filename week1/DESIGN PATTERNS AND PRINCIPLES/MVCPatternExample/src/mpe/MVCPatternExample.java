package mpe;

public class MVCPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating model
        Student student = new Student("John Doe", 1, "A");

        // Creating view
        StudentView view = new StudentView();

        // Creating controller
        StudentController controller = new StudentController(student, view);

        // Updating view
        controller.updateView();

        // Updating model data
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Updating view again
        controller.updateView();

	}

}
