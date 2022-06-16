Feature: US1005 dogru kullanici adi ve sifre ile giris yapilabilmeli

  @smoke  @regression @haftalik
  Scenario: TC08 positive login test
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And kullanici 1 sn bekler
    And gecerli password girer
    And kullanici 1 sn bekler
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir