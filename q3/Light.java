//receiver
public class Light {
    private String roomName;
    public Light(String roomName) {
        this.roomName = roomName;
    }
    public void on() {
        System.out.println("Light is on... in " + roomName);
    }  
    public void off() {
        System.out.println("Light is off... in " + roomName);
    }  
    public String getRoomName() {
        return roomName;
    }
}
