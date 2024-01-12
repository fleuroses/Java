package pack1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            // 예외처리 2024-01-12
            try {

                System.out.print("정수를 입력하세요(x 입력 시 종료) : ");
                String strNumber = sc.nextLine();
                if(strNumber.equals("x"))
                    break;
                int number = Integer.parseInt(strNumber); // Integer.parseInt() : (static 함수)  ->  문자열 정수를 진짜 정수형 타입으로 변경
                //sc.nextLine();




//        if( number == 0 ) {
//            System.out.println("0으로 나눌 수 없습니다.");
//        }



                int mok = 10 / number;
                System.out.printf("10을 %d로 나눈 결과 : %d\n", number, mok);
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
                //System.out.println(e.getMessage());
            } catch (NoSuchElementException e) {
                System.out.println("키보드 입력 오류가 발생했습니다.");
                // return;
            } catch (NumberFormatException e) {
                System.out.println("0이 아닌 정수를 입력하셔야 합니다.");
            } catch (Exception e) {
                System.out.println("알 수 없는 에러가 발생하였습니다.");
                //System.out.println(e.getMessage());  -> 어떤 에러가 났는지 확인 불가
            } finally {
                sc.close();
            }



//            if ( number==0 )
//            {
//                // 메세지 출력
//                continue;
//            }


        }

    }
}
