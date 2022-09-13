import java.util.Stack;
import java.util.LinkedList;

public class app {
    public static void main(String[] args) throws Exception {

  // 1. Array (50 pts)
  System.out.println("1. Array (50 pts)");
  System.out.println();

        // Create an array of characters of your SURNAME
        char[] surname = { 'P', 'A', 'P', 'I', 'N' , 'A' };

        // Print each character of your SURNAME on each line.
        for (int i = 0; i < surname.length; i++) {
            System.out.println(surname[i]);
        }
        System.out.println();

        // Print the first character of your SURNAME.
        System.out.println("First character of my surname:" +  surname[0]);

        System.out.println();

        //Print the last character of your SURNAME.
        System.out.println("Last character of my surname:" +  surname[5]);

        System.out.println();

        // Print the character of your SURNAME in reverse order.
        for (int i = surname.length - 1; i >= 0; i--) {
            System.out.println(surname[i]);
        
            }
        
            System.out.println("======================================================");
            System.out.println();

// 2. Linked list (25 pts)
System.out.println("2. Linked list (25 pts)");
  System.out.println();

        //Create a Linked list of the last six numbers of your STUDENT NUMBER.
        LinkedList<String> StudentNum= new LinkedList<>();
        
        StudentNum.add("1");
        StudentNum.add("0");
        StudentNum.add("5");
        StudentNum.add("6");
        StudentNum.add("4");
        StudentNum.add("2");
        
        // Add an asterisk (*) to the head/front of the Linked list.
        StudentNum.addFirst("*");
        
        // Add an asterisk (*) to the tail/end of the Linked list.
        StudentNum.addLast("*");
        
        // Print the Linked list.
        System.out.println("Sudent ID:" + StudentNum);
        
        //Print the last character of the Linked list
        System.out.println("last character of Sudent ID:" + StudentNum.get(6));
        
        //Replace the last character of the Linked list with the exclamation symbol (!).
        StudentNum.set(6, "!");
        
        // Remove the first character of the Linked list.
        StudentNum.remove(1);
        
        //Print the LinkedList.
        System.out.println(StudentNum);

        System.out.println("======================================================");
        System.out.println();
    
// 3. Stack (25 pts)
System.out.println("3. Linked list (25 pts)");
  System.out.println();

        // Create a Stack of characters of your SURNAME.
        Stack<String> surname1 = new Stack<>();

        surname1.push("P");
        surname1.push("A");
        surname1.push("P");
        surname1.push("I");
        surname1.push("N");
        surname1.push("A");

        //Print the Stack
        System.out.println(surname1);

        //Add a "INF214" to the stack.
        surname1.push("I");
        surname1.push("N");
        surname1.push("F");
        surname1.push("2");
        surname1.push("1");
        surname1.push("4");

        //Print the Stack
        System.out.println(surname1);

        // Remove "INF214"
        surname1.pop();
        surname1.pop();
        surname1.pop();
        surname1.pop();
        surname1.pop();
        surname1.pop();

        //Add "CCDATRCL-INF214".
        surname1.push("C");
        surname1.push("C");
        surname1.push("D");
        surname1.push("A");
        surname1.push("T");
        surname1.push("R");
        surname1.push("C");
        surname1.push("-");
        surname1.push("I");
        surname1.push("N");
        surname1.push("F");
        surname1.push("2");
        surname1.push("1");
        surname1.push("4");

        //Print the Stack
        System.out.println(surname1); {
        }
        }
    }
