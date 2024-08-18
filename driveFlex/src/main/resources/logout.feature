Feature: Çıkış yapma

  @logout
  Scenario: Kullanıcı çıkış yapar
    Given Kullanıcı anasayfadadır
    When Kullanıcı profil sayfasına gider
    And Kullanıcı Çıkış butonuna tıklar
    And Kullanıcı gelen pencerede ki  "evet" butonuna tıklar
    Then Kullanıcı Giriş sayfasına yönlendirilmelidir

  Scenario: Kullanıcı çıkış yapamaz
    Given Kullanıcı anasayfadadır
    When Kullanıcı profil sayfasına gider
    And Kullanıcı Çıkış butonuna tıklar
    And Kullanıcı gelen pencerede ki  hayır butonuna tıklar
    Then Kullanıcı profil sayfasına gider