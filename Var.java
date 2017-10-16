package convert;
//here we cretaed package as convert which that organizes a set of related classes and interfaces.
public class Var {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub

		int integer=841;
		//Initializing the integer value
		String string=String.valueOf(integer);
		//created a String object. 
		//valueOf(integer):means it is static method Of string class.
		//It is a returns the value of integer that we gave
		//It convert int into String in java
		string=Integer.toString(integer);
	//It is a returns the value of integer that we gave
	//It convert int into String in java
		System.out.println("After converting int into string");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
			System.out.println("Output is:"+integer);
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is message.
			//prints the integer
	}

	}


