public class DemoHorses
{
    public static void main(String[] args)
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setName("Horse 1");
        horse1.setColour("white");
        horse1.setBirthYear(2007);
        horse2.setName("Horse 2");
        horse2.setColour("black");
        horse2.setBirthYear(2009);
        horse2.setRaces(10);
        System.out.println(horse1.getName() + ", born in " + horse1.getBirthYear() + ", is " + horse1.getColour() + ".");
        System.out.println(horse2.getName() + ", born in " + horse2.getBirthYear() + ", is " + horse2.getColour() + ".");
        System.out.println(horse2.getName() + " has competed in " + horse2.getRaces() + " races.");
    }
}