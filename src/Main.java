public class Main {
    public static void main(String[] args) {
        //        System.out.println("Hello world!");

        int nbTotalBox = 34;
        int nbByTruck = 9;

        int nbTrip = (int) Math.ceil((double)nbTotalBox / nbByTruck);

        for (int i = 0; i < nbTrip; i++) {
            int nbBox = Math.min(nbByTruck, nbTotalBox - (i * nbByTruck));

            System.out.println("Un voyage de " + nbBox + " cartons.");
        }
    }
}