public boolean confusingNumber(int N) {
        char[] rotate = {'0', '1', '$', '$', '$', '$', '9', '$', '8', '6'};
        char[] num = Integer.toString(N).toCharArray();
        boolean res = false;

        for (int l = 0, r = num.length - 1; l <= r; ++l, --r) {
            if (rotate[num[l] - '0'] == '$' || rotate[num[r] - '0'] == '$')
                return false;
            if (rotate[num[l] - '0'] != num[r])
                res = true;
        }

        return res;
    }
