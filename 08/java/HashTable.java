public class HashTable {
    // public for testing purposes
    public int buckets[];
	public int c;
	public int a;
	public int m;

    public HashTable(long _a, long _c, long _m) {
	m = (int)_m;
	 a = (int)_a;
	 c = (int)_c;
	buckets = new int[(int)_m];
    }
    public void insert(int key) {
	int hash = (a*(key)+c) % m;
	while (buckets[hash] != 0) {
		hash++;
       	}
         buckets[hash] = key;
    }
    public boolean find(int key) {
	 boolean found = false;
	for(int i=0;i<buckets.length;i++) {
		if(buckets[i] == key) {
			found = true;
		}
	}
        return found;
    }

    public double loadFactor() {
	double load = 0.0;
	for(int i=0;i<buckets.length;i++) {
		if(buckets[i] != 0) {
			load++;
		}
	}
	return load/m;
    }

    
}	
