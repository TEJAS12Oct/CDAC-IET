﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NativeCodeDemoApp
{
    internal class Program
    {
        unsafe static void Main(string[] args)
        {
            int sum = 456;
            int* ptr = &sum;
            (*ptr)++;
            Console.WriteLine("Sum="+ sum);
            Console.ReadLine();
        }
    }
}
