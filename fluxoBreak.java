public class fluxoBreak {
    public static void main(String[] args) {
        for(int i=0; i < 11; i++){
            if( i < 5){
                continue; //return to for
            }else if(i == 10){
                break;
            }
            System.out.println("The value of i is "+i);
        }
    }
}
