import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuizRunner
	{
		private static String name;
		private static int qnum, count, right;
		public static void main(String[] args)
		{
			System.out.println("What is your name?");
			Scanner userInput=new Scanner(System.in);
			name=userInput.nextLine();
			System.out.println("Welcome to the inheritance quizzer, " + name + "!");
			System.out.println("Today I will be testing you on your understanding of Inheritance.");
			System.out.println("How many questions would you like to answer?");
			qnum=userInput.nextInt();
			while (count<qnum)
				{
					System.out.println("If I instantiate Feline x=new Feline(); and run x.makeSound(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().equals("a"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
						
						
				}
			System.out.println(name + " you got " + right + " out of " + qnum);
			

		}
		protected static void listAnswers()
			{
				System.out.println("a) ROAR");
				System.out.println("b) Boing");
				System.out.println("c) Meow");
				System.out.println("d) Lick");
				System.out.println("e) It will throw an error.");
				count++;
			}
		protected static String correct()
		{
			right++;
			return "Correct!";
		}
		
		//THis is all the old and broken code down there
		//It's a real mess
		
		/*static String name;
		static int score, counter, counter2; 
		//static Cat Mittens=new Feline();
		public static void main(String[] args)
			{			
				Cat Fluffles=new Cat();
				Feline j=new Cat();
				Feline f=new Feline();
				ArrayList<Feline> Zoo=new ArrayList<>();
				Zoo.add(j);
				Zoo.add(f);
				//This is a huge mess
				ArrayList<Cat> Zoo2=new ArrayList<>();
				Zoo2.add(Fluffles);

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
								ask(f);
							}
						else if (i>4 && i<8)
							{
								System.out.println(instance("Feline", "Cat"));
								ask(j);
							}
						else if (i>8 && i<12)
							{
								System.out.println(instance("Cat", "Feline"));
								//Cat x=new Feline();
								//ask (x);
							}
						else
							{
								System.out.println(instance("Cat", "Cat"));
								askCat(Fluffles);
							}
					}
			}
		protected static void listAnswers()
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
		
		protected static void ask(Feline x)
		{
			String answer;
			System.out.println("What if I run x.makeSound()?");
			listAnswers();
			counter2++;
			answer=answer().toLowerCase();
			if (answer.equals(x.makeSound()) || answer.equals("a"))
				{
					System.out.println(correct());
				}
			else if (!answer.equals("a") || !answer.equals("b") || !answer.equals("c"))
			else
				{
					System.out.println("Incorrect.");
				}
			System.out.println(name + ", You're " + counter + " for " + counter2);
			System.out.println("What if I run x.jump()?");
			listAnswers();
			counter2++;
			answer=answer().toLowerCase();
			if (answer.equals("c"))
		}
		
		protected static void askCat(Cat x)
		{
			String answer;
			System.out.println("What if I run x.makeSound()?");
			listAnswers();
			counter2++;
			answer=answer().toLowerCase();
			if (answer.equals(x.makeSound()) || answer.equals("c"))
				{
					System.out.println(correct());
				}
			else
				{
					System.out.println("Incorrect.");
				}
			System.out.println(name + ", You're " + counter + " for " + counter2);
		}
		protected static String answer()
		{
			Scanner userInput=new Scanner(System.in);
			return userInput.nextLine();
		}
		protected static String correct()
		{
			counter++;
			return "Correct!";
		}*/
	}
