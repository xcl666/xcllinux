using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearn
{
	class Dog
	{
			public Dog(){
				Console.WriteLine("Constructor");	
			}
			~Dog(){
				Console.WriteLine("Destructor");
			}
		static void Main(String[] args)
		{
			Dog d=new Dog();
		}
	}
}

