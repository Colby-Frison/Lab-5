public class UniqueList extends IntegerList{
    
    public UniqueList(){
        super();
    }

    public UniqueList(int num){
        super(num);
    }

    @Override
    public void add(int num) throws IllegalArgumentException {
        if(indexOf(num) == -1){
            super.add(num);
        }
        else{
            throw new IllegalArgumentException("The integer " + num + " is already in the list.");
        }
    }

    @Override
    public void insert(int index, int num) throws IllegalArgumentException {
        if(indexOf(num) == -1){
            super.insert(index, num);
        }
        else{
            throw new IllegalArgumentException("The integer " + num + " is already in the list.");
        }
    }
}
