using System;
class Calculator
{
    public static void Main()
    {
        do
        {
            Console.Write("x= ");
            double x = Convert.ToDouble(Console.ReadLine());

            Console.Write("y= ");
            double y = Convert.ToDouble(Console.ReadLine());

            double sum = x + y;
            Console.WriteLine("Result:{0}",sum);
        }
        while(true);
    }
}
