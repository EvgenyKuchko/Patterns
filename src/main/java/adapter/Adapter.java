package adapter;

public class Adapter extends ActionMethods implements PersonActions{
    @Override
    public void teach() {
        teachMath();
    }

    @Override
    public void learn() {
        learnEnglish();
    }

    @Override
    public void management() {
        schoolManagement();
    }
}
