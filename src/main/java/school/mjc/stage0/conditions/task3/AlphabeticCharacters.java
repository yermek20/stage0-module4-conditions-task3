package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char c = character;
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            System.out.println("Vowel");
        } else {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                System.out.println("Consonant");
            } else {
                System.out.println("wrong alphabet!");
            }
        }
    }
}
