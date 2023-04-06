# Zhu-Takaoka-algorithm


        Bu algoritmanın amacı belirli bir string ifadede istenilen değerden kaç tane olduğunu bulur.
        Öncelikle istenilen değerleri ve metni StringSearch classındaki search fonksiyonuna gönderiyoruz ve bu iki değerin
        uzunluklarını alıyoruz. Daha sonra aranılacak değeri badChar fonksiyonuna gönderiyoruz.
        badChar fonksiyonunun amacı Fonksiyon, bir karakter dizisi alır ve her bir karakterin ASCII değerine karşılık gelen bir dizi oluşturur. Daha sonra,
        dizideki her değer,karşılık gelen karakterin son görünümünün dizindeki indeksi olarak güncellenir. Eğer bir karakter birkaç
        kez görünürse, en son görünümünün indeksi saklanır.Bu karakter önişleme tablosu, arama işlemi sırasında kullanılarak
        aranan kelimenin metinde sağa doğru hareket etmesi sırasında eşleşmeyen bir karakter bulunduğunda, karakterin yerini belirlemeye yardımcı olur.
        search fonksiyonu bu algoritmanın ana döngüdür. Bu döngü, deger dizisi text dizisi içinde sağa doğru hareket eder ve deger dizisindeki
        karakterlerin text dizisi içindeki yerlerini kontrol eder. Eğer deger içindeki tüm karakterler text içinde bulunursa,
        karakter dizisi bulunmuş demektir.

        Algoritmanın çalışma analizi:
        Metnin solundan başlayarak desen aranmaya başlanır.
        Her seferinde, desenin sağ tarafından sola doğru ilerleyen bir j sayacı kullanılır ve eşleşen karakterler kontrol edilir.
        Eşleşen karakterler sırasıyla kontrol edilir. Eğer karakterler uyuşmuyorsa, j sayacı geriye doğru hareket eder.
        Eğer j sayacı, desenin başındaysa, metin doğrudan bir desen örneğiyle karşılaştırılmış olur.
        Eğer desen tamamen eşleşirse, desenin metindeki konumu yazdırılır.

        En iyi durum: Alt dize, ana dizinin başında bulunur. Karmaşıklık O(m), burada m, alt dizenin uzunluğudur.

        Ortalama durum: Karmaşıklık O(n), burada n ana dizinin uzunluğudur.
        
        En kötü durum: Alt dize, ana dizinin sonunda veya yoksa ana dizide bulunmaz. Karmaşıklık O(mn), burada m, alt
        dizenin uzunluğu ve n, ana dizinin uzunluğudur. Bu durum, tüm alt dizelerin kontrol edilmesi gerektiğinde oluşur ve
        diğer arama algoritmalarından daha yavaş çalışır.
