import model.Kotik;

public class Application  {
    public static void main(String[] args) {
        Kotik siam = new Kotik(5,6,"jessi", "mrrrr",-5);
        Kotik britan = new Kotik();
        britan.setKotik(7,"Charli",6,"Myr myr",-2);
        siam.liveAnotherDay();
        System.out.println(siam.getName() + " " +siam.getWeight() + " kg." );
        System.out.println(siam.getMeow().equals(britan.getMeow()) + " equals meow");
        System.out.println(Kotik.getTotexampl() + " create objects");
    }
}

