using System;

class Program
{
    static void Main()
    {
        Console.WriteLine("Even numbers from 1 to 100:");

        for (int i = 1; i <= 100; i++)
        {
            if (i % 2 == 0) // check if the number is even
            {
                Console.WriteLine(i);
            }
        }

        Console.WriteLine("Press any key to exit...");
        Console.ReadKey();
    }
}
