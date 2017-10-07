using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearn
{
	class Program
	{
		enum TrafficLights{Green, Red, Yellow};

		static void Main(String[] args)
		{
			TrafficLights x = TrafficLights.Red;
			switch(x) {
				case TrafficLights.Green:
					Console.WriteLine("Go!");
					break;
				case TrafficLights.Red:
					Console.WriteLine("Stop!");
					break;
				case TrafficLights.Yellow:
					Console.WriteLine("Caution!");
					break;
			}
		}
	}
}

