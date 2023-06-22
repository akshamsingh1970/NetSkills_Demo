class Oneto20Thread implements Runnable{
    int counter;

    Oneto20Thread(int x){
        counter = x;
    }

    @Override
    public void run(){
        System.out.print(Thread.currentThread().getName()+": ");
        for(int i=0; i<5; i++){
            System.out.print(i+1+(counter-1)*5+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        for(int i=1; i<=4; i++){
            Oneto20Thread ott = new Oneto20Thread(i);
            Thread t = new Thread(ott);

            t.start();
            try{
                t.join();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

