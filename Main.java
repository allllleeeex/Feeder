public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        System.out.println(f);
        //System.out.println(f.currentFood);
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        if(Math.random() < 0.05) currentFood = 0;
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
    }
}
