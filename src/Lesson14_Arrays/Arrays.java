package Lesson14_Arrays;

public class Arrays {

    int[] array = new int[3];
    Sweet [] box = new Sweet[5];

    int[] array2 = {10, 3, 7};

    Sweet candy1 = new Sweet();
    Sweet candy2 = new Sweet();
    Sweet candy3 = new Sweet();

    Sweet [] box2 = {candy1, candy2, candy3};

    Sweet [] box3;

    public void foo(){
        box[0] = candy3;
        System.out.println(box[0]);
        System.out.println(candy3);

    }
}
