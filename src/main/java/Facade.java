public class Facade {
    PersonFactory pf = new PersonFactory();
    Person person = new Person();
    Door door = new Door();

    public void facadeMethod(){
        person.action(pf.createPerson());
        person.changeDoorStatus();
        person.checkDoorStatus();
    }
}
