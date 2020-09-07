public class UsePackage
{
    public static void main(String[] args)
    {
        Package pack1 = new Package(4,'A');
        Package pack2 = new Package(10,'T');
        Package pack3 = new Package(20,'M');
        InsuredPackage pack4 = new InsuredPackage(4,'A');
        InsuredPackage pack5 = new InsuredPackage(10,'T');
        InsuredPackage pack6 = new InsuredPackage(20,'M');
        System.out.println("Packages:");
        pack1.display();
        pack2.display();
        pack3.display();
        System.out.println("Insured packages:");
        pack4.display();
        pack5.display();
        pack6.display();
    }
}