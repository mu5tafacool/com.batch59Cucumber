Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And sonuclarin "Java" icerdigini test eder
    And kullanici 3 sn bekler
    Then sayfayi kapatir
    #istenen kelimeyi "" icnde yazarak methodda
    # olur>>> kullanici_icin_arama_yapar(String istenenKelime) {
    # kullanici 3 sn bekler methodun da da ve integer deger otomatik static degistirilebilir yapiliyor