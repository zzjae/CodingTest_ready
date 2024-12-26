import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(int[][] line) {

        List<Point> points = new ArrayList<>();
        for(int i = 0; i< line.length; i++){
            for(int j = i+1; j<line.length; j++){
                //i식의 a,b,c값과 j식의 a,b,c 값으로 교점을 구함
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);

                if(intersection != null){
                    points.add(intersection);
                }
            }
        }

        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);

        int width = (int) (maximum.x - minimum.x +1);
        int height = (int) (maximum.y - minimum.y + 1);

        char[][] arr = new char[height][width];
        for(char[] row : arr){
            Arrays.fill(row, '.');
        }

        for(Point p: points){
            //좌표 변환
            int x = (int)(p.x - minimum.x);
            int y = (int)(maximum.y - p.y);
            arr[y][x] = '*';
        }

        String[] answer = new String[arr.length];
        for (int i=0;i< answer.length; i++){
            answer[i] = new String(arr[i]);
        }
        return answer;
    }

    //식 2개를 비교해서 교점을 구하는 함수
    public Point intersection(long a1, long b1, long c1,long a2, long b2, long c2){

        double x = (double)(b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double)(a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        //나머지가 있다면 즉 교점의 좌표가 정수가 아니라면 점을 찍지 않음
        if(x % 1 != 0 || y % 1 != 0) return null;

        return new Point((long) x, (long) y);
    }

    // 점
    public static class Point{
        public final long x,y;
        public Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }

    //print할 배열의 크기를 구하기 위한 최소 좌표 찾기
    private Point getMinimumPoint(List<Point> points){
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for(Point p: points){
            if(p.x < x) x = p.x;
            if(p.y < y) y = p.y;
        }

        return new Point(x,y);
    }
    //print할 배열의 크기를 구하기 위한 최대 좌표 찾기
    private Point getMaximumPoint(List<Point> points){
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for(Point p: points){
            if(p.x > x) x = p.x;
            if(p.y > y) y = p.y;
        }

        return new Point(x,y);
    }
}



