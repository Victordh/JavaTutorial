public class Iffy
{
    private int anIntProp = 42;
    public static void main(String[] args)
    {
        Iffy me = new Iffy();
        me.callSomeMethods();
    }

    public void callSomeMethods()
    {
        // add statements here to exercise the other methods ...
        Iffy x = new Iffy();
        x.warnIfNegative(-5);
        System.out.println(isInRange(1, 10, 5));
        System.out.println(isInRange(5, 10, 1));
        System.out.println(isInRange(5, 1, 10));
    }

    /**
    * Print out a warning if the value is negative
    * otherwise don't do anything.
    */
    public void warnIfNegative(int theValue)
    {
        // this if statement had a ; at the end, causing the line below to always execute
        if(theValue < 0)
            System.out.println("Caution - negative value given (" + theValue + ")");
    }

    /**
    * Print out a warning if the value of anIntProp is negative
    * and also set the value to zero.
    * Otherwise don't do anything.
    */
    public void resetIfNegative()
    {
        if(anIntProp < 0)
        {
            System.out.println("Caution - negative value given (" + anIntProp + ")");
        // the line below was always executed because there's no curly braces after the
        // if statement, making Java think only the first line is part of the if statement
            anIntProp = 0;
        }
    }

    /**
    * return true if value is between upperBound and LowerBound
    * (or equal to either bound) otherwise return false.
    */
    public boolean isInRange(int value, int upperBound, int lowerBound)
    {
        if(upperBound <= lowerBound)
            System.out.println("Warning: the upper bound is less than or equal to the lower bound!");
        if(lowerBound <= value && value <= upperBound)
            return true;
        else
            return false;
    }

    public boolean isInRangeIfLess(int value, int upperBound, int lowerBound)
    {
        return (lowerBound <= value && value <= upperBound);
    }
}
