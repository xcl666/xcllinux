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
			string yourName;
			Console.WriteLine("What is your name?");
			
			yourName=Console.ReadLine();

			Console.WriteLine("Hello {0}!",yourName);
		}
	}
}
