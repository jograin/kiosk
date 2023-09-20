package Kiosk;

import java.util.Scanner;

public class Kiosk_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner stdIn=new Scanner(System.in);

        while(true) {
        System.out.println("========================================");
        System.out.println(" KIOSK 상품등록 및 매장 운영프로그램 ");
        System.out.println("========================================");

        System.out.println("   1. 상품코드 등록");
        System.out.println("   2. 등록된 상품코드 조회");
        System.out.println("   3. KIOSK 매장 운영 프로그램(주문입력)");
        System.out.println("   4. 매장 매출현황(주문서별 합계)");
        System.out.println("   5. 매장 무준서별 LIST");
        System.out.println("   0. 작업 종료");
        System.out.println("========================================");
        System.out.print("\n작업 번호를 선택하세요 > ");
        int num=stdIn.nextInt();

        if(num==1) {
        	Kiosk_product_insert.main(args);
        }else if(num==2) {
        	Kiosk_Product_InquryChoice.main(args);
            System.out.print("계속 - 1  작업 종료 - 2 > ");
            int a=stdIn.nextInt();
            System.out.println();
            if(a==1) {
                continue;
            } else if(a==2) {
                System.out.println("\n작업을 종료합니다.");
                break;
            } else {
                System.err.println("\n제대로 다시 입력하세요\n");
                continue;
            }
        }else if(num==3) {
        	Kiosk_Product_BuyChoice.main(args);
            break;
        }else if(num==4) {
//            Kiosk_Product_BuyTotal.main(args);
        }else if(num==5) {
//            Kiosk_Product_BuyList.main(args);
        }else if(num==0) {
            System.out.println("\n작업을 종료합니다.");
            break;
        }else {
            System.err.println("\n제대로 다시 입력하세요\n");
            continue;
        }
        }
    }

}