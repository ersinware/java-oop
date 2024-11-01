public class Test {
    public static void main(String[] args) {
        Sort ascendingSort = new AscendingSort();
        ascendingSort.sort();

        Sort descendingSort = new DescendingSort();
        descendingSort.sort();

        Sort ascendingOrderNegative = new AscendingOrderNegative();
        ascendingOrderNegative.sort();
    }
}
