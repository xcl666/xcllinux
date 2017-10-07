using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearn
{
	class Program
	{
		static void Swap<T>(ref T a, ref T b){
			T temp = a;
			a = b;
			b = temp;
		}
		static void Main(String[] args)
		{
			int a = 4, b = 9;
			Swap<int>(ref a, ref b);
			Console.WriteLine(a);
			Console.WriteLine(b);

			string x = "Hello";
			string y = "World";
			Swap<string>(ref x, ref y);
			Console.WriteLine(x);
			Console.WriteLine(y);
		}
	}
}

