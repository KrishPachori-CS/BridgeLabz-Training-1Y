class VariableExamples {

    int id = 10;
    String name = "krish";
    int rollNo;

    static int age = 19;

    void display() {
        String status = "Active";
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {

        VariableExamples var = new VariableExamples();
        var.display();
        var.rollNo = 33;

        System.out.println(age);
    }
}
