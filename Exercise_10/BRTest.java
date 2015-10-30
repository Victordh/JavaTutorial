public class BRTest
{
    private int[] excepCounts = new int[5];
    private int totalReturned = 0;
    private int calls = 0;
    private int successfulCalls = 0;
    
    public void callIt()
    {
        calls++;
        try
        {
            totalReturned += BadRandom.randVal();
            successfulCalls++;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
            excepCounts[0]++;
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
            excepCounts[1]++;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
            excepCounts[2]++;
        }
        catch (ClassCastException e)
        {
            System.out.println(e.getMessage());
            excepCounts[3]++;
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(e.getMessage());
            excepCounts[4]++;
        }
    }
    
    public void resetCounts()
    {
        totalReturned = 0;
        calls = 0;
        successfulCalls = 0;
        for (int i = 0; i < 5; i++)
        {
            excepCounts[i] = 0;
        }
    }
    
    public void nRandInts(int n)
    {
        if (n <= 0)
        {
            System.out.println("Please enter an integer greater than 0.\n");
        }
        else
        {
            while (successfulCalls < n)
            {
                callIt();
            }
        }
    }
    
    public void writeData()
    {
        System.out.println("\nThe number of calls is " + calls);
        System.out.println("The number of successful calls is " + successfulCalls);
        System.out.println("The total of the values returned is " + totalReturned);
        System.out.println("The percentage of ArithmeticExceptions is " +
                            (100 * excepCounts[0] / calls) + "%");
        System.out.println("The percentage of NullPointerExceptions is " +
                            (100 * excepCounts[1] / calls) + "%");
        System.out.println("The percentage of ArrayIndexOutOfBoundsExceptions is " +
                            (100 * excepCounts[2] / calls) + "%");
        System.out.println("The percentage of ClassCastExceptions is " +
                            (100 * excepCounts[3] / calls) + "%");
        System.out.println("The percentage of NegativeArraySizeExceptions is " +
                            (100 * excepCounts[4] / calls) + "%");
        System.out.println("The percentage of successful calls is " +
                            (100 * successfulCalls / calls) + "%\n");
    }
    
    public static void main(String[] args)
    {
        BRTest me = new BRTest();
        me.resetCounts();
        me.nRandInts(30);
        me.writeData();
    }
}
