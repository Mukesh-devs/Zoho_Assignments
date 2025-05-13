import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Sortable {
    int[] sort(int[] arr);
}

class BubbleSort implements Sortable {
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The given array is sorted using Bubble Sort: " + Arrays.toString(arr));
        return arr;
    }
}

class QuickSort implements Sortable{

    public List<Integer> quick_sort(List<Integer> list){
        if(list.size()<=1) return list;
        int pivot = list.get(list.size()/2);
        List<Integer> left = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i: list){
            if(i<pivot) left.add(i);
            else if(i==pivot) middle.add(i);
            else right.add(i);
        }

        List<Integer> sortedLeft = quick_sort(left);
        List<Integer> sortedRight = quick_sort(right);
        List<Integer> result = new ArrayList<>();
        result.addAll(sortedLeft);
        result.addAll(middle);
        result.addAll(sortedRight);
        return result;

    }
    public int[] sort(int[] arr){
        
        List<Integer> list = new ArrayList<>();
        for(int i: arr) list.add(i);
        list = quick_sort(list);
        for(int i=0; i<arr.length; i++) arr[i] = list.get(i);
        return arr;
        

    }
}

class MergeSort implements Sortable {

    public List<Integer> combine(List<Integer> left, List<Integer> right){
        int i=0; int j=0;
        List <Integer> result = new ArrayList<>();
        while(i<left.size()&& j<right.size()){
            if(left.get(i)<right.get(j)){
                result.add(left.get(i));
                i++;
            }
            else{
                result.add(right.get(j));
                j++;
            }
        }
        while(i<left.size()){
            result.add(left.get(i++));
        } 
        while(j<right.size()){
            result.add(right.get(j++));
        }
        return result;
    }
    public List<Integer> merge_sort(List<Integer> list){
        if(list.size()<2) return list;
        int index = list.size()/2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(i<index) left.add(list.get(i));
            else right.add(list.get(i));
        }
        left=merge_sort(left);
        right=merge_sort(right);
        list = combine(left,right);
        return list;

    }
    public int[] sort(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i: arr) list.add(i);
        list = merge_sort(list);
        for(int i=0; i<arr.length; i++) arr[i] = list.get(i);
        return arr;
    }
    
} 

class Q1{
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        b.sort(new int[]{5,6,1,2,3});
        QuickSort q = new QuickSort();
        System.out.println("The given array is sorted using Quick Sort: "+Arrays.toString(q.sort(new int[]{6,8,4,5,3})));
        MergeSort m = new MergeSort();
        System.out.println("The given array is sorted using Merge Sort: "+ Arrays.toString(m.sort(new int[]{5,6,9,8,7})));
    }
}