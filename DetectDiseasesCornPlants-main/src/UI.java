import java.util.*;

public class UI {
    private ArrayList<String> questions;
    private int answers[];
    
    public UI()
    {
        this.answers = new int[31];
        this.questions = new ArrayList<String>();
        this.setQuestions();
    }
    
    private void setQuestions() {
     // Menampilkan judul aplikasi
        System.out.println("========================================================================");
        System.out.println("SISTEM PAKAR UNTUK MENDETEKSI PENYAKIT PADA TANAMAN JAGUNG");
        System.out.println("Oleh : Izlal Chaidar Islam dan Sulaiman");
        System.out.println("========================================================================");
        
    // Menambahkan pertanyaan ke dalam ArrayList berdasarkan gejala
    questions.add("Apakah Anda mengalami daun berwarna klorotik?"); // G1
    questions.add("Apakah Anda mengalami pertumbuhan yang terhambat?"); // G2
    questions.add("Apakah ada warna putih seperti tepung di permukaan atas dan bawah daun yang klorotik?"); // G3
    questions.add("Apakah daun terlihat melengkung dan terpilin?"); // G4
    questions.add("Apakah pembentukan bulir jagung terganggu?"); // G5
    questions.add("Apakah daun yang terkena terlihat layu?"); // G6
    questions.add("Apakah ada beberapa bercak kecil yang bersatu membentuk bercak yang lebih besar?"); // G7
    questions.add("Apakah ada bercak cokelat muda yang memanjang berbentuk koil atau perahu?"); // G8
    questions.add("Apakah ada bercak cokelat berbentuk elips?"); // G9
    questions.add("Apakah daun terlihat kering?"); // G10
    questions.add("Apakah ada bercak cokelat atau kuning kecil di permukaan daun?"); // G11
    questions.add("Apakah ada bercak merah di tulang daun?"); // G12
    questions.add("Apakah ada benang yang berbentuk tidak beraturan yang berwarna putih kemudian cokelat?"); // G13
    questions.add("Apakah ada bubuk yang seperti tepung berwarna kuning cokelat?"); // G14
    questions.add("Apakah ada pembengkakan pada bulir jagung?"); // G15
    questions.add("Apakah ada jamur berwarna putih hingga hitam di biji?"); // G16
    questions.add("Apakah biji terlihat bengkak?"); // G17
    questions.add("Apakah kelenjar terbentuk di biji?"); // G18
    questions.add("Apakah kelobot terbuka dan terlihat banyak jamur berwarna putih hingga hitam?"); // G19
    questions.add("Apakah ada lubang kecil di daun?"); // G20
    questions.add("Apakah ada celah di batang?"); // G21
    questions.add("Apakah ada bunga jantan atau pangkal bulir?"); // G22
    questions.add("Apakah batang dan tangkai (bunga jantan) mudah patah?"); // G23
    questions.add("Apakah ada tumpukan tangkai yang patah?"); // G24
    questions.add("Apakah bunga jantan tidak terbentuk?"); // G25
    questions.add("Apakah ada tepung/kotoran di sekitar hoist?"); // G26
    questions.add("Apakah daun sedikit kuning?"); // G27
    questions.add("Apakah ada lubang melintang di daun pada fase vegetatif?"); // G28
    questions.add("Apakah rambut jagung terpotong/reduksi/kering?"); // G29
    questions.add("Apakah ujung bulir jagung ada hoist?"); // G30
    questions.add("Apakah sering terdapat larva?"); // G31
}

    
    public void showQuestion()
    {
        Scanner sc = new Scanner(System.in);
        int i =0;
        for(String q: this.questions)
        {
            System.out.println(q);
            System.out.println("0. Tidak    1.Ya");
            int a = sc.nextInt();
            while(a != 0 && a!=1)
            {
                System.out.println("Jawaban tidak sesuai!");
                a = sc.nextInt();
            }
            answers[i] = a;
            i++;
        }
    }
    
