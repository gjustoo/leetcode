// package javacode;

// import java.util.Arrays;
// import java.util.TreeMap;
// import java.util.stream.Collectors;

// public class TheKWeakestRowsInAMatrix {

//     public static void main(String[] args) {
//         kWeakestRows(new int[][] { { 1, 1, 0, 0, 0 },
//                 { 1, 1, 1, 1, 0 },
//                 { 1, 0, 0, 0, 0 },
//                 { 1, 1, 0, 0, 0 },
//                 { 1, 1, 1, 1, 1 } }, 3);
//     }

//     public static int[] kWeakestRows(int[][] mat, int k) {

//         int[] result = new int[k];

//         TreeMap<Integer, Integer> map = new TreeMap<>();

//         for (int i = 0; i < mat[0].length; i++) {

//             int soldiers = Arrays.stream(mat[i]).sum();
//             map.put(soldiers, i);
//             int a = 0;
//         }


//         for (int i = 0; i < k; i++) {

//             result[i] = a.get(a.size()-1-i).intValue();

//         }

//         return result;
//     }

// }
