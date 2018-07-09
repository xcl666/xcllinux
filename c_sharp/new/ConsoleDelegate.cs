using System;

namespace ConsoleDelegate
{
    public delegate void SayDelegate(string name);

    class Program
    {
        static void Main(string[] args)
        {
            DelegateClass dc = new DelegateClass();
            SayDelegate sayDelegate1 = new SayDelegate(dc.ChineseSay);
            SayDelegate sayDelegate2 = dc.EnglishSay;

            dc.Say("Lilei", sayDelegate1);
            dc.Say("Lucy", sayDelegate2);

            SayDelegate sayDelegate3 = delegate(string name)
            {
                Console.WriteLine(name);
                Console.WriteLine("Japanese");
            };

            sayDelegate3("Japanihao");
            Console.ReadLine();
        }
    }

    public class DelegateClass
    {
        public void ChineseSay(string name)
        {
            Console.WriteLine("Nihao, {0}!",name);
            Console.WriteLine();
        }

        public void EnglishSay(string name)
        {
            Console.WriteLine("Hello, {0}",name);
            Console.WriteLine();
        }

        public void Say(string name, SayDelegate sayDelegate)
        {
            sayDelegate(name);
        }
    }
}
