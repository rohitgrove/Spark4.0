package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class HW {
    public static void main() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 10; i <= 50; i += 10) {
            nums.add(i);
        }
        System.out.println("List is: " + nums);
        if (nums.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        nums.clear();
        System.out.println("List is: " + nums);
        if (nums.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
    }
}
