class SLList {
    public static Object first;
    public static SLList rest;

    public SLList(Object f, SLList r) {
	first = f;
	rest = r;
    }
    public static final SLList NIL = new SLList(0, null);

    public Object first() {
        return first;
    }
    public SLList rest() {
        return rest;
    }
    public void setFirst(Object f) {
	first = f;
    }
    public void setRest(SLList r) {
	rest = r;
    }

    public Object nth(int i) {
	first = i;
        return first;
    }
    public SLList nthRest(int i) {
        return rest;
    }
  
    public int length() {
        return -1;
    }

    public SLList remove(Object o) {
        return null;
    }
    public SLList reverse() {
        return null;
    }

}
