using System;
using System.Linq;
using System.Collections.Generic;
namespace ConsoleFunctionLinq
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> num1 = new List<int>() {3,9,0,4,6,5,1,2,8,7};
            List<int> num2 = new List<int>() {17,19,12,10,11,16,13,15,14,18};

            var concat = num1.Concat(num2);

            double average = concat.Average();

            Console.WriteLine(average);

            foreach(var num in concat)
            {
                Console.WriteLine(num);
            }
            Console.ReadLine();
        }
    }
}
