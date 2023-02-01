package behavioral.memento;

public class EditorState<T> {
    private final T value;

    public EditorState(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
