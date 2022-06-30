import java.util.Scanner;

public class MainCargo {
    public static void main(String[] args) {
        boolean setChanges;
        boolean changes = false;
        Cargo newCargo;

        Dimensions dimensions = new Dimensions(10, 11, 1);
        Cargo cargo = new Cargo(dimensions, 15, "куда-то", true, "123", true);

        newCargo = cargo;

        System.out.println("Âíåñòè èçìåíåíèÿ? (true/false)");
        setChanges = new Scanner(System.in).nextBoolean();

        //Öèêëè÷åñêèé âîçîâ èçìåíåíèÿ îáúåêòà ñ ñîõðàíåíèåì èçìåíåíèé
        while (setChanges) {
            System.out.println("Êóäà âíåñòè èçìåíåíèÿ? (address,dimensions,weight)");
            String change = new Scanner(System.in).next();
            switch (change) {
                case "address" -> {
                    System.out.println("Ââåäèòå àäðåñ");
                    String address = new Scanner(System.in).next();

                    // Ïðîâåðêà íà âíåñåíèå èçìåíåíèé
                    if (!changes) {
                        newCargo = cargo.setAddress(address);
                    } else {
                        newCargo = newCargo.setAddress(address);
                    }
                }
                case "dimensions" -> {
                    System.out.println("Ââåäèòå äëèíó");
                    double length = new Scanner(System.in).nextDouble();
                    System.out.println("Ââåäèòå âûñîòó");
                    double width = new Scanner(System.in).nextDouble();
                    System.out.println("Ââåäèòå øèðèíó");
                    double height = new Scanner(System.in).nextDouble();
                    if (!changes) {
                        newCargo = cargo.setDimensions(length, width, height);
                    } else {
                        newCargo = newCargo.setDimensions(length, width, height);
                    }
                }
                case "weight" -> {
                    System.out.println("Ââåäèòå âåñ");
                    double weight = new Scanner(System.in).nextDouble();
                    if (!changes) {
                        newCargo = cargo.setWeight(weight);
                    } else {
                        newCargo = newCargo.setWeight(weight);
                    }
                }
            }

            System.out.println("Âíåñòè èçìåíåíèÿ? (true/false)");
            setChanges = new Scanner(System.in).nextBoolean();
            printCargoInfo(cargo);
            printCargoInfo(newCargo);
            changes = true;
        }
    }

    // Âûâîä èíôîðìàöèè î îáúåêòå
    public static void printCargoInfo(Cargo cargoObject) {
        System.out.println("Îáúåêò " + cargoObject + " èìååò ïàðàìåòðû:" + "\n"
                + "Äëèíà:" + cargoObject.dimensions.length + "\n"
                + "Øèðèíà:" + cargoObject.dimensions.width + "\n"
                + "Âûñîòà:" + cargoObject.dimensions.height + "\n"
                + "Âåñ:" + cargoObject.weight + "\n"
                + "Àäðåñ äîñòàâêè:" + cargoObject.address + "\n"
                + "Ìîæíî ëè ïåðåâîðà÷èâàòü?:" + cargoObject.overturn + "\n"
                + "Ðåãèñòðàöèîííûé íîìåð:" + cargoObject.regNumber + "\n"
                + "Õðóïêîñòü:" + cargoObject.fragility + "\n");
    }
}


