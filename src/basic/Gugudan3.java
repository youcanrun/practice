package basic;

import java.util.Scanner;

public class Gugudan3 {

  public static void main(String[] args) {
    //사용자가 유효하지 않은 입력을 한 경우 다시 입력하도록 구현
    System.out.println("구구단 중 출력할 단은? : ");
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    System.out.println("사용자가 입력한 값: " + i);
    if(i<2||i>9) {
      System.out.println("2이상, 9 이하의 값만 입력 할 수 있습니다. ");
      System.out.println("구구단 중 출력할 단은?: ");
      i = sc.nextInt();
    }
    for(int j = 1; j < 10; j++) {
      System.out.println(i+"단:"+i+"x"+j+"="+i*j);
    }
  }

}
