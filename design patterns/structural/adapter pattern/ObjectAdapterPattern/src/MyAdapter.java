public class MyAdapter extends MyUsingClass {
    private MyAdaptedClass myAdaptedClass = new MyAdaptedClass();

    @Override
    public void methodOfMyUsingClass() {
        myAdaptedClass.methodOfMyAdaptedClass();
        super.methodOfMyUsingClass();
    }
}
