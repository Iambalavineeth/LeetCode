public class MergeSortedArray{
  public void merge(int[] nums1, int m, int nums2, int n){
    int idx = m+n-1;
    int x = m-1, y = n-1;
    while(x >= 0 && y >= 0){
      if(nums2[y] < nums1[x]) nums1[idx--] = nums1[x--];
      else nums1[idx--] = nums2[y--];
    }
    while(x >= 0) nums1[idx--] = nums1[x--];
    while(y >= 0) nums1[idx--] = nums2[y--];
  }
}
