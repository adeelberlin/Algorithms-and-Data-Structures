class DynamicArray {
    public OpCounter counter = new OpCounter();
    static int[] storage;
    static int nitems;

    public DynamicArray(int size) {
      nitems = 0;
      storage = new int[size];
    }
    public int length() {
        return nitems;
    }
    public int select(int k) {
        return storage[k];
    }
    public void store(int o, int k) {
      storage[k] = o;
    }
    public void push(int o) {
     if(nitems >= storage.length){
	      extend();
      }
      counter.add(1);
      storage[nitems] = o;
      nitems++;
    }
    public int pop() {
        nitems--;
        return storage[nitems];
    }
    private void extend() {
        int [] temp =storage.clone();
        storage = new int[storage.length+1];
        System.arraycopy(temp, 0, storage, 0, temp.length);
    	//return array;
	//int [] new_array = new int[storage.length+1];
 	//System.arraycopy(new_array, 0, storage, 0, new_array.length);
	//System.out.println(storage.length);`
	//System.out.println(nitems);
    }

    public int space() {
    	int counter = 0;
	for(int i =0; i < storage.length; i++){
		if(storage[i] == 0 && i != 0){
		 counter++;
		}
   	}
   	return counter;
   }

}
