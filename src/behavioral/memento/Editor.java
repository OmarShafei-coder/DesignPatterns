package behavioral.memento;

public class Editor<T> {
    private T value;
    private final History<T> history = new History<>();;

    private EditorState<T> createState() {
        return new EditorState<>(value);
    }
    public void undo(){
        value = history.pop().getValue();
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value){
        if(this.value != null)
            history.push(this.createState());
        this.value = value;
    }
}
