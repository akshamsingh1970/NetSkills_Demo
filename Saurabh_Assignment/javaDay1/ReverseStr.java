class ReverseStr{
    public static void main(String args[]){
        String str = "I love my India!";
        System.out.println(solve(str));
    }

    public static String solve(String str){
        String ans = "";
        for(int i=str.length()-1; i>=0; i--){
            ans+=str.charAt(i);
        }

        return ans;
    }
}