public class NaiveStringMatch extends StringMatch {
    public int match(String text, String pattern) {
        char[] arrtxt =text.toCharArray();
        char[] arrpat=pattern.toCharArray();

        int t=arrtxt.length;
        int p=arrpat.length;

        int s;
        boolean isFound=true;
        for(s=0;s<=t-p;s++){
            int count=0;
            isFound=true;
            for(int i=0;i<p;i++) {
                if (arrtxt[s + i] != arrpat[i]) {
                    isFound = false;
                    break;
                }
            }
                if (isFound) {
                    return s;
                }
            }
                return -1;
            }
}
