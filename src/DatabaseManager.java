import java.util.Scanner;

public class DatabaseManager {
    private IDatabase database;

    public DatabaseManager(IDatabase database) {
        this.database = database;
    }

    public void loginDatabase(){
        database.login();
    }
    public void addDatabase(){
        database.add();
    }
    public void deleteDatabase(){
        database.delete();
    }
    public void getDatabase() {
        database.get();
    }
    public void updateDatabase(){
        database.update();
    }
    public void selectMenu(){
        int karaver;
        Scanner scanner=new Scanner(System.in);
        System.out.print("""
                < Gerçekleştirilecek İşlemler >
                -----------------
                [1] - Veri Ekle
                [2] - Veri Sil
                [3] - Veri Getir
                [4] - Veri Güncelle
                -----------------
                -> Kararınız:""");
        karaver= scanner.nextInt();

        switch (karaver){
            case 1:
                System.out.println("------------------");
                addDatabase();
                System.out.println("-------------------");

            case 2:
                System.out.println("---------------------");
                deleteDatabase();
                System.out.println("----------------------");
            case 3:
                System.out.println("------------------------");
                getDatabase();
                System.out.println("------------------------");

            case 4:
                System.out.println("------------------------");
                updateDatabase();
                System.out.println("-------------------------");
            default:
                System.out.println("\"-----------------\\n" +
                        "-> Tanımsız Bir Değer Girdiniz." +
                        "\\n-----------------\"");

                break;
        }

    }
}
