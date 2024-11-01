package MyComponent;

class FacadeImpl implements ComponentFacade {
    @Override
    public void methodOfFacadeImpl() {
        System.out.println("methodOfFacadeImpl is called");
        new MyClass().methodOfMyClass();
    }
}
