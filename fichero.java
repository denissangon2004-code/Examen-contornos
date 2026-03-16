public class Main {

public static void main(String[] args) {
  
int[] anArray = new int[10];
    System.out.println(Arrays.toString(anArray));
  
  anArray[4] = 100;
    System.out.println(Arrays.toString(anArray));
    System.out.println("Element at index 4: " + anArray[4]);
  
  System.out.println("Length: " + anArray.length);

  int[] b = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(b));

  for (int number : b) {
        System.out.println(number);
    }

  for (int i = 0; i < b.length; i++) {
        System.out.println(b[i]);
    }

  ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    System.out.println(arrayList);

      int[][] twoDArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    for (int[] row : twoDArray) {
        System.out.println(Arrays.toString(row));
    }
  }
}
