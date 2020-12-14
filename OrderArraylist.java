public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
        super();
    }

    public OrderedArrayList(startingCapacity) {
        super(startingCapacity);
    }

    public boolean add(T element) {
        return super.add(sortIndex(element), element);
    }


    public void add(int index, T element) {
        super.add(sortIndex(element), element);
    }


    public T set(int index, T element) {
        T remove = super.get(index);
        super.remove(index);
        super.add(getSortIndex(element), element);
        return remove;
    }

    private int sortIndex(T element) {
        int index = 0;
        if (this.size() > 0){
            for (int i  = 0; i < super.size(); i++){
                if(element.compareTo(super.get(i))>0) index++;
            }
        }
        return index;
    }
}
