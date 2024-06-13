
public class VowelsFinder {
    private String inputString;
    private int vowelsCount;

    // Constructor
    public VowelsFinder() {
        this.inputString = "";
        this.vowelsCount = 0;
    }

    // Method to read a string
    public void readString(String inputString) {
        this.inputString = inputString;
        this.vowelsCount = 0; // Reset the vowels count when a new string is read
    }

    // Method to find the number of vowels in the string
    public void findVowelsCount() {
        String vowels = "aeiouAEIOU";
        for (int idx = 0; idx < inputString.length(); idx++) {
            char c = inputString.charAt(idx);
            if (vowels.indexOf(c) != -1) {
                vowelsCount++;
            }
        }
    }

    // Method to display the vowels count
    public void displayVowelsCount() {
        System.out.println("The number of vowels in the string is: " + vowelsCount);
    }

    
}
