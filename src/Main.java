import behavioral.state.Canvas;
import behavioral.state.ToolType;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setToolType(ToolType.Circle);
        canvas.draw();
        canvas.erase();
        canvas.setToolType(ToolType.Rectangular);
        canvas.draw();
        canvas.erase();
    }
}