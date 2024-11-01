import java.util.Scanner;

public abstract class Sort {
    public final int[] arr = new int[5];

    public final void sort() {
        getInput();
        bubbleSort();
        display();
    }

    private void getInput() {
        System.out.println("enter 5 numbers");
        var scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (!checkInput(arr[i]))
                throw new Error("invalid number");
        }
    }

    public abstract boolean checkInput(int number);

    public void bubbleSort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (compare(arr[j], arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public abstract boolean compare(int numberOne, int numberTwo);

    private void display() {
        for (int number : arr) System.out.println(number);
    }
}
