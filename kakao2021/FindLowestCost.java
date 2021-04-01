package kakao2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ¸ÅÃâ ÇÏ¶ô ÃÖ¼ÒÈ­
 * @author sooki
 */
public class FindLowestCost {

	public static void main(String[] args)
	{
		int[] sales = {14, 17, 15, 18, 19, 14, 13, 16, 28, 17};
		int[][] links = {{10, 8}, {1, 9},
		                 {9, 7}, {5, 4},
		                 {1, 5}, {5, 10},
		                 {10, 6}, {1, 3},
		                 {10, 2}};
		System.out.println(solution(sales, links));		// 44
	}
	
    public static int solution(int[] sales, int[][] links)
    {
        int answer = 0;
        
        // ÆÀ (ÆÀÀå, ÆÀ¿øList)
        Map<Integer, List> team = new HashMap<Integer, List>();
        for (int i = 0; i < links.length; i++) {
        	if (!team.containsKey(links[i][0])) {
        		team.put(links[i][0],new ArrayList<Integer>());
        	}
		}
        
        // ÆÀ ¼ö
        int teamNum = team.size();
        
        // ÆÀ º° ÆÀ¿ø ¼ÂÆÃ
        for (int i = 0; i < links.length; i++) {
        	team.get(links[i][0]).add(links[i][1]);
		}
        
        int tmpAnswer = 0;
        boolean[] teamChk = new boolean[team.size()];
        Arrays.fill(teamChk, false);
        
        // ½ÃÀÛÁ¡ (¸®´õ)
        int cursor = 1;
        List member = team.get(cursor);
        for (int i = 0; i <= member.size(); i++) {
        	if (i == 0) {
				tmpAnswer += sales[cursor];
			}
        	
		}
        return answer;
    }

    
    public static int findTotalCount(int[] sales, int[][] links, int answer) {
    	
    	
    	return answer;
    }
    
	


}
