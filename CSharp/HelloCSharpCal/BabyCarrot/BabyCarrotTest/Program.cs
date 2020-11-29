using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BabyCarrot.Tools;
using BabyCarrot.Extensions;

namespace BabyCarrotTest
{
    class Program
    {
        static void Main(string[] args)
        {
            string temp = "test";

            Console.WriteLine("IsNumeric? : " + temp.IsNumeric());
            Console.WriteLine("IsDateTIme? : " + temp.IsDateTime());
        }
    }
}
