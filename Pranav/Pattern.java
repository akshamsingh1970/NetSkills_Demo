public class Pattern {
    public static void main(String[] args){
        printStar(5,"* ");
//        printStar_Alt(5,"* ");
        diamondStar(5,"* ");
        pantStarPattern(5,"*");
        invertedPantStarPattern(5,"*");
    }
    private static void printStar(int a, String pattern){
        for(int i=0; i<a;i++){
            for(int j=-1;j<i;j++){
                System.out.print(pattern);
            }
            System.out.println();
        }
    }
    private static void printStar_Alt(int a, String pattern){
        for(int i=1; i<=a;i++){
            System.out.println(pattern.repeat(i));
        }
    }
    private static void diamondStar(int a, String pattern){
        for(int i=1;i<=2*a+1;i++){
            if(i<=a) {
                for (int j = 1; j <= 2*a+1;j++) {
                    if(j <= a+1-i){
                        System.out.print(" ");
                    }else{
                        for(int k=0;k<i;k++){
                            System.out.print(pattern);
                        }
                        break;
                    }

                }
                System.out.println();
            }
            else{
                for (int j = 1; j <= 2*a+1;j++) {
                    if(j <= i-a-1){
                        System.out.print(" ");
                    }else{
                        for(int k=0;k<2*a+2-i;k++){
                            System.out.print(pattern);
                        }
                        break;
                    }

                }
                System.out.println();
            }
        }
    }
    private static void pantStarPattern(int a, String pattern){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=2*a-1;j++){
                if(j<=a+1-i){
                    System.out.print(pattern);
                }
                else if(j>a+1-i && j<a+1) {
                    System.out.print(" ");
                }
                else if(j<=2*a+1-i){
                    System.out.print(pattern);
                }
            }
            System.out.println();
        }
    }
    private static void invertedPantStarPattern(int a, String pattern){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=2*a-1;j++){
                if(j<=i){
                    System.out.print(pattern);
                }
                else if(j>i && j<a+1) {
                    System.out.print(" ");
                }
                else if(j<=a+i){
                    System.out.print(pattern);
                }
                else if(j<=2*a+1-i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}