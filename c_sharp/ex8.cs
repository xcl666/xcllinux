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
			string test="This is some text about a dog. The word dog apperrs in this text a number of times. This is the end.";
			Console.WriteLine(test.Length);
			test=test.Replace("dog","cat");
			test=test.Substring(0);

			Console.WriteLine(test);
			//Outputs:"This is some text about a cat."
		}
	}
}

