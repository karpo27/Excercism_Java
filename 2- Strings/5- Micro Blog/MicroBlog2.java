import java.util.stream.Collectors;

class MicroBlog2 {
    public String truncate(String input) {
        String result = input.codePoints().limit(5).mapToObj(Character::toString).collect(Collectors.joining());
        
        return result;
    }
}
