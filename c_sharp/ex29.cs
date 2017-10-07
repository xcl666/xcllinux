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
			try{
				int[] arr = new int[]{4,5,8};
				Console.Write(arr[8]);
			}
			catch(Exception e){
				Console.WriteLine(e.Message);
			}
		}
	}
}
