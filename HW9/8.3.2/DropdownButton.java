public class DropdownButton extends Button {
    public DropdownButton(Size size) { super(size); }
    @Override
    public void draw() {
        size.applySize();
        System.out.println("Drawing a dropdown button.\n");
    }
}
