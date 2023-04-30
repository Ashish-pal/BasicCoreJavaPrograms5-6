public class DistanceCMD {
    public static double calDistance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x, x) + Math.pow(y, y));
        return distance;
    }

    public static void main(String arg[]) {
        int x1 = Integer.parseInt(arg[0]);
        System.out.println("Enter x1 value: " + x1);
        int x2 = Integer.parseInt(arg[1]);
        System.out.println("Enter x2 value " + x2);
        int y1 = Integer.parseInt(arg[2]);
        System.out.println("Enter y1 value: " + y1);
        int y2 = Integer.parseInt(arg[3]);
        System.out.println("Enter y2 value " + y2);
        int x, y;
        x = x2 - x1;
        y = y2 - y1;

        DistanceCMD obj = new DistanceCMD();
        double distance = obj.calDistance(x, y);
        System.out.println("Distance= " + distance);
    }

}