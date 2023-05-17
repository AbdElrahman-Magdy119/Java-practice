import java.util.Random;
import java.util.Arrays;  
import java.util.*;  

class lab{  
//  public static void binary_search(int arr[], int key){
//    int first=0, last=999;  
//    int mid = (first + last)/2;  
//    while( first <= last ){  
//       if ( arr[mid] < key ){  
//         first = mid + 1;     
//       }else if ( arr[mid] == key ){  
//         System.out.println("Element is found at index: " + mid);  
//         break;  
//       }else{  
//          last = mid - 1;  
//       }  
//       mid = (first + last)/2;  
//    }  
//    if ( first > last ){  
//       System.out.println("Element is not found!");  
//    }  
//  }
    public static void main(String[] args){  
    long start = System.currentTimeMillis();
    Random randomArr = new Random(); 
    int[] arr = new int[1000];
    // int mx,mn;
      for (int i = 0; i < arr.length; i++) {
         arr[i] = randomArr.nextInt(1000); 
      }
      mx=arr[0];
      mn=arr[0];
      for (int i = 0; i < arr.length; i++) {
         mx=Math.max(mx,arr[i]);
         mn=Math.min(mn,arr[i]);
      }
    long end = System.currentTimeMillis();
    long elapsedTime = end - start;
    System.out.println("max: "+mx);
    System.out.println("min: "+mn);
    System.out.println("the search running time: "+elapsedTime);
    //-------------------------------------
    // int ans=Arrays.binarySearch(arr,100);
    // Arrays.sort(arr);
    // binary_search(arr,100);
    // long end = System.currentTimeMillis();
    // long elapsedTime = end - start;
    // System.out.println("the search running time: "+elapsedTime);
    //-------------------------------------------
     String data="ITI developes people and ITI house of developers and ITI for people";
//     // String data="ITI nada ITI";
//     String subData = "ITI";
//     // String arr [] = data.split("ITI");
//     // int len=arr.length-1;
       int ans=0;
//     int x=0;
//     //System.out.println("the number of occurrence of the : "+len);
//     // for(int i=0;i<data.length();i++){
//    while(true){
//         x=data.indexOf(subData, x);
//         if(x != -1){
//             ans++;
//             x+=3;
//         }else{
//             break;
//         } 
//     }
//     System.out.println("the number of occurrence of the : "+ans);
//---------------------------------------------------------------------
    StringTokenizer st = new StringTokenizer(data);
     while (st.hasMoreTokens()) {
        // System.out.println(st.nextToken());
        if(st.nextToken().equals("ITI")){
           ans++;
        }
     }
    System.out.println("the number of occurrence of the : "+ans);
 
    //--------------------------------------------------------------------
    String IP="123.123.123.123";
    // String arr [] = IP.split("\\.");
    // for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    // }
    //--------------------------------------------
    // StringTokenizer st = new StringTokenizer(IP,".");
    //  while (st.hasMoreTokens()) {
    //      System.out.println(st.nextToken());
    //  }


 }  
}