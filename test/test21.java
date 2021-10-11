public class test21{
    public static void main(String[] args) {
        father aaa = new child();
        aaa.getname();
        aaa.say(1);
    }
}


class father {
    public void getname()
    {
        System.out.println("父亲");
    }
    public void say(String i )
    {
        System.out.println("喂");
    }
}

class child extends father {
    @Override
    public void getname()
    {
        System.out.println("儿子");
    }
    @Overload
    public void say(int i )
    {
        System.out.println("oo");
    }
}