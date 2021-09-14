import adapter.Adapter;

public class Person {
    private String name;
    private Adapter adapter = new Adapter();

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeDoorStatus(){
        Door.getInstance(Door.isStatus());
        Door.changeStatus();
    }

    public void checkDoorStatus(){
        Door.doorStatus();
    }

    public void action(Person person){
        if(person.getClass().getSimpleName().equals("Student")){
            adapter.learn();
        }else if(person.getClass().getSimpleName().equals("Teacher")){
            adapter.teach();
        }else if(person.getClass().getSimpleName().equals("Director")){
            adapter.management();
        }
    }
}