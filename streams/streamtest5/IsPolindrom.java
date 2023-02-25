package streamtest5;

public class IsPolindrom {
    public static boolean isPolindrom(String str) {
        StringBuilder leftToRight = new StringBuilder();

        str.chars()
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(leftToRight::appendCodePoint);

        StringBuilder rightToLeft = new StringBuilder();

        str.chars()
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(rightToLeft::appendCodePoint);
        return leftToRight.toString().equals(rightToLeft.toString());
    }
}