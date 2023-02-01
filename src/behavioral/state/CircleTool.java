package behavioral.state;

public class CircleTool implements Tool{

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }


    @Override
    public void erase() {
        System.out.println("Erase Circle");
    }
}
