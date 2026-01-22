package Jan_22.Stream;

import java.util.*;

public class ItemMain {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("삼성 노트북", 5, true, 1000000),
                new Item("로지텍 마우스", 0, true, 30000),
                new Item("삼성 키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("마이크", 0, false, 60000)
        );

        // 실습1) 이름에 삼성이 들어간 상품 중 10만원 이하 상품 찾기
        List<Item> result1 = items.stream()
                .filter(it -> it.getName().contains("삼성"))
                .filter(it -> it.getPrice() <= 100000)
                .toList();
        System.out.println(result1);

        // 실습2) 이름에 로지텍이 없는 상품 및 세일 중인 상품 중 10만원 이하 상품리스트 추출
        List<Item> result2 = items.stream()
                .filter(it -> !it.getName().contains("로지텍"))
                .filter(it -> it.isOnSale())
                .filter(it -> it.getPrice() <= 100000)
                .toList();
        System.out.println(result2);

        // 실습3) 세일 중인 상품들 전체 가격 총합(재공량 * 가격)
        // for문 + 외부누적변수
        int sum = 0;
        List<Integer> totalPrices = items.stream()
                .filter(it -> it.isOnSale()) // 1차 필터링
                // [item1, item2 ...] -> [5000000, 0, 500000....]
                .map(it -> it.getStock() * it.getPrice()) // 객체 -> Integer
                .toList();

        for(Integer price : totalPrices){
            sum += price;
        }

        int result5 = items.stream()
                .filter(it -> it.isOnSale())
                .map(it -> it.getPrice() * it.getStock())
                .reduce(0, (priceSum, price) -> priceSum + price);

        System.out.println("세일 재고 가격 총합: " + result5);


        // 최종 연산자
        // reduce(초기값, (누적변수, 꺼내올 변수) -> 연산식)
        // 초기값 -> 누적변수의 초기값
        // 리턴된 값은 누적 변수에 재대입됨
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int total = nums.stream()
                .reduce(0, (sum2, num) -> sum2 + num);

        // [[1, 2], [3, 4], [5,6]] -> [1,2,3,4,5,6]
        List<List<Integer>> lists = List.of(
                List.of(1,2),
                List.of(3,4),
                List.of(5,6)
        );
        System.out.println(lists);

        // 리스트의 평탄화
        List<Integer> result4 = lists.stream()
                .reduce(new ArrayList<Integer>(), // 초기값(빈 배열)
                        (acc, list) -> {
                            List<Integer> newList = new ArrayList<>(acc);
                            newList.addAll(list); // 리스트의 모든 요소 추가
                            return newList;
                        }
                );
        System.out.println(result4);
    }
}
