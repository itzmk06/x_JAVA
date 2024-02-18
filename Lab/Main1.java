interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Resized width to: " + width);
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Resized height to: " + height);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("Initial Width: " + rectangle.getWidth());
        System.out.println("Initial Height: " + rectangle.getHeight());

        rectangle.resizeWidth(15);
        rectangle.resizeHeight(8);

        System.out.println("Final Width: " + rectangle.getWidth());
        System.out.println("Final Height: " + rectangle.getHeight());
    }
}

//outlput
// Initial Width: 10
// Initial Height: 5
// Resized width to: 15
// Resized height to: 8
// Final Width: 15
// Final Height: 8