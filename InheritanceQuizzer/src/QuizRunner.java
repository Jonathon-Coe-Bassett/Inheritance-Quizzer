import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuizRunner
	{
		private static String name;
		private static int qnum, count, right;
		static boolean e=false;
		static Feline x=new Feline();
		static Feline j=new Cat();
		static Cat c=new Cat();
		//static Object x;
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
					runQuestions("Feline", "Feline");
					if(count>=qnum)
					{
						break;
					}
					runQuestions("Feline" , "Cat");
					if(count>=qnum)
					{
						break;
					}
					runQuestions("Cat", "Feline");
					if(count>=qnum)
					{
						break;
					}
					runQuestions("Cat", "Cat");
					if(count>=qnum)
					{
						break;
					}
				}
			printRight();

			

		}
		protected static void runQuestions(String first,String last)
		{
			
				if (first.equals("Feline"))
					{
						if (last.equals("Feline"))
							{
								Scanner userInput=new Scanner(System.in);
								System.out.println("If I instantiate " + instance(first, last) + " and run x.MakeNoise(); , what will the output be?");
								listAnswers();
								
								if (userInput.nextLine().toLowerCase().equals(getAnswer(x.makeSound())))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println(name + ", you're " + right + " for " + count);
								System.out.println("If I instantiate " + instance(first, last) + " and run x.jump(); , what will the output be?");
								listAnswers();
								if (userInput.nextLine().toLowerCase().equals(getAnswer(x.jump())))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println("If I instantiate " + instance(first, last) + " and run x.lick(); , what will the output be?");
								listAnswers();
								if (userInput.nextLine().toLowerCase().equals("e"))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println(name + ", you're " + right + " for " + count);
							}
						else
							{
								Scanner userInput=new Scanner(System.in);
								System.out.println("If I instantiate " + instance(first, last) + " and run x.MakeNoise(); , what will the output be?");
								listAnswers();
								
								if (userInput.nextLine().toLowerCase().equals(getAnswer(j.makeSound())))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println(name + ", you're " + right + " for " + count);
								System.out.println("If I instantiate " + instance(first, last) + " and run x.jump(); , what will the output be?");
								listAnswers();
								if (userInput.nextLine().toLowerCase().equals(getAnswer(j.jump())))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println("If I instantiate " + instance(first, last) + " and run x.lick(); , what will the output be?");
								listAnswers();
								if (userInput.nextLine().toLowerCase().equals("e"))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println(name + ", you're " + right + " for " + count);
							}
					}
				else
					{
						if (last.equals("Cat"))
							{
								Scanner userInput=new Scanner(System.in);
								System.out.println("If I instantiate " + instance(first, last) + " and run x.MakeNoise(); , what will the output be?");
								listAnswers();
								
								if (userInput.nextLine().toLowerCase().equals(getAnswer(c.makeSound())))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println(name + ", you're " + right + " for " + count);
								System.out.println("If I instantiate " + instance(first, last) + " and run x.jump(); , what will the output be?");
								listAnswers();
								if (userInput.nextLine().toLowerCase().equals(getAnswer(c.jump())))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println("If I instantiate " + instance(first, last) + " and run x.lick(); , what will the output be?");
								listAnswers();
								if (userInput.nextLine().toLowerCase().equals(getAnswer(c.lick())))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println(name + ", you're " + right + " for " + count);
							}
						else
							{
								e=true;
								Cat x=new Cat();
								Scanner userInput=new Scanner(System.in);
								System.out.println("If I instantiate " + instance(first, last) + " and run x.MakeNoise(); , what will the output be?");
								listAnswers();
								
								if (userInput.nextLine().toLowerCase().equals(getAnswer(x.makeSound())))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println(name + ", you're " + right + " for " + count);
								System.out.println("If I instantiate " + instance(first, last) + " and run x.jump(); , what will the output be?");
								listAnswers();
								if (userInput.nextLine().toLowerCase().equals(getAnswer(x.jump())))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println("If I instantiate " + instance(first, last) + " and run x.lick(); , what will the output be?");
								listAnswers();
								if (userInput.nextLine().toLowerCase().equals(getAnswer(x.lick())))
									{
										System.out.println(correct());
									}
								else
									{
										System.out.println("Incorrect.");
									}
								System.out.println(name + ", you're " + right + " for " + count);
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
				count++;
			}
		protected static String correct()
		{
			right++;
			return "Correct!";
		}
		private static void printRight()
		{
			System.out.println(name + " you got " + right + " out of " + qnum);

		}
		protected static String instance(String first, String last)
			{
				return ( first +" x=new " + last +"();");
				
			}
		protected static String getAnswer(String ans)
		{
				if (e)
					{
						ans="e";
					}
					
				if (ans.equals("ROAR"))
					{
						ans="a";
					}
				if (ans.equals("Boing"))
					{
						ans="b";
					}
				if (ans.equals("Meow"))
					{
						ans="c";
					}
				if (ans.equals("Lick"))
					{
						ans="d";
					}
				return ans;
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
		}
		System.out.println("If I instantiate Feline x=new Feline(); and run x.makeSound(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("a"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					
					System.out.println("If I instantiate Feline x=new Feline(); and run x.jump(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("b"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					System.out.println("If I instantiate Feline x=new Feline(); and run x.lick(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("e"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					System.out.println("If I instantiate Feline x=new Cat(); and run x.makeSound(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("c"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					System.out.println("If I instantiate Feline x=new Cat(); and run x.jump(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("b"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					System.out.println("If I instantiate Feline x=new Cat(); and run x.lick(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("d"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					System.out.println("If I instantiate Cat x=new Feline(); and run x.makeSound(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("e"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					System.out.println("If I instantiate Cat x=new Feline(); and run x.jump(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("e"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					System.out.println("If I instantiate Cat x=new Feline(); and run x.lick(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("e"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					System.out.println("If I instantiate Cat x=new Cat(); and run x.makeSound(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("c"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					System.out.println("If I instantiate Cat x=new Cat(); and run x.jump(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("c"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);
					System.out.println("If I instantiate Cat x=new Cat(); and run x.lick(); , what will the output be?");
					listAnswers();
					if (userInput.nextLine().toLowerCase().equals("c"))
						{
							System.out.println(correct());
						}
					else
						{
							System.out.println("Incorrect.");
						}
					System.out.println(name + ", you're " + right + " for " + count);*/
	}
