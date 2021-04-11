class SieveOfEratosthenes
{
    
	public static boolean prime[];
	public static int n = 20;
	
    public static void main(String args[])
    {
        int i;
        System.out.print("Urmatoarele numere sunt prime ");
        System.out.println("in intervalul 0 - " + n);
        long start = System.nanoTime();
        
        prime = new boolean[n+1];
        for(i=0;i<n;i++)
			prime[i] = true;
        
        for(i=2;i<n;i++) {
        	Thread P1 = new PrimTh(n);
        	P1.start();
        }
        
          
        for(i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + "\n");
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        timeElapsed = timeElapsed/1000000;
        System.out.println("Timp necesar pentru run:");
        System.out.print(timeElapsed + " milisecunde\n");
    }
}