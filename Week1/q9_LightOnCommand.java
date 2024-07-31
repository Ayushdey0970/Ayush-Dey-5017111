public class q9_LightOnCommand implements q9_Command {
    private q9_Light light;

    public q9_LightOnCommand(q9_Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}