package com.chainsys.work;

public class Test {

	public static void main(String[] args) {
		int[] nums= {1,2,3,5};
		int[] num = new int[nums.length];
		int[]left = new int[3];
		int[]right = new int[3];
		
//
		int n =1;
		for(int i= 0;i<nums.length;i++) {
			n*= nums[i];
		}
		System.out.println(n);
		for(int i =0 ;i<nums.length;i++) {
			num[i] = n/nums[i];
		}
		
		for(int i =0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
//		for(int i=0;i<nums.length-1;i++) {
//		for(int j=0;j<=3;j++) {
//			
//			left[j]=nums[j-1]*left[j-1];
//		}
//		for(int k=nums.length-2;k>=0;k--) {
//			right[k]= nums[k+1]*right[k+1];
//		
//		}
//		num[i]=left[i]*right[i];
//		
//		
//			}
//		for(int i:num) {
//			System.out.println(i);
//		}
//		}
//			if(i!=num.length-1 && i!=0 ) {
//				 num[i] = nums[i-1]* nums[i+1]; 
//			}
//			else if(i==0) {
//				num[i] = nums[i+1] * nums[i+2];
//			}
//			else {
//				num[i] = nums[i-1] * nums[i-2];
//			}
//		}
	}
	}


