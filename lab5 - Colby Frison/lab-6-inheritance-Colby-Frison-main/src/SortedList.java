import java.util.Arrays;

public class SortedList extends IntegerList{

    public SortedList() {
        super();
    }

    public SortedList(int num) {
        super(num);
    }

    @Override
    public void add(int num) throws UnsupportedOperationException {
        super.insert(size, num);
        Arrays.sort(array, 0, size);
    }

    @Override
    public void insert(int index, int num) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }
    
}
