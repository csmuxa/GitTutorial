class ConsoleApplication {
    int a;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("first app");
    }

    static void print(String arg) {
        System.out.println(arg);
    }

    static String normalize(String arg) {
        return arg.toLowerCase().trim();
    }
    static String upper(String arg){
        return arg.toUpperCase();
    }
}