Feature: Udemy Mobile App
  Scenario: US_01 Udemy Uygulamasinda Yazilim Kurslarini Ara
    Given Udemy uygulamasini ac
    When Arama kutusuna tikla
    When Yazilim testi yaz ve ara
    Then Yazilim Testi kurslarinin geldigini kontrol et

