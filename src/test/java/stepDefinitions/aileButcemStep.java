package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class aileButcemStep {

AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver();
TouchAction action=new TouchAction<>(driver);

    @Given("Kullanici kurulumlari tamamlar")
    public void kullanici_kurulumlari_tamamlar() {
        Driver.getAndroidDriver();
    }

    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilkEkranAyarlariniYapinVeArdindanLoginSayfasinaUlasin() {
        ReusableMethods.wait(2);
        for (int i=0;i<6; i++){
            action.press(PointOption.point(924,933)).
                    waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
                    moveTo(PointOption.point(125,933)).release().perform();

        }
        ReusableMethods.scrollWithUiScrollable("Giris yap");



    }

    @Then("mail ve password bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mailVePasswordBilgileriniGirerekKullaniciBilgileriyleGirisYapin() {

    }

    @Then("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamayaKullaniciBilgileriyleGirisYapildiginiDogrulayin() {

    }

    @Then("sol kisimdaki menuden hesabim bolumune gidin")
    public void solKisimdakiMenudenHesabimBolumuneGidin() {

    }

    @Then("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin")
    public void hesabimSayfasindakiBilgileriDegistirerekDegisikleriKaydedin() {

    }

    @And("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindanDegisiklerinYapildiginiDogrulayin() {
    }
}
