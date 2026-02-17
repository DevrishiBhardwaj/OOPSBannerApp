/**
 * OOPSBannerApp UC4 Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author [Your Name]
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] bannerLines = new String[7];
        bannerLines[0] = "  *****  " + "  *****  " + " ******* " + "  ***** ";
        bannerLines[1] = " *     * " + " *     * " + " *     * " + " *     *";
        bannerLines[2] = " *     * " + " *     * " + " *     * " + " *      ";
        bannerLines[3] = " *     * " + " *     * " + " ******* " + "  ***** ";
        bannerLines[4] = " *     * " + " *     * " + " *       " + "       *";
        bannerLines[5] = " *     * " + " *     * " + " *       " + " *     *";
        bannerLines[6] = "  *****  " + "  *****  " + " *       " + "  ***** ";
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}