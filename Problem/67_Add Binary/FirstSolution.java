public class FirstSolution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length();
        int j = b.length();
        int flag = 0;

        while (i > 0 && j > 0) {
            int m = a.charAt(i - 1) - '0';
            int n = b.charAt(j - 1) - '0';
            int sum = m + n + flag;
            if (sum > 1) {
                sum %= 2;
                flag = 1;
            } else {
                flag = 0;
            }

            result.append(sum);
            i--;
            j--;
        }

        if (i != 0) {
            while (i > 0) {
                int sum = a.charAt(i- 1) - '0' + flag;
                if (sum > 1) {
                    sum %= 2;
                    flag = 1;
                } else {
                    flag = 0;
                }

                result.append(sum);
                i--;
            }
        }

        if (j != 0) {
            while (j > 0) {
                int sum = b.charAt(j - 1) - '0' + flag;
                if (sum > 1) {
                    sum %= 2;
                    flag = 1;
                } else {
                    flag = 0;
                }

                result.append(sum);
                j--;
            }
        }

        if (flag == 1) result.append(1);

        return result.reverse().toString();
    }
}
