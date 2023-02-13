package structural.adapter;

public class VividFilter implements Filter{
    /**
     * @param image
     */
    @Override
    public void apply(Image image) {
        System.out.println("Apply Vivid Filter");
    }
}
