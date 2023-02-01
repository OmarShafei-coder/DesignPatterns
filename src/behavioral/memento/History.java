package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History<T> {
    private final List<EditorState<T>> states = new ArrayList<>();

    public void push(EditorState<T> state){
        states.add(state);
    }
    public EditorState<T> pop(){
        int lastIndex = states.size() - 1;
        EditorState<T> lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }
}
