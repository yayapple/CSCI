public class quine {

    public static void main(String[] args) {
        String quine = """
            public class quine {
            
                public static void main(String[] args) {
                    String quine = %s
                    String triple = String.valueOf((char)34).repeat(3);
            
                    System.out.printf(quine, triple.indent(0) + (quine + triple + ';').indent(12));
                }
            }
            """;

        String triple = String.valueOf((char)34).repeat(3);

        System.out.printf(quine, triple.indent(0) + (quine + triple + ';').indent(12));
    }
}
