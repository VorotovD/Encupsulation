import java.util.Scanner;

public class MainCargo {
    public static void main(String[] args) {
        boolean setChanges;
        boolean changes = false;
        Cargo newCargo;

        Dimensions dimensions = new Dimensions(10, 11, 1);
        Cargo cargo = new Cargo(dimensions, 15, "куда-то", true, "123", true);

        newCargo = cargo;

        System.out.println("Внести изменения? (true/false)");
        setChanges = new Scanner(System.in).nextBoolean();

        //Циклический вызов изменения объекта с сохранением изменений
        while (setChanges) {
            System.out.println("Куда внести изменения? (address,dimensions,weight)");
            String change = new Scanner(System.in).next();
            switch (change) {
                case "address" -> {
                    System.out.println("Введите адрес доставки");
                    String address = new Scanner(System.in).next();

                    // Проверка на внесенные изменения
                    if (!changes) {
                        newCargo = cargo.setAddress(address);
                    } else {
                        newCargo = newCargo.setAddress(address);
                    }
                }
                case "dimensions" -> {
                    System.out.println("Введите длину груза");
                    double length = new Scanner(System.in).nextDouble();
                    System.out.println("Ведите ширину груза");
                    double width = new Scanner(System.in).nextDouble();
                    System.out.println("Введите выосту груза");
                    double height = new Scanner(System.in).nextDouble();
                    if (!changes) {
                        newCargo = cargo.setDimensions(length, width, height);
                    } else {
                        newCargo = newCargo.setDimensions(length, width, height);
                    }
                }
                case "weight" -> {
                    System.out.println("Введите вес груза");
                    double weight = new Scanner(System.in).nextDouble();
                    if (!changes) {
                        newCargo = cargo.setWeight(weight);
                    } else {
                        newCargo = newCargo.setWeight(weight);
                    }
                }
            }

            System.out.println("Внести изменения? (true/false)");
            setChanges = new Scanner(System.in).nextBoolean();
            printCargoInfo(cargo);
            printCargoInfo(newCargo);
            changes = true;
        }
    }

    // Вывод информации о объекте
    public static void printCargoInfo(Cargo cargoObject) {
        System.out.println("Объект " + cargoObject + ". Параметры:" + "\n"
                + "Длина:" + cargoObject.dimensions.length + "\n"
                + "Ширина:" + cargoObject.dimensions.width + "\n"
                + "Высота:" + cargoObject.dimensions.height + "\n"
                + "Вес:" + cargoObject.weight + "\n"
                + "Адрес доставки" + cargoObject.address + "\n"
                + "Можно ли переворачивать?:" + cargoObject.overturn + "\n"
                + "Регистрационный номер:" + cargoObject.regNumber + "\n"
                + "Хрупкость:" + cargoObject.fragility + "\n");
    }
}


