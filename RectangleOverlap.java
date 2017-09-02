/**
 * Prob: 626 No: Rectangle overlap
 *
 *

*Given two rectangles, find if the given two rectangles overlap or not.
* Notice
*
*1: Top Left coordinate of first rectangle.
*r1: Bottom Right coordinate of first rectangle.
*l2: Top Left coordinate of second rectangle.
*2: Bottom Right coordinate of second rectangle.
*
*l1 != r2 and l2 != r2
*
*Example
*
*Given l1 = [0, 8], r1 = [8, 0], l2 = [6, 6], r2 = [10, 0], return true
*
*Given l1 = [0, 8], r1 = [8, 0], l2 = [9, 6], r2 = [10, 0], return `false
*
* Take way: 判断一个事情是不是真，可以判断所有真的情况是否都满足，或者也可以判断是否错的情况是否都满足
*
* * Definition for a point.
 * class Point {
 *     public int x, y;
 *     public Point() { x = 0; y = 0; }
 *     public Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    /**
     * @param l1 top-left coordinate of first rectangle
     * @param r1 bottom-right coordinate of first rectangle
     * @param l2 top-left coordinate of second rectangle
     * @param r2 bottom-right coordinate of second rectangle
     * @return true if they are overlap or false
     */
    public boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
        return !(r2.x < l1.x || l2.x > r1.x || r2.y > l1.y || l2.y < r1.y);
    }
}
