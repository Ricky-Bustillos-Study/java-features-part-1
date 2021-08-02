package one.digitalinnovation.enums;

public class Program {

    public static void main(String[] args) {
        // final VehicleType vehicleType = new VehicleType();

        System.out.println(VehicleType.LAND);
        System.out.println(VehicleType.AQUATIC);

        System.out.println(VehicleType.valueOf("AERIAL"));

        for (VehicleType type: VehicleType.values()) {
            System.out.println("Type: "+type);
        }

        System.out.println("Close status code: "+Status.CLOSE.getCode());
        System.out.println("Open status text: "+Status.OPEN.getText());
    }
}
