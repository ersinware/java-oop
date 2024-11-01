public class MyAdapter extends MyAdaptedClass implements MyInterface {
    @Override
    public void methodOfMyInterface() {
        //
        System.out.println("methodOfMyInterface is called");
        methodOfMyAdaptedClass();
    }
}
