class IfElse {
    public static void main(int a) {
        int n;
        int [n]cart;
        int totalcart=0, balance=0;
        for(int i=0;i<n;i++){
            totalcart+=cart[i];
        }
        if(totalcart<10000){
            balance=((totalcart*0.1)-totalcart);
            System.out.println(balance);
        }
        else{
            balance=totalcart;
            System.out.println(balance);
        }
    }
}