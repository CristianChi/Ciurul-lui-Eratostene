public class PrimTh extends Thread {
	
	private int m;
	public PrimTh(int m) {
		this.m = m;
	}
	
	public void run() {
		int p;
          
        for(p = m; p <= SieveOfEratosthenes.n; p = p + m)
        {
        	SieveOfEratosthenes.prime[p] = false;
        }
	}

}
