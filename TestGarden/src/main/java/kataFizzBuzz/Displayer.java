package kataFizzBuzz;

public class Displayer {

	private String stringToDisplay;
	
	public void display(int i) {
		this.stringToDisplay = String.valueOf(i);
		System.out.println(i);
	}

	@Override
	public String toString()
	{
		return stringToDisplay;
	}
}
