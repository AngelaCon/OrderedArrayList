import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

    public NoNullArrayList() {
        super();
    }

    public NoNullArrayList(int startingCapacity) {
        super(startingCapacity);
    }

    public boolean add(T element) {
        if(element == null) throw new IllegalArgumentException("you cannot put null here");
        super.add(element);
    }

    public void add(int index, T element) {
        if(element == null) throw new IllegalArgumentException("you cannot put null here");
        super.add(index, element);
    }

    public void T set(int index, T element) {
        if(element == null) throw new IllegalArgumentException("you cannot put null here");
        super.set(index, value);
    }



}
