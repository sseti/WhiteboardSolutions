import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for(int i: nums){
            if(numbers.contains(i)) {
                return true;
            } else {
                numbers.add(i);
            }
        }

        return false;

    }
}

