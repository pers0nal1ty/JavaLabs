package ru.javacore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, Никита!" );
        Tester.printGreetings();
        Tester[] testers = {
            new Tester("Глеб", "Гуринович", 5, "C1", 1660.0),
            new Tester("Антон", "Бродко", 2, "B1", 123.0),
            new Tester("Алексей", "Бакулин", 3, "C1", 666.0),
            new Tester("Игнат", "Дьячук", 4, "B2", 999.0)
        };
        for (Tester tester:testers) {
            tester.printInfo();

        }
        for(int i = 0; i< testers.length;i++){
            System.out.println((i+1) + ". Рассчитанная заработная плата: " + testers[i].calculateSalary(1.5));
        }
    }
}
