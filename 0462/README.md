# [Medium]462. Minimum Moves to Equal Array Elements II
Given a non-empty integer array, find the minimum number of moves required to make all array elements equal, where a move is incrementing a selected element by 1 or decrementing a selected element by 1.

You may assume the array's length is at most 10,000.

    Input:
    [1,2,3]

    Output:
    2

    Explanation:
    Only two moves are needed (remember each move increments or decrements one element):

    [1,2,3]  =>  [2,2,3]  =>  [2,2,2]





中位數

n=1

x = x1 為距離最短


n=2

x1 x2

與x1 x2 距離最短為 x1 <= x <= x2


n=3

x1 x3 x2

與x1 x2 距離最短為 x1 <= x <= x2 && x3距離最短為x3本身(x=x3)

所以最短距離為x3


n=4 同 n=2


n=5 同 n=3

# Java
Runtime: 2 ms

Memory Usage: 39.9 MB

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int m = nums[length/2];
        int sum=0;
        for (int j =0 ;j<length;j++){
            sum = sum + Math.abs(nums[j]-m);
        }
        return sum;
    }
    
Runtime: 3 ms

Memory Usage: 39.6 MB  

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int m = nums[length/2];
        int sum  = Arrays.stream(nums).reduce(0,(a,b)->{
            return a+ Math.abs(b-m);
        });
        return sum;
    }
    
Runtime: 4 ms

Memory Usage: 39.6 MB

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = nums[nums.length/2];
        return Arrays.stream(nums).map(x -> Math.abs(x-i)).sum();
    }


Runtime: 10 ms

Memory Usage: 40 MB 

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int m = nums[length/2];        
        int sum=0;
        sum = Arrays.stream(nums).parallel().map(x -> Math.abs(x-m)).sum();
        return sum;
    }

Runtime: 15 ms

Memory Usage: 40 MB

    public int minMoves2(int[] nums) {
        IntStream aaa = Arrays.stream(nums).sorted();
        final int i = aaa.parallel().skip(nums.length/2).findFirst().getAsInt();
        return Arrays.stream(nums).parallel().map(x -> Math.abs(x-i)).sum();
    }


Runtime: 1 ms
Memory Usage: 40.2 MB
    
    class test {
        public int minMoves2(int[] nums) {
            int n = nums.length;
            int moves = 0;
            int median;
            // median = quickselect(nums, 0, n - 1, n / 2 + 1);
            median = getM(nums, 0, n - 1);
            for (int num : nums) moves += Math.abs(num - median);
            return moves;
        }
    //    public int quickselect(int[] nums, int lo, int hi, int k) {
    //        int pivot = nums[(lo + hi) / 2];
    //        if (lo == hi) return pivot;
    //        int i = lo - 1, j = hi + 1;
    //        while (true) {
    //            do { i++; } while (nums[i] < pivot);
    //            do { j--; } while (nums[j] > pivot);
    //            if (i >= j) break;
    //            swap(nums, i, j);
    //        }
    //        int size = j - lo + 1;
    //        if (k <= size) return quickselect(nums, lo, j, k);
    //        else return quickselect(nums, j + 1, hi, k - size);
    //    }
        public void swap(int[] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        public int getM(int[] nums, int lo, int hi) {
            int pivot = nums[(lo + hi) / 2];

            int i = lo - 1, j = hi + 1;
            while (true) {
                do { i++; } while (nums[i] < pivot);
                do { j--; } while (nums[j] > pivot);
                if (i >= j) break;
                swap(nums, i, j);
            }
            int pivot_new = nums[(lo + hi) / 2];
            if (pivot_new==pivot){
                return pivot;
            } else {
                return getM(nums,lo,hi);
            }
        }
    }    
    
    
    
    
# Go
Runtime: 8 ms

Memory Usage: 4.5 MB

    func minMoves2(nums []int) int {
        sort.Ints(nums)
        m := nums[len(nums)/2]
        var sum float64 = 0
        for i:=0; i < len(nums); i++ {
            sum = sum + math.Abs(float64(nums[i]-m))
        }
        return int(sum)
    }
    
