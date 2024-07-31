public class q9_LightOffCommand implements q9_Command {
    private q9_Light light;

    public q9_LightOffCommand(q9_Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}