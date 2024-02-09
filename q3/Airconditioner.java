public class Airconditioner {
    private String roomName;
    public Airconditioner(String roomName) {
        this.roomName = roomName;
    }
    public void on() {
        System.out.println("The AC is on... in " + roomName);
    }
    public void setTemp(int temp) {
        System.out.println("The temp is set to  " + temp + " in " + roomName);
    }
    public void off() {
        System.out.println("The AC is off... in " + roomName);
    }

    public String getRoomName() {
        return roomName;
    }
    
}
