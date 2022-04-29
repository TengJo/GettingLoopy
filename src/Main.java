public class Main
{

    public static void main(String[] args)
    {
        for (int x = 0; x <= 30; x++)
        {
            System.out.printf("%3d", x);
        }
        System.out.println();
        for (int x = 30; x >= 0; x--)
        {
            System.out.printf("%3d", x);
        }
        System.out.println();
        for (int x = 0; x <= 18; x += 3)
        {
            System.out.printf("%3d", x);
        }
        System.out.println();
        for (int x = 10; x >= 0; x -= 2)
        {
            System.out.printf("%3d", x);
        }
        System.out.println();
        for (int row = 1; row <= 5; row++)
        {

            for (int col = 1; col <= 5; col++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= 5; row++)
        {

            for (int col = 1; col <= row; col++)
            {
                System.out.printf("*");
            }
            System.out.println();

        }
        System.out.println();
        for (int row = 5; row >= 1; row--)
        {

            for (int col = 1; col <= row; col++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
