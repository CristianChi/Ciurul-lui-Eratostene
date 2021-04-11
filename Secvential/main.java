class SieveOfEratosthenes
{
      
    public static void main(String args[])
    {
        int n = 5644, i, p;
        System.out.print("Urmatoarele numere sunt prime ");
        System.out.println("in intervalul 0 - " + n);
        long start = System.nanoTime();
        boolean prime[] = new boolean[n+1];
        for(i=0;i<n;i++)
            prime[i] = true;
          
        for(p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
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