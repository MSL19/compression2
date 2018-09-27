public class task1andtask2 {
    public static void main(String[] args) {
        String test = "sssssssdddffff";
        System.out.println("Here is my test string: "+test);
        System.out.println("it should say: 7s3d4f");
        System.out.println(simpComp(test));
    }
    public static String disV(String s){
        String temp = new String();
        for(int i =0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("a")||s.substring(i,i+1).equals("e")||s.substring(i,i+1).equals("i")||s.substring(i,i+1).equals("i")||s.substring(i,i+1).equals("o")||s.substring(i,i+1).equals("u")){

            }
            else{
                temp+=s.substring(i,i+1);
            }
        }
        return temp;
    }
    public static String simpComp(String s){
        int num;
        int k;
        String temp = new String();
        for(int j = 0; j<s.length(); j++) {
            k = j;
            num = 1;
            if (j < s.length()-2) {
                if (s.substring(k, k + 1).equals(s.substring(k + 1, k + 2))) {
                    while (k < s.length()-1&&s.substring(k, k + 1).equals(s.substring(k + 1, k + 2))) {
                        k++;

                        num++;
                    }
                    j=k;
                    temp += s.substring(j, k) + num;
                }
                temp += s.substring(j, j + 1);
            }
        }
        return temp;
    }
}
