public class FirstSolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;

        int[] temp = new int[m];
        for (int a = 0; a < m; a++) temp[a] = nums1[a];

        int count = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (temp[i] < nums2[j]) nums1[count++] = temp[i++];
            else nums1[count++] = nums2[j++];
        }

        while (i < m) {
            nums1[count++] = temp[i++];
        }

        while (j < n) {
            nums1[count++] = nums2[j++];
        }

    }
}
