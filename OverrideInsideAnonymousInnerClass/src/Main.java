public class Main {
    public static void main(String[] args) {
        /*
        anonymous inner class içerisinde bu şekilde override edilebilir
        her metod override edilmek zorunda değil.
         */
        PdfCreator pdfCreator = new PdfCreator() {
            @Override
            public String create() {
                method();
                return super.getService() + " from anonymous inner class";
            }

            public void method() {
                System.out.println("method is called on anonymous inner class");
            };
        };
        System.out.println(pdfCreator.create());

        PdfCreator pdfCreator2 = new PdfCreator();
        System.out.println(pdfCreator2.create());
    }
}