package Recursion;

public class length {

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(length(str));
        printChars("Hello");
        int[] arr = {4,5,6,2,3,8,9};
        int search = search(arr,0,arr.length,9);
        System.out.println("search Index : " + search);
        int result1 = findMaxNumber(arr,0,arr.length-1);
        System.out.println("최댓값 : " + result1);
        int result2 = findMinNumber(arr,0,arr.length-1);
        System.out.println("최소값 : "+ result2);
        
    }

    // 문자열의 길이는 나머지 문자 길이 + 첫번째 문자 길이이
   public static int length(String str){
        //abcd
        if(str.equals(""))
            return 0; //base case
        else{
            return 1 + length(str.substring(1));
        }
    }

    // 첫글자를 출력하고 첫글자를 제외한 나머지를 출력
    public static void printChars(String str){
        //hello
        if(str.length() == 0){
            return;
        }else{
            System.out.println(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    //search
    public static int search(int[] data, int begin, int end, int target){
        if(begin>end){
            return -1;
        }
        else if(data[begin] == target){
            return begin;
        } // 처음 값이라면
        else{
            return search(data,begin+1,end,target);
        }
    }


    public static int findMaxNumber(int [] data , int begin, int end){
        if(begin==end){
            return data[begin]; //Base case
        }else{
            int middle = (begin+end)/2;
            int max1 = findMaxNumber(data,begin,middle);
            int max2 = findMaxNumber(data,middle+1,end);
            return Math.max(max1,max2);
            // 점점 base case로 수렴하고 있다.
        }
    }

    // Recursion 은 explicit하게 표현하라
    public static int findMinNumber(int[] arr,int begin,int end){
        // Recursion 만드는 규칙
        // 1. base case 만들기 2. base case에 수렴하도록 규칙 만들기
        if(begin == end){
            return arr[begin]; //base case
        }else{
            int middle = (begin+end)/2;
            int min1 = findMinNumber(arr,0,middle); //앞에 것을 뒤짐
            int min2 = findMinNumber(arr,middle+1,end); //뒤에 것을 뒤짐
            return Math.min(min1,min2);
        }
    }
}