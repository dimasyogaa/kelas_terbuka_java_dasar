package kelasterbuka.util;

public class Memasak {

    public static void dagingPublic() {
        System.out.println("Kelas terbuka : Memasak : Public");
    }

    private static void dagingPrivate() {
        System.out.println("Kelas terbuka : Memasak : Private");
    }

    static void dagingDefault() {
        System.out.println("Kelas terbuka : Memasak : Default");
    }

    protected static void dagingDProtected() {
        System.out.println("Kelas terbuka : Memasak : Protected");
    }

}
