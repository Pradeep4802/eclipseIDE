package practice.multithreaded;

import java.util.*;

//Multithreading class extending the Thread class
public class Multithreading extends Thread {
 int start, end, arr[], target;
 static int index = -1;
 
 // Constructor method
 public Multithreading(int start, int end, int[] arr, int target){
     this.start = start;
     this.end = end;
     this.arr = arr;
     this.target = target;
 }
 
 // overriding run method
 @Override
 public void run(){
     if(end>=arr.length){
         return;
     } 
     for(int i=start;i<=end;i++){
         if(arr[i] == target){
             index = i;
             return;
         }
     }
 }
 
 // to return the index of the first occurrence of the target 
 public static int getIndex(){
     return index;
 }
 
 // main method
 public static void main(String[] args){
     int[] array = new int[]{45,92,60,29,36, 97,72, 23,29,81,45,22,62,58,72};
     int n = array.length;
     int target = 62;
     
     // creating thread objects of the multithreading class
     // dividing the array into two
     Multithreading thread1 = new Multithreading(0,n/2,array,target);
     Multithreading thread2 = new Multithreading(n/2+1, n-1, array,target);
     
     // creating and running threads to find the target element
     thread1.start();
     thread2.start();
     int resultIndex = 0;
     
     // ensuring that both the threads have finished their task
     while(thread1.isAlive() || thread2.isAlive());
     
     // returning first occurrence of the given target in the array
     if(thread1.getIndex() == -1 || thread2.getIndex() == -1){
         resultIndex = Math.max(thread1.getIndex(), thread2.getIndex());
     }
     else{
         resultIndex = Math.min(thread1.getIndex(), thread2.getIndex());
     }
     System.out.println("Index of first occurence of "+target+" int the array "+Arrays.toString(array)+" is at the index "+resultIndex);
 }
}
