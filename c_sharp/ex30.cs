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
			int result = 0;
			int num1 = 8;
			int num2 = 4;
			try{
				result = num1 / num2;
			}
			catch(DivideByZeroException e){
				Console.WriteLine("Error");
			}
			finally{
				Console.WriteLine(result);
			}
		}
	}
}

