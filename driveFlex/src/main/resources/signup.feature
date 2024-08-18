Feature:Sign Up

  @signup
  Scenario: Kullanıcı başarılı bir şekilde kayıt olur
    Given Kullanıcı giriş sayfasını görüntüler.
    When Kullanıcı gelen ekrandan kayıt ol butonuna tıklar.
    And Kullanıcı kayıt ol sayfasını doğrular.
    And Kullanıcı name kısmına "Ali" ismini yazar.
    And Kullanıcı surname kısmına "Yılmaz" soyismini yazar.
    And Kullanıcı "ali.yilmaz@example.com" email adresini yazar.
    And Kullanıcı "1234567890123456" tckn kısmına yazar.
    And Kullanıcı "0530 000 00 00" telefon numarası kısmına yazar.
    And Kullanıcı "Ali.123456" şifresini girer.
    And Kullanıcı "Kvkk aydınlatma metnini onaylıyorum" tıklar.
    And Kullanıcı "Kayıt Ol" butonuna tıklar
    Then Kullanıcıya "Hesabınız başarıyla oluşturuldu" mesajı gösterilmelidir


  Scenario: Kullanıcı Name kısmını boş bırakarak kayıt olmaya çalışır.

    Given Kullanıcı giriş sayfasını görüntüler.
    When Kullanıcı gelen ekrandan kayıt ol butonuna tıklar.
    And Kullanıcı kayıt ol sayfasını doğrular.
    And Kullanıcı surname kısmına "Yılmaz" soyismini yazar.
    And Kullanıcı "ali.yilmaz@example.com" email adresini yazar.
    And Kullanıcı "1234567890123456" tckn kısmına yazar.
    And Kullanıcı "0530 000 00 00" telefon numarası kısmına yazar.
    And Kullanıcı "Ali.123456" şifresini girer.
    And Kullanıcı "Kvkk aydınlatma metnini onaylıyorum" tıklar.
    And Kullanıcı "Kayıt Ol" butonuna tıklar
    Then Kullanıcıya Zorunlu alanlar boş bırakılamaz. mesajı gösterilmelidir.

  Scenario: Kullanıcı Surname kısmını boş bırakarak kayıt olmaya çalışır
    Given Kullanıcı giriş sayfasını görüntüler.
    When Kullanıcı gelen ekrandan kayıt ol butonuna tıklar.
    And Kullanıcı kayıt ol sayfasını doğrular.
    And Kullanıcı name kısmına "Ali" ismini yazar.
    And Kullanıcı "ali.yilmaz@example.com" email adresini yazar.
    And Kullanıcı "1234567890123456" tckn kısmına yazar.
    And Kullanıcı "0530 000 00 00" telefon numarası kısmına yazar.
    And Kullanıcı "Ali.123456" şifresini girer.
    And Kullanıcı "Kvkk aydınlatma metnini onaylıyorum" tıklar.
    And Kullanıcı "Kayıt Ol" butonuna tıklar
    Then Kullanıcıya Zorunlu alanlar boş bırakılamaz. mesajı gösterilmelidir.

  Scenario: Kullanıcı, mevcut bir email adresi ile kayıt olmaya çalışır.

    Given Kullanıcı giriş sayfasını görüntüler.
    When Kullanıcı gelen ekrandan kayıt ol butonuna tıklar.
    And Kullanıcı kayıt ol sayfasını doğrular.
    And Kullanıcı name kısmına "Alihan" ismini yazar.
    And Kullanıcı surname "Yıldırım" soyismini yazar
    And Kullanıcı "ali.yilmaz@example.com" email adresini yazar.
    And Kullanıcı "2234567890123456" tckn kısmına yazar.
    And Kullanıcı "0540 000 00 00" telefon numarası kısmına yazar.
    And Kullanıcı "Alihan.123456" şifresini girer.
    And Kullanıcı "Kvkk aydınlatma metnini onaylıyorum" tıklar.
    And Kullanıcı "Kayıt Ol" butonuna tıklar
    Then Kullanıcıya "Bu email adresi zaten kullanılıyor" mesajı gösterilmelidir

  Scenario: Kullanıcı, şifresini yanlış formatta kayıt olmaya çalışır.
    Given Kullanıcı giriş sayfasını görüntüler.
    When Kullanıcı gelen ekrandan kayıt ol butonuna tıklar.
    And Kullanıcı kayıt ol sayfasını doğrular.
   And Kullanıcı name kısmına "Ali" ismini yazar.
    And Kullanıcı surname kısmına "Yılmaz" soyismini yazar.
    And Kullanıcı "ali.yilmaz@example.com" email adresini yazar.
    And Kullanıcı "1234567890123456" tckn kısmına yazar.
    And Kullanıcı "0530 000 00 00" telefon numarası kısmına yazar.
    And Kullanıcı "123456" şifresini girer.
    And Kullanıcı "Kvkk aydınlatma metnini onaylıyorum" tıklar.
    And Kullanıcı "Kayıt Ol" butonuna tıklar
    Then Kullanıcıya "Şifre en az bir büyük harf, bir rakam ve bir özel karakter içermelidir" mesajı gösterilmelidir.

  Scenario: Kullanıcı, tckn  yanlış formatta kayıt olmaya çalışır.

    Given Kullanıcı giriş sayfasını görüntüler.
    When Kullanıcı gelen ekrandan kayıt ol butonuna tıklar.
    And Kullanıcı kayıt ol sayfasını doğrular.
    And Kullanıcı name kısmına "Ali" ismini yazar.
    And Kullanıcı surname kısmına "Yılmaz" soyismini yazar.
    And Kullanıcı "ali.yilmaz@example.com" email adresini yazar.
    And Kullanıcı "1234567890" tckn kısmına yazar.
    And Kullanıcı "0530 000 00 00" telefon numarası kısmına yazar.
    And Kullanıcı "Ali.123456" şifresini girer.
    And Kullanıcı "Kvkk aydınlatma metnini onaylıyorum" tıklar.
    And Kullanıcı "Kayıt Ol" butonuna tıklar
    Then Kullanıcıya "Tckn numarası 11 hane olmalıdır." hata mesajı görülür.

  Scenario: Kullanıcı "Kvkk aydınlatma metnini onaylıyorum" boş bırakarak kayıt olmaya çalışır.
    Given Kullanıcı giriş sayfasını görüntüler.
    When Kullanıcı gelen ekrandan kayıt ol butonuna tıklar.
    And Kullanıcı kayıt ol sayfasını doğrular.
    And Kullanıcı name kısmına "Ali" ismini yazar.
    And Kullanıcı surname kısmına "Yılmaz" soyismini yazar.
    And Kullanıcı "ali.yilmaz@example.com" email adresini yazar.
    And Kullanıcı "1234567890123456" tckn kısmına yazar.
    And Kullanıcı "0530 000 00 00" telefon numarası kısmına yazar.
    And Kullanıcı "Ali.123456" şifresini girer.
    And Kullanıcı "Kayıt Ol" butonuna tıklar
    Then Kullanıcıya "Kvkk aydınlatma metnini onaylıyorum" butonuna tıklayınız mesajı görülür.
