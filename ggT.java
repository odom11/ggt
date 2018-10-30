public final class ggT {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        if (second == 0) {
            System.out.println("ggt = " + first);
            return;
        }
        for (
                int remainder = first % second; 
                remainder != 0; 
                remainder = first % second) {
            //System.out.println("first: " + first + ", second: " + second + ", remainder" + remainder);
            first = second;
            second = remainder;
        }
        System.out.println("ggt = " + second);
    }
}
