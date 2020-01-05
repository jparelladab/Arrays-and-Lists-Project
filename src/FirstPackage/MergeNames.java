package FirstPackage;

import java.util.ArrayList;

public class MergeNames {

    public static void addUniq(String[] arr, ArrayList<String> result) {
        for (String i : arr) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
    }

    public static String[] uniqueNames(String[] names1, String[] names2) {
        ArrayList<String> solution = new ArrayList<String>();
        addUniq(names1, solution);
        addUniq(names2, solution);
        String[] output = solution.toArray(new String[solution.size()]);
        return output;
    }


    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}