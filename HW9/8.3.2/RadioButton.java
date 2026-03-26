public class RadioButton extends Button {
    public RadioButton(Size size) { super(size); }
    @Override
    public void draw() {
        size.applySize();
        System.out.println("Drawing a radio button.\n");
    }
}
