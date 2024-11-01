public class MirrorWithFrame extends MirrorDecorator {
    @Override
    public void produce() {
        getMirror().produce();
        addBorder();
    }

    private void addBorder() {
        System.out.println("The border is added to the mirror");
    }
}
