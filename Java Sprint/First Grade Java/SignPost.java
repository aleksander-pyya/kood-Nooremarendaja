package sprint;

public class SignPost {
    public int getArea(String multiLiner) {
        String[] lines = multiLiner.split("\n");

        int maxWidth = 0;
        for (String line : lines) {
            if (line.length() > maxWidth) {
                maxWidth = line.length();
            }
        }

        int height = lines.length;
        int area = maxWidth * height;

        return area;
    }
}
