public final class Dimensions {
    final double length; // Длина
    final double width; // Ширина
    final double height; // Высота

    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSize(double length, double width, double height) {
        return length * width * height;
    }
}
