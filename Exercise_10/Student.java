/* Need to import java.io package to use the BufferedReader and InputStreamReader. */
import java.io.*;

public class Student
{
    private static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    private String name;
    private int age;

    public Student ()
    {
        name = "";
        age = -2;
    }

    public void readName () throws IOException
    {
        System.out.print("Input your name: ");
        name = stdIn.readLine();
    }
    public void readAge () throws IOException
    {
        while (age < 0 || age > 150)
        {
            try
            {
                System.out.print("Input your age (0 - 150): ");
                age = Integer.parseInt(stdIn.readLine());
            }
            catch (IOException e)
            {
                System.out.print("Help! Your keyboard probably exploded!");
                System.exit(0);
            }
            catch (NumberFormatException e)
            {
                age = -1;
                System.out.print("That's not a number, please try again.\n");
            }
        }
    }

    public void printName ()
    {
        System.out.println("Name: " + name);
    }
    public void printAge ()
    {
        System.out.println("Age: " + age);
    }

    public static void main (String[] args) throws IOException
    {
        Student me = new Student();
        me.readName();
        me.printName();
        me.readAge();
        me.printAge();
    }
}
