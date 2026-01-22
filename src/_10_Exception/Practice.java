package _10_Exception;

import java.util.Scanner;

public class Practice {
    public static void checkEmpty(String email){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이메일을 입력하세요 >");
        String email = scanner.nextLine();

        try{
            // 문자열.length() == 0 or 문자열.equals("")
            if(email.isEmpty()){
                throw new InvalidEmailException("이메일이 비어있습니다", email);
            }

            if(!email.contains("@")){
                throw new InvalidEmailException("이메일에 @가 없습니다: ", email);
            }
        // 자식타입 먼저 catch -> 부모타입 캐치
        } catch (InvalidEmailException e){
            System.out.println("커스텀 예외로 캐치함");
            System.out.println(e.getMessage());
        // 상속 받은 부모 타입으로도 캐치 가능
        } catch (RuntimeException e){
            System.out.println("부모타입으로 캐치함");
            System.out.println(e.getMessage());
        // 상위 부모 타입으로도 캐치 가능 -> 내가 예상치 못한 예외까지 캐치가 가능함
        } catch (Exception e){
            System.out.println("상위 부모 타입으로 캐치함");
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("이메일이 확인되었습니다.");
        }
    }
}
