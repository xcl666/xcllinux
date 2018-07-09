using System;

namespace ConsoleFunctionAndDelegate
{
    public delegate void MyDelegate();

    class Program
    {
        static void Main(string[] args)
        {
            Program p = new Program();
            MyDelegate myDel = new MyDelegate(p.Read);

            myDel += p.Play;
            myDel += p.Watch;
            myDel();
            myDel -= p.Read;
            myDel();
            Console.ReadLine();
        }

        public void Read()
        {
            Console.WriteLine("Read a book");
        }

        public void Play()
        {
            Console.WriteLine("Play games");
        }

        public void Watch()
        {
            Console.WriteLine("Watch TV");
        }
    }
}
