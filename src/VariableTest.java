/*
 * This is a test program to demonstrate variable declarations, naming conventions,
 * and complier errors in the Java programming language.
 * 
 */

public class VariableTest
{

    public static void main(String[] args)
    {
        // Variables declarations
        int number = 1;
        String name = "Rob";
        char initial = 'A';
        boolean result = true;
        float gpa = 3.50f;
        double pi = 3.14159;
        
        // Naming Conventions
        String GoodForTitle = "Pascal case is good for Java program titles";
        String camelCase = "Good for variables in Java";
        String python_style = "Good for Python; not for Java";
        int _specialSomething = 1337;
        String $doNotUseThis = "Used for event.  Do not use in Java";
        String ALL_CAPS = "Nice for constant values";
        
        // Valid variable outputs
        System.out.println(1);
        System.out.println(name);
        System.out.println(initial);
        System.out.println(result);
        System.out.println(gpa);
        System.out.println(pi);
        
        // Uninitialized variables
        int all;
        int people;
        int seem;
        int to;
        int need;
        int data;
        int processing;
        
        // Uninitialized variable outputs
        System.out.println(all);
        System.out.println(people);
        System.out.println(seem);
        System.out.println(to);
        System.out.println(need);
        System.out.println(data);
        System.out.println(processing);
        
        // Uninitialized variable outputs
        /*
         * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
            The local variable all may not have been initialized
            The local variable people may not have been initialized
            The local variable seem may not have been initialized
            The local variable to may not have been initialized
            The local variable need may not have been initialized
            The local variable data may not have been initialized
            The local variable processing may not have been initialized
            at Variables.main(Variables.java:46)
         */
        
        // Illegal variable declarations
            int (nope) = 7;
            int 12 = 12;
            String &nope = "Nope.  This won't work.";
            String double = "Can't use a primitive as a string";
            String whoops = "Forgot the semicolon"
        
        // Illegal variable output
          /*
          * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
            Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
            Syntax error, insert ";" to complete LocalVariableDeclarationStatement
            nope cannot be resolved to a variable
            Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
            Syntax error, insert ";" to complete LocalVariableDeclarationStatement
            Duplicate local variable $missing$
            The left-hand side of an assignment must be a variable
            String cannot be resolved to a variable
            Syntax error on token "&", invalid AssignmentOperator
            nope cannot be resolved to a variable
            String cannot be resolved to a variable
            Syntax error on token "double", delete this token
            Syntax error, insert ";" to complete LocalVariableDeclarationStatement
            at Variables.main(Variables.java:70)
            */
                   
    }

}
