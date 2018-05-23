package kataFizzBuzz;

public class FizzBuzz {

	private Printer printer;

	public FizzBuzz(Printer printer) {
		this.printer=printer;
	}

	public void printFizzBuzz(int number) {
		StringBuilder sb = new StringBuilder();
		for(int increment=1;increment<=number;increment++)
		{
			if(increment==3)
			{
				sb.append("Fizz");
			}else {
				if(increment==5)
				{
					sb.append("Buzz");
				}
				else {
				sb.append(increment);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}

	//collab
	public void fizzBuzz(int i) {
		printer.print("1");
	}

}
