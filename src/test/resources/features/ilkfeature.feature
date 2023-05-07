Feature: US001_Amazon_Sayfasi_Testi

  Scenario: TC01_Amazon_Sayfasinda_Urun_Aratiir
    Given :kullanici_amazon_sayfasina_gider
    Then arama_kutusunda_iphone_aratir
    And sayfayi_kapatir