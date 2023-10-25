public class Dog extends Animal
{
    final private String cry = "Bark";

    @Override
    public void doCry()
    {
        System.out.println(cry);
    }
}
