public class q10_MVCPatternDemo {
    public static void main(String[] args) {
        q10_Student model = new q10_Student("John Doe", "S001", "A");

        q10_StudentView view = new q10_StudentView();

        q10_StudentController controller = new q10_StudentController(model, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        System.out.println("\nUpdating student information...");
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("A+");

        System.out.println("\nUpdated Student Details:");
        controller.updateView();
    }
}