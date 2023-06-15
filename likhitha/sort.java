
class StringDescendingSorter {
    public static void main(String[] args) {
        String[] str = {"-100", "50", ".12", "0.12", "0", "000.000"};

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (Double.parseDouble(str[j]) > Double.parseDouble(str[i])) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        for (String s : str) {
            System.out.print(s+"  ");
        }
    }
}
