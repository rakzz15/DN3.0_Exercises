package CPE;

public class CommandPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating the receiver
        Light livingRoomLight = new Light();

        // Creating commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Creating the invoker
        RemoteControl remote = new RemoteControl();

        // Turning the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turning the light off
        remote.setCommand(lightOff);
        remote.pressButton();
	}

}
