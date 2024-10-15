import java.util.*;
class ArraySumCombinationsIterativeDP {
    public static List<List<Integer>> findCombinations(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Set<List<Integer>>> dp = new HashMap<>();
        // dp.put(0, new HashSet<>(Collections.singletonList(new ArrayList<>())));
        for (int num : arr) {
            Map<Integer, Set<List<Integer>>> newCombinations = new HashMap<>();
            for (int sum : dp.keySet()) {
                if (sum + num <= target) {
                    for (List<Integer> combination : dp.get(sum)) {
                        List<Integer> newCombination = new ArrayList<>(combination);
                        newCombination.add(num);
                        newCombinations.computeIfAbsent(sum + num, k -> new HashSet<>()).add(newCombination);

                        if (sum + num == target) {
                            result.add(newCombination);
                        }
                    }
                }
            }
            for (Map.Entry<Integer, Set<List<Integer>>> entry : newCombinations.entrySet()) {
                dp.computeIfAbsent(entry.getKey(), k -> new HashSet<>()).addAll(entry.getValue());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        List<List<Integer>> result = findCombinations(arr, target);
        System.out.println("All combinations that sum up to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
