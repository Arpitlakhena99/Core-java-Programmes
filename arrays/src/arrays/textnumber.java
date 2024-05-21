package arrays;
public class textnumber{
    public static void main(String[] args) {
        char[] input = {'1', '2', '3','5','7','8','9'};
        char[][] digitWords = {
            {'z', 'e', 'r', 'o'},
            {'o', 'n', 'e'},
            {'t', 'w', 'o'},
            {'t', 'h', 'r', 'e', 'e'},
            {'f', 'o', 'u', 'r'},
            {'f', 'i', 'v', 'e'},
            {'s', 'i', 'x'},
            {'s', 'e', 'v', 'e', 'n'},
            {'e', 'i', 'g', 'h', 't'},
            {'n', 'i', 'n', 'e'}
        };
        int i = 0;
        while (i < input.length) {
            char digitChar = input[i];
            int digit = Character.getNumericValue(digitChar);

            if (digit >= 0 && digit <= 9) {
                int j = 0;
                while (j < digitWords[digit].length) {
                    char ch = digitWords[digit][j];
                    if (ch != ' ') {
                        System.out.print(ch);
                    }
                    j++;
                }
            } else {
                System.out.println("Invalid input: " + digitChar);
                return;
            }
            i++;
        }
    }
}
