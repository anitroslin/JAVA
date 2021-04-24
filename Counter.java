class Co{
int count;
public void incr(){
count++;
}
}
class Counter{
public static void main(String[] args)throws InterruptedException{
Co c=new Co();
Thread t1=new Thread(new Runnable(){
public void run()
{
for(int i=0;i<1000;i++)
c.incr();
System.out.println("Count=" +c.count);
}
}
);
Thread t2=new Thread(new Runnable(){
public void run()
{
for(int i=0;i<1000;i++)
c.incr();
System.out.println("Count=" +c.count);
}
}
);
t1.start();
t2.start();
System.out.println("count=" +c.count);
}
}
