using System;
using System.IO;

namespace StreamReaderExample

    class Program
    {
        static void Main(string[] args)
        {
            String path = "/home/xcl/work/test/today.txt";
            try
            {
                using (StreamReader reader = File.OpenText(path))
                {
                    string line;
                    // Read every line text from the file
                    while((line = reader.ReadLine()) != null)
                    {
                        Console.Write(line);
                    }
                }
            }
            catch (IOException e)
            {
                Console.Write(e.Message);
            }

            Console.ReadKey();
        }
    }
}
