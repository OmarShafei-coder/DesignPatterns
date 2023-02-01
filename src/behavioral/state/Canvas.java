package behavioral.state;

public class Canvas {
    private ToolType toolType;

    public void setToolType(ToolType toolType) {
        this.toolType = toolType;
    }

    public void draw()
    {
        switch (toolType){
            case Circle -> System.out.println("Draw Circle");
            case Rectangular -> System.out.println("Draw rectangular");
        }
    }

    public void erase()
    {
        switch (toolType){
            case Circle -> System.out.println("Erase Circle");
            case Rectangular -> System.out.println("Erase rectangular");
        }
    }
}
