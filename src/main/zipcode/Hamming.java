package zipcode;

public class Hamming {
   private String s;
   private String s1;
    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
        if(s.length() != s1.length() )
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    public int getHammingDistance() {
        String[] str1 = s.split("");
        String[] str2 =s1.split("");
        int counter = 0;

        for (int i = 0; i < str1.length; i++) {
                if(!str1[i].equals(str2[i])){
                    counter++;
                }
            }

        return counter;
    }
}
