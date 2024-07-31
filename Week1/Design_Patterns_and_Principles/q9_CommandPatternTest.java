public class q9_CommandPatternTest {
    public static void main(String[] args) {
        q9_Light light = new q9_Light();
        q9_Command lightOn = new q9_LightOnCommand(light);
        q9_Command lightOff = new q9_LightOffCommand(light);

        q9_RemoteControl remote = new q9_RemoteControl();

        // Turn on the light
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn off the light
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}