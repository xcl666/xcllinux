using System;

namespace ConsoleEvent2
{
    public delegate void MyEventHandler(object sender, EventArgs e);

    class Program
    {
        static void Main(string[] args)
        {
            MyEventClass mec = new MyEventClass();
            mec.MyEvent += new MyEventHandler(mec.MyFunction);
            mec.FireEvent(EventArgs.Empty);
            Console.ReadLine();
        }
    }

    public class MyEventClass
    {
        public event MyEventHandler MyEvent;

        public void FireEvent(EventArgs e)
        {
            if(MyEvent != null)
            {
                MyEvent(this, e);
            }
        }

        public void MyFunction(object sender, EventArgs e)
        {
            Console.WriteLine("MyFunction:{0}",e.ToString());
        }
    }
}
