using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BabyCarrot.Tools;

namespace BabyCarrotTest
{
    class Program
    {
        static void Main(string[] args)
        {
            LogManager log = new LogManager();

            log.WriteLine("[Begin Processing]...");
            for(int i=0; i<10; i++)
            {
                log.WriteLine("Processing: " + i);

                System.Threading.Thread.Sleep(500);
                
                log.WriteLine("Done: " + i);
            } 
            log.WriteLine("[End Processing]...");
        }
    }
}
