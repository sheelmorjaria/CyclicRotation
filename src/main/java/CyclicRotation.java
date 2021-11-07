public class CyclicRotation {
    public static void main(String[] args) {
        CyclicRotationSolution cyclicRotation = new CyclicRotationSolution();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int[] result = cyclicRotation.solution(arr, k);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }

   public static class CyclicRotationSolution {
        public int[] solution(int[] A, int K) {
            int[] B = new int[A.length];
            for (int i : A) {
                B[(i + K) % A.length] = A[i];
            }
            return B;
        }
    }
}