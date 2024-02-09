public class App {
    public static void main(String[] args) {
        Light lightBedRoom = new Light("light Bed Room");
        Light lightKitchen = new Light("light Kitchen");
        Airconditioner ACBedRoom = new Airconditioner("AC Bed Room");

        LightCommand remoteKey0 = new LightCommand(lightBedRoom);
        LightCommand remoteKey1 = new LightCommand(lightKitchen);
        AirconditionerCommand remoteKey2 = new AirconditionerCommand(ACBedRoom);

        Remote remote = new Remote(6);
        remote.bindKey(remoteKey0, 0);
        remote.bindKey(remoteKey1, 1);
        remote.bindKey(remoteKey2, 2);

        System.out.println("slot 0, light Bed Room");
        remote.clickOn(0);
        remote.clickOff(0);

        System.out.println("slot 1, light Kitchen");
        remote.clickOn(1);
        remote.clickOff(1);

        System.out.println("slot 2, AC Bed Room");
        remote.clickOn(2);
        remote.clickOff(2);

        System.out.println("test one unavailable slot, slot 3");
        remote.clickOn(3);
        remote.clickOff(3);
    }
}
