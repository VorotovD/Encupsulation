public final class Dimensions {
    final double length; // �����
    final double width; // ������
    final double height; // ������

    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSize(double length, double width, double height) {
        return length * width * height;
    }
}
