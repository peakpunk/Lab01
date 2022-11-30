public class AirPurifier {
//Field
    boolean Dust_filtered = true;
    boolean Eco_mode = true;
    boolean silent = true;
//Method
    void printDust_filtered(int dust) {
        System.out.println(Dust_filtered);
        if(dust == 0){
            System.out.println("GOOD PLACE");
        }
        else if(dust == 5){
            System.out.println("BAD PLACE");
        }
        else{
            System.out.println("CAN LIVE");
        }

    }
    void printEcomode() {
        System.out.println(Eco_mode);
    }
    void printSilent() {
        System.out.println(silent);
    }
    AirPurifier() {
        this(false,false,false);
    }

    AirPurifier(boolean _Dust_filtered,boolean _Eco_mode,boolean _silent) {
        this.Dust_filtered = _Dust_filtered ;
        this.Eco_mode = _Eco_mode;
        this.silent = _silent;
    }

//    Air_Filter
//    Play_music
//    Show_notifications
//    Google_assistant.

}
