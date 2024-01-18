public class Main {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("このコードを実行するとNullPointerExceptionが発生したよ");
            System.out.println(e.getMessage());
        }
    }
}