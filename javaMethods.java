
public class javaMethods {
    static int mult(int... arr) {
        // available as int[] arr
        int result = 1;
        for (int a : arr) {
            result = result* a;
        } // for each loop; apply for all the a in array array
        return result;
    }

    static void greet() {
        System.out.println("good morning!!");
    }

    static void greet(String s) {
        s = "swapnil";

        System.out.println("good morning " + s);
    }

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    static int change(int ch) {
        ch = 23;
        return ch;
    }

    static int change(int[] arr) {
        arr[0] = 56;
        return 2;
    }

    int multiplication(int x, int y) {
        int z;
        z = x * y;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = logic(a, b);
        System.out.println(c);
        int a1 = 3;
        int b1 = 1;
        System.out.println(logic(a1, b1));

        int a2 = 3;
        int b2 = 4;
        int c2;
        javaMethods obj = new javaMethods();
        c2 = obj.multiplication(a2, b2);
        System.out.printf("the answer from the object method invocation: %d", c2);

        // Case1: changing the integer
        int x = 45;
        change(x);
        System.out.println("the value of x after the change is " + x); // no effect of method
        // Case2: Changing the array
        int[] array = { 12, 13, 14, 15 };
        change(array);
        System.out.println("chnage in array element after change method: " + array[0]);// array is changed because we
                                                                                       // have passed the reference

        // method overloading
        greet();// greet
        String str = "ayush";
        System.out.println("before passing to method - good morning " + str);
        greet(str);

        // VarArgs
        System.out.println("the multiplication of 3 and 4: " + mult(3, 4));
        System.out.println("the multiplication of 3,4 and 5: " + mult(3, 4, 5));

    }
}
