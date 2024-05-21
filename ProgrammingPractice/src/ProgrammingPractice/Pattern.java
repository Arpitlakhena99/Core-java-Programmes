package ProgrammingPractice;

public class Pattern {
/**
 * starts with a character 'A' and a number 1.
*It iterates through each row from 1 to 4.
*For each row, it iterates through each column from 1 to the current row number.
*If the row number is even, it prints the current character ('A', 'B', 'C', ...) and increments the character.
*If the row number is odd, it prints the current number (1, 2, 3, ...) and increments the number.
*The output of this program looks like this:
* @param args
	 */
public static void main(String[] args) {
	char current='A';
	int num =1;
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i%2==0)
			{
				System.out.print(current+" ");
				current++;
			}
			else {
				System.out.print(num+" ");
				num++;
			}
		}
		System.out.println();
	}
}
}
