package behavioral.state;

public class StateMain {
    public static void main(String[] args) {
        Canvas canvas = new Canvas(new CircleTool());
        canvas.draw();
        canvas.erase();
        canvas = new Canvas(new RectangularTool());
        canvas.draw();
        canvas.erase();
    }
}