public class Door {
    private static Door instance;
    private static boolean status = false;

    public Door() {
    }

    private Door(boolean status){
        this.status = status;
    }

    public static boolean isStatus() {
        return status;
    }

    public static void setStatus(boolean status) {
        Door.status = status;
    }

    public static Door getInstance(boolean status){
        if(instance == null){
            instance = new Door(status);
        }
        return instance;
    }

    public static boolean changeStatus(){
        if(!status){
            status = true;
            System.out.println("Open door");
        }else{
            status = false;
            System.out.println("Close door");
        }
        return status;
    }

    public static void doorStatus(){
        if(!status){
            System.out.println("Closed");
        }else{
            System.out.println("Opened");
        }
    }
}