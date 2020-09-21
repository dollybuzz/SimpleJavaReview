//Followed this tutorial: https://www.youtube.com/watch?v=WPvGqX-TXP0

import java.util.Arrays;
import java.util.Scanner;
//import java.util.*;

public class Animal {

	//Static allows you to access this without creating an instance of Animal, not associated with a constructor
	public static final double FAVNUMBER = 1.6180;
	
	//Private is only accessible for this class and any classes that inherit
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	//Protected is only accessible to other classes within this package
	protected static int numberOfAnimals = 0;
	
	static Scanner userInput = new Scanner(System.in);

	//Constructor
	public Animal() {
		//super(); necessary to instantiate new Animal instances with class Animal attributes
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);
		
		System.out.print("Enter the name: \n");
		
		//hasNextInt, hasNextFloat, hasNextDouble, hasNextBoolean, hasNextByte
		//nextInt, nextFloat, nextDouble, etc.
		
		if(userInput.hasNextLine())
		{
			this.setName(userInput.nextLine());
		}
		
		this.setFavoriteChar();
		this.setUniqueID();
		
	}

	//Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}
	
	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 1000000;
		
		//casting
		this.uniqueID = minNumber +  (long)(Math.random()* ((maxNumber-minNumber))+1); 
		String stringNumber = Long.toString(maxNumber);
		
		int numberString = Integer.parseInt(stringNumber);
		System.out.println("Unique ID set to: " + this.uniqueID);
	}

	public char getFavoriteChar() {
		return favoriteChar;
		
	}

	//method overloading
	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	public void setFavoriteChar() {
		int randomNumber = (int)(Math.random() * 126) + 1;
		
		this.favoriteChar = (char)randomNumber;
		
		if(randomNumber == 32) {
			System.out.println("Favorite character set to Space");
		} else if(randomNumber == 10) {
			System.out.println("Favorite character set to Newline");
		} else {
			System.out.println("Favorite character set to " + this.favoriteChar);
		}
		
		
		//ternary operator
		int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
		
		//switch case
		switch(randomNumber) {
		
			case 8:
				System.out.println("Favorite character set to backspace");
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			default:
				System.out.println();
				break;
		}
		
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	
	//conditional
	public static void countTo(int startingNumber) {
		for(int i = startingNumber; i <= 100; i++) {
			if(i == 90) continue;
			System.out.println(i);
		}
	}
	
	//while loop
	protected static String printNumbers(int maxNumbers) {
		int i = 1;
		
		while(i < (maxNumbers/2)) {
			System.out.println(i);
			i++;
			
			if(i == (maxNumbers/2)) break;
		}
		
		Animal.countTo(maxNumbers/2);
		
		return "End of printNumbers";
	}
	
	//do while
	protected static void guessMyNumber() {
		int number;
		
		do 
		{
			System.out.println("Guess Number up to 100");
			
			while(!userInput.hasNextInt()) {
				String userEntered = userInput.next();
				System.out.printf("%s is not a number\n", userEntered);
			}
			
			number = userInput.nextInt();
			
		} while(number != 50);
	}
	
	//polymorphism
	public String makeSound() { //this method must be defined as a default
		return "Grrr";
	}
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says " + randAnimal.makeSound());
	}
	
	
	public static void main(String[] args) {
		Animal theAnimal = new Animal();
		
		
		//Array declaration
		int [] favoriteNumbers;
		favoriteNumbers = new int[20];
		
		favoriteNumbers[0] = 100;
		
		String[] stringArray = {"Random", "Words", "here"};
		
		for(String word : stringArray) {
			System.out.println(word);
		}
		
		//3D array
		String[][][] arrayName = {{{"000"},{"100"},{"200"},{"300"},
			{"010"},{"110"},{"210"},{"310"},
			{"020"},{"120"},{"220"},{"320"}}};
		
		
		//arrayName[HowManyDown(3)][HowManyAcross(4)][HowManyofThoseGroups(1)]
		
		for(int i = 0; i < arrayName.length; i++)
		{
			for(int j = 0; j < arrayName[i].length; j++)
			{
				for(int k = 0; k < arrayName[i][j].length; k++)
				{
					System.out.print("| " + arrayName[i][j][k] + " ");
				}
			}
			
			System.out.println("|");
		}
		
		//cloning array
		String[] cloneOfArray = Arrays.copyOf(stringArray, 3);
		
		System.out.println(Arrays.toString(cloneOfArray)); //toString prints out contents of array as strings
		
		System.out.println(Arrays.binarySearch(cloneOfArray, "here")); //returns index of where key was found
		
	}//end Main
	
	
}//end Animal class

