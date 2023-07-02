package Task_2;

public class Main {

    public static void main(String[] args) {

        String[] productsList = new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};
        String productToDelete = "onion";

        System.out.println("Список до корегування: ");
        showArrayInfo(productsList);

        for (int i = 0; i < productsList.length; i++) {
            if (productsList[i].equals(productToDelete)) {
                productsList = stringDeletion(productsList, i);
                i--;
            }
        }
        System.out.println("Список після корегування: ");
        showArrayInfo(productsList);
    }


    public static String[] stringDeletion(String[] array, int index) {

        if (index < 0 || index >= array.length) {
            return array;
        }

        String[] newList = new String[array.length - 1];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newList[newIndex] = array[i];
                newIndex++;
            }
        }
        return newList;
    }

    public static void showArrayInfo(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ") " + array[i]);
        }
        System.out.println("__________" + '\n');
    }

}
