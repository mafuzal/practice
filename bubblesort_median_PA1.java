public class Solution {
	public static double findMedianSortedArrays(int[] nums1,int[]nums2)
	{
		int k=nums1.length+nums2.length;
		double [] array=new double[k];
      double [] order=new double[k];
		int count=0;
		for(int i=0;i<nums1.length;i++)
		{
			array[i]=nums1[i];
			count = i;
		}
		count=count+1;
		for(int j=0;j<nums2.length;j++)
		{
			array[j+count]=nums2[j];
			
		}
      
      
		double median=0;
      
  		order=bubblesort(array);
      
		int len=order.length;
		if (len%2==0){
			len=(len/2)-1;
			median = (order[len]+order[len+1])/2;
			
		}
		else{
			len=(len+1)/2;
			median = (order[len-1]);
		}
		
		return median;
		
	}
  
  public static double []bubblesort(double []ar){
    double  temp;
   	for(int k=0;k<ar.length;k++)
			{
				for(int i=0;i<ar.length-1;i++)
				{
					if (ar[1+i]>ar[i])
					{
						
						temp=ar[i];
						ar[i]=ar[i+1]; 
						ar[i+1]=temp;   
					
					}	

				}

			}
    return ar;
      
    
  }

  
  
	public static void main(String[] args) {
	Solution s=new Solution();
      int[] nums1={1,3};
		int[] nums2={2};
		double nums3=s.findMedianSortedArrays(nums1,nums2);
      System.out.println(nums3);
	
	}

}
	