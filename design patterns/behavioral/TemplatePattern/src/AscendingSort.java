public class AscendingSort extends Sort {
    @Override
    public boolean checkInput(int number) {
        return number > 0;
    }

    @Override
    public boolean compare(int numberOne, int numberTwo) {
        return !(numberOne < numberTwo);
    }

}
