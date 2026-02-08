package lesson3.homeWork;

public class Test {
    public static void main(String[] args) {
        String str="я java разработчик";
        int count=str.length();

        char[] arr=str.toCharArray();
        System.out.println(arr);
        for (int index =count-1; index >=0; index--) {
            System.out.print(arr[index]);
        }

        }


    }

