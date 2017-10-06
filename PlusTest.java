// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
         System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
         //prints as if it were 1 large string
         System.out.println ("The first computer was invented about" + 55 +
                                 "years ago.");
         //prints as one string however with no spaces in between strings
         System.out.println ("8 plus 5 is " + 8 + 5);
         //prints as 3 strings put together, not a string plus two ints
         System.out.println ("8 plus 5 is " + (8 + 5));
         //prints as a string plus an int, and it recognizes that it's adding 
         //two ints together to form one int
         System.out.println (8 + 5 + " equals 8 plus 5.");
         //again prints correctly and recognizes that it's an int plus a string
        }
}
