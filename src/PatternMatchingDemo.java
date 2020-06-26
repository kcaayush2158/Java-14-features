public class PatternMatchingDemo {
    public static void main(String[] args){
        Object obj = "Old java is here";
        if(obj instanceof String){
            String string = (String) obj;
            System.out.println(string.toUpperCase());
        }

        //java 14 features
        Object javaObj = "Java 14 is here";
        if(javaObj instanceof String s){
            System.out.println(s);
        }


    }
}
