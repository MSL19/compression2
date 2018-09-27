public class task1andtask2 {
    public static void main(String[] args) {
        String test = "asasasaadadadadadadadaadadadad";
        System.out.println(disV(test));
    }
    public static String disV(String s){
        String temp = new String();
        for(int i =0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("a")){

            }
            else{
                temp+=s.substring(i,i+1);
            }
        }
        return temp;
    }
}
