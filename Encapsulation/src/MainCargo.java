import java.util.Scanner;

public class MainCargo {
    public static void main(String[] args) {
        boolean setChanges;
        boolean changes = false;
        Cargo newCargo;

        Dimensions dimensions = new Dimensions(10, 11, 1);
        Cargo cargo = new Cargo(dimensions, 15, "����-������", true, "123", true);

        newCargo = cargo;

        System.out.println("������ ���������? (true/false)");
        setChanges = new Scanner(System.in).nextBoolean();

        //����������� ����� ��������� ������� � ����������� ���������
        while (setChanges) {
            System.out.println("���� ������ ���������? (address,dimensions,weight)");
            String change = new Scanner(System.in).next();
            switch (change) {
                case "address" -> {
                    System.out.println("������� �����");
                    String address = new Scanner(System.in).next();

                    // �������� �� �������� ���������
                    if (!changes) {
                        newCargo = cargo.setAddress(address);
                    } else {
                        newCargo = newCargo.setAddress(address);
                    }
                }
                case "dimensions" -> {
                    System.out.println("������� �����");
                    double length = new Scanner(System.in).nextDouble();
                    System.out.println("������� ������");
                    double width = new Scanner(System.in).nextDouble();
                    System.out.println("������� ������");
                    double height = new Scanner(System.in).nextDouble();
                    if (!changes) {
                        newCargo = cargo.setDimensions(length, width, height);
                    } else {
                        newCargo = newCargo.setDimensions(length, width, height);
                    }
                }
                case "weight" -> {
                    System.out.println("������� ���");
                    double weight = new Scanner(System.in).nextDouble();
                    if (!changes) {
                        newCargo = cargo.setWeight(weight);
                    } else {
                        newCargo = newCargo.setWeight(weight);
                    }
                }
            }

            System.out.println("������ ���������? (true/false)");
            setChanges = new Scanner(System.in).nextBoolean();
            printCargoInfo(cargo);
            printCargoInfo(newCargo);
            changes = true;
        }
    }

    // ����� ���������� � �������
    public static void printCargoInfo(Cargo cargoObject) {
        System.out.println("������ " + cargoObject + " ����� ���������:" + "\n"
                + "�����:" + cargoObject.dimensions.length + "\n"
                + "������:" + cargoObject.dimensions.width + "\n"
                + "������:" + cargoObject.dimensions.height + "\n"
                + "���:" + cargoObject.weight + "\n"
                + "����� ��������:" + cargoObject.address + "\n"
                + "����� �� ��������������?:" + cargoObject.overturn + "\n"
                + "��������������� �����:" + cargoObject.regNumber + "\n"
                + "���������:" + cargoObject.fragility + "\n");
    }
}


