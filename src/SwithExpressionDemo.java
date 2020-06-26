public class SwithExpressionDemo {
    public static void main(String[] args){
        String sport ="Football";
        String bestPlayer = switch (sport){
            case "Football" -> "football";
            case "Tennis" -> "zzz";
            case "f1" ->"AAA";
            default -> "unknown";
        };
        System.out.println(bestPlayer);
    }
}
