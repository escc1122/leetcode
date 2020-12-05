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

x1 本身為距離最短


n=2

x1 x2

與x1 x2 距離最短為 x1 <= x <= x2


n=3

x1 x3 x2

與x1 x2 距離最短為 x1 <= x <= x2 && x3距離最短為x3本身

所以最短距離為x3


n=4 同 n=2


n=5 同 n=3
