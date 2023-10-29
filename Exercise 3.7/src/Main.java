public class Main {
    public static void main(String[] args) {
        printUnicodeValue("\uD83E\uDD1F",0); //https://symbl.cc/en/1F91F/
    }

    public static void printUnicodeValue(String unicodeString, int index)
    {
        if (index < 0 || index >= unicodeString.length()) {
            System.out.println("Invalid index.");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder(unicodeString);
        int unicodeValueInteger = stringBuilder.codePointAt(index);
        String unicodeValueHex = Integer.toHexString(stringBuilder.codePointAt(index)).toUpperCase();
        System.out.println("Integer unicode value: " + unicodeValueInteger); //should return 129311
        System.out.println("Hex unicode value: U+" + unicodeValueHex); //should return 1F91F
    }
}