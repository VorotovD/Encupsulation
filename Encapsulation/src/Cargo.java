public class Cargo {
    final Dimensions dimensions;
    final double weight; // Вес, кг
    final String address; // Адрес  доаставки
    final boolean overturn; // Можно ли переворачивать
    final String regNumber; // Регистрационныйы номер
    final boolean fragility; // Хрупкость


    public Cargo(Dimensions dimensions, double weight, String address, boolean overturn, String regNumber, boolean fragility) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.overturn = overturn;
        this.regNumber = regNumber;
        this.fragility = fragility;
    }

    public Cargo(double length, double width, double height, double weight, String address, boolean overturn, String regNumber, boolean fragility) {
        dimensions = setCargoDimensions(length, width, height);
        this.weight = weight;
        this.address = address;
        this.overturn = overturn;
        this.regNumber = regNumber;
        this.fragility = fragility;
    }

    public Dimensions setCargoDimensions(double length, double width, double height) {
        return new Dimensions(length, width, height);
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions.length, dimensions.width, dimensions.height, weight, address, overturn, regNumber, fragility);
    }

    public Cargo setDimensions(double length, double width, double height) {
        return new Cargo(length, width, height, weight, address, overturn, regNumber, fragility);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions.length, dimensions.width, dimensions.height, weight, address, overturn, regNumber, fragility);
    }

}
