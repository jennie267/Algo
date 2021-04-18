package kakao.intern.p2020;

/**
 * 키패드 누르기
 * https://programmers.co.kr/learn/courses/30/lessons/67256
 * @author sooki
 *
 */
public class Keypad {
	
	static int[][] position = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keypad keypad = new Keypad();
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		System.out.println(keypad.solution(numbers, hand));
		

	}
	
	// 1,4,7 왼손
	// 3,6,9 오른손
	// 2,5,8,0 가까운손(같은거리면 오른손잡이는 오른손으로 왼손잡이는 왼손으로)
	// numbers 누를 번호가 담긴 배열
	// hand 왼손잡이 오른손잡이
    public String solution(int[] numbers, String hand) {
        StringBuffer answer = new StringBuffer();
        int[] left = {3,0};
        int[] right = {3,2};
        for (int i = 0; i < numbers.length; i++) {
        	int target = numbers[i];
        	if(target == 1 || target == 4 || target == 7) {
        		answer.append("L");
        		left[0] = position[target][0];
        		left[1] = position[target][1];
        	} else if (target == 3 || target == 6 || target == 9) {
        		answer.append("R");
        		right[0] = position[target][0];
        		right[1] = position[target][1];
        	} else {
        		int leftMove = Math.abs(left[0]-position[target][0]) + Math.abs(left[1]-position[target][1]);
        		int rightMove = Math.abs(right[0]-position[target][0]) + Math.abs(right[1]-position[target][1]);
        		if (leftMove == rightMove) {
					if ("left".equals(hand)) {
						answer.append("L");
		        		left[0] = position[target][0];
		        		left[1] = position[target][1];
					}else {
						answer.append("R");
		        		right[0] = position[target][0];
		        		right[1] = position[target][1];
					}
				} else if (leftMove > rightMove) {
					answer.append("R");
	        		right[0] = position[target][0];
	        		right[1] = position[target][1];
					
				} else {
					answer.append("L");
	        		left[0] = position[target][0];
	        		left[1] = position[target][1];
					
				}
        		
        	}
        	
		}
        return answer.toString();
    }

}
