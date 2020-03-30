import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;


//A simplifed version of Linked List. This code is seperate from LinkedList23
public class LinkedList2 {
public static void main(String args[])
{

String again;
	Scanner kb= new Scanner(System.in);
	LinkedList list = new LinkedList();

	LinkedList Freelist = new LinkedList();


	do{
	System.out.println("data:"+list);
	System.out.println("free:"+Freelist);

	System.out.println("Insert(i) or Delete(d)"); // User presses i for Insert or d for delete
	String id=kb.next();
switch(id){
case "i":
	System.out.println("Add number.");
	int Number= kb.nextInt();
	list.add(Number);

	if(list.size()>5)

	{System.out.println("Stack full");}

	else{
	System.out.println("data:"+list);}

break;

case "d": //If the user press on two it mean delete

	if(list.size()<=0)
		{System.out.println("The list is empty.");//If their nothing in the Stack.
		}

	else{

 System.out.println("What number do you want to delete?");
 int delete=kb.nextInt();
 for(int i=0;i<list.size();i++)
 {
	 if(list.get(i).equals(delete))
	 {
 Freelist.add(list.remove(i));
}

 }

	//this will  removed from the list and add it to the free space.

		System.out.println("data:"+list);
		System.out.println( "free:"+Freelist);}

break;
}

	System.out.println("Do you wish to continue y or n");
	again=kb.next();
	}
	while(again.equals("y"));


}
}




