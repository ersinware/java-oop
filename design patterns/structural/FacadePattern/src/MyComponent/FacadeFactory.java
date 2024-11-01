package MyComponent;

/*
Singleton tasarım kalıbı kullanılıyor
 */

public class FacadeFactory {
    private static FacadeFactory facadeFactory = new FacadeFactory();

    private FacadeFactory() {
        System.out.println("facadeFactory object is created");
    }

    public static FacadeFactory getInstance() {
        return facadeFactory;
    }

    public ComponentFacade getFacade() {
        return new FacadeImpl();
    }
}
