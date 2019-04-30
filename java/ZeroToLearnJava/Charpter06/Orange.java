public class Orange
{
    public static void main(String[] args)
    {
        Orange orange = new Orange();
        double qulatiy01 = 0.5;
        double price01 = 2.98;
        double price = price01 / qulatiy01;
        double qulatiy02 = 3;

        System.out.println("The total money is "+ orange.sum(qulatiy02,price));
    }

    private double sum(double qulatiy, double price) 
    {
        double sum = 0.0;
        sum = qulatiy * price;
        return sum;
    }
}
