import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //get input
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    sc.close();
    //declare int variable for return
    int count = 0;
    if (isPalindrome(num+"")){
      count++;
    }
    for (int i = 2; i < 10; i++){
      if (numberBases(i, num)){
        count++;
        }
    }
    System.out.println(count);
    
  }
  public static boolean numberBases(int base, long num){
    String r = "";
    while(num != 0){
      r = (num % base) + r;
      num = num/base;
    }
    return isPalindrome(r);
  }
  public static boolean isPalindrome(String text){
      String reverse = new String("");

      for (int i = text.length()-1; i>=0; i--){
        char a = text.charAt(i); 
        reverse = reverse + a;  
      }
      if (text.equals(reverse)){
        return true;
      }else{
        return false;
  }
}
}