public class Student {

    private String name;
    private int id;
    private double score;

    public void setAllAttributes(String s_name, int s_id, double s_score) {
        name = s_name;
        id = s_id;
        score = s_score;
    }

    public void getAllAttributes() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Score: " + score);
    }

    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].setAllAttributes("Ahmed Ali", 1, 92.5);
        students[1].setAllAttributes("Sara Mohammed", 2, 88.0);
        students[2].setAllAttributes("Rana Ahmed", 3, 95.3);

        students[0].getAllAttributes();
        students[1].getAllAttributes();
        students[2].getAllAttributes();
    }
}