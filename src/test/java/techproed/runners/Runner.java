package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
Runner class; testNG deki .xml file larda belirttiğimiz class'ları,packageları veya methodları nasıl
çalıştırıyorsak, Cucumber frameworkundede Runner class'ındaki tags parametresi ile belirttiğimiz
senaryoyu çalıştırabiliriz
 */
//Cucumber ile JUnit'in entegre olmasını sağlayan test çalıştırıcı notasyonudur
@RunWith(Cucumber.class)
//Seneryoların nerede ve nasıl çalışacağı, hangi raporu kullanacağıyla alakalı seçenekleri ayarlarız
@CucumberOptions(plugin = {"pretty","html:src/test/resources/features/htmlReport/cucumberilk.html",
//tagsadki yaziyi girersen(cucumberilk) ayri yere  kaydeder
        "json:src/test/resources/features/htmlReport/cucumberilk.json",//developper kullanir
        "junit:src/test/resources/features/htmlReport/cucumberilk.xml"},//ctrl+alt+l ile duzenlersin sayfayi
        //plugin parametresi ile pretty ifadesi kullanılırsa konsolda scenario'lar ile bilgi gösterir
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinitions"},//Bu parametre ile kodlarımızı yazdığımız stepDefinition
        //class'ının packege'ını belirtiriz
        tags = "@ilk",
        dryRun = false,//dryRun=false Test adımlarını kontrol eder ve browser'ı çalıştırır
        //dryRun=True Test adımlarını sadece kontrol eder
        //default olarak false'tur
        monochrome = true//pretty ifadesinden sonra monochrome = true kullanırsak senerio adımlarını tekrenk olark siyah gösterir
        //monochrome = false kullanırsak renkli gösterir
        //default false
)
/*
features ===> features'ların olduğu packega'ın yolunu ver(ContentRoot)
glue ====> stepDefinition'ların olduğu packega'ın yolunu ver(Source Root)
tags ====> çalıştırmak istediğin grubu yaz
 */

public class Runner {
}