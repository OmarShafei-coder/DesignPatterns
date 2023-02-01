package behavioral.state;

public class Canvas {
    private Tool currentTool;

    public Canvas(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void draw()
    {
        currentTool.draw();
    }

    public void erase()
    {
        currentTool.erase();
    }
}
