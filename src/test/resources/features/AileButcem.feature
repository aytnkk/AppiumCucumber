
//ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
//mail ve password bilgilerini girerek kullanici bilgileriyle giris yapin
//uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
// sol kisimdaki menuden hesabim bolumune gidin
//hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin
//ardindan degisiklerin yapildigini dogrulayin

Feature: Aile Butcem Login Page Test
  @wip
  Scenario: Kullanici aile butcem uygulamasina basarili bir sekilde giris yaparak ilgili gorevleri yerine getirir

  Given ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
  Then mail ve password bilgilerini girerek kullanici bilgileriyle giris yapin
  Then uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
  Then  sol kisimdaki menuden hesabim bolumune gidin
  Then hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin
  And ardindan degisiklerin yapildigini dogrulayin