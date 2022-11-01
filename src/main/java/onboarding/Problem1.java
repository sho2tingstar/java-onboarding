package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        if (!checkPages(pobi) || !checkPages(crong)) {
            answer = -1;
            return answer;
        }

        return answer;
    }

    private static boolean checkPages(List<Integer> list) {
        int leftPage = list.get(0);
        int rightPage = list.get(1);
        if ((leftPage + 1) != rightPage || (leftPage % 2 == 0) || (rightPage % 2 == 1) ||
            (leftPage == 1) || (rightPage == 400)) {
            return false;
        }
        return true;
    }
}
