package Task_1;

public class Main {

    public static void main(String[] args) {

        String[] productsCorrectList = new String[]{"orange", "plum", "tomato", "onion", "grape"};
        String[] productsForCheckList = new String[]{"brange", "plum", "tomato", "onibn", "grape"};

        System.out.println("Список до корегування: ");
        showArrayInfo(productsForCheckList);

        productsForCheckList = stringComparator(productsCorrectList, productsForCheckList);

        System.out.println("Список після корегування: ");
        showArrayInfo(productsForCheckList);
    }

    public static String[] stringComparator(String[] stringCorrect, String[] stringForCheck) {

        String[] editedList = new String[stringForCheck.length];

        for (int i = 0; i < stringCorrect.length; i++) {
            String word1 = stringCorrect[i];
            String word2 = stringForCheck[i];

            if (!word1.equals(word2)) {
                StringBuilder string = new StringBuilder(word2);

                for (int j = 0; j < word1.length(); j++) {
                    if (word2.charAt(j) != word1.charAt(j)) {
                        string.setCharAt(j, word1.charAt(j));
                    }
                }

                editedList[i] = string.toString();
            } else {
                editedList[i] = word1;
            }
        }
        return editedList;
    }

    public static void showArrayInfo(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ") " + array[i]);
        }
        System.out.println("__________" + '\n');
    }

}
