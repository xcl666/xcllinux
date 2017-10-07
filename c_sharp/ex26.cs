using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearn
{
	class Program
	{
		struct Book{
			public string title;
			public double price;
			public string author;
		}
		static void Main(String[] args)
		{
			Book b;
			b.title = "Test";
			b.price = 5.99;
			b.author = "David";
			Console.WriteLine(b.title);
		}
	}
}

