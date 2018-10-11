public class LockerPuzzle {
	
	public static void main(String[] args) {
		
		//Declare locker as a boolean array of 100 elements
		boolean[] locker = new boolean[100];
		
		//Instantiate each locker as false (closed)
		for (int i = 0; i < locker.length; i++) {
			locker[i] = false;
		}
		
		//Each student changes (opens/closes) each nth locker
		//Where n is the student's number in line
		//The first student opens all lockers
		//The second student closes every other locker
		//The third toggles every third locker (opens closed locker, closes opened ones)
		//This continues up to the 100th student
		for (int i = 1; i <= locker.length; i++) {
			for (int j = i-1; j < locker.length; j+=i) {
				locker[j] = (!locker[j]);
			}
		}
		
		//Print the status of the lockers
		//True indicates a locker is opened
		//False indicates a locker is closed
		for (int k = 0; k < locker.length; k++) {
			System.out.println("Locker " + (k+1) + " is " + (locker[k] == true ? "open" : "closed"));
		}
	}

}