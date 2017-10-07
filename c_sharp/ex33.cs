using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearn
{
	class Program
	{
		class Stack<T>{
			int index=0;
			T[] innerArray=new T[100];
			public void Push(T item){
				innerArray[index++]=item;
			}
			public T Pop(){
				return innerArray[--index];
			}
			public T Get(int k){return innerArray[k];}
		}
		static void Main(String[] args)
		{
			Stack<int> intStack = new Stack<int>();
			intStack.Push(3);
			intStack.Push(6);
			intStack.Push(7);
			Console.WriteLine(intStack.Get(1));
		}
	}
}

