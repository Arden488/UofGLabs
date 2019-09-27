public class Lab6Ex4 {
    /*
     * Get max number of rows and add spaces between
     */
    public static int calcNumOfSymbols(int row) {
        return row * 2 - 1;
    }

    public static String addSpace(int totalSymbols, int rowSymbols) {
        String str = "";
        int numOfSpaces = (totalSymbols - rowSymbols) / 2;

        for (int i = 1; i <= numOfSpaces; i++) {
            str += " ";
        }

        return str;
    }

    public static String addRowSymbols(int i, int numOfSymbols) {
        String str = "";

        for (int j = 0; j < numOfSymbols; j++) {
            if (j % 2 == 0) {
                str += i;
            } else {
                str += " ";
            }
        }

        return str;
    }

    public static String outputRows(int numOfRows) {
        String str = "";
        int totalNumOfSymbols = calcNumOfSymbols(numOfRows);

        for (int i = 1; i <= numOfRows; i++) {
            int numOfSymbols = calcNumOfSymbols(i);
            str += addSpace(totalNumOfSymbols, numOfSymbols);
            str += addRowSymbols(i, numOfSymbols);
            str += addSpace(totalNumOfSymbols, numOfSymbols);
            str += "\n";
        }

        return str;
    }

    public static void main(String[] args) {
        int numOfRows = 9;

        System.out.println(outputRows(numOfRows));
    }
}