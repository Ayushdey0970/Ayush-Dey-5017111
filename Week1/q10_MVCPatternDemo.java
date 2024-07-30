public class q10_MVCPatternDemo {
    public static void main(String[] args) {
        // Create Model
        q10_Student model = new q10_Student("John Doe", "S001", "A");

        // Create View
        q10_StudentView view = new q10_StudentView();

        // Create Controller
        q10_StudentController controller = new q10_StudentController(model, view);

        // Display initial student details
        System.out.println("Initial Student Details:");
        controller.updateView();

        // Update student information using the controller
        System.out.println("\nUpdating student information...");
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("A+");

        // Display updated student details
        System.out.println("\nUpdated Student Details:");
        controller.updateView();
    }
}