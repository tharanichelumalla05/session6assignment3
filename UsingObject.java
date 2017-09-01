/*program to changing the value of data membeers via object*/

package object;// here I have created a package as object
public class UsingObject {
	//declares a class called UsingObject
		//classes are the basics of opps(object oriented programming)
	//the value that we have initialize
	public static void main(String[] args) {
		//TODO Auto-generated method stub
				//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter
		 Integer i = new Integer(8);//here we taking an object of integer data type has variable i
	        setToThree(i);//and initialized as 2 and given that method to set had 3
	        System.out.println(i);
	    }//system is used to return code
	   //out is a static number
	//Println is used to print text and gives output
	//hence it prints the value 8

	    public static void setToThree(Integer i) {
	    	//Here public is a access modifier which defines who can access this method
			//Here static a keyword which identifies class related thing
			//void is used to define return type of the method,void means method wont return any value
	        i = new Integer(9);//it sets that the value and it is going to print 2
	    }
	}



