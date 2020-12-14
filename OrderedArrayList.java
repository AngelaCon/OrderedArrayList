public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
        super();
    }

    public OrderedArrayList(int startingCapacity) {
        super(startingCapacity);
    }

    public boolean add(T element) {
        super.add(sortIndex(element), element);
        return true;
    }


    public void add(int index, T element) {
        super.add(sortIndex(element), element);
    }


    public T set(int index, T element) {
        T remove = super.get(index);
        if (element == null) throw new IllegalArgumentException("you cannot put null here");
        else {
        super.remove(index);
        super.add(sortIndex(element), element);
    }
        return remove;
    }

    private int sortIndex(T element) {
        if(element == null) throw new IllegalArgumentException("cannot implement null"); 
        int index = 0;
        if (this.size() > 0){
            for (int i  = 0; i < super.size(); i++){
                if(element.compareTo(super.get(i))>0) index++;
            }
        }
        return index;
    }
}
