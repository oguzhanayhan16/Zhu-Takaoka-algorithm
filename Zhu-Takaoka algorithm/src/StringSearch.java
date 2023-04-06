public class StringSearch {
    static int NO_OF_CHARS = 256;


   int[] badChar(char[] str) {
        int size = str.length;
        int[] badChar = new int[NO_OF_CHARS];

        for (int i = 0; i < NO_OF_CHARS; i++)
            badChar[i] = -1;

        for (int i = 0; i < size; i++)
            badChar[(int) str[i]] = i;

        return badChar;
    }



     void search(char[] txt, char[] deger) {
        int value = deger.length;
        int text = txt.length;
        int aranan=0;
        int[] badChar = badChar(deger);

        int s = 0;
        while (s <= (text - value)) {
            int j = value - 1;

            while (j >= 0 && deger[j] == txt[s + j])
                j--;

            if (j < 0) {
              aranan++;
                s += (s + value < text) ? value - badChar[txt[s + value]] : 1;
            } else
                s += Math.max(1, j - badChar[txt[s + j]]);
        }
        System.out.println("Aranan değer " + new String(deger) + " " +aranan+" kez bulundu.");
    }
}
