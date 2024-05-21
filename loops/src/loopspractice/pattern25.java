// *****
//  ****
//   ***
//    **
//     *
package loopspractice;
public class pattern25 {
        public static void main(String[] args) {
            int i; 
            int j;
            for (i = 1; i <= 7; i++) {
                for (j = 1; j <= 7; j++) {
                    if (j < i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }

