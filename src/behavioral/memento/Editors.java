package behavioral.memento;

public class Editors {
//    Add here anything you want to perform undo operation on it
//    So we can create a model for each object that contains anything want to perform undo operation
    private Editor<String> content = new Editor<>();
    private Editor<Integer> fontSize = new Editor<>();

    public Editor<String> getContent() {
        return content;
    }

    public void setContent(Editor<String> content) {
        this.content = content;
    }

    public Editor<Integer> getFontSize() {
        return fontSize;
    }

    public void setFontSize(Editor<Integer> fontSize) {
        this.fontSize = fontSize;
    }
}
