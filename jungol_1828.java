import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 정올 #1828 냉장고
 */
public class jungol_1828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        // 가능한 경우의 수 모두 받아서 저장 후 정렬 (최소값 작은 것부터)
        ArrayList<int[]> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.add(new int[] {a, b});
        }

        Collections.sort(arr, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> cnt = new ArrayList<>();

        // 첫 값을 첫 번째 냉장고로 지정
        // 이전 냉장고로 수납 가능하면 최소값, 최대값 조정 후 패스
        // 가능한 냉장고가 없으면 현재 값으로 추가
        cnt.add(new int[] {arr.get(0)[0], arr.get(0)[1]});

        for (int i = 1; i < N; i++) {
            int[] cur = arr.get(i);
            int min = cur[0];
            int max = cur[1];

            boolean t = false;

            for (int[] now : cnt) {
                if ((min >= now[0] && min <= now[1]) || (max <= now[1] && max >= now[0])) {
                    t = true;
                    now[0] = Math.max(min, now[0]);
                    now[1] = Math.min(max, now[1]);
                    break;
                }
            }

            if (!t) cnt.add(new int[] {min, max});
        }

        // 답은 마지막까지 생성된 모든 냉장고의 수
        System.out.println(cnt.size());
    }
}
