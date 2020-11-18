using System;

namespace HelloCSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Console.WriteLine(args.Length);
            Console.ReadKey(); // 키를 입력할때까지 기다림.
        }
    }
}
