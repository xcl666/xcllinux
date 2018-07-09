using System;
using System.Threading.Tasks;

namespace ConsoleEvent
{
    public delegate void MyEventHandler();

    class Program
    {
        static void Main(string[] args)
        {
            MyEventClass mec = new MyEventClass();
            mec.MyEvent += new MyEventHandler(mec.MyFunction);
            mec.FireEvent();
            Console.ReadLine();
        }
    }

    public class MyEventClass
    {
        public event MyEventHandler MyEvent;

        public void FireEvent()
        {
            if(MyEvent != null)
            {
                MyEvent();
            }
        }

        public void MyFunction()
        {
            Console.WriteLine("MyFunction");
        }
    }
}
