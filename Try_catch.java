public class Try_catch {
    public static void main(String[] args) {
        int a = 5000;
        int b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println("Unable to run the code... Reasons still unclear");
            System.out.println(e);
        }
    }
}