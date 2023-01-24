package arabakiralama2;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        ArabaVeMusteriBilgisi start = new ArabaVeMusteriBilgisi();
        start.aracTalepEt();
        start.arabaOzellikleri();
        start.musteriBilgisi();
        start.ödemeBilgileri();

    }
}
