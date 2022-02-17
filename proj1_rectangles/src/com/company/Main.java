package com.company;

public class Main {
    public static void main(String[] args) {

        int ax1, ay1, bx1, by1; // variables statement
        int ax2, ay2, bx2, by2;

        // init variables
        // x - 1st rect, 2nd rect
        ax1 = 1;
        bx1 = 6;

        ax2 = 1;
        bx2 = 6;

        // y - 1st rect, 2nd rect
        ay1 = 1;
        by1 = 2;

        ay2 = 1;
        by2 = 3;


        if (  ((ax2 <= bx1 && bx1 <= bx2) || (ax2 <= ax1 && ax1 <= bx2) || (ax1 <= ax2 && ax2 <= bx1) || (ax1 <= bx2 && bx2 <= bx1) ) &&
              ((ay2 <= by1 && by1 <= by2) || (ay2 <= ay1 && ay1 <= by2) || (ay1 <= ay2 && ay2 <= by1) || (ay1 <= by2 && by2 <= by1)) ) {
            System.out.println("Rectangles have intersection");
            if ((by1 == ay2 && bx1 == ax2) || (by1 == ay2 && ax1 == bx2) || (ay1 == by2 && ax1 == bx2) || (ay1 == by2 && bx1 == ax1)  ||
                    (bx2 == ax1 && by2 == ay1) || (ax2 == bx1 && by2 == ay1) || (ay2 == by1 && bx1 == ax2) || (ay2 == by1 && ax1 == bx2)) {
                System.out.println("With point");
            }
            else if(( (by1 == ay2 || by2 == ay1) && ((ax2 < bx1 && bx1 < bx2) || (ax2 < ax1 && ax1 < bx2) || (ax1 < ax2 && ax2 < bx1) || (ax1 < bx2 && bx2 < bx1))) ){
                System.out.println("With horizontal line");
            }
            else if(( (bx2 == ax1 || bx1 == ax2) && ((ay2 < by1 && by1 < by2) || (ay2 < ay1 && ay1 < by2) || (ay1 < ay2 && ay2 < by1) || (ay1 < by2 && by2 < by1))) ){
                System.out.println("With vertical line");
            }
            else if( (ax1 == ax2 && bx2 == bx2) && (ay1 == ay2 && by1 == by2)){
                System.out.println("With rectangle");
            }
        }
        else{
            System.out.println("Rectangles have no intersection");
        }
    }
}
