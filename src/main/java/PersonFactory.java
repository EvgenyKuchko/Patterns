import java.util.Scanner;

public class PersonFactory {
    Scanner scanner = new Scanner(System.in);
    Person person = null;

    public Person createPerson() {
        System.out.println("Enter number for create:\n" +
                "[1]. Teacher\n" +
                "[2]. Student\n" +
                "[3]. Director\n");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                person = new Teacher();
                System.out.println("teacher");
                break;
            case 2:
                person = new Student();
                System.out.println("student");
                break;
            case 3:
                person = new Director();
                System.out.println("director");
                break;
        }
        return person;
    }
}