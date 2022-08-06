Feature: US1011 web tablasundaki istenen sutunu yazdirma

 # @guru @pr2
  Scenario:TC17 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    And kullanici 3 sn bekler
  #  And cookies sorulursa kabul eder
    And "Bank", olan firmalari yazdirir
    #Then sayfayi kapatir