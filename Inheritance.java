class A
{
    int i,j;
    void print()
    {
        System.out.println("i=" +i + "j=" +j);
    }
}
class B extends A
{
    int k;
    void show()
    {
        System.out.println("i=" +i + "j=" +j + "k=" +k);
    }
}
class Inheritance
{
    public static void main(String [] args)
    {
        A aa=new A();
        aa.i=10;
        aa.j=20;
        aa.print();
        B bb=new B();
        bb.i=100;
        bb.j=200;
        bb.k=300;
        bb.show();
    }
}