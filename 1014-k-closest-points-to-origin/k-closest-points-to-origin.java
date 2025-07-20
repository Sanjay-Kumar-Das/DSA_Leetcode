class Solution {
    public class Point implements Comparable<Point>{
        int x,y,d;
        Point(int x, int y, int d){
            this.x = x;
            this.y = y;
            this.d = d;
        }
        public int compareTo(Point p){
            return this.d - p.d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
      PriorityQueue<Point> pq = new PriorityQueue<>(Collections.reverseOrder());  
        for(int i=0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
            int d = x*x + y*y ;
            pq.add(new Point(x,y,d));

            if(pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for(int i =0;i<k;i++){
            Point p = pq.remove();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }
        return ans;
    }
}