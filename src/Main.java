import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> sortedName = new TreeSet<>();
        Book book1 = new Book("Bülbülü Öldürmek", 355, "Harper Lee", 1960);
        Book book2 = new Book("Hayvan Çiftliği", 152, "George Orwell", 1945);
        Book book3 = new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", 1943);
        Book book4 = new Book("Simyacı", 184, "Paulo Coelho", 1988);
        Book book5 = new Book("Yabancı", 111, "Albert Camus", 1942);
        sortedName.add(book1);
        sortedName.add(book2);
        sortedName.add(book3);
        sortedName.add(book4);
        sortedName.add(book5);
        System.out.println("- KİTAP İSMİNE GÖRE SIRALAMA -");
        for (Book b : sortedName) {
            System.out.println("İsim : " + b.getName() + ", Sayfa Sayısı : " + b.getPage() + ", Yazar : " + b.getAuthor() + ", Yılı : " + b.getPublishDate());
        }
        System.out.println("..................................................");
        TreeSet<Book> sortedPage = new TreeSet<>((o1, o2) -> {
            if (o1.getPage() == o2.getPage()) {
                return o1.getName().compareTo(o2.getName());
            }
            return o1.getPage() - o2.getPage();
        });
        sortedPage.add(book1);
        sortedPage.add(book2);
        sortedPage.add(book3);
        sortedPage.add(book4);
        sortedPage.add(book5);
        System.out.println("- SAYFA SAYISINA GÖRE SIRALAMA -");
        for (Book b : sortedPage) {
            System.out.println("İsim : " + b.getName() + ", Sayfa Sayısı : " + b.getPage() + ", Yazar : " + b.getAuthor() + ", Yılı : " + b.getPublishDate());
        }

    }
}
