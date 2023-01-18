public class LoopDrills {
    public static void main(String[] args) {
        System.out.println("ADD ALL WHILE");
        System.out.println(LoopDrills.addAllWhile(4, 4));
        System.out.println(LoopDrills.addAllWhile(-1, 2));
        System.out.println(LoopDrills.addAllWhile(8, 12));

        System.out.println("(4, 4) = 4: " + (4 == LoopDrills.addAllWhile(4, 4)));
        System.out.println("(-1, 2) = 2: " + (2 == LoopDrills.addAllWhile(-1, 2)));
        System.out.println("(8, 12) = 50: " + (50 == LoopDrills.addAllWhile(8, 12)));
        System.out.println();

        System.out.println("ADD ALL FOR");
        System.out.println(LoopDrills.addAllFor(4, 4));
        System.out.println(LoopDrills.addAllFor(-1, 2));
        System.out.println(LoopDrills.addAllFor(8, 12));

        System.out.println("(4, 4) = 4: " + (4 == LoopDrills.addAllFor(4, 4)));
        System.out.println("(-1, 2) = 2: " + (2 == LoopDrills.addAllFor(-1, 2)));
        System.out.println("(8, 12) = 50: " + (50 == LoopDrills.addAllFor(8, 12)));
        System.out.println();

        System.out.println("ADD ALL FOR CHANGE");
        System.out.println(LoopDrills.addAllForChg(4, 4, 2));  //Prints 4 
        System.out.println(LoopDrills.addAllForChg(-1, 2, 2)); //Prints 0 
        System.out.println(LoopDrills.addAllForChg(8, 12, 3)); 
        System.out.println(LoopDrills.addAllForChg(12, 8, 3));
        System.out.println();

        System.out.println("CALCULATE AMOUNT");
        System.out.println(LoopDrills.CalculateAmt(4, 10, 1));  //Prints 7 
        System.out.println(LoopDrills.CalculateAmt(4, 10, 2)); //Prints 28 
        System.out.println(LoopDrills.CalculateAmt(5, -5, 4)); // What does this print?  Hand calculate 
        System.out.println();

        System.out.println("ADD EVENS");
        int[] array1 = {1,2,3,4,5}; 
        System.out.println(LoopDrills.AddEvens(array1));  //Prints 6 
         
        int[] array2 = new int[10]; 
        for (int i = 0; i < 10; i++){ 
         array2[i] = i * 10; 
        } 
        System.out.println(LoopDrills.AddEvens(array2));  //Prints 450
    }

    public static int addAllWhile(int low, int high) {
        int sum = 0;
        int i = low;
        while (i <= high) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static int addAllFor(int low, int high) {
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        return sum;
    }

    public static int addAllForChg(int low, int high, int change) {
        int sum = 0;
        if (low < high) {
            for (int i = low; i <= high; i += change) {
                sum += i;
            }
        } else {
            for (int i = low; i >= high; i -= change) {
                sum += i;   
            }
        }
        return sum;
    }

    public static int CalculateAmt(int low, int high, int change) {
        int sum = 0;
        if (low < high) {
            for (int i = low; i <= high; i += change) {
                sum += (i % 2 == 0) ? i : -i;
            }
        } else {
            for (int i = low; i >= high; i -= change) {
                sum += (i % 2 == 0) ? i : -i; 
            }
        }
        return sum;
    }

    public static int AddEvens(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) sum += num;
        }

        return sum;
    }
}