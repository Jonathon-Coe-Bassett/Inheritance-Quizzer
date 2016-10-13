import java.util.InputMismatchException;
import java.util.Scanner;

public class QuizRunner
	{
		static String name;
		static int score, counter1, counter2;
		public static void main(String[] args)
			{	
				System.out.println("What is your name?");
				Scanner userInput=new Scanner(System.in);
				name=userInput.nextLine();
				System.out.println("Welcome to the inheritance quizzer, " + name + "!");
				System.out.println("Today I will be testing you on your understanding of Inheritance.");

				for (int i=0; i<16; i++)
					{
						if (i<4)
							{
								System.out.println(instance("Feline", "Feline"));
							}
						else if (i>4 && i<8)
							{
								System.out.println(instance("Feline", "Cat"));
							}
						else if (i>8 && i<12)
							{
								System.out.println(instance("Cat", "Feline"));
							}
						else
							{
								System.out.println(instance("Cat", "Cat"));
							}
					}
			}
		protected void listAnswers()
		{
			System.out.println("a) ROAR");
			System.out.println("b) Boing");
			System.out.println("c) Meow");
			System.out.println("d) Lick");
			System.out.println("e) It will throw an error.");
		}
		protected static String instance(String first, String last)
		{
			return ( first +" x=new " + last +"();");
			
		}
		protected static void ask()
		{
			System.out.println("What if I run x.makeSound()?");
			//FINISH METHOD w/ all possible for x
		}
	}
