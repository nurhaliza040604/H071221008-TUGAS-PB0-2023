/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kalkulator;
// kelas awal yang dimana untuk saat apk di mulai
import javafx.application.Application;
// kelas mengatur penempatan elemen seperti vbox,poscenter
import javafx.geometry.Pos;
// kelas merepresentasikan sebuah scene/layar
import javafx.scene.Scene;
// kelas tombol
import javafx.scene.control.Button;
// kelas membuat label dengan teks tertentu dan menambahkannya ke dalam scene.
import javafx.scene.control.Label;
// kelas membuat area input teks/menerima
import javafx.scene.control.TextField;
// kelas untuk menampilkan gambar 
import javafx.scene.image.ImageView;
// mengatur elemen-elemen dalam bentuk tumpukan (stack) seperti button 1 dan 2
import javafx.scene.layout.StackPane;
// kelas berbentuk vertikal
import javafx.scene.layout.VBox;
// kelas menampilkan teks seperti tugas praktikum 9
import javafx.scene.text.Text;
// Kelas ini merepresentasikan jendela (window) 
import javafx.stage.Stage;
// kelas app yg merupakan turunan dari kelas application 
public class App extends Application {
    private Stage stage;
// stage menggunakan parameter start nah dimana membuat label dng praktm 9
    @Override
    public void start(Stage mainStage) {
        //handling stage
        stage = mainStage;

        //stage
        stage.setTitle("Tugas Praktikum 9"); // menentukan judul aplikasi
        stage.setScene(getScene1());
        stage.setResizable(false); //perubahan ukuran(pass)
        stage.show(); // metode show
    }
        // mendapatkan scene pertama
    private Scene getScene1() {

        Text tTitle = new Text("Kalkulator Sederhana");
        Button bMulai = new Button("Mulai"); // Button untuk mulai
        VBox sectionRight = new VBox(tTitle, bMulai); // Vbox agar objek pada apk 
        sectionRight.setSpacing(50); // Jarak antara objek
        sectionRight.setAlignment(Pos.CENTER); // Tempatkan objek2 dari vbox di tengah
        sectionRight.setPrefWidth(30);

        //Action untuk Button

        bMulai.setOnAction(v -> {
            stage.setScene(getScene2()); // Buat agar button/tombol pindah ke scene 2
        });

        //section untuk menggambarkan bagian-bagian terpisah dari kode
        ImageView ivBanner = new ImageView("/images/123.png");
        ivBanner.setFitWidth(260);
        ivBanner.setFitHeight(300);
        ivBanner.setPreserveRatio(true);

        //rootNode
        VBox rootNode = new VBox(ivBanner, sectionRight);
        // mengatur posisi root Vbox ketengah yg dimana maksdunya
        // Ini akan membuat VBox dan label yang ditambahkan ke dalamnya terletak di tengah jendela aplikasi JavaFX.
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(new StackPane(rootNode), 640, 480);

        //atur css untuk mengatur tampilan elemen seperti ukuran gambar
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        return scene;
    }
        // mendapatkan scane kedua
    private Scene getScene2() {
        Text tTitle = new Text("PILIH MENU");
        Button bKalkulator1 = new Button("Body Mass Index (BMI)");
        Button bKalkulator2 = new Button("Berat Badan Ideal Pria");
        Button bKalkulator3 = new Button("Berat Badan Ideal Wanita");
        VBox sectionRight = new VBox(tTitle, bKalkulator1, bKalkulator2, bKalkulator3);
        sectionRight.setSpacing(15);
        // elemen geometry digunakan untuk mengatur posisi root VBox ke tengah yg dimana "pilih menu" ditempatkan ditengah
        sectionRight.setAlignment(Pos.TOP_CENTER); 
        sectionRight.setPrefWidth(0);

        //Action untuk Button pada scane kedua

        bKalkulator1.setOnAction(v -> {
            stage.setScene(getScene3("Body Mass Index (BMI)", false));
        });

        bKalkulator2.setOnAction(v -> {
            stage.setScene(getScene3("Berat Badan Ideal Pria", true));
        });

        bKalkulator3.setOnAction(v -> {
            stage.setScene(getScene3("Berat Badan Ideal Wanita", true));
        });

        //rootNode
        VBox rootNode = new VBox(sectionRight);

        Scene scene = new Scene(new StackPane(rootNode), 640, 480);

        //Atur css/Cascading Style Sheets yg digunakan untuk mengatur tampilan dan gaya pada elemen GUI dalam aplikasi JavaFX
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm()); // Memanggil style dari file style.css
        return scene;

    }
    
    
    // mendapatkan scane ketiga dengan parameter kalkulator dan tinggi badan
    private Scene getScene3(String kalkulator, boolean tinggiBadan) {
        Text tTitle = new Text("Jenis Kalkulator : " + kalkulator);
        Label lInput1 = new Label("Tinggi Badan(CM)"); 
        TextField tInput1 = new TextField("0"); // Buat taruh tempat input
        Label lInput2 = new Label("Berat Badan(KG)");
        TextField tInput2 = new TextField("0");
        Label lHasil = new Label();

        Button bClear = new Button("Clear");
        Button bCalculate = new Button("Calculate");
        Button bBackToHome = new Button("BACK TO HOME");

        VBox sectionRight;

        if (tinggiBadan) {
            sectionRight = new VBox(tTitle, lInput1, tInput1, lHasil, bClear, bCalculate, bBackToHome);

        } else {
            sectionRight = new VBox(tTitle, lInput1, tInput1, lInput2, tInput2, lHasil, bClear, bCalculate,
                    bBackToHome);
        }
        sectionRight.setSpacing(15);
        sectionRight.setAlignment(Pos.TOP_CENTER);
        sectionRight.setPrefWidth(0);

        //Action untuk Button/tombol pada scane 3
        bClear.setOnAction(v -> {
            tInput1.clear();
            tInput2.clear();
        });

         bCalculate.setOnAction(v -> {
            try {
                double tinggi1 = Double.parseDouble(tInput1.getText());
                double tinggi2 = Double.parseDouble(tInput1.getText());
                double berat = Double.parseDouble(tInput2.getText());
                double hasil = 0;
                tinggi1 /= 100;

                if (!tinggiBadan) {
                    // Menghitung Body Mass Index (BMI)
                    hasil = berat / (tinggi1 * tinggi1);
                } else {
                    // Menghitung berat badan ideal (pria atau wanita)
                    if (kalkulator.equals("Berat Badan Ideal Pria")) {
                        hasil = (tinggi2 - 100) - ((tinggi2 - 100) * 0.1);
                    } else if (kalkulator.equals("Berat Badan Ideal Wanita")) {
                        hasil = (tinggi2 - 100) - ((tinggi2 - 100) * 0.15);
                    }
                }
                
                 // Menambahkan keterangan berdasarkan hasil
                //String keterangan = "";
                //if (hasil < 18.5) {
                //    keterangan = "Berat badan kurang atau kekurangan berat badan";
                //} else if (hasil >= 18.5 && hasil <= 24.9) {
                //    keterangan = "Berat badan normal atau sehat";
                //} else if (hasil >= 25.0 && hasil <= 29.9) {
                //    keterangan = "Berat badan berlebih atau overweight";
                //} else if (hasil >= 30.0) {
                //    keterangan = "Obesitas";
                //}



                 lHasil.setText("Hasil: " + hasil);
                
             } catch (NumberFormatException e) {
                lHasil.setText("Input tidak Valid");
            
            }
        });

        bBackToHome.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        //rootNode/tombol
        VBox rootNode = new VBox(sectionRight);

        Scene scene = new Scene(new StackPane(rootNode), 640, 480);

        //atur css
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        return scene;

    }
    
    public static void main(String[] args) {
        launch();
    }

}