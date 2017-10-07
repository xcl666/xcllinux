using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearn
{
	class Program
	{
	class Animal{
		public Animal(){
			Console.WriteLine("Animal created");
		}
		~Animal(){
			Console.WriteLine("Animal deleted");		
		}
		class Dog:Animal{
			public Dog(){
				Console.WriteLine("Dog created");
			}
			~Dog(){
				Console.WriteLine("Dog deleted");
			}
		}
		static void Main(String[] args)
		{
			Dog d = new Dog();
		}
	}
	}
}

