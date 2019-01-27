package chatbot;

//Spis możliwych diaglogów.
public class Dialogs {
    private static final String[][] Dialogs={
        {"witaj","witam","cześć","czesc","hej"},
        {"Witaj! W czym mogę pomóc?","Cześć! Jak mogę pomóc?",
         "Hej! W czym pomóc?"},

        {"co u ciebie słychać","co u ciebie slychac","jak się czujesz",
         "jak sie czujesz","co tam u ciebie"},
        {"Bardzo dobrze!","Dobrze!","Żle się czuję!"},

        {"czy są wolne pokoje","czy sa wolne pokoje","pokoje","wolne pokoje",
         "czy są jeszcze wolne pokoje","czy sa jeszcze wolne pokoje"},
        {"Posiadamy jeszcze wolne pokoje. W trakcie\n\trobienia rezerwacji "
        + "online proszę kliknąć w\n\tprzycisk 'Wybierz pokój', powinno pokazać"
        + " się\n\tokno modalne z wyborem twolnych pokoi. Czy\n\tmogę jeszcze w"
        + " czymś pomóc?",
         "Oczywiście, są jeszcze wolne pokoje. W trakcie\n\trobienia rezerwacji"
        + " online proszę kliknąć w\n\tprzycisk 'Wybierz pokój', powinno "
        + "pokazać się\n\tokno modalne z wyborem wolnych pokoi. Czy\n\tmogę "
        + "jeszcze jakoś pomóc?"},

        {"gdzie mogę przedłużyć rezerwację", "gdzie moge przedluzyc rezerwacje",
         "przedluzenie rezerwacji", "czy mogę jeszcze przedłużyć rezerwację", 
         "czy moge jeszcze przedluzyc rezerwacje","przedłużenie rezerwacji"},
        {"Podczas tworzenia rezerwacji online, proszę\n\tkliknąć w opcję "
        + "'Przedłużam rezerwację', powinno\n\tpokazać się okno modalne, w "
        + "którym będą do\n\twyboru dostępne wolne terminy. Czy masz\n\tjeszcze"
        + " jakieś pytania?",
         "Jeżeli to nie będzie problemem to proszę\n\tzgłosić się do recepcji na "
        + "parterze w hotelu.\n\tZałatwimy to od ręki. Czy mogę odpowiedzieć\n\t"
        + "jeszcze na jakieś pytania?"},

        {"czy są jeszcze wolne terminy do rezerwacji", "czy sa jeszcze wolne "
        + "terminy do rezerwacji", "czy można jeszcze dokonać rezerwacji", 
         "czy mozna jeszcze dokonac rezerwacji", "rezerwacja"},
        {"Posiadamy jeszcze wolne terminy, powinny\n\tpojawić się podczas "
        + "dokonywania rezerwacji\n\tonline. Jeżeli występuje jakiś błąd na "
        + "stronie\n\tto zapraszamy na infolinię i prosimy o zgłoszenie\n\t"
        + "problemu przyciskiem 'Zgłoś problem' w\n\tformularzu rezerwacji. "
        + "Czy mogę jeszcze\n\tjakoś pomóc?",
         "Tak, są jeszcze wolne terminy. Powinny\n\twyświetlić się one podczas "
        + "dokonywania\n\trezerwacji online. Czy ma Pan jeszcze jakieś\n\t"
        + "pytania?"},
        {"tak"},
        {"Przykładowe pytanie: Czy są jeszcze wolne pokoje?",
         "Przykładowe pytanie: Czy mogę jeszcze przedłużyć\n\trezerwację?",
         "Przykładowe pytanie: Czy są jeszcze wolne terminy\n\tdo rezerwacji?"},
        {"Nie rozumiem!","Proszę powtórzyć!"}
    };
    
    public String[][] getDialogs() {
        return Dialogs;
    }
}
