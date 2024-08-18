Feature:Giriş yapar

  @login
  Scenario: Kullanıcı geçerli bilgilerle giriş yapar
    Given Kullanıcı Giriş sayfasındadır
    When Kullanıcı geçerli e-mail "ali@example.com" ve şifre "password123" girer
    And Kullanıcı Giriş butonuna tıklar
    Then Kullanıcı araç kirala ekranına yönlendirilmelidir

  Scenario: Kullanıcı geçersiz e-mail bilgileri giriş yapar
    Given Kullanıcı Giriş sayfasındadır
    When Kullanıcı geçersiz e-mail "ali@example.com" yazar
    And Kullanıcı  şifre "password123" girer
    And Kullanıcı Giriş butonuna tıklar
    Then Kullanıcı "Geçersiz e-mail ve ya password girdiniz." hatası verir.

  Scenario: Kullanıcı geçersiz password bilgileri giriş yapar
    Given Kullanıcı Giriş sayfasındadır
    When Kullanıcı geçerli e-mail "ali@example.com" yazar
    And Kullanıcı  geçersiz şifre "password1" girer
    And Kullanıcı Giriş butonuna tıklar
    Then Kullanıcı "Geçersiz e-mail ve ya password girdiniz." hatası verir.

  Scenario: Kullanıcı geçerli bilgilerle giriş yapar ve beni hatırla butonuna tıklar.
    Given Kullanıcı Giriş sayfasındadır
    When Kullanıcı geçerli e-mail "ali@example.com" ve şifre "password123" girer
    And Kullanıcı "Beni hatırla" butonuna tıklar
    And Kullanıcı Giriş butonuna tıklar
    And Kullanıcı araç kirala ekranına yönlendirilmelidir
    And Kullanıcı profil sayfasına gider
    And Kullanıcı Çıkış butonuna tıklar
    And Kullanıcı gelen pencerede ki  "evet" butonuna tıklar
    And Kullanıcı Giriş sayfasına yönlendirilmelidir
    And Kullanıcı email ve password ekranının doğru olduğunu doğrular.

  Scenario: Kullanıcı geçersiz password bilgileri giriş yapar
    Given Kullanıcı Giriş sayfasındadır
    When Kullanıcı geçerli e-mail "ali@example.com" yazar
    And Kullanıcı  geçersiz şifre "password1" girer
    And Kullanıcı Giriş butonuna tıklar
    And Kullanıcı "Geçersiz e-mail ve ya password girdiniz." hatası verir.
    And Kullanıcı Giriş sayfasına yönlendirilmelidir
    And Kullanıcı şifremi unuttum butonuna tıklar
    And Kullanıcı geçerli e-mail "ali@example.com" yazar
    And Kullanıcı gelen emaili onaylar ve yeni şifreyi girer.
    Then Kullanıcı geçerli e-mail "ali@example.com" ve yeni şifre "passwordali123" girer
