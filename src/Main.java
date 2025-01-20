public class Main {
    public static void main(String[] args) {
        Collection prose = new Collection();

        Book YellowSUn = new Book("Half of a yellow sun",
                "Chimamanda Adiche",
                342567865 );
        Book MonteCristo = new Book("The count  of monte Cristo",
                "Alexandre Dumas",
                422569065 );

        prose.addToCollection(YellowSUn);
        System.out.println(prose.getBookByTitle("half of a yellow sun").getAuthor());
    }
}
