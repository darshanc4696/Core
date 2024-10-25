package corejava;

//class Demo1 extends Thread
//{
//	@Override
//	public void run() {
//		Thread t = Thread.currentThread();
//		System.out.println(t);
//	}
//}

//public class Practice {
//    public static void main(String[] args) {
////        // Get the current main thread and print its details
////        Thread mainThread = Thread.currentThread();
////        System.out.println(mainThread);
////        
////        // Change the name of the main thread
////        mainThread.setName("MainThread");
////        
////        // Print the details of the main thread after renaming
////        System.out.println(mainThread);
////
////        // Create an instance of Demo1 thread
////        Demo1 d1 = new Demo1();
////
////        // Set the name of the thread to "BABA"
////        d1.setName("BABA");
////
////        // Start the thread
////        d1.start();
//    	
//    	LinkedList ll = new LinkedList();
//
//    	ll.add(100);
//    	ll.add(200);
//    	ll.add(300);
//    	
//    	
//
////    	Iterator itr = ll.iterator();
////    	while(itr.hasNext())
////    	{
////    		System.out.println(itr.next());
////    	}
//    	
//    	Iterator itr1 = ll.descendingIterator();
//    	while(itr1.hasNext())
//    	{
//    		System.out.println(itr1.next());
//    	}
//    	
//    	TreeMap tm = new TreeMap();
//    	tm.put(1, "Darshan");
//    	tm.put(4, "Indresh");
//    	tm.put(2, "Rohit");
//    	tm.put(3, "Bargav");
//    	
//    	System.out.println(tm);
//    	
//    	Set s = tm.keySet();
//  
//    	
//    	
//    }
//}

class Fun
{
	final int a = 10;
}

public class Practice {
    public static void main(String[] args)
    {
    	Fun f = new Fun();
    	System.out.println(f.a);
    }
}


