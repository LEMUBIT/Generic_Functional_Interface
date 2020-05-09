package lemubit.academy;

public class Main {

    public static void main(String[] args) {
        var arrayInt = new Integer[]{3, 3, 4};
        var arrayStr = new String[]{"3", "3", "4"};

        Store<Integer> storeInt = (arr) -> {
            int sum = 0;
            for (int x : arr) {
                sum = sum + x;
            }
            return sum;
        };

        Store<String> storeStr = (arr) -> {
            int sum = 0;
            for (String x : arr) {
                int xInt = Integer.parseInt(x);
                sum = sum + xInt;
            }
            return String.valueOf(sum);
        };

        var result = storeStr.add(arrayStr);

        System.out.println(result);


    }

    interface Store<T> {
        T add(T[] arr);
    }
}