    public Set<String> getFacts() {
        Set<String> facts = new HashSet<>();

        // Menambahkan fakta berdasarkan gejala yang terdeteksi
        if (answers[0] == 1) facts.add("G1: Daun berwarna klorotik"); // Bulai
        if (answers[1] == 1) facts.add("G2: Mengalami pertumbuhan yang terhambat"); // Bulai
        if (answers[2] == 1) facts.add("G3: Ada warna putih seperti tepung di daun yang klorotik"); // Bulai
        if (answers[3] == 1) facts.add("G4: Daun terlihat melengkung dan terpilin"); // Bulai
        if (answers[4] == 1) facts.add("G5: Pembentukan bulir jagung terganggu"); // Bulai

        if (answers[5] == 1) facts.add("G6: Daun yang terkena terlihat layu"); // Blight
        if (answers[6] == 1) facts.add("G7: Ada beberapa bercak kecil yang bersatu membentuk bercak yang lebih besar"); // Blight
        if (answers[7] == 1) facts.add("G8: Ada bercak cokelat muda yang memanjang berbentuk koil atau perahu"); // Blight
        if (answers[8] == 1) facts.add("G9: Ada bercak cokelat berbentuk elips"); // Blight
        if (answers[9] == 1) facts.add("G10: Daun terlihat kering"); // Blight

        if (answers[10] == 1) facts.add("G11: Ada bercak cokelat atau kuning kecil di permukaan daun"); // Leaf Rust
        if (answers[11] == 1) facts.add("G12: Ada bercak merah di tulang daun"); // Leaf Rust
        if (answers[12] == 1) facts.add("G13: Ada benang berbentuk tidak beraturan yang berwarna putih kemudian cokelat"); // Leaf Rust
        if (answers[13] == 1) facts.add("G14: Ada bubuk yang seperti tepung berwarna kuning cokelat"); // Leaf Rust

        if (answers[14] == 1) facts.add("G15: Ada pembengkakan pada bulir jagung"); // Burn
        if (answers[15] == 1) facts.add("G16: Ada jamur berwarna putih hingga hitam di biji"); // Burn
        if (answers[16] == 1) facts.add("G17: Biji terlihat bengkak"); // Burn
        if (answers[17] == 1) facts.add("G18: Kelenjar terbentuk di biji"); // Burn
        if (answers[18] == 1) facts.add("G19: Kelobot terbuka dan terlihat banyak jamur berwarna putih hingga hitam"); // Burn

        if (answers[19] == 1) facts.add("G20: Ada lubang kecil di daun"); // Stem Borer
        if (answers[20] == 1) facts.add("G21: Ada celah di batang"); // Stem Borer
        if (answers[21] == 1) facts.add("G22: Ada bunga jantan atau pangkal bulir"); // Stem Borer
        if (answers[22] == 1) facts.add("G23: Ada tumpukan tangkai yang patah"); // Stem Borer
        if (answers[23] == 1) facts.add("G25: Bunga jantan tidak terbentuk"); // Stem Borer
        if (answers[24] == 1) facts.add("G26: Ada tepung/kotoran di sekitar hoist"); // Stem Borer
        if (answers[25] == 1) facts.add("G27: Daun sedikit kuning"); // Stem Borer
        if (answers[26] == 1) facts.add("G28: Rambut jagung terpotong/reduksi/kering"); // Cob Borer
        if (answers[27] == 1) facts.add("G29: Ujung bulir jagung ada hoist"); // Cob Borer
        if (answers[28] == 1) facts.add("G30: Ada larva"); // Cob Borer
        if (answers[29] == 1) facts.add("G31: Ada jamur di biji"); // Cob Borer
        
        return facts;
    }

    public void showConclusion(boolean gIsTrue, Set<String> facts, Set<String> inferedFacts) {
        boolean isBulaiDetected = facts.stream().anyMatch(fact -> fact.startsWith("G1") || fact.startsWith("G2") || fact.startsWith("G3") || fact.startsWith("G4") || fact.startsWith("G5"));
        boolean isBlightDetected = facts.stream().anyMatch(fact -> fact.startsWith("G6") || fact.startsWith("G7") || fact.startsWith("G8") || fact.startsWith("G9") || fact.startsWith("G10"));
        boolean isLeafRustDetected = facts.stream().anyMatch(fact -> fact.startsWith("G11") || fact.startsWith("G12") || fact.startsWith("G13") || fact.startsWith("G14"));
        boolean isBurnDetected = facts.stream().anyMatch(fact -> fact.startsWith("G15") || fact.startsWith("G16") || fact.startsWith("G17") || fact.startsWith("G18") || fact.startsWith("G19"));
        boolean isStemBorerDetected = facts.stream().anyMatch(fact -> fact.startsWith("G20") || fact.startsWith("G21") || fact.startsWith("G22") || fact.startsWith("G23") || fact.startsWith("G25") || fact.startsWith("G26") || fact.startsWith("G27"));
        boolean isCobBorerDetected = facts.stream().anyMatch(fact -> fact.startsWith("G28") || fact.startsWith("G29") || fact.startsWith("G30") || fact.startsWith("G31"));

        System.out.println("Semua fakta: " + facts);
        
    if (isBulaiDetected && isBlightDetected && isLeafRustDetected && isBurnDetected && isStemBorerDetected && isCobBorerDetected) {
    System.out.println("Semua penyakit terdeteksi: Bulai, Blight, Leaf Rust, Burn, Stem Borer, dan Cob Borer.");
} else {
    // Menampilkan penyakit yang terdeteksi berdasarkan gejala
    if (isBulaiDetected) {
        System.out.println("Penyakit Bulai terdeteksi berdasarkan gejala yang diberikan.");
    }
    if (isBlightDetected) {
        System.out.println("Penyakit Blight terdeteksi berdasarkan gejala yang diberikan.");
    }
    if (isLeafRustDetected) {
        System.out.println("Penyakit Leaf Rust terdeteksi berdasarkan gejala yang diberikan.");
    }
    if (isBurnDetected) {
        System.out.println("Penyakit Burn terdeteksi berdasarkan gejala yang diberikan.");
    }
    if (isStemBorerDetected) {
        System.out.println("Penyakit Stem Borer terdeteksi berdasarkan gejala yang diberikan.");
    }
    if (isCobBorerDetected) {
        System.out.println("Penyakit Cob Borer terdeteksi berdasarkan gejala yang diberikan.");
    }
    
    // Jika tidak ada penyakit yang terdeteksi
    if (!isBulaiDetected && !isBlightDetected && !isLeafRustDetected && !isBurnDetected && !isStemBorerDetected && !isCobBorerDetected) {
        System.out.println("Tidak ada penyakit yang terdeteksi berdasarkan gejala yang diberikan.");
    }
}

    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        UI ui = new UI();
        Scanner scanner = new Scanner(System.in);

        // Menyuruh pengguna untuk memberikan jawaban untuk setiap gejala
        System.out.println("Masukkan jawaban untuk setiap gejala (1 untuk Ya, 0 untuk Tidak):");
        
        for (int i = 0; i < 31; i++) {
            System.out.print("Apakah Anda mengalami gejala G" + (i + 1) + "? ");
            ui.answers[i] = scanner.nextInt(); // Mengambil input dari pengguna
        }
        
        scanner.close(); // Menutup scanner
    }
}
    
