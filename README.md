# Library-Automation

Programın çalışabilmesi için öncelikle "Library\database" dizinindeki
"library.sql" veri tabanının sistemin mysql veritabanına eklenmesi gerekmektedir.

Bu ekleme işlemi için gerekli özellikler aşağıda belirtilmiştir:

Eklenilecek olan veritabanının ismi "library" olmalıdır ve
veri tabanının sahibi olan kullanıcının Kullanıcı Adı "utku",
parolası "123456" olmalıdır. 
Ya da bu işlemleri yapmak istemiyorsanız program kodları kısmından Database sınıfındaki bağlantı değerleri değiştirilmelidir.

Veri tabanını ekleme işlemleri bittikten sonra "Library\dist" dizinin altındaki
"Library.jar" dosyası çalıştırılarak programa erişim sağlanabilir.

Gerekli işlemlerden sonra programı, bashde "dist" dizinine düşerek “java -jar Library.jar” komutuyla çalıştırabilirsiniz.
