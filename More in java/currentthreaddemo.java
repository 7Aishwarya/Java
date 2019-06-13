class myclass extends Thread

{

public void run()

{

for(int i=0;i<10;i++)

{

System.out.println(Thread.currentThread().getId() + "value" + i);

}

}

}

public class currentthreaddemo

{

public static void main(String args[])

{

myclass myclass= new myclass();

myclass.start();

myclass myclass1=new myclass();

myclass1.start();

}

}

//System.out.println(thread.currentthread().getID()+"value"+i);
