import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    PersonFactory personFactory = new PersonFactory();

    public void start() {
        while (true) {
            Person person = personFactory.createPerson();
            System.out.println("Choose operation for person:\n" +
                    "[1]. Change door status\n" +
                    "[2]. Check door status\n" +
                    "[3]. Do action");
            int choose = scanner.nextInt();
            if (choose == 1) {
                person.changeDoorStatus();
            } else if (choose == 2) {
                person.checkDoorStatus();
            } else if (choose == 3) {
                person.action(person);
            }
        }
    }
}
