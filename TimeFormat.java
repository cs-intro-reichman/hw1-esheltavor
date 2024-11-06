// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		String minutes = "" + args[0].charAt(3) + args[0].charAt(4);
		// Determine whether it's AM or PM
        boolean isAM = hours < 12;
		// Convert to 12-hour format
        int displayHours = hours % 12;
        if (displayHours == 0 &! isAM) {
            displayHours = 12; // Handle noon (12 -> 12 PM)
        }
		if (isAM) {
			System.out.println(displayHours + ":" + minutes + " AM");
		} else {
			System.out.println(displayHours + ":" + minutes + " PM");
		}
	}
}
