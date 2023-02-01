import behavioral.memento.Editors;

public class MementoMain {
    public static void main(String[] args) {

        Editors editors = new Editors();

        editors.getContent().setValue("content 1");
        editors.getFontSize().setValue(1);

        editors.getContent().setValue("content 2");
        editors.getFontSize().setValue(2);

        System.out.println(editors.getContent().getValue());
        System.out.println(editors.getFontSize().getValue());

        editors.getContent().undo();
        editors.getFontSize().undo();

        System.out.println("\n" + editors.getContent().getValue());
        System.out.println(editors.getFontSize().getValue());

        String x = editors.getContent().getValue();
        int y = editors.getFontSize().getValue();

        System.out.println("\n" + x);
        System.out.println(y);
    }
}