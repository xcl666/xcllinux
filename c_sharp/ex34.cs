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
			List<String> colors = new List<String>();
			colors.Add("Red");
			colors.Add("Green");
			colors.Add("Pink");
			colors.Add("Blue");
			foreach(var color in colors){
				Console.WriteLine(color);
			}
		}
	}
}

