using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearn
{
	class Program
	{
		struct Point{
			public int x;
			public int y;
			public Point(int x, int y) {
				this.x = x;
				this.y = y;
			}
		}
		static void Main(String[] args)
		{
			Point p = new Point(10,15);
			Console.WriteLine(p.x);
		}
	}
}

