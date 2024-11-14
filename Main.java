class Main{
    public static void main(String[] args){
        System.out.println("Performing break codition");
        for(int i = 0; i <= 23; i++){
            System.out.println("printing numbers!");
            if(i == 6){
                System.out.println("Ending loop here!");
                continue;
            }
        }
        System.out.println("outside the loop!");
    }
}
