# TAPDTI-Micu
NOTE:
i = baris,
j = kolom.

Langkah - Langkah:
1) Tentukan banyak baris (i).
2) Tentukan syntax apa yang dipakai untuk loopingnya (saya menggunakan syntax for)
3) dari pola yang akan saya buat (0,4,M) terdiri dari 3 bagian yaitu pertama "0", kedua "4", dan ketiga "M"
4) Sebelum masuk ke penjelasan syntax saya ingin mengingatkan bahwa semua pola yang saya buat bentuk awalnya adalah persegi/kotak yang setelahnya akan dimodifikasi menggunakan "if"
5) Jadi yang paling awal kita buat adalah "0". Kode diatas berarti; jumlah dari baris (i) adalah 6 baris dan jumlah dari kolom (j) adalah 5. Untuk j==5 print("  ") adalah command untuk menghilangkan kolom kelima (saya membuatnya menjadi spasi). lalu syarat berikutnya adalah jika j bernilai 1, j bernilai 4, i bernilai 1, dan i bernilai sama dengan n maka print symbol bintang, jika tidak maka print kosong/spasi. j bernilai 1 brarti kolom pertama kita print bintang, j bernilai 4 berarti kolom keempat kita print bintang, i bernilai 1 berarti baris pertama kita print bintang, dan i bernilai sama dengan n berarti baris keenam kita print bintang, selain dari baris dan kolom diatas kita kosongkan dengan print spasi.
6) Lalu kita membuat angka "4". Saya ingatkan kembali bentuk awal angka 4 pada output kode diatas awalnya berbentuk persegi/kotak lalu dimodifikasi dengan if. Untuk if j==5 itu berfungsi sama seperti pada pembuatan pattern "0" yaitu untuk spasi buat pattern berikutnya ("M"). Lalu dilanjutkan dengan syarat j bernilai 4, i bernilai 1, dan j ditambah dengan i bernilai 5, print symbol bintang. Untuk j ditambah dengan i disini maksudnya adalah, misalnya bintangnya terletak di i3 dan j2 maka i+j adalah 3+2 = 5, jadi print symbol bintangnya. Contoh lainnya untuk pattern "4" yaitu i2 dan j3, jadi 2+3 = 5, jadi kita print symbol bintangnya, dan akhirnya ditambahkan dengan perintah else print kosong/spasi.
7) Last, untuk membuat pattern "M" kita menggunakan persegi juga pastinya sama seperti pola pattern sebelum sebelumnya. Untuk (j+i==4&&j==3) berarti jika nilai j+1 adalah 4 *DAN* j bernilai 3 maka kita print spasi. Lalu untuk (j==1||j==5||j+i==4||j+i==6&&i<4) artinya jika j bernilai 1, j bernilai 5, j+1 bernilai 4, j+1 bernilai 6 kita akan print bintang tapi dengan syarat tambahan yaitu i harus bernilai kurang dari 4, dan jika nilai i sudah lebih dari/sama dengan 4 maka kita tidak akan mengprint bintang (kita print spasi). Dan yang terakhir, jika tidak memenuhi syarat syarat diatas maka kita print spasi.
8) Lalu pada baris terakhir jangan lupa tambahkan System.out.println(); yang berfungsi untuk jika nilai i sudah salah maka dia akan ke baris selanjutnya.

Kesimpulan:
Kesimpulannya, agar lebih mudah membayangkan kode/bagaimana cara kita memecahkan kodenya anggap saja pattern pattern itu terbagi dari berbagai kotak/persegi... Dengan begitu kita akan mudah untuk menyelesaikan kode sesuai polanya, seperti halnya saya menggunakan 3 kotak/persegi sebagai base/dasar pattern saya yang lalu perseginya diubah dengan command "if" untuk memberikan syarat symbol bintang yang mana saja yang harus di print dan yang harus tidak di print.



~Micu ^^
