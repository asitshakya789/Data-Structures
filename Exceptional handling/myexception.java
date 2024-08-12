// // myexception.java
// import java.lang.Exception;
// public class myexception extends Exception {
//     myexception(String message) {
//         super(message);
//     }
// }

// // thow_keyword.java
// public class  {
//     public static void main(String[] args) {
//         int x = 5;
//         int y = 100;
//         try {
//             float z = (float) x / (float) y;
//             if (z < 0.01) {
//                 throw new myexception("number is too small");
//             }
//         } catch (myexception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }