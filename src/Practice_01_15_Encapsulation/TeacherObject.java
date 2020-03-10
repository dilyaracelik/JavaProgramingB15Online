package Practice_01_15_Encapsulation;

public class TeacherObject {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
//        t1.setName("Sventlana");
//        t1.setAge(19);
        t1.initializeFields("Nuran", 18);

        System.out.println("t1.getAge() = " + t1.getAge());
        System.out.println("t1.getName() = " + t1.getName());


    }}