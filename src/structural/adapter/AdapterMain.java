package structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelAdapter(new Caramel()));
    }
}