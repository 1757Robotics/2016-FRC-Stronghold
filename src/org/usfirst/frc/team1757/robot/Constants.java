package org.usfirst.frc.team1757.robot;

public class Constants {
	private Constants(){}
	
	public static final class Config {
		private Config(){}
		
	}
	
	public static final class CAN_ {
		private CAN_(){}
		
		public static final int
		MOTORFRONTLEFT, MOTORFRONTRIGHT, MOTORBACKLEFT, MOTORBACKRIGHT, MOTORARM, PCM, PDP;
	}
	
	public static final class PCM_ {
		private PCM_(){}
		
		
	}
	
	public static final class AIO_ {
		private AIO_(){}
		
		public static final int
		TRANSDUCER, GYROMETER;
	}
	
	public static final class DIO_ {
		private DIO_(){}
		
		public static final int
		STOPSWITCH;
	}
	
	public static final class Gamepad_LogitechDual {
		private Gamepad_Logitech(){}
		
		public static final int PORT = 1;
		public static final float DEADZONE = 0.08f, INVERTED = 0.0f, TRIGGERZONE = 0.0f;
		public static final String MODE = "DUALACTION";
		
		public static final int
		BUTTON_A = 1
	}
}
