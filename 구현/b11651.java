// 2020-09-21 Yoo Jaein
// [BOJ] 11651 좌표 정렬하기 2
// 구현

import java.io.*;
import java.util.*;

public class Main {
	
	static class Point {
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		ArrayList<Point> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			list.add(new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
		}
		
		Collections.sort(list, new Comparator<Point>() {
			@Override
			public int compare(Point p1, Point p2) {
				if(p1.y==p2.y)
					return p1.x-p2.x;
				else
					return p1.y-p2.y;
			}
		});
		
		for(Point p : list)
			System.out.println(p.x+" "+p.y);
		
		br.close();
    	return;
    }
}
