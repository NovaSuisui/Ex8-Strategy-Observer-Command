public class Remote {
    private Command[] commands;

    public Remote(int maxButton){
        commands = new Command[maxButton];
        for (int i = 0; i < commands.length; i++) {
            commands[i] = null;
        }
    }

    public void bindKey(Command command, int index){
        commands[index] = command;
    }
    public void removeKey(int index){
        if (commands.length >= index && commands[index] != null) {
            commands[index] = null;
        }
        else {
            System.out.println("No command is assigned to this slot");
        }
    }

    public void clickOn(int index){
        if (commands.length >= index && commands[index] != null) {
            commands[index].on();
        }
        else {
            System.out.println("On button No command is assigned to this slot");
        }
    }
    public void clickOff(int index){
        if (commands.length >= index && commands[index] != null) {
            commands[index].off();
        }
        else {
            System.out.println("Off button No command is assigned to this slot");
        }
    }
}
