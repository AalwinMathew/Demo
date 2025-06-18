public class FrequencyCounter {

    public static int firstOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                result = mid;
                right = mid - 1; 
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static int lastOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                result = mid;
                left = mid + 1; 
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static int countFrequency(int[] arr, int key) {
        int first = firstOccurrence(arr, key);
        if (first == -1) {
            return 0; 
        }
        int last = lastOccurrence(arr, key);
        return last - first + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6}; 
        int key = 5;

        int frequency = countFrequency(arr, key);
        System.out.println("Frequency of " + key + ": " + frequency);
    }
}
