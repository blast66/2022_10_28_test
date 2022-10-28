public class test18 {
    public static void main(String[] args) { 
        for(int i = 1; i<=6; i++){
			
            for(int z=1; z<=6;z++){
                if(z<=6-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(z-(6-i));	
                }
            }	
            System.out.println();
        }
    }
}