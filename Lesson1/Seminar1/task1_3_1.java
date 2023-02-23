// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно 
// перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов 
// массива должны быть отличны от заданного, 
// а остальные - равны ему.

package Lesson1.Seminar1;

public class task1_3_1 {
    public static void main(String[] args) {    
        int[] nums = new int[] {3,2,3,1,3,2,3,1,3};
        int val = 3;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {                           //если i = val
                temp = nums[i];                             //то заменяем temp на i
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }                   
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }   
}


