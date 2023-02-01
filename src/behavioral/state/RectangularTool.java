package behavioral.state;

public class RectangularTool implements Tool{

    @Override
    public void draw() {
        System.out.println("Draw rectangular");
    }
    @Override
    public void erase() {
        System.out.println("Erase rectangular");
    }
}
