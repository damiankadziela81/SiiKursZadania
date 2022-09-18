package sii.dp.command;

public class Main {

	public static void main(String[] args) {
		
		InternetOfThings fridge = new Fridge();
		InternetOfThings microwave = new Microwave();
				
		Commander fridgeSwitchOff = new MachineOnSwitcher(fridge);
		Commander fridgeSwitchOn = new MachineOffSwitcher(fridge);
		
		Commander microwaveSwitchOn = new MachineOnSwitcher(microwave);
		Commander microwaveSwitchOff = new MachineOffSwitcher(microwave);
	
		RemoteControl fridgeRemoteControl = new RemoteControl();
		fridgeRemoteControl.setCommand(fridgeSwitchOff);
		
		RemoteControl microwaveRemoteControl = new RemoteControl();
		microwaveRemoteControl.setCommand(microwaveSwitchOn);
		
		System.out.println(fridgeRemoteControl.exe());
		System.out.println(microwaveRemoteControl.exe());
		
	}

}
