public final class Dimensions {
    final double length; // Длина, см
    final double width; // Ширина, см
    final double height; // Высота, см

    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSize(double length, double width, double height) {
        return length * width * height;
    }
}
