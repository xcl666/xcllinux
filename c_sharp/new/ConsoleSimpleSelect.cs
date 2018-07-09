using System;
using System.Linq;

namespace ConsoleSimpleSelect
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] scores = new int[] {81,57,39,46,100,99,55, 68, 77, 59};

            var x = from score in scores where score >= 60 orderby score descending select score;

            foreach(var s in x)
            {
                Console.WriteLine(s);
            }
            Console.ReadKey();
        }
    }
}
