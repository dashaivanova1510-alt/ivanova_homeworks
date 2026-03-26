public class CheckboxButton extends Button {
    public CheckboxButton(Size size) { super(size); }
    @Override
    public void draw() {
        size.applySize();
        System.out.println("Drawing a checkbox button.\n");
    }
}
