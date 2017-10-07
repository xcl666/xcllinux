using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearn
{
	class Program
	{
		static void Main(String[] args)
		{
			Console.WriteLine("How old are you?");
			int age=Convert.ToInt32(Console.ReadLine());
			Console.WriteLine("You are {0} years old",age);
			if(age<0)
			{
				Console.WriteLine("Really?");
			}
			else
			{
				Console.WriteLine("It is right.");
			}
		}
	}
}
