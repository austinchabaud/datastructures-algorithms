public class MissingNumber {

    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int missingNum = findMissingNumber(numbers, maxNum);
        System.out.println("Missing number: " + missingNum);
    }

    public static int findMissingNumber(int[] numbers, int maxNum) {
        int expectedSum = maxNum * (maxNum + 1) / 2;

        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }

        int missingNum = expectedSum - actualSum;

        return (missingNum == 0) ? 0 : missingNum;
    }
}

