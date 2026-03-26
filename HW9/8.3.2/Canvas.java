public class Canvas {
    public static void main(String[] args) {
        Size small = new SmallSize();
        Size medium = new MediumSize();
        Size large = new LargeSize();
        Size userSize = new UserSize();

        System.out.println(" Old buttons refactored ");
        
        Button btn1 = new CheckboxButton(small);
        btn1.draw();

        Button btn2 = new RadioButton(medium);
        btn2.draw();

        Button btn3 = new DropdownButton(large);
        btn3.draw();

        System.out.println(" New functionality (ImageButton & UserSize) ");

        Button btn4 = new ImageButton(userSize);
        btn4.draw();

        Button btn5 = new RadioButton(userSize);
        btn5.draw();
    }
}
