
public class StarPattern {
	public static void main(String args[])
	{
		int r=0, c=0;
		{
			System.out.println("Star pattern using nested for loop:\n");
		}
		for(r=1;r<=4;r++)
		{
			for(c=1;c<=r;c++)
			{
				System.out.print("*\t");
			}
			System.out.println(" ");
		}
	}

}
