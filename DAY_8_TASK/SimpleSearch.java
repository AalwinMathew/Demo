public class SimpleSearch {

    public static void main(String[] args) {
        Object[] data = {10, "apple", true, "banana", 42, false, "grape"};

        String input = "banana"; 

        Object key = detectType(input);

        int index = search(data, key);

        if (index != -1) {
            System.out.println("Found '" + key + "' at index " + index);
        } else {
            System.out.println("Value '" + key + "' not found.");
        }
    }

    public static Object detectType(String input) {
        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            return Boolean.parseBoolean(input);
        }
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return input;
        }
    }

    public static int search(Object[] arr, Object key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
