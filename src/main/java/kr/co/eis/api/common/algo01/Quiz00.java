package kr.co.eis.api.common.algo01;


import java.util.Random;
import java.util.Scanner;

/**
 * packageName: kr.co.eis.api.common.step1
 * fileName   : MaxMin
 * author     : Jangwonjong
 * date       : 2022-05-09
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-09     Jangwonjong       최초 생성
 */
public class Quiz00 {
    public static void main(String[] args) { // 03소수 quiz03prime()
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("00계산기 01Bmi 02주사위 03가위바위보 04윤년 05숫자추론 06로또 07예약 08입출금 09구구단");
            switch (scanner.next()){
                case "00": quiz00calc(); break;
                case "01": quiz01bmi(); break;
                case "02": quiz02dice(); break;
                case "03": quiz03rps(); break;
                case "04": quiz04leap(); break;
                case "05": quiz05guess(); break;
                case "06": quiz06lotto(); break;
                case "07": quiz07booking(); break;
                case "08": quiz08bank(); break;
                case "09": quiz09gugudan(); break;
                default:return;
            }
        }
    } // main
    static void quiz00calc(){

    }

    static void quiz01bmi(){

    }
    static void quiz02dice(){
        System.out.println("01 주사위");
        // 홀수나올때까지 주사위굴려 합하는 프로그래밍
        // Random random = new Random();
        Random random = new Random();
        int result = 0;
        while(true) {
            int r = random.nextInt(5)+1;
            System.out.println(" dice value : "+ r);
            if(r % 2 != 0) {
                break;
            }
            result += r;
        }
        System.out.println(result);
        // 6면인 주사위를 5회 굴려서 나온 합계를 구하시오.
        // (int) (Math.random() * 최댓값) + 최솟값
        result = 0;
        for(int i=0; i<5; i++) {
            double d = Math.random();
            int temp = (int) (d * 6) +1;  // 랜덤으로 (1-6) 정수값
            System.out.println(temp);
            result += temp;
        }
        System.out.println("Sum : "+result);
        // 플레이어(Math 랜덤값)와 컴퓨터(Random 랜덤값) 주사위 굴리기를 해 이기면
        // "Win", 비기면 "Draw.", 지면 "Lose"를 출력하세요.
        int player=(int)(Math.random()*6)+1;
        System.out.println("플레이어 숫자"+player);
        int com= new Random().nextInt(5)+1;
        System.out.println("컴퓨터 숫자"+com);
        String s = "Draw";
        if(player!=com) s = (player>com) ? "Win" : "Lose";
        System.out.println(s);
    }
    static void quiz03rps(){
        System.out.println("02 가위바위보");
        System.out.println(" ----------- 1 -------------");
        int a = (int)(Math.random()*3)+1;
        int b = (int)(Math.random()*3)+1;
        System.out.println((a == b) ? "Draw" : (b > (a+1)%3) ? "Win":"lose");
        System.out.println(" ----------- 2 -------------");
        a = (int)(Math.random()*3)+1;
        b = (int)(Math.random()*3)+1;
        System.out.println(a);
        System.out.println(b);
        String s = "";
        if (a == b) s= "Draw";
		/*
		 2%3 2 3
		 3%3 0 1
		 1%3 1 2
		 * */
        else s = (b > (a+1)%3) ? "Win":"lose";
        System.out.println(s);
        System.out.println(" ----------- 3 -------------");
        String[] arr = {"가위", "바위", "보", "Draw", "Win", "Lose"};
        int[] arr2 = new int[2];
        for(int i =0 ; i<arr2.length; i++) arr2[i] = (int)(Math.random()*3)+1;
        int p = arr2[0], c = arr2[1];
        System.out.printf("Player : %s %d\n",arr[p-1], p);
        System.out.printf("Computer : %s %d\n",arr[c-1], c);
        int i = 3;
        switch(Math.abs(p - c)) {
            case 1: i = (p > c) ? 5 : 4;
            case 2: i = (p > c) ? 4 : 5;
            default: break;
        }
        System.out.printf("Player: %s", arr[i]);
    }
    static void quiz04leap(){
        System.out.println("04 윤년");
    }
    static void quiz05guess(){
        System.out.println("05 숫자추론");
    }
    static void quiz06lotto(){
        System.out.println("06 로또");
    }
    static void quiz07booking(){
        System.out.println("07 예약");
    }
    static void quiz08bank(){
        System.out.println("08 입출금");
    }
    static void quiz09gugudan(){
        System.out.println("09 구구단");
        System.out.println(" --------- 1 --------------");
        for(int k = 2; k < 10; k+=4) {
            for (int i = 1; i < 10; i++) {
                for (int j = k; j < k+4; j++) {
                    System.out.print(j + "*" + i+ "=" +(j*i)+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(" --------- 2 --------------");
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 6; j++) {
                System.out.print(j + "*" + i+ "=" +(j*i)+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            for (int j = 6; j < 10; j++) {
                System.out.print(j + "*" + i+ "=" +(j*i)+"\t");
            }
            System.out.println();
        }
        System.out.println(" --------- 3 --------------");
        /*
        for(i 1 10 1)
        for(j 2 6 1)
        j * i = j * i
        for(i 1 10 1)
        for(j 6 10 1)
        j * i = j * i
        에서 같은 구문이 반복되므로, 다시 for 를 사용한다.
        for(k 2, 10, 4)
        for(i 1, 10, 1)
        for(j k, k+4, 1)
        j * i = (j * i)
         * */
        for (int dan = 2; dan < 10; dan += 4) { //구구단은 2단부터 시작.
            for (int i = 1; i <= 9; i++) { // 1 ~ 9 까지 곱이 나오도록 조건잡기
                for (int j = dan; j < dan + 4; j++) {
                    System.out.print(j + "*" + i + "=" + (j * i) + "\t");
                }
                System.out.print("\n"); // 4개씩 출력 되어야 하므로 j*i 값 4개가 출력된 후 엔터
            }
            System.out.println("\n"); //4개의 단(2단~5단)이 모두 출력 된 후, 엔터
        }
    }

}
