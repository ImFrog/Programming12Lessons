import java.util.ArrayList;

public class IntegerSet {

    //Requires: int
    //Effects: if num is not in array, return false, else true
    private ArrayList<Integer> nums = new ArrayList<>();

    public boolean contains(int num) {
        return nums.contains(num);
    }

    public void insert(int num) {
        if(!nums.contains(num)) {
            nums.add(num);
        }
    }

    public int size() {
        return nums.size();
    }

    public void remove(int num) {
        nums.remove(nums.indexOf(num));
    }
}
