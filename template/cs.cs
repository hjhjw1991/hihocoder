using System;

public class AplusB
{
    private static void Main()
    {
        string line;
        while((line = Console.ReadLine()) != null)
        {
            string[] tokens = line.Split(' ');
            Console.WriteLine(int.Parse(tokens[0]) + int.Parse(tokens[1]));
        }
    }
}