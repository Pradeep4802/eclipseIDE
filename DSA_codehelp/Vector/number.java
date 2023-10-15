public class number {
    public void num1to10(int num,int count) {
        // base condition 
        if(count > 10){
            return ;
        }
        if(num % 2 == 0) {
            System.out.print(num+" ");
            count++;
        }
        num1to10(num+1,count);
    }
    public static void main(String[] args) {
        number n = new number();
        n.num1to10(1,1);
    }
}