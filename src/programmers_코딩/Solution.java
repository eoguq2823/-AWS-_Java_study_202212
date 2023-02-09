package programmers_코딩;

class Solution {
    public int[] solution(int[] numbers) {
    	for(int i = 0; i < numbers.length; i++) {
    		numbers[i] = i * 2;
    		System.out.println(i);
    	}
    return numbers;
    }
}