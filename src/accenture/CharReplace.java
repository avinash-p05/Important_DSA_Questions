package accenture;

public class CharReplace {
    public static void main(String[] args) {
        String str = "apples";
        char c1 = 'a';
        char c2 = 'p';
        StringBuffer b = new StringBuffer();
        for(char c : str.toCharArray()){
            if(c==c1)
                b.append(c2);
            else if (c==c2) {
                b.append(c1);
            }
            else
                b.append(c);
        }
        System.out.println(b.toString());
    }
}
