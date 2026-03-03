public class BannerAppUC4 {

    public static void main(String[] args) {

        // Step 1: Store banner lines in String array
        String[] bannerLines = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", "        WELCOME        ", "*"),
                String.join("", "*", "      TO UC4 BANNER     ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Step 2: Print using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}