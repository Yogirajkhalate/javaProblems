
class lowestPriceProduct {
    public static String lowestProduct(String Products) {
        String P[] = Products.split(";");
        String Str = "";
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < P.length; i++) {
            String p = P[i].trim();
            String PV[] = p.split(" ");
            String st = PV[0];

            int min = Integer.parseInt(PV[1]);
            if (min < minVal) {
                minVal = min;
                Str = st;
            }

        }
        return Str;
    }

    public static void main(String[] args) {
        String st = "Mango 30 ;Apple -10;banana 5;Orange 10";
        String Product = lowestProduct(st);
        System.out.println(Product);
    }
}
