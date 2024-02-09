public class AirconditionerCommand implements Command {
    private Airconditioner airconditioner;

    public AirconditionerCommand(Airconditioner airconditioner){
        this.airconditioner = airconditioner;
    }
    
    @Override
    public void on(){
        airconditioner.setTemp(25);
        airconditioner.on();
    }
    @Override
    public void off(){
        airconditioner.off();
    }
}
