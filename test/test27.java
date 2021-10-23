public class test27 {
    public static void main(String[] args) {
        clerk a1 = new clerk();
        producer b1 = new producer(a1);
        customer b2 = new customer(a1);
    }
}

class clerk{
    public int garbage = 0 ;

    
}

class producer{
    producer(clerk c)
    {
        while(true){
            produce(c); 
        }
    }
    public void produce(clerk c){
        c.garbage ++ ;
    }
}

class customer{
    customer(clerk c)
    {
        while(true){
            custom(c);
        }
    }   
    public void custom(clerk c){
        c.garbage -- ;
    }

}