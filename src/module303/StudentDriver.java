package module303;

public class StudentDriver {
    public static void main(String[] args) {
        // Create our student objects:
        double grades[] = new double[]{100,95,99};
        Student nurseit = new Student("Nurseit", "Kalbaev", "Mamanazirovich", 31,7777777,"123 ABC lane",grades, 2024);

        nurseit.setAge(33);
        nurseit.setAddress("12618 NE 10th Pl");
        nurseit.setGrades(grades);
        nurseit.setSocialSecurity(777777777);
        nurseit.setGraduationYear(2024);

        Student guled = new Student();
        guled.setGraduationYear(2024);




    }

}
