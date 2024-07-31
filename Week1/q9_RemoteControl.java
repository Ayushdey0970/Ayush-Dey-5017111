public class q9_RemoteControl {
    private q9_Command command;

    public void setCommand(q9_Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}