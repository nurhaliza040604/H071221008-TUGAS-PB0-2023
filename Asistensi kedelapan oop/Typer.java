// nomor2
// atribut
public class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm; // Words Per Minute
    private TypeRacer typeRacer;
// konstructor
    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }
// method
    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {

        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        // TODO 1,variable howLongToType yang memuat waktu yang diperlukan typer untuk menulis 1 kata dalam milisecond
       // Dibagi 60 ribu karena 1000 dari milisecond  dan 60-nya lagi karena ini dalam hitungan per kata dalam 1 menit
        int howLongToType = (int) (60000 / wpm);

        // TODO 2 perulangan untuk menambahkan kata dengan method addWordToTyped setelah interval waktu sebanyak howLongToType
        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
                this.addWordTyped(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.addWordTyped("(selesai)");

        // TODO 3 : Tambahkan typer yang telah selesai mengetik semua kata ke list typeRaceTabel yang ada di class typeRacer.

        typeRacer.addResult(this);
    }
}
